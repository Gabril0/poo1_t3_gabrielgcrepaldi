public class Main {
    public static void main(String[] args) {
        Figurinha[] fig = new Figurinha[3];

        for(int i = 0; i < 3; i++){
            if(i == 0){
                fig[0] = new Figurinha();

                fig[0].alteraNome("Kevin Shields");
                fig[0].alterarAltura(150.00);
                fig[0].alterarData("1950-12-12");
                fig[0].alterarPais("Irlanda");
                fig[0].alterarPeso(60);
                fig[0].alterarPosicao("Atacante");}

            if(i == 1){
                fig[1] = new Figurinha();

                fig[1].alteraNome("Billy Corgan");
                fig[1].alterarAltura(1.60);
                fig[1].alterarData("1985-01-29");
                fig[1].alterarPais("Estados Unidos");
                fig[1].alterarPeso(70);
                fig[1].alterarPosicao("Goleiro");}

            if(i == 2){
                fig[2] = new Figurinha();

                fig[2].alteraNome("Thurston Moore");
                fig[2].alterarAltura(1.80);
                fig[2].alterarData("1969-09-06");
                fig[2].alterarPais("Estados Unidos");
                fig[2].alterarPeso(60);
                fig[2].alterarPosicao("Zagueiro");}
        }
    }
}
