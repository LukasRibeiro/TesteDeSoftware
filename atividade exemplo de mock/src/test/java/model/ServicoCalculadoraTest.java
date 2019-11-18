package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicoCalculadoraTest{

    private ServicoCalculadora servCacl;

    private static Calculadora calculadoraMockFinal = Mockito.mock(Calculadora.class);

    private static int paramRepCount = 0;

    @Test
    public void calculadoraSoma(){

        Calculadora calculadoraMock = Mockito.mock(Calculadora.class);

        Mockito.when(calculadoraMock.somar(1.0f, 1.0f)).thenReturn(2.0f);
        servCacl = new ServicoCalculadora(calculadoraMock);
        assertEquals("2.0", servCacl.calcular("1", "1", "+"));
        Mockito.verify(calculadoraMock).somar(1.0f, 1.0f);
    }


    @Test
    public void calculadoraSoma2(){

        Calculadora calculadoraMock = Mockito.mock(Calculadora.class);

        Mockito.when(calculadoraMock.somar(1.0f, 1.0f)).thenReturn(2.0f);
        servCacl = new ServicoCalculadora(calculadoraMock);
        assertEquals("2.0", servCacl.calcular("1", "1", "+"));
        Mockito.verify(calculadoraMock).somar(2.0f, 2.0f);
    }

}