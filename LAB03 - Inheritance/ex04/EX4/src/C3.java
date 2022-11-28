public class C3 extends C2{
    public int publico;
    private int privado;
    protected int protegido;

    public C3(){
        publico = 3;
        privado = 3;
        protegido = 3;
        System.out.printf("\nClasse C3: chamada do construtor padrao, sem parametros");
    }
    public C3(int publico, int privado, int protegido){
        super(publico,privado,protegido);
        this.publico = publico;
        this.privado = privado;
        this.protegido = protegido;
        System.out.printf("\nClasse C3: chamada do construtor com parametros");  
    }
    public void mostrarAtributos(){
        System.out.printf("\nC3: publico :%d, privado: %d, protegido: %d",publico,privado,protegido);
    }
    public void mostrarAtributosSuper(){
        super.mostrarAtributosC2();
    }
}
