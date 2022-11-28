public class CamaroteSuperior extends VIP{
    private int assento;
    private double valor;
    CamaroteSuperior(double valor, int assento){
        super((valor*1.15384));
        this.assento = assento;
        this.valor = valor;
    }
    public void imprimeAssento(){
        System.out.printf("\nAssento numero do camarote superior: %d",assento);
    }

    public void setAssento(int assento){
        this.assento = assento;
    }

    public void printValor(){
        super.escreveValor();
    }
    public double returnValor(){
        return (valor*1.15384);
    }
}