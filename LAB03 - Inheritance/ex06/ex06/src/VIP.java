public class VIP extends Ingresso{
    public VIP(double preco){
        super((preco*1.3));
    }
    public void imprimeVIP(){
        super.escreveValor();
    }
    
}
