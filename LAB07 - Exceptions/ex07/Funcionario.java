public class Funcionario {
    private String cpf, nome;
    private double salario, teto = 40000;

    Funcionario(String cpf, String nome, double salario){
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        if(salario<=teto){
        this.salario = salario;}
        else System.out.println("ERRO");
    }
    public double getTeto() {
        return teto;
    }
    public void setTeto(double teto) {
        this.teto = teto;
    }
    public void aumentaSalario(double percentual){
        double temp;
        temp =  salario; //armazenamento do salario antigo
        salario = salario * percentual;
        if(salario < 0){
            System.out.println(salario);
            throw new SalarioNegativoException();
        }
        if(salario>teto){
            System.out.println(salario);
            throw new EstourouTetoException();
        }
    }

    public void aumentaSalarioThrows(double percentual) throws SalarioNegativoException, EstourouTetoException{
        double temp;
        temp =  salario; //armazenamento do salario antigo
        salario = salario * percentual;
        if(salario < 0){
            System.out.println(salario);
            throw new SalarioNegativoException();
        }
        if(salario>teto){
            System.out.println(salario);
            throw new EstourouTetoException();
        }
    }

}
