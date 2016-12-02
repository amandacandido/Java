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

<<<<<<< HEAD
    public Motocicleta(Marca marca,ModeloMotocicleta modelo, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos);
=======
    public Motocicleta(Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano, int idadeVeiculoEmAnos, double valorDiaria) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano, idadeVeiculoEmAnos, valorDiaria);
>>>>>>> origin/master
        this.modelo = modelo;
    }
    
    public ModeloMotocicleta getModelo(){
    
        return modelo;
    }  
    
    
    @Override
    public double getValorDiariaLocacao () {
<<<<<<< HEAD
        if (getCategoria() == Categoria.POPULAR){
            return 70.00;
        } else if (getCategoria() == Categoria.INTERMEDIARIO){
            return 200.00;
        } else {
            return 350.00;
        }
=======
    
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
>>>>>>> origin/master
    }
    
 }

    

