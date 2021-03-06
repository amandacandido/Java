/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Amanda
 */
public class Motocicleta extends Veiculo {

    private ModeloMotocicleta modelo;

    public Motocicleta(Marca marca,ModeloMotocicleta modelo, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos);
        this.modelo = modelo;
    }
    
    public ModeloMotocicleta getModelo(){
    
        return modelo;
    }  
    
    
    @Override
    public double getValorDiariaLocacao () {
        if (getCategoria() == Categoria.POPULAR){
            return 70.00;
        } else if (getCategoria() == Categoria.INTERMEDIARIO){
            return 200.00;
        } else {
            return 350.00;
        }
    }
    
 }

    

