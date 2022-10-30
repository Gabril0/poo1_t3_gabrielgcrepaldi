import java.util.Scanner;
//ATENCAO!! PROGRAMA NAO CONTEM TRATAMENTO DE ERRO!!
public class App {
    public static String nome[] = new String[4];
    public static float preco[] = new float[4];
    public static int qtd_estoque[] = new int[4];
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n", i);
            nome[i] = in.next();
            preco[i] = in.nextFloat();
            qtd_estoque[i] = in.nextInt();
        }
        System.out.printf("\nAumentando o preco em 10%% do produto 1 e 3");
        preco[0] = altera_preco(preco[0],-110);
        preco[2] = altera_preco(preco[2],10);

        System.out.printf("\nReduzindo o preco em 5%% do produto 2");
        if(altera_preco(preco[1],-5)==-1) System.out.printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else {preco[1] = altera_preco(preco[1],-5); 
            System.out.printf("\n\n Preco alterado com sucesso");}

        System.out.printf("\nAlterando o preco do prod. 3");
        if(altera_preco(preco[3],-110)==-1) System.out.printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else {preco[3] = altera_preco(preco[3],-110);
            System.out.printf("\n\n Preco alterado com sucesso");}

        System.out.printf("\nProdutos Cadastrados");
        for(int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome[i],preco[i],qtd_estoque[i]);
        }

        in.close();
    }
    public static float altera_preco(float preco, float porcentagem){
        float temp;
        if(porcentagem > -100){
            temp = 1+porcentagem/100;
            preco = preco*temp;
            return preco;
        }
        if(porcentagem < -100){return preco;}
        else return -1;
    }
}
