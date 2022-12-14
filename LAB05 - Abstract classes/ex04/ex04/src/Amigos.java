public class Amigos extends Contato{
    protected String grauS;
    public Amigos(String aniversario, String apelido, String email, String nome, int grau){
        this.aniversario = aniversario;
        this.apelido = apelido;
        this.email = email;
        this.nome = nome;
        if(grau == 1)grauS = "melhor amigo";
        else if(grau == 2)grauS = "amigo";
        else grauS = "conhecido";
    }

    public String imprimirContato(){
        return (imprimirBasico() + ","+grauS);
    }
    public String getEspecial(){
        return grauS;
    }
    
}
