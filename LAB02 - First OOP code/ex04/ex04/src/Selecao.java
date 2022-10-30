import java.util.Scanner;

public class Selecao {
    private String selecao, tecnico;
    private String[]  jogadores = new String[11];

    public void registraJogadores(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 11; i++){
            String jog;
            System.out.printf("\n Digite o nome do jogador %d: ", i+1);
            jog = in.next();
            jogadores[i] = jog;
        }
        System.out.printf("\n Digite o nome da selecao: ");
        selecao = in.next();
        System.out.printf("\n Digite o nome do tecnico do %s: ",selecao);
        tecnico = in.next();
        System.out.printf("\n Nome da selecao: %s", selecao);
        System.out.printf("\n Nome do tecnico: %s", tecnico);
        
        for(int i = 0; i < 11; i++){
            System.out.printf("\n Nome do jogador %d do time %s: %s", i+1, selecao, jogadores[i]);
        }
    }
}
