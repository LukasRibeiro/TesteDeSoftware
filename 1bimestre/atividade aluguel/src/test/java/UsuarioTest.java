// package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import org.junit.jupiter.api.Test;

public class UsuarioTest{

    private List <Usuario> usuarios;

    @Test
    public void inserirTest(){

        usuarios = new ArrayList<>();
        Usuario u = new Usuario();

        u.setDataNasc("01/01/2001");
        u.setRg("5489292611");
        u.setUsername("teste");

        usuarios.add(u);

        assertEquals(1, usuarios.size());
    
    }

    @Test
    public void buscarTest(){

        Usuario acha = null;

        for (Usuario u: usuarios){
            if(u.getUsername().equals("teste")){
                acha = u;
                break;
            }
        }

        assertEquals(acha.getRg(), "5489292611");
        assertEquals(acha.getDataNasc(), "01/01/2001");
    
    }
}