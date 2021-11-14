class CarroEletrico extends CarroPadrao { //Esta classe estende a classe CarroPadrao o que chamamos de herança é a capacidade de uma classe herdar
    CarroEletrico(String cor){ // atributos e métodos da classe pai, que neste caso é a CarroPadrao
        super(cor); //Super é usado em uma classe para herdar os parametros passados pela classe pai
        this.tipoDeMotor = "Elétrico";//Este é um exemplo de acesso e redefinição do atributo tipoDeMotor da classe pai dizendo que este carro é "Elétrico"
        this.cor = cor;             //Aqui também
    }
}