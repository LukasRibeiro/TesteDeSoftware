import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest{
    private Calculadora calculadora;
    public CalculadoraTest(){
        calculadora = new Calculadora();
    }
    @Test
    public void somarTest(){
        assertEquals(2,calculadora.somar(1,1));
    }
}



// executar gradle test

// gradle test jacocoTestReport