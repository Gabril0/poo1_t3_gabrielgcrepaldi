public class SalarioNegativoException extends IllegalStateException{
    SalarioNegativoException(){
        super("Valor invalido de salario");
        // isso funciona pois a super eh Exception, e o primeiro parametro eh a string de erro
    }
}
