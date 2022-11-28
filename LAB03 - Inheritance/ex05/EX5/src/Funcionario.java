public class Funcionario {
    private String nome, dataNascimento;
    private double salario;

    public Funcionario(){
        nome = "nome nao registrado";
        dataNascimento = "data nao registrada";
        salario = 0;
    }
    public Funcionario(String nome,String dataNascimento, double salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void setFuncionario(String nome,String dataNascimento, double salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    public void mostrarFuncionario(){
        System.out.printf("\nNome: %s\nData: %s\nSalario: %.2f",nome,dataNascimento,salario);
    }
}
