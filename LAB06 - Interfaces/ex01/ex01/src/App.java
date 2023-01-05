public class App {
    public static void main(String[] args) throws Exception {
        Produto[] p = new Produto[3];
        Servico[] s = new Servico[3];
        Cliente[] c = new Cliente[3];
        Classificador classificador = new Classificador();

        p[0] = new Produto(527024892);
        p[1] = new Produto(323896729);
        p[2] = new Produto(123746092);

        s[0] = new Servico(29.99);
        s[1] = new Servico(19.99);
        s[2] = new Servico(14.99);

        c[0] = new Cliente("Thurston");
        c[1] = new Cliente("Andrew");
        c[2] = new Cliente("Tom");

        classificador.ordena(c);
        classificador.ordena(s);
        classificador.ordena(p);

        for (int i = 0; i < p.length; i++){
            System.out.println("Codigo do Produto "+i+":"+" "+ p[i].getCodigo());
        }

        for (int i = 0; i < s.length; i++){
            System.out.println("Preco do Servico "+i+":"+" "+ s[i].getPreco());
        }

        for (int i = 0; i < c.length; i++){
            System.out.println("Codigo do Cliente "+i+":"+" "+ c[i].getCodigo());
        }

    }
}
