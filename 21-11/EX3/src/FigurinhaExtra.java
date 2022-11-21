import java.time.LocalDate;

public class FigurinhaExtra extends Figurinha {
    private String cor, categoria;
    public FigurinhaExtra(String pais, double altura, double peso, LocalDate dataDeNascimento, String nomeDoJogador, String posicao, String cor, String categoria){
        super(pais, altura, peso, dataDeNascimento, nomeDoJogador, posicao);
        this.cor = cor;
        this.categoria = categoria;

    }
    public FigurinhaExtra(Figurinha fig, String cor, String categoria){
        super(fig.getPais(), fig.getAltura(), fig.getAltura(), fig.getData(), fig.getNome(), fig.getPosicao());
        this.cor = cor;
        this.categoria = categoria;
    }
    public String mostraFigurinha() {
        return super.mostraFigurinha() +
                "   \ncor=" + cor + '\'' +
                "   \ncategoria=" + categoria + '\'';
    }
}

