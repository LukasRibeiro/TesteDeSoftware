/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucas Ribeiro
 */
public class UsuarioDaoStub implements UsuarioDao {

    @Override
    public Usuario inserir(Usuario usuario) {
       switch(usuario.getNome()){
            
           case "Lucas":
               usuario.setId(new Long (1));
               break;
               
            case "Vinicius":
               usuario.setId(new Long (2));
               break;
                
            case "Thiago":
               usuario.setId(new Long (3));
               break;
                
            case "Fabio":
               usuario.setId(new Long (4));
               break;
       }
       
       return usuario;
    }
    
}
