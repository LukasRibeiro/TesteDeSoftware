// package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Usuario;

public class UsuarioTest{

    private static List <Usuario> usuarios;

    @BeforeAll
    public static void init(){
        
        usuarios = new ArrayList<>();
        Usuario u;

        u = new Usuario();
        
        u.setDataNasc("01/01/2001");
        u.setRg("5489292611");
        u.setUsername("teste");
        usuarios.add(u);
        
        u = new Usuario();
        u.setDataNasc("16/12/97");
        u.setRg("888888888");
        u.setUsername("teste2");
        usuarios.add(u);
    }


    // @Test
    // public void inserirTest(){

    //     u.setDataNasc("01/01/2001");
    //     u.setRg("5489292611");
    //     u.setUsername("teste");

        

    //     assertEquals(1, usuarios.size());
    
    // }

    @Test
    public void buscarTest1(){

        Usuario acha = null;

        for (Usuario u: usuarios){
            if(u.getUsername().equals("teste")){
                acha = u;
                break;
            }
        }

        // assertEquals(acha.getRg(), "5489292611");
        // assertEquals(acha.getDataNasc(), "01/01/2001");

        assertEquals(usuarios.get(0), acha);
    
    }

    @Test
    public void buscarTest2(){

        Usuario acha = null;

        for (Usuario u: usuarios){
            if(u.getUsername().equals("teste2")){
                acha = u;
                break;
            }
        }

        // assertEquals(acha.getRg(), "888888888");
        // assertEquals(acha.getDataNasc(), "16/12/97");

        assertEquals(usuarios.get(1), acha);
    
    }
}