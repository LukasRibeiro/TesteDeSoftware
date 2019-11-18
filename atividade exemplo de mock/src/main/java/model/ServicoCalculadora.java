package model;


public class ServicoCalculadora{

    private Calculadora calc;

    public ServicoCalculadora(Calculadora calc){
        this.calc = calc;
    }

    public String calcular(String x, String y, String opt){
        
        String retorno = null;

        try{
            Float xf = Float.valueOf(x);
            Float yf = Float.valueOf(y);
            if(opt.equals("+")){
                retorno = calc.somar(xf, yf).toString();
            }
        } catch (NumberFormatException nfe){
            retorno = "invalido";
        }
        return retorno;
    }


}