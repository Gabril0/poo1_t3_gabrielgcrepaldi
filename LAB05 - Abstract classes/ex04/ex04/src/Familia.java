public class Familia extends Contato{
    protected String parentesco;
    public Familia(String aniversario, String apelido, String email, String nome, String parentesco){
        this.aniversario = aniversario;
        this.apelido = apelido;
        this.email = email;
        this.nome = nome;
        this.parentesco = parentesco; 
    }

    public String imprimirContato(){
        return (imprimirBasico() + "," + parentesco);
    }
    public String getEspecial(){
        return parentesco;
    }
    
}
