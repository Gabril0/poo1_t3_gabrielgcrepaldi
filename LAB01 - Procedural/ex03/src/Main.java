import java.util.Scanner;
import java.util.concurrent.CompletionStage;
//Nome: Gabriel Garcia Crepaldi
//Matricula: 12111BSI204
public class Main {

    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();
        exercicio10();
        exercicio11();
        exercicio12();
        exercicio13();
        exercicio14();
        exercicio15();
        exercicio16();
    }

    public static void exercicio1(){
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("<< Listando um vetor >>");
        System.out.printf("\nEntre com o numero 1: ");
        numero[0] = in.nextInt();
        System.out.printf("\nEntre com o numero 2: ");
        numero[1] = in.nextInt();
        System.out.printf("\nEntre com o numero 3: ");
        numero[2] = in.nextInt();
        System.out.printf("\nEntre com o numero 4: ");
        numero[3] = in.nextInt();
        System.out.printf("\nEntre com o numero 5: ");
        numero[4] = in.nextInt();
        System.out.printf("\nEntre com o numero 6: ");
        numero[5] = in.nextInt();
        System.out.printf("\n\nOs valores lidos sao: %d %d %d %d %d %d",numero[0],numero[1],numero[2],numero[3],numero[4],numero[5]);

    }

    public static void exercicio2() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("\n<< Listando um vetor >>");
        for(int i = 0;i<6;i ++){
            System.out.printf("\nEntre com o numero %d: ",i+1);
            numero[i] = in.nextInt();
        }
            System.out.printf("\n\nOs valores lidos sao: ");
        for(int i = 0;i<6;i ++){
            System.out.printf("%d ",numero[i]);
        }

    }

    public static void exercicio3() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("\n<< Listando um vetor em ordem inversa >>");
        for(int i = 0;i<6;i ++){
            System.out.printf("\nEntre com o numero %d: ",i+1);
            numero[i] = in.nextInt();
        }
        System.out.printf("\n\nOs valores lidos sao: ");
        for(int i = 5;i>=0;i --){
            System.out.printf("%d ",numero[i]);
        }
    }

    public static void exercicio4() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("\n<< Listando um vetor de numero pares >>");
        for(int i = 0;i<6;i++){
        System.out.printf("\nEntre com o numero %d: ",i+1);
        numero[i] = in.nextInt();
        if(numero[i]%2 != 0){
            i--;
            System.out.printf("\nErro: Valor inválido\n");
            }

        }
        System.out.printf("\nOs numeros pares digitados foram: ");
        for(int i = 0;i<6;i++){
            System.out.printf("%d ",numero[i]);
        }


    }

    public static void exercicio5() {
        Scanner in = new Scanner(System.in);

        int[] numero = new int[6];
        int maior = 0, menor = 0, tempMaior = 0, tempMenor = 0;
        float media = 0;

        System.out.printf("\n<< 5 valores >>");
        for(int i = 0;i<6;i ++){
            System.out.printf("\nEntre com o numero %d: ",i+1);
            numero[i] = in.nextInt();
            media = numero[i] + media;
            if(i==0){tempMaior = numero[0]; tempMenor = numero[0];}
            if(tempMaior <= numero[i]){maior = numero[i];}
            if(tempMenor >= numero[i]){menor = numero[i];}
        }
        media = media/6;
            System.out.printf("\n\nOs valores lidos sao: ");
        for(int i = 0;i<6;i ++){
            System.out.printf("%d ",numero[i]);
        }
        System.out.printf("\nO maior valor eh: %d", maior);
        System.out.printf("\nO menor valor eh: %d", menor);
        System.out.printf("\nA media eh: %.2f", media);

    }

    public static void exercicio6() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];
        int maior = 0, menor = 0, tempMaior = 0, tempMenor = 0, vetormaior = 0, vetormenor = 0;
        float media = 0;

        System.out.printf("\n<< 5 valores >>");
        for(int i = 0;i<6;i ++){
            System.out.printf("\nEntre com o numero %d: ",i+1);
            numero[i] = in.nextInt();
            media = numero[i] + media;
            if(i==0){tempMaior = numero[0]; tempMenor = numero[0]; vetormaior = i;}
            if(tempMaior <= numero[i]){maior = numero[i];vetormaior = i;}
            if(tempMenor >= numero[i]){menor = numero[i];vetormenor = i;}
        }
        media = media/6;
            System.out.printf("\n\nOs valores lidos sao: ");
        for(int i = 0;i<6;i ++){
            System.out.printf("%d ",numero[i]);
        }
        System.out.printf("\nO maior valor eh: %d, localizado na posicao %d do vetor", maior, vetormaior);
        System.out.printf("\nO menor valor eh: %d, localizado na posicao %d do vetor", menor, vetormenor);
        System.out.printf("\nA media eh: %.2f", media);
    }

    public static void exercicio7() {
        Scanner in = new Scanner(System.in);
        int[] nota = new int[5];
        int maior = 0, temp = 0, resultado;
        System.out.printf("\n<< Normalizando as notas >>");
        for(int i = 0;i < 5; i++){
            System.out.printf("\nEntre com a nota do aluno %d: ",i+1);
            nota[i] = in.nextInt();
            if(i==0){temp = nota[0]; maior = nota[0]; }
            if(temp <= nota[i]){maior = nota[i];}
        }
        System.out.printf("\nNotas normalizadas\n");
        for(int i = 0;i < 5; i++){
            resultado = nota[i] * 100 / maior;
            System.out.printf("\nA nota do aluno %d eh %d",i+1, resultado);
        }

    }

    public static void exercicio8() {
        Scanner in = new Scanner(System.in);
        int[] valor = new int[5];
        double desvio = 0, media = 0;
        System.out.printf("\n<< Media e desvio-padrao >>");
        for(int i = 0;i < 5; i++){
            System.out.printf("\nEntre o valor %d: ",i+1);
            valor[i] = in.nextInt();
            media = valor[i] + media;
        }
        media = media/5;
        for(int i = 0;i < 5; i++){
            desvio = Math.pow((valor[i] - media),2) + desvio;
        }
        desvio = Math.sqrt(desvio/4);
        System.out.printf("\nA media eh %.2f e o desvio-padrao eh %.13f", media, desvio); 

    }

    public static void exercicio9() {
        Scanner in = new Scanner(System.in);
        int[] nota = new int[99];
        int numero;
        float media = 0;
        System.out.printf("\n<< Media de n alunos. Maximo 100 alunos >>");
        System.out.printf("\nEntre com o numero de alunos: ");
        numero = in.nextInt();
        if(numero > 100 || numero < 1){
            System.out.printf("\nErro! O numero maximo de alunos permitido eh 100.");
            return;
        }
        for(int i = 0;i < numero; i++){
            System.out.printf("\nDigite a nota do aluno  %d: ",i+1);
            nota[i] = in.nextInt();
            media = nota[i] + media;
        }
        media = media/numero;
        System.out.printf("\nRelatorio de Notas");
        for(int i = 0;i < numero; i++){
            System.out.printf("\nA nota do aluno %d eh %d",i+1, nota[i]);
        }
        System.out.printf("\nA media da turma eh %.1f", media);

    }

    public static void exercicio10() {
        Scanner in = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int [3];
        System.out.printf("\n<< Subtracao de vetores >>");
        for(int i = 0; i <= 2; i++){
            System.out.printf("\nEntre o valor %d de A: ",i+1);
            A[i] = in.nextInt();
        }
        for(int i = 0; i <= 2; i++){
            System.out.printf("\nEntre o valor %d de B: ",i+1);
            B[i] = in.nextInt();
        }
        for(int i = 0; i <= 2; i++){
            C[i] = A[i] - B[i];
        }
        System.out.printf("\nO vetor C, definido como C = A-B eh(%d,%d,%d)",C[0],C[1],C[2]);
    }

    public static void exercicio11() {
        Scanner in = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int contV1 = 0, contV2 = 0;

        System.out.printf("\n<< Pares e Impares >>");
        for(int i = 0; i < 5; i++){
            System.out.printf("\nDigite o valor %d: ",i+1);
            v[i] = in.nextInt();
            if(v[i]%2 == 0){v1[contV1] = v[i];contV1++;}
            else{v2[contV2] = v[i];contV2++;}
        }
        System.out.printf("\nImpares: ");
        for(int i = 0; i < contV2; i++){
            System.out.printf("%d ",v2[i]);
        }
        System.out.printf("\nPares: ");
        for(int i = 0; i < contV1; i++){
            System.out.printf("%d ",v1[i]);
        }

    }

    public static void exercicio12() {
        Scanner in = new Scanner(System.in);
        int[] bolas = new int[4];// 0 = verde, 1 = azul, 2 = amarela, 3 = vermelha
        int temp = 0, aux = 0;
        float resultado, soma = 0;
        System.out.printf("\n<< Probabilidades >>");
        System.out.printf("\nDigite a quantidade de bolinhas");
        for(int i = 0; i < 4; i++){
            if(i==0){
                System.out.printf("\nVerde: ");
                bolas[i] = in.nextInt();}
            if(i==1){
                System.out.printf("\nAzul: ");
                bolas[i] = in.nextInt();}
            if(i==2){
                System.out.printf("\nAmarela: ");
                bolas[i] = in.nextInt();}
            if(i==3){
                System.out.printf("\nVermelha: ");
                bolas[i] = in.nextInt();}
        }
        for(int i = 0; i < 4; i++){
            if(temp <= bolas[i]){temp = bolas[i];aux = i;}
            System.out.printf("\nTemp: %d,Aux: %d", temp, aux);
            soma = bolas[i] + soma;
        }
        System.out.printf("\n\nProbabilidades");
        for(int i = 0; i < 4; i++){
            if(i==0){
                resultado = (bolas[i]*100)/soma;
                System.out.printf("\nVerde: %.1f%%",resultado);
                if(i==aux)System.out.printf("<< Maior probabilidade");}
            if(i==1){
                resultado = (bolas[i]*100)/soma;
                System.out.printf("\nAzul: %.1f%%",resultado);
                if(i==aux)System.out.printf("<< Maior probabilidade");}
            if(i==2){
                resultado = (bolas[i]*100)/soma;
                System.out.printf("\nAmarela: %.1f%%",resultado);
                if(i==aux)System.out.printf("<< Maior probabilidade");}
            if(i==3){
                resultado = (bolas[i]*100)/soma;
                System.out.printf("\nVermelho: %.1f%%",resultado);
                if(i==aux)System.out.printf("<< Maior probabilidade");}
            }
    }

    public static void exercicio13() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[5];
        System.out.printf("\n<< Zerando negativos >>");
        for(int i = 0; i < 5; i++){
            System.out.printf("\nEntre com o numero %d: ",i);
            numero[i] = in.nextInt();
            if(numero[i] <= 0){numero[i] = 0;}
        }
        System.out.printf("\nZerando os negativos, obtem-se: ");
        for(int i = 0; i < 5; i++){
            System.out.printf("%d ", numero[i]);
        }

    }

    public static void exercicio14() {
        Scanner in = new Scanner(System.in);
        float[] cra = new float[50]; 
        String[] classe = new String[50];  
        int[] numero = new int[50];// nao usei 10000 porque nao vai precisar no exemplo, se precisasse era só aumentar o numero
        int numCad;
        System.out.printf("\n<< Universidade X >>");
        System.out.printf("\nQuantos alunos serao cadastrados: ");
        numCad = in.nextInt();
        if(numCad>10000){return;}
        for(int i = 0; i < numCad; i++){
            System.out.printf("\n\nEntre com o numero do aluno: ");
            numero[i] = in.nextInt();
            System.out.printf("\nEntre com a classe social do aluno %d: ",numero[i]);
            classe[i] =  in.next();
            System.out.printf("\nEntre com o CRA do aluno %d: ",numero[i]);
            cra[i] = in.nextFloat();
        }
        System.out.printf("\n==== Alunos Cadastrados ====");
        for(int i = 0; i < numCad; i++){
            System.out.printf("\nNumero: %d Classe social: %s CRA: %.2f",numero[i], classe[i], cra[i]);
        }


    }

    public static void exercicio15() {
        Scanner in = new Scanner(System.in);
        int [] vetor = new int[8];
        int [] vetAux = new int[8];
        int [] listaRepetida = new int[8];
        int contRep = 0;

        System.out.printf("\n<< Valores iguais >>");
        for(int i = 0; i < 8; i++){
            System.out.printf("\nEntre com o numero %d: ",i+1);
            vetor[i] = in.nextInt();
        }
        //Desculpe essa resolucao foi terrivel mas nao tinha entendido como fazer de forma dinamica, e 
        //nao funciona direito
        for(int i = 0; i < 8; i++){
            if( i < 6 &&  vetor[i] == vetor[i+1]){listaRepetida[contRep] = vetor[i];contRep++;}
            if( i < 5 && vetor[i] == vetor[i+2]){listaRepetida[contRep] = vetor[i];contRep++;}
            if( i > 2 && vetor[i] == vetor[i-1]){listaRepetida[contRep] = vetor[i];contRep++;}
            if( i > 3 && vetor[i] == vetor[i-2]){listaRepetida[contRep] = vetor[i];contRep++;}
        }
        System.out.printf("\nValores repetidos: ");
        for(int i = 0; i < contRep; i++){
            System.out.printf("%d ",listaRepetida[i]);
        }
    }

    public static void exercicio16() {
        Scanner in = new Scanner(System.in);
        int [] vetor = new int[8];
        int [] listaRepetida = new int[8];
        int contRep = 0;

        System.out.printf("\n<< Valores iguais >>");
        for(int i = 0; i < 8; i++){
            System.out.printf("\nEntre com o numero %d: ",i+1);
            vetor[i] = in.nextInt();
        }
        //Desculpe essa resolucao foi terrivel mas nao tinha entendido como fazer de forma dinamica, e 
        //nao funciona direito
        for(int i = 0; i < 8; i++){
            if( i < 6 &&  vetor[i] == vetor[i+1]){listaRepetida[contRep] = vetor[i];contRep++;}
            if( i < 5 && vetor[i] == vetor[i+2]){listaRepetida[contRep] = vetor[i];contRep++;}
            if( i > 2 && vetor[i] == vetor[i-1]){listaRepetida[contRep] = vetor[i];contRep++;}
            if( i > 3 && vetor[i] == vetor[i-2]){listaRepetida[contRep] = vetor[i];contRep++;}
        }
        System.out.printf("\nValores repetidos: ");
        for(int i = 0; i < contRep; i++){
            int temp = 0;
            if(listaRepetida[i] == listaRepetida[i+1]){
                temp++;
                System.out.printf("\n%d aparece %d vezes",listaRepetida[i],temp+1);}
        }
    }
}

