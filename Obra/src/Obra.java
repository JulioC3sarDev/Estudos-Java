public class Obra{
    private int idObra;
    private String descricao;
    private double valorObra;
    private double valorPago;
    private double percentualConcluido;
    private  boolean emAndamento;

    public Obra(int idObra, String descricao, double valorObra ){
        this.idObra = idObra;
        this.valorObra = valorObra;
        this.descricao = descricao;
        this.valorPago = 0;
        this.percentualConcluido = 0;
        this.emAndamento = true;
    }

    public boolean informaPagamento(double valor){
        if (valor <= this.valorObra){
            this.valorPago = valor;
            return true;

        }
        if (this.percentualConcluido > 100){
            this.percentualConcluido = 100;

        }
        if(this.percentualConcluido == 100 && this.valorPago == this.valorObra){
            this.emAndamento = false;
        }

        return false;
    }
    public void informaAndamento(double percentualAdicional){
        this.percentualConcluido = percentualAdicional;
        if (this.percentualConcluido > 100){
            this.percentualConcluido = 100;
        }
        if(this.percentualConcluido == 100 && this.valorPago == this.valorObra){
            this.emAndamento = false;
        }
    }
    public void aditaContrato(double valor, double percentualImpacto){
        this.valorObra += valor;
        this.percentualConcluido = this.percentualConcluido
                -(this.percentualConcluido * percentualImpacto/100);
    }

    public int getIdObra() {
        return idObra;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorObra() {
        return valorObra;
    }

    public double getValorPago() {
        return valorPago;
    }

    public double getPercentualConcluido() {
        return percentualConcluido;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}