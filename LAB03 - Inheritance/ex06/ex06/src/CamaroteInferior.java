public class CamaroteInferior extends VIP{
    private int assento;
    CamaroteInferior(double valor, int assento){
        super(valor);
        this.assento = assento;
    }
    public void imprimeAssento(){
        System.out.printf("\nAssento numero do camarote inferior: %d",assento);
    }

    public void setAssento(int assento){
        this.assento = assento;
    }
}
