import java.time.LocalDate;
import java.util.Scanner;

public class Selecao {
    private String selecao, tecnico;

    private String nomeDoJogador, pais, posicao;
    private LocalDate dataDeNascimento;
    private double altura, peso;

    private Figurinha fig[] = new Figurinha[11];

    public Selecao(String pais, double altura, double peso, LocalDate dataDeNascimento, String nomeDoJogador, String posicao, String tecnico){
        this.pais = pais;
        this.altura = altura;
        this.peso = peso;
        this.dataDeNascimento = dataDeNascimento;
        this.nomeDoJogador = nomeDoJogador;
        this.posicao = posicao;
        this.tecnico = tecnico;


        for(int i = 0; i < 11; i++){
            fig[i] = new Figurinha(pais,altura,peso,dataDeNascimento,nomeDoJogador,posicao);

        }
    }
    public void mostraJogadores(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\nTecnico: %s",tecnico);
        for(int i = 0; i < 11; i++){

            System.out.printf("\n\n Nome do jogador %d do time %s: %s", i+1, fig[i].getPais(), fig[i].getNome());

            System.out.printf("\nAltura: %.2f\nPeso: %.2f\nPosicao: %s\n Data de Nascimento: %s\n ",fig[i].getAltura(),fig[i].getPeso(),fig[i].getPosicao(),fig[i].getData());
        }
    }
}