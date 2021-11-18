public interface InterfacePrimaria {
    // Interfaces podem ter constantes e passar estas constantes para as classes que a implementam
    final String texto01 = "Constante da interface primaria.";

    // Os métodos de interfaces sào ocos e são obrigatórios nas classes que implementam a interface 
    public String paraTexto(int n);
    public void mostrarNaTela();
}