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

<<<<<<< HEAD
    public Van(Marca marca, ModeloVan modelo, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos);
=======
    public Van(Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos, double valorDiaria) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos, valorDiaria);
>>>>>>> origin/master
        this.modelo = modelo;
    }
    
    public ModeloVan getModelo(){
    
        return modelo;
    }  
    
    
    @Override
    public double getValorDiariaLocacao () {
<<<<<<< HEAD
        if (getCategoria() == Categoria.POPULAR){
            return 200.00;
        } else if (getCategoria() == Categoria.INTERMEDIARIO){
            return 400.00;
        } else {
            return 600.00;
        }
=======
    
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
>>>>>>> origin/master
    }
    
 }

    

