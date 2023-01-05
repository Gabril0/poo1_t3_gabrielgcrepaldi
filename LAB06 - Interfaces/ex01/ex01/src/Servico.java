public class Servico implements Classificavel{
    private double preco;

    Servico(double preco){
        this.preco = preco;}
        
    public boolean eMenorQue (Classificavel obj){
        Servico compara = (Servico) obj;
        if ( this.preco < compara.preco ) {
        return true ;
        } else {
        return false ;
        }

    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
}
