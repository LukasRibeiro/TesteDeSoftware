/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

/**
 *
 * @author Vinicius Lelis
 */
public class Checar {
        
    public boolean insertString (String palavra) {
    int n = palavra.length();
    if(n >= 1 && n<=5){
        return true;
    } else {
        return false;
    }
    }
    
    public boolean PossuiArroba (String palavra){
        int i;
        Boolean tem = null;
        int n = palavra.length();
            if(n >= 1 && n<=5){
                for (i=0; i<n; i++) {
                char c = palavra.charAt(i); // 
                    if (c == '@'){
                        tem = true;
                    } else {
                        tem = false;
                    }
                }
        return tem;
    } else {
        return false;        
            }
    }
    public int qtdArroba(String palavra) {
        int contador = 0;
        int posi = 100;
        int i;
        int n = palavra.length();
            if(n >= 1 && n<=5){
                for (i=0; i<n; i++) {
                    char c = palavra.charAt(i);
                    if(c == '@' && posi == 100) {
                        contador++;
                        posi = i;
                    }
                
                }
            }
        return posi;
    }                
}