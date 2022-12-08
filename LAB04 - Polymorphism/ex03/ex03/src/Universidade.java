import java.util.Scanner;
public class Universidade {
    private String nome = "Universidade", dataDaFundacao = "00/00/0000";
    protected Estudante[] ed = new Estudante[100];
    private int contGrad=0,contPos=0,contMes=0,contDoc=0,contTotal=0;;

    Universidade(String nome, String dataDaFundacao){
        this.nome = nome;
        this.dataDaFundacao = dataDaFundacao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataFundacao(String dataDaFundacao){
        this.dataDaFundacao = dataDaFundacao;
    }

    public String getNome(){
        return nome;
    }

    public String getDataFundacao(){
        return dataDaFundacao;
    }

    public void printTudo(){
        for(int i = 0;i<contTotal;i++){
            System.out.printf("\nAluno numero %d:\n",i);
            ed[i].print();
        }
    }
    public void registraEstudante(){
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        int op;
        while(flag){
        System.out.println(" ===Registro de alunos=== ");
        System.out.println("1.Graduacao");
        System.out.println("2.Pos Graduacao");
        System.out.println("3.Mestrado");
        System.out.println("4.Doutorado");
        System.out.println("0.Sair");
        System.out.println("Numero de alunos de Graduacao: " + contGrad);
        System.out.println("Numero de alunos de pos graduacao: " + contPos);
        System.out.println("Numero de alunos de Mestrado: " + contMes);
        System.out.println("Numero de alunos de Doutorado: " + contDoc);
        System.out.println("Numero de alunos ao todo: " + contTotal);
        System.out.printf("\nOpcao: ");
        op = in.nextInt();        
        switch(op){
                case 1:{
                    ed[contTotal] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
                    contGrad++;
                    contTotal++;
                    break;}
                case 2:{
                    ed[contTotal] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
                contPos++;
                contTotal++;
                break;}
                case 3:{
                    ed[contTotal] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
                contMes++;
                contTotal++;
                break;}
                case 4:{
                    ed[contTotal] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
                contDoc++;
                contTotal++;
                break;}
                case 0:{
                in.close();
                flag = false;
                }
                default:{
                break;}
        }
    }
}
}
