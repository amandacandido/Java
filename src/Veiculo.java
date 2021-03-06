
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
public abstract class Veiculo implements VeiculoI {
    private Marca marca;
    private Estado estado;
    private Locacao locacao;
    private Categoria categoria;
    private double valorDeCompra;
    private String placa;
    private int ano;
    private int idadeVeiculoEmAnos;
    private Tipo tipo;


    public Veiculo(Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos) {
        this.marca = marca;
        this.estado = estado;
        this.locacao = locacao;
        this.categoria = categoria;
        this.valorDeCompra = valorDeCompra;
        this.placa = placa;
        this.ano = ano;
        this.idadeVeiculoEmAnos = idadeVeiculoEmAnos;
    }

    public abstract double getValorDiariaLocacao();

    //Muda estado para LOCADO. Cria uma instância de Locacao e armazena no atributo locacao. Chama o método getValorDiariaLocacao para calcular o valor da locação.
    public void locar(int dias, Calendar data, Cliente cliente){
        this.estado = Estado.LOCADO;
        this.locacao = new Locacao(dias, getValorDiariaLocacao(), data, cliente);
    }

    //Muda estado para VENDIDO e não pode mais ser alugado
    public void vender(){
        this.estado = Estado.VENDIDO;
    }

    //Muda estado para DISPONIVEL
    public void devolver(){
        this.estado = Estado.DISPONIVEL;
    };


    public Estado getEstado() {
        return estado;
    }
    
    public Marca getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }  
    
    public Locacao getLocacao() {
        return locacao;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public int getAno() {
        return ano;
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
    //Método que calcula um valor para venda. Utilizar o seguinte cálculo:
    //valorParaVenda = valorDeCompra – idadeVeiculoEmAnos*0,15*valorDeCompra
    //Se o resultado for menor do que 10% do valorDeCompra ou negative, então
    // varlorParaVenda = valorDeCompra*0,1
    public double getValorParaVenda(){
        double valorParaVenda;
        valorParaVenda = this.valorDeCompra - this.idadeVeiculoEmAnos*0.15*this.valorDeCompra;
        if (valorParaVenda < (this.valorDeCompra*0.1))
            valorParaVenda = this.valorDeCompra*0.1;
        return valorParaVenda;
    }

}
