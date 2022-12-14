public class ContaComum extends ContaCorrente{
    private float limite;

    ContaComum(float val , int num , int pwd){  
        super(val,num,pwd);
        limite = 0;
    }
}
