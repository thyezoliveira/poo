public class ProgramaPrincipal {//Ao envés de TestarCarro eu defini o nome da minha classe principal de ProgramaPrincipal (Inglês: MainProgram)
    public static void main(String args[]) { //Temos uma função principal que é executada quando o programa se inicia...
        FabricarCarro fabricaEletrica = new FabricarCarro("eletrico", "preto"); //É possível deixar o programa principal bem clean e usar outras classes para
        FabricarCarro fabricaCombustao = new FabricarCarro(null, "metálico"); //os procedimentos gerais do programa, o código fica mais legível.
    } //...E termina aqui!
}

class CarroPadrao { //Esta é a classe PAI
    private Byte quantidadeDeRodas = 4; //Os atributos são public para que possam ser acessado por outras classes
    public String tipoDeMotor = ""; //Se fosse private, outras classes nao poderiam acessar os atributos do objeto
    public String cor = "";             //Inclusive classes filhas não podem acessar
    public Integer velocidade = 0;
    
    CarroPadrao(String cor){ //Método construtor da classe. O método contrutor te permite passar parãmetros durante a criação do objeto
        this.setMotor("Combustão");// Neste caso o construtor está usando o setMotor para definir o valor do atributo tipoDeMotor para "Combustão" sem precisar
        this.cor =  cor;// passar pelos parâmetros mas todos os atributos podem ser definidos por parâmetro, como é o caso da cor aqui.
    }
    
    private void setMotor(String tipo){ //Este método recebe um parâmetro que é o tipo de motor que o carro terá este parametro vai ser uma String
                                        //Curiosidade: A palavra set quer dizer definir e o get é pegar, então quado dizemos que vamos setar um valor
                                        //quer dizer que vamos definir um valor, mesmo que já tenha um valor definido. Nós definimos por cima do
                                        //valor antigo, um novo valor.
        this.tipoDeMotor = tipo;//E aqui ele pega o atributo do objeto tipoDeMotor e substitui o valor que tá lá, que é vazio, pelo valor passado por parâmetro
    }
    
    public String getTipoDeMotor(){
        return this.tipoDeMotor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public Byte getRodas(){
        return this.quantidadeDeRodas;
    }
}

class CarroEletrico extends CarroPadrao { //Esta classe estende a classe CarroPadrao o que chamamos de herança é a capacidade de uma classe herdar
    CarroEletrico(String cor){ // atributos e métodos da classe pai, que neste caso é a CarroPadrao
        super(cor); //Super é usado em uma classe para herdar os parametros passados pela classe pai
        this.tipoDeMotor = "Elétrico";//Este é um exemplo de acesso e redefinição do atributo tipoDeMotor da classe pai dizendo que este carro é "Elétrico"
        this.cor = cor;             //Aqui também
    }
}

class FabricarCarro {
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