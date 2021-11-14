public class ProgramaPrincipal {//Ao envés de TestarCarro eu defini o nome da minha classe principal de ProgramaPrincipal (Inglês: MainProgram)
    public static void main(String args[]) { //Temos uma função principal que é executada quando o programa se inicia...
        FabricarCarro fabricaEletrica = new FabricarCarro("eletrico", "preto"); //É possível deixar o programa principal bem clean e usar outras classes para
        FabricarCarro fabricaCombustao = new FabricarCarro(null, "metálico"); //os procedimentos gerais do programa, o código fica mais legível.
    } //...E termina aqui!
}