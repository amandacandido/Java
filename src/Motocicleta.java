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

    public Motocicleta(Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos, double valorDiaria) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos, valorDiaria);
        this.modelo = modelo;
    }
    
    public ModeloMotocicleta getModelo(){
    
        return modelo;
    }  
    
    
    @Override
    public double getValorDiariaLocacao () {
    
        switch (categoria) {
            case POPULAR:
                this.valorDiaria = 70;
                break;
            case INTERMEDIARIO:
                this.valorDiaria = 200;
                break;
            case LUXO:
                this.valorDiaria = 350;
                break;
            default:
                break;
        }
        return valorDiaria;
    }
    
 }

    

