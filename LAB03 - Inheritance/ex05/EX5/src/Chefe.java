public class Chefe extends Funcionario{
    public Chefe(String nome, String dataDeNascimento, double salario){
    super(nome,dataDeNascimento,salario);}

    public void mostraSalario(){
        super.mostrarFuncionario();
    }
}
