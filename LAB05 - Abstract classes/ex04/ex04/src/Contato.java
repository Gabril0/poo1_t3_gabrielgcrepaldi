public abstract class Contato {
    protected String apelido, nome, email, aniversario;

    public String imprimirBasico(){
        return (apelido + ", " + nome + ", " + email + ", " + aniversario);
    }
    public abstract String imprimirContato();
    public abstract String getEspecial();
}
