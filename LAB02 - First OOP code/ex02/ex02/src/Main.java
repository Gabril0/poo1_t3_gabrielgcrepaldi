public class Main {
    public static void main(String[] args){
        Figurinha kevin = new Figurinha();
        kevin.alteraNome("Kevin Shields");
        kevin.alterarAltura(150.00);
        kevin.alterarData("1950-12-12");
        kevin.alterarPais("Irlanda");
        kevin.alterarPeso(60);
        kevin.alterarPosicao("Atacante");

        Figurinha billy = new Figurinha();
        billy.alteraNome("Billy Corgan");
        billy.alterarAltura(1.60);
        billy.alterarData("1985-01-29");
        billy.alterarPais("Estados Unidos");
        billy.alterarPeso(70);
        billy.alterarPosicao("Goleiro");

        Figurinha thurston = new Figurinha();
        thurston.alteraNome("Thurston Moore");
        thurston.alterarAltura(1.80);
        thurston.alterarData("1969-09-06");
        thurston.alterarPais("Estados Unidos");
        thurston.alterarPeso(60);
        thurston.alterarPosicao("Zagueiro");
    }
}
