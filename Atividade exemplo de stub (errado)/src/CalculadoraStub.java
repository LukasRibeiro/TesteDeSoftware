
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
public class CalculadoraStub implements CalculadoraDao{

    @Override
    public int subrair(int x, int y) {
        
        return x - y;
    }
}