package app;

import model.Calculadora;

import org.mockito.Mockito;
// import org.mockito.Mockito.*;

public class Aplicacao{

    public static void main(String[] args){

        Calculadora calmock = Mockito.mock(Calculadora.class);

        //  metodo 1
        System.out.println("Efetuando o mock aplicando o metodo da soma!");

        Mockito.when(calmock.somar(10f, 10f)).thenReturn(20f);
        System.out.println(calmock.somar(10f, 10f));
    

        //  metodo 2
        System.out.println("Efetuando o mock efetuando o metodo da subtrção!");

        // Calculadora calmock = Mockito.mock(Calculadora.class);
        Mockito.when(calmock.subtrair(10f, 10f)).thenReturn(0f);
        System.out.println(calmock.subtrair(10f, 10f));

        
        // metodo 3
        System.out.println("Efetuando o mock efetuando o metodo de multiplicação!");

        // Calculadora calmock = Mockito.mock(Calculadora.class);
        Mockito.when(calmock.multiplicar(10f, 10f)).thenReturn(100f);
        System.out.println(calmock.multiplicar(10f, 10f));
        

        // metodo 4 
        System.out.println("Efetuando o mock efetuando o metodo de divisão!");

        // Calculadora calmock = Mockito.mock(Calculadora.class);
        Mockito.when(calmock.dividir(10f, 10f)).thenReturn(1f);
        System.out.println(calmock.dividir(10f, 10f));    
    }

}