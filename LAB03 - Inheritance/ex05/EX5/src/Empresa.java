public class Empresa {
    public static void main(String[] args) throws Exception {
        Chefe[] ch = new Chefe[3];
        Vendedor[] ven = new Vendedor[3];
        Operario[] op = new Operario[3];
        Horista[] hor = new Horista[3];

        System.out.printf("\n\nChefe:");
        ch[0] = new Chefe("Chefia","Chefersario",20000);
        ch[0].mostraSalario();

        System.out.printf("\n\nVendedor:");
        ven[0] = new Vendedor("Verdedoro","Verdersario",2000, 200, 5);
        ven[0].mostraSalario();

        System.out.printf("\n\nOperario:");
        op[0] = new Operario("Operarodos","Operasario",200, 5);
        op[0].mostraSalario();

        System.out.printf("\n\nHorista:");
        hor[0] = new Horista("Horistadora","Horistasario",35, 160);
        hor[0].mostraSalario();
    }
}
