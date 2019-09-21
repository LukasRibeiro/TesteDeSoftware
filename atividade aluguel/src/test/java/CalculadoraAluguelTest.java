/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import model.CalculadorAluguel;

public class CalculadoraAluguelTest{
    
    CalculadorAluguel aluguel = new CalculadorAluguel(500);

    //Caso de teste 1
    @Test
    public void dia0(){
        assertEquals(-1, aluguel.calcAluguel(0), 0.01);
    }


    @Test
    public void dia1(){
        assertEquals(450, aluguel.calcAluguel(1), 0.01);
    }    

    @Test
    public void dia4(){
        assertEquals(450, aluguel.calcAluguel(4), 0.01);
    }


    @Test 
    public void dia5(){
        // erro
        assertEquals(450, aluguel.calcAluguel(5), 0.01);
    }

/*=====================================================================================================*/

    //Caso de teste 2

    @Test
    public void dia6(){
        assertEquals(475, aluguel.calcAluguel(6), 0.01);
    }
    @Test 
    public void dia7(){
        //erro 
        assertEquals(475, aluguel.calcAluguel(7), 0.01);
    }
    @Test
    public void dia9(){
        assertEquals(475, aluguel.calcAluguel(9), 0.01);
    }
    @Test
    public void dia10(){
        assertEquals(475, aluguel.calcAluguel(10), 0.01);
    }

/*===================================================================================================*/

    //Caso de teste 3

    @Test
    public void dia11(){
        assertEquals(500, aluguel.calcAluguel(11), 0.01);
    }
    @Test 
    public void dia12(){
        assertEquals(500, aluguel.calcAluguel(12), 0.01);
    }
    @Test
    public void dia14(){
        assertEquals(500, aluguel.calcAluguel(14), 0.01);
    }
    @Test
    public void dia15(){
        assertEquals(500, aluguel.calcAluguel(15), 0.01);
    }
/*====================================================================================================*/

    //Caso de teste 4
    
    @Test
    public void dia16(){
        assertEquals(510.25, aluguel.calcAluguel(16), 0.01);
    }
    @Test 
    public void dia17(){
        assertEquals(510.5, aluguel.calcAluguel(17), 0.01);
    }
    @Test
    public void dia31(){
        assertEquals(511.50, aluguel.calcAluguel(31), 0.01);
    }
    @Test
    public void dia32(){
        assertEquals(-1, aluguel.calcAluguel(32), 0.01);
    }
}