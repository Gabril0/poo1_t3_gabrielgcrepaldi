public class EstourouTetoException extends IllegalStateException{
    EstourouTetoException(){
        super("Valor ultrapassa o teto");
    }
}
