import java.util.Scanner;
public class FaceFriends {
    //Desculpe pela bagunca nesse, ele definitivamente funciona, so que seria melhor se tivesse funcoes separadas
    //nos switch cases, fiz desta maneira so pela pressa mesmo e reconheco meu erro
    public static void main (String[] args){
        Contato[] c = new Contato[100];
        int[] arrayF = new int[100]; 
        int[] arrayT = new int[100]; 
        int[] arrayA = new int[100]; 
        int op, numCont = 0,numContA = 0,numContT = 0,numContF = 0;
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("=== BEM VINDO AO FACEFRIENDS ===");
        System.out.println("1.Adicionar Contato");
        System.out.println("2.Ver todos os contatos");
        System.out.println("3.Ver somente Familiares");
        System.out.println("4.Ver somente Amigos");
        System.out.println("5.Ver somente Pessoas do Trabalho");
        System.out.println("6.Ver melhores amigos, irmaos e colegas de trabalho");
        System.out.println("7.Escolher contato por indice");
        System.out.println("0.Sair");
        System.out.println("Selecione sua opcao:");
        op = in.nextInt();

        switch(op){
            case 1: {
                System.out.println("Qual tipo de contato deseja adicionar?");
                System.out.println("1.Amigos");
                System.out.println("2.Familia");
                System.out.println("3.Trabalho");
                System.out.println("0.Sair");
                System.out.println("Selecione sua opcao:");
                op = in.nextInt();
                switch(op){
                    case 1:{
                        c[numCont] = new Amigos("Aniversario","Nome","@gmail.com","NomeAMIGO",1);
                        arrayA[numContA] = numCont;
                        numContA++;
                        numCont++;
                        break;
                    }
                    case 2:{
                        c[numCont] = new Familia("Aniversario","Nome","@gmail.com","NomeFAMILIA","irmao");
                        arrayF[numContF] = numCont;
                        numContF++;
                        numCont++;
                        break;
                    }
                    case 3:{
                        c[numCont] = new Trabalho("Aniversario","Nome","@gmail.com","NomeTRABALHO","colega");
                        arrayT[numContT] = numCont;
                        numContT++;
                        numCont++;
                        break;
                    }
                    case 0: {
                        System.exit(1);
                        break;
                    }
                    default: {
                        System.out.println("Opcao invalida");
                        break;
                    }
                }
                break;
            }
            case 2: {
                for(int i = 0; i < numCont; i++){
                    System.out.println(c[i].imprimirContato());
                }
                break;
            }
            case 3: {
                for(int i = 0; i < numContF; i++){
                    System.out.println(c[arrayF[i]].imprimirContato());
                }
                break;
            }
            case 4: {
                for(int i = 0; i < numContA; i++){
                    System.out.println(c[arrayA[i]].imprimirContato());
                }
                break;
            }
            case 5: {
                for(int i = 0; i < numContT; i++){
                    System.out.println(c[arrayT[i]].imprimirContato());
                }
                break;
            }
            case 6: {
                for(int i = 0; i < numCont; i++){
                    if(c[i].getEspecial() == "melhor amigo" || c[i].getEspecial() == "irmao" || c[i].getEspecial() == "colega")System.out.println(c[i].imprimirContato());
                }
                break;
            }
            case 7: {
                System.out.println("Escreva o indice do contato:");
                op = in.nextInt();
                System.out.println(c[op].imprimirContato());
                break;
            }
            case 0: {
                System.exit(1);
                break;
            }
            default: {
                System.out.println("Opcao invalida");
                break;
            }
        }
    }}
}
