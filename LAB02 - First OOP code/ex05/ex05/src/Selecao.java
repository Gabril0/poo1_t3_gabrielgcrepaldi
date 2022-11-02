import java.util.Scanner;

public class Selecao {
    private String selecao, tecnico, pais;
    private String[]  jogadores = new String[11];

    public void Selecao(String tecnicoCon, String selecaocon){
        tecnico = tecnicoCon;
        selecao = selecaocon;
    }
    public void registraJogadores(){
        Scanner in = new Scanner(System.in);
        Figurinha fig[] = new Figurinha[11];

        for(int i = 0; i < 11; i++){
            fig[i] = new Figurinha();
            fig[i].Figurinha(selecao);
            fig[i].alteraNome("Nome");
            fig[i].alterarAltura(1.80);
            fig[i].alterarData("1981-02-09");
            //fig[i].alterarPais(pais);
            fig[i].alterarPeso(69);
            fig[i].alterarPosicao("Posicao de football⚽️");

        }
        System.out.printf("Tecnico: %s",tecnico);
        for(int i = 0; i < 11; i++){

            System.out.printf("\n\n Nome do jogador %d do time %s: %s", i+1, fig[i].getPais(), fig[i].getNome());

            System.out.printf("\nAltura: %f\nPeso: %f\nPosicao: %s\n Data de Nascimento: %s\n ",fig[i].getAltura(),fig[i].getPeso(),fig[i].getPosicao(),fig[i].getData());
        }
    }
}