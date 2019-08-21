/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.List;
import modelo.Usuario;
import modelo.UsuarioDao;
import modelo.UsuarioDaoDouble;

/**
 *
 * @author Lucas Ribeiro
 */
public class TesteDouble {
    
    public static void main(String[] args){
        
        Usuario u = new Usuario();
        UsuarioDao udao = new UsuarioDaoDouble();
        
        u.setNome("Lucas");
        u.setId(1);
        
        udao.buscar(u);
        udao.buscar(u);
        udao.buscar(u);
        udao.buscar(u);
        
        System.out.println("Numero de vezes que o metodo foi chamado: " + udao.getContadorBuscar());
    }
}
