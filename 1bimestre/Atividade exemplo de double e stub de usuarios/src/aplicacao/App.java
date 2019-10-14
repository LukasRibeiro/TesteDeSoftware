/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import modelo.Usuario;
import modelo.UsuarioDao;
import modelo.UsuarioDaoStub;

/**
 *
 * @author Lucas Ribeiro
 */

/*O stub tem como objetivo fornecer dados prontos*/
public class App {
    public static void main(String[] args) {
        
        Usuario u = new Usuario();
        
        u.setId(new Long (0));
        u.setNome("Thiago");
        u.setSenha("senha");
        UsuarioDao udao = new UsuarioDaoStub();
        udao.inserir(u);
        
        System.out.println("id: " + u.getId());
        System.out.println("nome: " + u.getNome() );
        System.out.println("senha: " + u.getSenha() );
        
    }
}
