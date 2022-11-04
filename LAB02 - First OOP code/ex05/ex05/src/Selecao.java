import java.util.Scanner;

public class Selecao {
    private String selecao, tecnico;
    private Figurinha fig[] = new Figurinha[11];
    
    public Selecao(String tecnicoCon, String selecaocon){
        tecnico = tecnicoCon;
        selecao = selecaocon;
        

        for(int i = 0; i < 11; i++){
            fig[i] = new Figurinha(selecao);
            fig[i].alteraNome("Nome");
            fig[i].alterarAltura(1.80);
            fig[i].alterarData("1981-02-09");
            //fig[i].alterarPais(pais);
            fig[i].alterarPeso(69);
            fig[i].alterarPosicao("Posicao de football");
        }
    }
    public void mostraJogadores(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Tecnico: %s",tecnico);
        for(int i = 0; i < 11; i++){
            
            System.out.printf("\n\n Nome do jogador %d do time %s: %s", i+1, fig[i].getPais(), fig[i].getNome());

            System.out.printf("\nAltura: %.2f\nPeso: %.2f\nPosicao: %s\n Data de Nascimento: %s\n ",fig[i].getAltura(),fig[i].getPeso(),fig[i].getPosicao(),fig[i].getData());
        }
    }
}