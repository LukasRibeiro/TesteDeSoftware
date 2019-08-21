/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Lucas Ribeiro
 */
public interface UsuarioDao {
    
    public Usuario inserir (Usuario usuario);
    public List<Usuario> buscar (Usuario usuario);
    public Integer getContadorBuscar();
    public Integer getContadorInserir();
}
