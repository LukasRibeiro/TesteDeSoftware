package app;

import model.Calculadora;

import org.mockito.Mockito;
// import org.mockito.Mockito.*;

public class Aplicacao{

    public static void main(String[] args){

        System.out.println("Efetuando o mock");

        Calculadora calmock = Mockito.mock(Calculadora.class);
        Mockito.when(calmock.somar(10f, 10f)).thenReturn(20f);
        System.out.println(calmock.somar(10f, 10f));   
    }

}