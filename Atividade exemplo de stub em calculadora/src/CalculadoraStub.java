
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
public class CalculadoraStub implements CalculadoraInterface{

    @Override
    public int subrair(int x, int y) {
        
        if(x == 10 && y == 5)
            return 5;
        
        if(x == 7 && y == 2)
            return 5;
        
        if(x == 20 && y == 10)
            return 10;
        
        if(x == 15 && y == 14)
            return 1;
        return 0;
    }
}