import java.time.LocalDate;
public class Figurinha {
    private String nomeDoJogador, pais, posicao;
    private LocalDate dataDeNascimento;

    private double altura, peso;

    public Figurinha(String pais, double altura, double peso, LocalDate dataDeNascimento, String nomeDoJogador, String posicao){
        this.pais = pais;
        this.altura = altura;
        this.peso = peso;
        this.dataDeNascimento = dataDeNascimento;
        this.nomeDoJogador = nomeDoJogador;
        this.posicao = posicao;
    }

    public void alterarAltura (double varAltura){
        altura = varAltura;
    }
    public void alteraNome (String nome){
        nomeDoJogador = nome;
    }
    public String getNome(){

        return nomeDoJogador;
    }
    public double getAltura(){

        return altura;
    }
    public String getPais(){

        return pais;
    }
    public String getPosicao(){

        return posicao;
    }
    public LocalDate getData(){

        return dataDeNascimento;
    }
    public double getPeso(){

        return peso;
    }

    /**public void alterarPais (String varPais){
     pais = varPais;
     }**/

    public void alterarPosicao (String varPosicao){
        posicao = varPosicao;
    }
    public void alterarData (String varData){
        dataDeNascimento = LocalDate.parse(varData);
    }
    public void alterarPeso (double varPeso){
        peso = varPeso;
    }

    public String mostraFigurinha() {
        return "\nFigurinha:" +
                "   \nnomeDoJogador='" + nomeDoJogador + '\'' +
                "   \npais='" + pais + '\'' +
                "   \nposicao='" + posicao + '\'' +
                "   \ndataDeNascimento=" + dataDeNascimento +
                "   \naltura=" + altura +
                "   \npeso=" + peso;
    }
}