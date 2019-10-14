package Model;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Model.AcoesBotao;

public class Janela extends JFrame {

    AcoesBotao act = new AcoesBotao();

    private JTextField ValorEntrada;
    private JTextField ValorSaida;

    private JButton botaoTestar;
    private JButton botaoLimpar;


public JTextField getValorEntrada() {
        return this.ValorEntrada;
}

public void setValorEntrada(JTextField ValorEntrada) {
        this.ValorEntrada = ValorEntrada;
}

public JTextField getValorSaida() {
        return this.ValorSaida;
}

public void setValorSaida(JTextField ValorSaida) {
        this.ValorSaida = ValorSaida;
}

public JButton getBotaoTestar() {
        return this.botaoTestar;
}

public void setBotaoTestar(JButton botaoTestar) {
        this.botaoTestar = botaoTestar;
}

public JButton getBotaoLimpar() {
        return this.botaoLimpar;
}

public void setBotaoLimpar(JButton botaoLimpar) {
        this.botaoLimpar = botaoLimpar;
}}


//     metodo para abrir a janela
public void criarJanela() {

        Container jal = getContentPane();
        setLayout(null);
  
        AcoesBotao act = new AcoesBotao();

        //input para digitar entrada
        JLabel valor = new JLabel("Entrada: ");
        ValorEntrada = new JTextField(10);

        //input para mostrar saida
        JLabel resultado = new JLabel("Saida: ");
        ValorSaida = new JTextField(10);
        
        //botoes da janela
        botaoTestar = new JButton("Executar");
        botaoLimpar = new JButton("Apagar");
        
        
//=====================================================================================

        //posicionamento dos campos de entrada e saida da janela
        valor.setBounds(50,40,100,20);
        resultado.setBounds(150,40,100,20);

        ValorEntrada.setBounds(50,80,100,20);
        ValorSaida.setBounds(150,80,100,20);
        
        //posicionamento botao
        botaoTestar.setBounds(50,120,150,20);
        botaoLimpar.setBounds(50,160,150,20);

//=====================================================================================


        //adicionando as propriedades nas janelas
        jal.add(valor);
        jal.add(ValorEntrada);
        jal.add(resultado);
        jal.add(ValorSaida);
        jal.add(botaoTestar);
        jal.add(botaoLimpar);
        
        //tamanho da janela
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

//=====================================================================================

//       metodos para executar as acoes dos botoes

        //metodo para limpar os campos inseridos
      botaoLimpar.addActionListener(new ActionListener(){
      
        public void actionPerformed(ActionEvent evt){
                act.limparCampos(ValorEntrada, ValorSaida);
        }
      });

    // metodo para testar os valores inseridos no campo
    botaoTestar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
                ValorSaida.setText("" + act.testarCampos(ValorEntrada));
        }
    });
}
}