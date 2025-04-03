import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o saldo
        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();
        
        // Classifica o saldo
        String classificacao;
        if (saldo < 0) {
            classificacao = "Negativado";
        } 
        while(saldo > 0  && saldo <=500) {
            classificacao = "Baixo";
        } 
        else {
            classificacao = "Confortavel";
        }
        
        // Exibe a classificação
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
}