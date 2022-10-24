import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Figurinha kevin = new Figurinha();
        Figurinha billy = new Figurinha();
        Figurinha thurston = new Figurinha();


        kevin.altura = 1.80;
        kevin.peso = 60;
        kevin.dataDeNascimento = LocalDate.parse("1979-05-12");
        kevin.nomeDoJogador = "Kevin Shields";
        kevin.pais = "Irlanda";
        kevin.posicao = "Atacante";

        billy.altura = 1.60;
        billy.peso = 70;
        billy.dataDeNascimento = LocalDate.parse("1985-01-29");
        billy.nomeDoJogador = "Billy Corgan";
        billy.pais = "Estados Unidos";
        billy.posicao = "Goleiro";

        thurston.altura = 1.80;
        thurston.peso = 60;
        thurston.dataDeNascimento = LocalDate.parse("1969-09-06");
        thurston.nomeDoJogador = "Thurston Moore";
        thurston.pais = "Estados Unidos";
        thurston.posicao = "Zagueiro";

        System.out.printf("\n\nNome do Jogador: %s",kevin.nomeDoJogador);
        System.out.printf("\nAltura: %.2f",kevin.altura);
        System.out.printf("\nPeso: %.2f",kevin.peso);
        System.out.printf("\nData de Nascimento: %s",kevin.dataDeNascimento);
        System.out.printf("\nPais: %s",kevin.pais);
        System.out.printf("\nPosicao: %s",kevin.posicao);

        System.out.printf("\n\nNome do Jogador: %s",billy.nomeDoJogador);
        System.out.printf("\nAltura: %.2f",billy.altura);
        System.out.printf("\nPeso: %.2f",billy.peso);
        System.out.printf("\nData de Nascimento: %s",billy.dataDeNascimento);
        System.out.printf("\nPais: %s",billy.pais);
        System.out.printf("\nPosicao: %s",billy.posicao);

        System.out.printf("\n\nNome do Jogador: %s",thurston.nomeDoJogador);
        System.out.printf("\nAltura: %.2f",thurston.altura);
        System.out.printf("\nPeso: %.2f",thurston.peso);
        System.out.printf("\nData de Nascimento: %s",thurston.dataDeNascimento);
        System.out.printf("\nPais: %s",thurston.pais);
        System.out.printf("\nPosicao: %s",thurston.posicao);


    }
}
