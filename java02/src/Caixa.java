import java.util.Scanner;

public class Caixa {

    private Integer id = 98495164;
    private Double saldo = 0.0;
    Scanner teclado = new Scanner(System.in);
    
    public void startMenu(){
        System.out.println("==MENU==========================");
        System.out.println("Tecle uma opção e em seguida tecle Enter.");
        System.out.println("[1] - Depositar");
        System.out.println("[2] - Saldo");
        System.out.println("[0] - Encerrar");
        Byte escolha = teclado.nextByte();
        this.option(escolha);
    }

    private void option(Byte opcao){
        switch(opcao){
            case 1:
                System.out.println("============");
                System.out.println("Area de Deposito");
                System.out.println("============");
                System.out.print("Digite o valor e tecle enter:");
                Double valor = teclado.nextDouble();
                this.depositar(valor);
                break;
            case 2:
                System.out.println("============");
                System.out.println("Area de saldo");
                System.out.println("Conta: " + this.id);
                mostrar();
                this.novaOperacao();
                break;
            case 0:
                System.out.println("Obrigado por usar os nossos serviços!");
                System.out.println("FIM");
                break;
            default:
                break;
        }
    }
    
    private void mostrar(){
        System.out.println("Seu saldo agora é de: " + receberSaldo());
    }

    private void novaOperacao(){
        System.out.print("Deseja fazer outra operação? [1] sim / [0] não :");
        Byte simounao = teclado.nextByte();
        if(simounao == 1){
            this.startMenu();
        } else {
            this.fim();
        }
    }

    private void fim(){
        System.out.println("Obrigado por usar os nossos serviços!");
        System.out.println("Fim!");
    }

    private Double receberSaldo(){
        return saldo;
    }
    
    private void depositar(Double deposito){
        this.saldo = this.saldo + deposito;
        this.mostrar();
        this.novaOperacao();
    }
}