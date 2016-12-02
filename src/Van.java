/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
public class Van extends Veiculo {

    private ModeloVan modelo;

    public Van(Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos);
        this.modelo = modelo;
    }
    
    public ModeloVan getModelo(){
    
        return modelo;
    }  
    
    
       
    @Override
    public double getValorDiariaLocacao () {
    
    return 0.0;
    }

    
}
