public class main {
    public static void main(String[] args) throws Exception {
        C1 c1 = new C1();
        C2 c2 = new C2();
        C3 c3 = new C3();
        c1.mostrarAtributosC1();
        System.out.printf("\nsuper: ");
        c2.mostrarAtributosSuper();
        c2.mostrarAtributosC2();
        System.out.printf("\nsuper: ");
        c3.mostrarAtributosSuper();
        c3.mostrarAtributos();
    }
}
