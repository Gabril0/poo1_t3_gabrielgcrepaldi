public class C1 {
    public int publico;
    private int privado;
    protected int protegido;

    public C1(){
        publico = 1;
        privado = 1;
        protegido = 1;
        System.out.printf("\nClasse C1: chamada do construtor padrao, sem parametros");
    }
    public C1(int publico, int privado, int protegido){
        System.out.printf("\nClasse C1: chamada do construtor com parametros");
        this.publico = publico;
        this.privado = privado;
        this.protegido = protegido;
    }
    public void mostrarAtributosC1(){
        System.out.printf("\nC1: publico :%d, privado: %d, protegido: %d",publico,privado,protegido);
    }
}
