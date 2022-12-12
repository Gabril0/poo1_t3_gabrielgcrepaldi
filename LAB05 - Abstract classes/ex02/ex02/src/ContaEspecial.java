public class ContaEspecial extends ContaCorrente{
    private float limite;

    ContaEspecial(float limite){
        super(5,2,100);
        this.limite = limite;
        if(limite == 0){
            ContaComum cc = new ContaComum();
    }
}
}
