public class Calculator {
    public static int max(int n1, int n2, int n3){
        int a;

        if (n1 > n2 && n1 > n3) {
            a = n1;
        }
        else if (n2 > n3){
            a = n2;
        }
        else{
            a = n3;
        }
        return a;
    }

    public static void mostrarMaior(int max){
        System.out.println("O maior número é: " + max);
    }
}
