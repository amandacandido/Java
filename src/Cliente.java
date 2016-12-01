/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Amanda
 */
public class Cliente {
    private String nome, sobrenome, CPF, RG, rua ;
    private int numero, cidade, uf;
        
    public Cliente(String nome, String sobrenome, String CPF, String RG, String rua, int numero, 
            int cidade, int uf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.RG = RG;
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setUf(int uf) {
        this.uf = uf;
    }
        
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public String getRua() {
        return rua;
    }
   
    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }    

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCidade() {
        return cidade;
    }
    
    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public int getUF() {
        return uf;
    }
    
    public void setUF(int uf) {
        this.uf = uf;
    }
    
}
