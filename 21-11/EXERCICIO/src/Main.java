import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    FigurinhaExtra fig = new FigurinhaExtra("pais",2,5, LocalDate.parse("1415-12-12"),"nomeds","posicaoas","ouro","Legends");
    System.out.printf("%s",fig.mostraFigurinha());
    }
}