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

    public Van(Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos, double valorDiaria) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos, valorDiaria);
        this.modelo = modelo;
    }
    
    public ModeloVan getModelo(){
    
        return modelo;
    }  
    
    
    @Override
    public double getValorDiariaLocacao () {
    
        switch (categoria) {
            case POPULAR:
                this.valorDiaria = 200;
                break;
            case INTERMEDIARIO:
                this.valorDiaria = 400;
                break;
            case LUXO:
                this.valorDiaria = 600;
                break;
            default:
                break;
        }
        return valorDiaria;
    }
    
 }

    

