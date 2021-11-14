public class FabricarCarro { //Este método, fará uso dos outros métodos
    FabricarCarro(String tipo, String cor){
        if(tipo == "Elétrico" || tipo == "Eletrico" || tipo == "eletrico" || tipo == "elétrico"){
            CarroEletrico carro = new CarroEletrico(cor);
            System.out.println("Um carro " + carro.getTipoDeMotor() + " de cor " + carro.getCor() + " foi fabricado.");
        } else if(tipo == null){
            CarroPadrao carro = new CarroPadrao(cor);
            System.out.println("Um carro " + carro.getTipoDeMotor() + " de cor " + carro.getCor() + " foi fabricado.");
        }
    }
}
