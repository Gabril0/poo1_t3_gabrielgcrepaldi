public class ContaEspecial extends ContaCorrente{
    private float limite;

    ContaEspecial(float limite, float val , int num , int pwd){
        super(val,num,pwd);
        this.limite = limite;
        if(limite == 0){
            ContaComum cc = new ContaComum(val,num,pwd);
    }
}
}
