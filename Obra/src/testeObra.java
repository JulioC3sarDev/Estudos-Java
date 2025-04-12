
public class testeObra {
    public static void main(String[] args){
        Obra ob1 = new Obra(4, "Construção da filial recife da empresa Tech Brasil Ltda", 30567342.34);

        boolean pagamento = ob1.informaPagamento(20000000.00);

        if (pagamento){
            System.out.println("Pagamento registrado");
            System.out.println("Valor pago: " + ob1.getValorPago());
        }
        else{
            System.out.println("Pagamento não registrado");
        }

        ob1.informaAndamento(40);
        System.out.printf("percentual conluido: %.0f%%\n" , ob1.getPercentualConcluido());

        ob1.informaAndamento(50);
        System.out.printf("percentual conluido: %.0f%%\n" , ob1.getPercentualConcluido());

        ob1.aditaContrato(2000000.00,10);
        System.out.printf("Valor pago na obra: R$%.0f\n" , ob1.getValorPago());
        System.out.printf("Percentual concluido: %.0f%%\n" , ob1.getPercentualConcluido());


        boolean pagamento2 = ob1.informaPagamento(500000000.00);

        if (pagamento2){
            System.out.println("Pagamento Regsitrado\n" + "Valor pago na obra: " + ob1.getValorPago());
        }
        else{
            System.out.println("Pagamento não Regsitrado\n" + "Valor pago na obra: " + ob1.getValorPago());
        }



    }
}
