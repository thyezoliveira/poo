import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite a idade:");
        String idade = Integer.toString(teclado.nextInt());
        System.out.print("Nome: " + nome + "| Idade: " + idade);
    }
}