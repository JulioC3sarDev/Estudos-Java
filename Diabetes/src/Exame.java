public class Exame {
    public int idExame;
    public int nivelGlicose;

    public String obterDiagnostico(){
        if (nivelGlicose <= 99){
            return "Seu diagnóstico é normal!";
        }
        else if(nivelGlicose >= 100 && nivelGlicose <=125){
            return "Seu diagnóstico é Pré-diabate! ";
        }
        else{
            return "Seu diagnóstico é Diabetes!";
        }
    }

     public void exibirDados(){
        System.out.println("ID: " + idExame);
        System.out.println("Nivel glicose: " + nivelGlicose + " mg/dl");
        System.out.println(obterDiagnostico());
    }

}