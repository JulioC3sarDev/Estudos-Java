import java.util.Scanner;

public class Paciente {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        Exame paciente = new Exame();

        System.out.println("Qual a id do seu exame ? :");
        int id = usuario.nextInt();
        paciente.idExame = id;
        System.out.println("Qual seu nível de glicose ?:");
        int glicose = usuario.nextInt();
        paciente.nivelGlicose = glicose;

        System.out.println("O resultado do exame foi:\n");
        paciente.exibirDados();
    }
}
