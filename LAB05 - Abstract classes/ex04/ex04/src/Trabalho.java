public class Trabalho extends Contato{
    protected String tipo;
    public Trabalho(String aniversario, String apelido, String email, String nome, String tipo){
        this.aniversario = aniversario;
        this.apelido = apelido;
        this.email = email;
        this.nome = nome;
        this.tipo = tipo; 
    }

    public String imprimirContato(){
        return (imprimirBasico() + "," + tipo);
    }
    
    public String getEspecial(){
        return tipo;
    }
}
