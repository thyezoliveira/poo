public class Tabuada {
    private int numero;

    public void setNumero(int vNumero) {
        numero = vNumero;
    }

    public int getNumeto(){
        return numero;
    }

    public String retTabuada1(int vTabuada) {
        String tabuada = "";
        int numeracao = 0;
        while(numeracao <= vTabuada) {
            tabuada = tabuada + numeracao + " x " + vTabuada + " = " + (numeracao * vTabuada) + "\n";
            numeracao++;
        }

        return tabuada;
    }

    public String retTabuada2(int vTabuada) {
        String tabuada = "";
        int numeracao = 1;
        while(numeracao <= 10) {
            tabuada = tabuada + numeracao + " x " + vTabuada + " = " + (numeracao * vTabuada) + "\n";
            numeracao++;
        }

        return tabuada;
    }
}
