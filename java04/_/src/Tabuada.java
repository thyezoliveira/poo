public class Tabuada {
    private int numero; //Este atributo ne é usado na questão

    public void setNumero(int vNumero) { //NEm este método
        numero = vNumero;
    }

    public int getNumeto(){ // E nem este
        return numero;
    }

    public String retTabuada1(int vTabuada) { //Versão original do método usado na questão
        String tabuada = "";
        int numeracao = 0; /*Ao manter este 0 aqui, sempre haverá a multiplicação 
        por zero no inicio, que sabemos que com qualquer numero dá zero*/
        while(numeracao <= vTabuada) { /*E aqui se mantermos o parametro, toda vez que inserirmos um numero
            como parametro, estaremos também limitando a contagem, por exemplo, 5 teremos somente a
            tabuada até o 5o multiplicador rode o App e veja */
            tabuada = tabuada + numeracao + " x " + vTabuada + " = " + (numeracao * vTabuada) + "\n";
            numeracao++;
        }

        return tabuada;
    }

    public String retTabuada2(int vTabuada) { //Minha versão modificada do método acima
        String tabuada = "";
        int numeracao = 1; //Somente troquei o valor para 1
        while(numeracao <= 10) { //E substitui o vTabuada por 10
            tabuada = tabuada + numeracao + " x " + vTabuada + " = " + (numeracao * vTabuada) + "\n";
            numeracao++;
        }

        return tabuada;
    }

    public String retTabuada3(int vTabuada) { //Versão da questão 4
        String tabuada = "";
        int numeracao;

        for(numeracao = 0; numeracao <= vTabuada; numeracao++) {
            tabuada = tabuada + numeracao + " x " + vTabuada + " = " + (numeracao * vTabuada) + "\n";
        }

        return tabuada;
    }
}
