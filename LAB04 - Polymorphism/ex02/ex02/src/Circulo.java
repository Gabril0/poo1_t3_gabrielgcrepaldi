public class Circulo extends FormaBidimensional{
    Circulo(double raio){
        this.raio = raio;
    }
    protected double obterArea(){
        super.area = PI*(raio*raio);
        return area;
    }
}
