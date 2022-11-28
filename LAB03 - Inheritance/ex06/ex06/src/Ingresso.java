public class Ingresso {
    private double preco;
    public Ingresso(){
        this.preco = 30;
    }

    public Ingresso(double preco){
        this.preco = preco;
    }

    public void escreveValor(){
        System.out.printf("\nValor: %.2f",preco);
    }
}
