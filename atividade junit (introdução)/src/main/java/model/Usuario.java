package model;

public class Usuario{

    private String username;
    private String rg;
    private String dataNasc;


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public boolean equals (Object obj){
        
        if(obj instanceof Usuario){
            
            Usuario u = (Usuario) obj;
            if(u.getUsername().equals(this.getUsername()) && u.getRg().equals(this.getRg()) && u.getDataNasc().equals(this.getDataNasc())){
                return true;
            }
            return false;
        }
        return false;
    } 

    // assertEquals(usuarios.get(1), acha);
}