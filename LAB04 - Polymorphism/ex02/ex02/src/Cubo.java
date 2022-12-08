public class Cubo extends FormaTridimensional{
    Cubo(double lado){
        this.lado = lado;
    }

    protected double obterArea(){
        super.area = 6*(lado*lado);
        return area;
    }

    protected double obterVolume(){
        super.volume = ((lado*lado)*lado);
        return volume;
    }
}
