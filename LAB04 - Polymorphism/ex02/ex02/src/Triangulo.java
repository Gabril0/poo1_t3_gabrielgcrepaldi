public class Triangulo extends FormaBidimensional{
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    protected double obterArea(){
        super.area = (base*altura)/2;
        return area;
    }
}
