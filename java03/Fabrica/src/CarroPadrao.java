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