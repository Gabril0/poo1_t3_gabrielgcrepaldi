public class Esfera extends FormaTridimensional{
    Esfera(double raio){
        this.raio = raio;
    }

    protected double obterArea(){
        super.area = 4*PI*(raio*raio);
        return area;
    }

    protected double obterVolume(){
        super.volume = (4/3)*PI*((raio*raio)*raio);
        return volume;
    }
}
