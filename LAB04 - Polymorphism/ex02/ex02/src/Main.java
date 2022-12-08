public class Main {
    public static void main(String[] args) throws Exception {
        Forma[] forma = new Forma[10];

        forma[0] = new Quadrado(5);
        System.out.println("Area Quadrado:" + forma[0].obterArea());

        forma[1] = new Circulo(5);
        System.out.println("Area Circulo:" + forma[1].obterArea());

        forma[2] = new Triangulo(10,10);
        System.out.println("Area Triangulo:" + forma[2].obterArea());

        forma[3] = new Esfera(5);
        System.out.println("Area Esfera:" + forma[3].obterArea());
        System.out.println("Volume Esfera:" + forma[3].obterVolume());

        forma[4] = new Cubo(5);
        System.out.println("Area Cubo:" + forma[4].obterArea());
        System.out.println("Volume Cubo:" + forma[4].obterVolume());

        forma[5] = new Tetraedo(5,10,15);
        System.out.println("Area Tetraedo:" + forma[5].obterArea());
        System.out.println("Volume Tetraedo:" + forma[5].obterVolume());
    }
}
