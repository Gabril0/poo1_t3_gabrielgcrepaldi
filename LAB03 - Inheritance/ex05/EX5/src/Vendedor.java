public class Vendedor extends Funcionario{
    public Vendedor(String nome, String dataDeNascimento, double salario, double comissao, double vendas){
        super();
        double calculo;
        calculo = comissao * vendas;
        setFuncionario(nome, dataDeNascimento, (salario + calculo));
        }
    
        public void mostraSalario(){
            super.mostrarFuncionario();
        }
}
