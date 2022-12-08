public class Operario extends Funcionario{
    public Operario(String nome, String dataDeNascimento, double producao, double quantidade){
            super();
            setFuncionario(nome, dataDeNascimento, (producao * quantidade));
    }
    public void mostraSalario(){
        super.mostrarFuncionario();
    }
}
