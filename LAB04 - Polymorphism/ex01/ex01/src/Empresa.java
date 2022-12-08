public class Empresa {
    public static void main(String[] args) throws Exception {
        Funcionario[] funcionario = new Funcionario[10];
        

        System.out.printf("\n\nChefe:");
        funcionario[0] = new Chefe("Chefia","Chefersario",20000);
        funcionario[0].mostrarFuncionario();

        System.out.printf("\n\nVendedor:");
        funcionario[1] = new Vendedor("Verdedoro","Verdersario",2000, 200, 5);
        funcionario[1].mostrarFuncionario();

        System.out.printf("\n\nOperario:");
        funcionario[2] = new Operario("Operarodos","Operasario",200, 5);
        funcionario[2].mostrarFuncionario();

        System.out.printf("\n\nHorista:");
        funcionario[3] = new Horista("Horistadora","Horistasario",35, 160);
        funcionario[3].mostrarFuncionario();
        System.out.println("\nFolha de pagamento:");
        FolhaPagamento fp = new FolhaPagamento(funcionario, 3);
    }
}
