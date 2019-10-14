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

    // public Usuario username(String username) {
    //     this.username = username;
    //     return this;
    // }

    // public Usuario rg(String rg) {
    //     this.rg = rg;
    //     return this;
    // }

    // public Usuario dataNasc(String dataNasc) {
    //     this.dataNasc = dataNasc;
    //     return this;
    // }
}