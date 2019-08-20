
import model.Calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas Ribeiro
 */
public class App {
    
    public static void main (String [] Args){
        
        Calculadora cal = new Calculadora();
        CalculadoraDao calDao = new CalculadoraStub();
        
        int s = 0;
        
        cal.setX(5);
        cal.setY(10);
        
        System.out.println(calDao.subrair(cal.getX(), cal.getY()));
    }
}