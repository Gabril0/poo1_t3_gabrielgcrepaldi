import java.time.LocalDate;
public class Figurinha {
    private String nomeDoJogador, pais, posicao;
    private LocalDate dataDeNascimento;
    private double altura, peso;

    public void Figurinha(String paisCon){
        pais = paisCon;
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

}