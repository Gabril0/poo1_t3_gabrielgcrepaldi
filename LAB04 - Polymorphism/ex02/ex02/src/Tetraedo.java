import java.lang.Math;
public class Tetraedo extends FormaTridimensional{
    Tetraedo(double lado, double areaDaBase, double altura){
        this.lado = lado;
        this.areaDaBase = areaDaBase;
        this.altura = altura;
    }

    protected double obterArea(){
        super.area = (lado*lado)*Math.sqrt(3);
        return area;
    }

    protected double obterVolume(){
        super.volume = (0.33*areaDaBase)*altura;
        return volume;
    }
}

