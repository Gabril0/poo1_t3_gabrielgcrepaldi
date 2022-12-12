import java.util.Scanner;

public class UsaBanco {
    private int numDeContas = 0,op;
    private ContaCorrente[] cc = new ContaCorrente[100];
    private Scanner in = new Scanner(System.in);
    private float limite;

    public void menu(){
    while(true){
        System.out.println("=== Bem vindo ao banco!! ===");
        System.out.println("1.Colocar Saldo");
        System.out.println("2.Fazer Pagamento");
        System.out.println("3.Checar Saldo");
        System.out.println("4.Estado da conta");
        System.out.println("5.Mudar estado da conta");
        System.out.println("6.Criar nova conta");
        System.out.println("0.Sair");
        System.out.println("Escolha:");

        op = in.nextInt();
            switch(op){/// ATENCAO PARA IDENTIFICAR A CONTA FAZER COM QUE O NUMERO DA CONTA SEJA O MESMO QUE O DO ARRAY PARA IDENTIFICAR MAIS FACILMENTE E NAO PRECISAR BUSCA
                case 1:{
                    break;}
                case 2:{break;}
                case 3:{break;}
                case 4:{break;}
                case 5:{break;}
                case 6:{
                    CriaConta();
                    break;}
                case 0:{
                    System.exit(1);
                    break;}   
                default:{System.out.println("Erro!! Numero digitado nao reconhecido");}
            }
        }
    }
    public void CriaConta(){
            System.out.println("=== Criacao de conta ===");
            System.out.println("1.Conta Comum");
            System.out.println("2.Conta Especial");
            System.out.println("0.Sair");
            System.out.println("Escolha:");
            op = in.nextInt();
        switch(op){
            case 1: {
                cc[numDeContas] = new ContaComum();
                numDeContas++;
            }
            case 2: {
                System.out.println("Digite o limite:");
                limite = in.nextFloat();
                cc[numDeContas] = new ContaEspecial(limite);
                numDeContas++;
            }
        }
    }
}
