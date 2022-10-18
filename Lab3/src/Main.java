import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        //exercicio5();
        //exercicio6();
        //exercicio7();
        //exercicio8();
        //exercicio9();
        //exercicio10();
        //exercicio11();
        //exercicio12();
        //exercicio13();
        //exercicio14();
        //exercicio15();
        //exercicio16();
    }
    public static void exercicio1(){
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("<< Listando um vetor >>");
        System.out.printf("\nEntre com o número 1: ");
        numero[0] = in.nextInt();
        System.out.printf("\nEntre com o número 2: ");
        numero[1] = in.nextInt();
        System.out.printf("\nEntre com o número 3: ");
        numero[2] = in.nextInt();
        System.out.printf("\nEntre com o número 4: ");
        numero[3] = in.nextInt();
        System.out.printf("\nEntre com o número 5: ");
        numero[4] = in.nextInt();
        System.out.printf("\nEntre com o número 6: ");
        numero[5] = in.nextInt();
        System.out.printf("\n\nOs valores lidos são: %d %d %d %d %d %d",numero[0],numero[1],numero[2],numero[3],numero[4],numero[5]);

    }
    public static void exercicio2() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("\n<< Listando um vetor >>");
        for(int i = 0;i<6;i ++){
            System.out.printf("\nEntre com o número %d: ",i+1);
            numero[i] = in.nextInt();
        }
            System.out.printf("\n\nOs valores lidos são: ");
        for(int i = 0;i<6;i ++){
            System.out.printf("%d ",numero[i]);
        }

    }

    public static void exercicio3() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("\n<< Listando um vetor em ordem inversa >>");
        for(int i = 0;i<6;i ++){
            System.out.printf("\nEntre com o número %d: ",i+1);
            numero[i] = in.nextInt();
        }
        System.out.printf("\n\nOs valores lidos são: ");
        for(int i = 5;i>=0;i --){
            System.out.printf("%d ",numero[i]);
        }
    }

    public static void exercicio4() {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[6];

        System.out.printf("\n<< Listando um vetor de número pares >>");
        for(int i = 0;i<6;i++){
        System.out.printf("\nEntre com o número %d: ",i+1);
        numero[i] = in.nextInt();
        if(numero[i]%2 != 0){
            i--;
            System.out.printf("\nErro: Valor inválido");
            }

        }
        System.out.printf("\nOs números pares digitados foram: ");
        for(int i = 0;i<6;i++){
            System.out.printf("%d ",numero[i]);
        }


    }

    public static void exercicio5() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio6() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio7() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio8() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio9() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio10() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio11() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio12() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio13() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio14() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio15() {
        Scanner in = new Scanner(System.in);

    }

    public static void exercicio16() {
        Scanner in = new Scanner(System.in);

    }
}

