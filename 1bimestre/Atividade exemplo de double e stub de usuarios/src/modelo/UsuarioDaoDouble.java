/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Ribeiro
 */
public class UsuarioDaoDouble implements UsuarioDao {

    private Integer contadorInserir;
    private Integer contadorBuscar;
    
    
    public UsuarioDaoDouble(){
        this.contadorInserir = 0;
        this.contadorBuscar = 0;
    }
    
    @Override
    public Usuario inserir(Usuario usuario) {

        this.contadorInserir +=1;
        
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
    
    @Override
    public List<Usuario> buscar(Usuario usuario) {
        
        this.contadorBuscar +=1;
        
        List <Usuario> usuarios = new ArrayList();
        
        Usuario user = new Usuario(); user.setId(new Long(1)); usuarios.add(user);
        user = new Usuario(); user.setId(new Long(2)); usuarios.add(user);
        user = new Usuario(); user.setId(new Long(3)); usuarios.add(user);
        user = new Usuario(); user.setId(new Long(4)); usuarios.add(user);
        
        List <Usuario> achados = new ArrayList();
        
        for(Usuario ul: usuarios){
           if(ul.getId().equals(usuario.getId())){
               achados.add(user);
            }
        }
        return achados;
    }

    @Override
    public Integer getContadorBuscar() {

       return this.contadorBuscar;
    }

    @Override
    public Integer getContadorInserir() {

        return this.contadorInserir;
    }
}
