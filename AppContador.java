import java.util.Scanner;

public class AppContador {

    public static void main (String args[]){

    Scanner scanner = new Scanner (System.in);
    Contador contador = new Contador(500);

    double valorIncremento;

    System.out.printf("Saldo atual: %.2f\n", contador.getValorCount());

    System.out.println("Valor a ser incrementado: ");
    valorIncremento = scanner.nextDouble();
    System.out.printf("Saldo atual: %.2f\n", contador.incrementar(contador.getValorCount(), valorIncremento));

    System.out.printf("Saldo atual: %.2f\n", contador.zerar(contador.getValorCount()));

    
    }
}
