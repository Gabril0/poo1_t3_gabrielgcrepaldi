import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    FigurinhaExtra fig = new FigurinhaExtra("pais",2,5, LocalDate.parse("1415-12-12"),"nomeds","posicaoas","ouro","Legends");
    Figurinha figN = new Figurinha("pais",2,5, LocalDate.parse("1415-12-12"),"nomeds","posicaoas");
    System.out.printf("\n\nFigurinha Extra: %s",fig.mostraFigurinha());
    System.out.printf("\n\nFigurinha Normal: %s",figN.mostraFigurinha());
    }
}