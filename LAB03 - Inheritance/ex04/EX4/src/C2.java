public class C2 extends C1{
    public int publico;
    private int privado;
    protected int protegido;

    public C2(){
        publico = 2;
        privado = 2;
        protegido = 2;
        System.out.printf("\nClasse C2: chamada do construtor padrao, sem parametros");
    }
    public C2(int publico, int privado, int protegido){
        super(publico,privado,protegido);
        System.out.printf("\nClasse C2: chamada do construtor com parametros");
        this.publico = publico;
        this.privado = privado;
        this.protegido = protegido;
        
    }
    public void mostrarAtributosC2(){
        System.out.printf("\nC2: publico %d, privado: %d, protegido: %d",publico,privado,protegido);
    }
    public void mostrarAtributosSuper(){
        super.mostrarAtributosC1();
    }
}
