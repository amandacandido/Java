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
    private String nome, sobrenome, CPF, RG, endereco ;
        
    public Cliente(String nome, String sobrenome, String CPF, String RG, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }
   
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
