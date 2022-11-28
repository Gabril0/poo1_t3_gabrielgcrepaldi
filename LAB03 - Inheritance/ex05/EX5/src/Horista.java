public class Horista extends Funcionario{
    public Horista(String nome, String dataDeNascimento, double valor, double horas){
        super();
        setFuncionario(nome, dataDeNascimento, (valor * horas));
}
public void mostraSalario(){
    super.mostrarFuncionario();
}
}
