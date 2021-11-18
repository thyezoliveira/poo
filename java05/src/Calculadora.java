public class Calculadora implements InterfacePrimaria, InterfaceSecundaria {

    private String texto03 = "Atributo da classe implementadora das interfaces.";

    Calculadora(){
        this.mostrarNaTela();
    }

    public void soma(int x, int y){ //Método de soma com inteiros
        System.out.println(x + y);
    }

    public void soma(float x, float y){ // Sobrecarga do método soma com float
        System.out.println(x + y);
    }

    //Métodos obrigatórios da interface primária

    public String paraTexto(int n){ //Método da interface primaria com parâmetro
        return Integer.toString(n); //Também poderia ser String.valueOf(n)
    }

    public void mostrarNaTela(){ // Método da interface primaria
        System.out.println("Método da interface primária: "+texto01);
        System.out.println("Método da interface primária: "+texto02);
        System.out.println("Método da interface primária: "+this.texto03);
    }
}
