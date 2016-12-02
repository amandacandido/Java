/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Amanda
 */
public class Automovel extends Veiculo {

    private ModeloAutomovel modelo;

    public Automovel(Marca marca, ModeloAutomovel modelo, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos);
        this.modelo = modelo;
    }
    
    public ModeloAutomovel getModelo(){
    
        return modelo;
    }  
    
    
    @Override
    public double getValorDiariaLocacao () {
        if (getCategoria() == Categoria.POPULAR){
            return 100.00;
        } else if (getCategoria() == Categoria.INTERMEDIARIO){
            return 300.00;
        } else {
            return 450.00;
        }
    }
    
 }

    

