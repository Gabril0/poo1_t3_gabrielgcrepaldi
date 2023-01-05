public class Cliente implements Classificavel{
    private String nome;

    Cliente (String nome){
        this.nome = nome;}
        
    public boolean eMenorQue (Classificavel obj){
        Cliente compara = (Cliente) obj;
        if ( this.nome.length() < compara.nome.length()) {
        return true ;
        } else {
        return false ;
        }

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCodigo(){
        return nome;
    }
}
