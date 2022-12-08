public class FolhaPagamento{
    private double salarioTotal = 0;
    FolhaPagamento(Funcionario fun[], int numeroDeFuncionarios){
        for(int i = 0; i<numeroDeFuncionarios; i++){
        fun[i].mostrarFuncionario();
        salarioTotal = fun[i].getSalario() + salarioTotal;
    }
    System.out.printf("\nGastos com salario: %.2f", salarioTotal);
    }
    public void printFolha(){}
}