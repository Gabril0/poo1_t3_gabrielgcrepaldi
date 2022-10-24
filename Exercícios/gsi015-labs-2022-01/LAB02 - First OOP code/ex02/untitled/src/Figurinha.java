import java.time.LocalDate;
public class Figurinha {
    private String nomeDoJogador, pais, posicao;
    private LocalDate dataDeNascimento;
    private double altura, peso;

    public void alterarAltura (double altura){
        Figurinha fig = new Figurinha();
        fig.altura = altura;
        System.out.printf("\nAltura: %f",fig.altura);
    }
    public void alteraNome (String nome){
        Figurinha fig = new Figurinha();
        fig.nomeDoJogador = nome;
        System.out.printf("\n\nNome do jogador: %s",fig.nomeDoJogador);
    }
    public void alterarPais (String pais){
        Figurinha fig = new Figurinha();
        fig.pais = pais;
        System.out.printf("\npais: %s",fig.pais);
    }
    public void alterarPosicao (String posicao){
        Figurinha fig = new Figurinha();
        fig.posicao = posicao;
        System.out.printf("\nPosicao: %f",fig.posicao);
    }
    public void alterarData (LocalDate data){
        Figurinha fig = new Figurinha();
        fig.dataDeNascimento = LocalDate.parse(data);
        System.out.printf("\nData de Nascimento: %s",fig.dataDeNascimento);
    }
    public void alterarPeso (double peso){
        Figurinha fig = new Figurinha();
        fig.peso = peso;
        System.out.printf("\nPeso: %f",fig.peso);
    }

}