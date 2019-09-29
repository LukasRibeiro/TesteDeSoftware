package Model;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Model.AcoesBotao;

public class Janela extends JFrame{

    AcoesBotao act = new AcoesBotao();

    //metodo para abrir a janela
    public void criarJanela(){

        Container jal = getContentPane();
        setLayout(null);
  
        AcoesBotao act = new AcoesBotao();

        //input para digitar entrada
        JLabel valor = new JLabel("Entrada: ");
        JTextField SetValor = new JTextField(10);
        
        //input para mostrar saida
        JLabel resultado = new JLabel("Saida: ");
        JTextField SetSaida = new JTextField(10);
        
        //botoes da janela
        JButton botaoTestar = new JButton("Testar");
        JButton botaoLimpar = new JButton("Limpar campos");
        
        
//=====================================================================================

        //posicionamento dos campos de entrada e saida da janela
        valor.setBounds(50,40,100,20);
        resultado.setBounds(200,40,100,20);

        SetValor.setBounds(50,80,100,20);
        SetSaida.setBounds(200,80,100,20);
        
        //posicionamento botao
        botaoTestar.setBounds(50,120,250,20);
        botaoLimpar.setBounds(50,160,250,20);

//=====================================================================================


        //adicionando as propriedades nas janelas
        jal.add(valor);
        jal.add(SetValor);
        jal.add(resultado);
        jal.add(SetSaida);
        jal.add(botaoTestar);
        jal.add(botaoLimpar);
        
        //tamanho da janela
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//=====================================================================================

//       metodos para executar as acoes dos botoes

        //metodo para limpar os campos inseridos
      botaoLimpar.addActionListener(new ActionListener(){
      
        public void actionPerformed(ActionEvent evt){
                act.limparCampos(SetValor, SetSaida);
        }
      });

    // metodo para testar os valores inseridos no campo
    botaoTestar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
                SetSaida.setText("" + act.testarCampos(SetValor));
        }
    });           
    
    }
}