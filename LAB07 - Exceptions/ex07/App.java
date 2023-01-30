public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario("cpf","nome",5000);
        try{f.aumentaSalarioThrows(10);}
        catch(IllegalStateException ise){
            System.out.println("Numero digitado estoura os limites");
        }
        finally{
            System.out.println(f.getSalario());
        }
        f.aumentaSalario(-10); //erro SalarioNegativoException
        f.aumentaSalario(10);  //erro EstourouTetoException
    }
}
