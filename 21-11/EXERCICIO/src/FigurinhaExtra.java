import java.time.LocalDate;

public class FigurinhaExtra {
    private String cor, categoria;
    private String nomeDoJogador, pais, posicao;
    private LocalDate dataDeNascimento;
    private double altura, peso;

    public FigurinhaExtra(String pais, double altura, double peso, LocalDate dataDeNascimento, String nomeDoJogador, String posicao, String cor, String categoria){
        this.pais = pais;
        this.altura = altura;
        this.peso = peso;
        this.dataDeNascimento = dataDeNascimento;
        this.nomeDoJogador = nomeDoJogador;
        this.posicao = posicao;
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

