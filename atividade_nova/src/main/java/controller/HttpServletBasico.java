/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabriciogmc
 */
@WebServlet("/httpservlet")
public class HttpServletBasico extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        String nome = req.getParameter("nome"); 
        String resNome = "Seu nome e: " + nome;
        try{
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();            
            pw.write(resNome); pw.close();
        } 
        catch (Exception e){}
    }  
}