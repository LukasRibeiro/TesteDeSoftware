package Model;

import javax.swing.JTextField;
import model.AnalisadorSequencia;


// import model.AnalisadorSequencia;

public class AcoesBotao {
    
    AnalisadorSequencia chamaOMetodoPara = new AnalisadorSequencia();

    public void limparCampos(JTextField entrada, JTextField saida){

        entrada.setText("");
        saida.setText("");
    }
        
    public Boolean testarCampos(JTextField entrada){

        return chamaOMetodoPara.analisar(entrada.getText());
    }
}