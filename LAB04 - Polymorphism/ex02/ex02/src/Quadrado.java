public class Quadrado extends FormaBidimensional{
    Quadrado(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        super.area = lado*lado;
        return super.area;
    }
}
