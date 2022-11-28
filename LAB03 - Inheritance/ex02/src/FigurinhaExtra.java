import java.time.LocalDate;

public class FigurinhaExtra extends Figurinha {
    private String cor, categoria;
    public FigurinhaExtra(String pais, double altura, double peso, LocalDate dataDeNascimento, String nomeDoJogador, String posicao, String cor, String categoria){
        super(pais, altura, peso, dataDeNascimento, nomeDoJogador, posicao);
        this.cor = cor;
        this.categoria = categoria;
    }
    public String mostraFigurinha() {
        return "\nFigurinha:" +
                "   \nnomeDoJogador='" + nomeDoJogador + '\'' +
                "   \npais='" + pais + '\'' +
                "   \nposicao='" + posicao + '\'' +
                "   \ndataDeNascimento=" + dataDeNascimento +
                "   \naltura=" + altura +
                "   \npeso=" + peso + '\'' +
                "   \ncor=" + cor + '\'' +
                "   \ncategoria=" + categoria + '\'';
    }
}

