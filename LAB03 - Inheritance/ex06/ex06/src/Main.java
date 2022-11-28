import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("== Exemplo de uso ==");
        VIP vip = new VIP(10);
        CamaroteInferior ci = new CamaroteInferior(10,5);
        CamaroteSuperior cs = new CamaroteSuperior(10, 7);
        Normal nor = new Normal(10);
        
        System.out.printf("\n\nVIP:");
        vip.imprimeVIP();

        System.out.printf("\n\nCamarote Inferior:");
        ci.imprimeAssento();
        ci.escreveValor();

        System.out.printf("\n\nCamarote Superior:");
        cs.imprimeAssento();
        cs.escreveValor();

        System.out.printf("\n\nNormal:");
        nor.imprimeNormal();
    }
}
