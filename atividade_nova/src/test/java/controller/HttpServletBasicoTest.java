/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 *
 * @author fabricio
 */
public class HttpServletBasicoTest {
 
    @Test
    public void doPostTest(){

        HttpServletRequest req = Mockito.mock(HttpServletRequest.class);
        Mockito.when(req.getParameter("nome")).thenReturn("Lucas");
        HttpServletResponse res = Mockito.mock(HttpServletResponse.class);  
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        
        try{ 
            Mockito.when(res.getWriter()).thenReturn(printWriter);
        } catch (Exception e ) {}
        HttpServletBasico httpSB = new HttpServletBasico();
        httpSB.doGet(req, res);
        String response = null;
        try{
           response =  res.getOutputStream().toString();
        } catch(Exception e){
            
        }
        assertEquals("Seu nome e: Lucas", stringWriter.toString());        
    }
}
