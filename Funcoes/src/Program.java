import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Digite 3 Números: ");
        int n1 = usuario.nextInt();
        int n2 = usuario.nextInt();
        int n3 = usuario.nextInt();

        int maximo = Calculator.max(n1,n2,n3);

        Calculator.mostrarMaior(maximo);
    }

}