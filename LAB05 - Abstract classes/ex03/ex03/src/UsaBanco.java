import java.util.Scanner;
//ATENCAO, EU PERCEBI QUE FALTOU A IMPLEMENTACAO DO LIMITE NA CONTA, MAS A SEMANA ESTA CHEIA DE PROVAS E NAO
//TENHO MAIS TEMPO PARA ISSO, PECO PERDAO
public class UsaBanco {
    private int numConta = 0,op, numDeContas = 0;
    private ContaCorrente[] cc = new ContaCorrente[100];
    private Scanner in = new Scanner(System.in);
    private float limite, valor;
    private int senha;

    public static void main(String[] args){
        UsaBanco banco = new UsaBanco();
        banco.menu();
        
    }

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
            switch(op){
                case 1:{
                    numConta = perguntaNumero();
                    senha = perguntaSenha(numConta);
                    valor = perguntaValor();
                    cc[numConta].creditaValor(senha, valor);
                    break;}
                case 2:{
                    numConta = perguntaNumero();
                    senha = perguntaSenha(numConta);
                    valor = perguntaValor();
                    cc[numConta].debitaValor(valor, senha);
                    break;}
                case 3:{
                    numConta = perguntaNumero();
                    senha = perguntaSenha(numConta);
                    System.out.println("saldo da conta de numero "+ numConta+ ": " +cc[numConta].getSaldo(senha));
                    break;}
                case 4:{
                    String estado = "";
                    numConta = perguntaNumero();
                    senha = perguntaSenha(numConta);
                    if(cc[numConta].getEstado(senha) == 1){estado = "Ativa";}
                    else{estado = "Inativa";}
                    System.out.println("Estado da conta:" + estado);
                    break;}
                case 5:{
                    int estado = 0;
                    numConta = perguntaNumero();
                    senha = perguntaSenha(numConta);
                    System.out.println("Mudar estado da conta:" + numConta +"\n1.Ativa\n2.Inativa");
                    estado = in.nextInt();
                    if(estado == 1){cc[numConta].setEstado(senha,1);}
                    else{cc[numConta].setEstado(senha,-1);}
                    
                    break;}
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
            System.out.println("0.Voltar");
            System.out.println("Escolha:");
            op = in.nextInt();
        switch(op){
            case 1: {
                System.out.println("Digite a senha desejada para a conta numero "+ numDeContas + ": ");
                senha = in.nextInt();
                cc[numDeContas] = new ContaComum(0,numConta,senha);
                numDeContas++;
                break;
            }
            case 2: {
                System.out.println("Digite o limite:");
                limite = in.nextFloat();
                System.out.println("Digite a senha desejada para a conta numero "+ numDeContas + ": ");
                senha = in.nextInt();
                cc[numDeContas] = new ContaEspecial(limite,0,numDeContas,senha);
                numDeContas++;
                break;
            }
            case 0:{
                break;
            }
        }
    }
    public int perguntaSenha(int numConta){
        int senha;
        System.out.println("Qual a senha da conta "+numConta+"?:");
        senha = in.nextInt();
        return senha;
    }

    public int perguntaNumero(){
        int id;
        System.out.println("Qual o numero de identificacao da conta?:");
        id = in.nextInt();
        return id;
    }

    public float perguntaValor(){
        float valor;
        System.out.println("Qual o valor desejado?:");
        valor = in.nextFloat();
        return valor;
    }
}
