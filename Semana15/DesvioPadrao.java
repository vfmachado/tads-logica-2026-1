public class DesvioPadrao {
    public static void main(String[] args) {
        
        float [] v = {1, 2, 3, 4};

        // desvio padrao
        /*
            raiz qudrada (da soma (da diferenca de cada valor com a media) ao quadrado / n)
        */

        float media = 0;
        for (int i = 0; i < v.length; i++) {
            media = media + v[i];   // media += v[i]
        }
        media = media/v.length;

        float soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + (v[i] - media)*(v[i] - media);
        }

        soma = soma / v.length;

        double desvio = Math.sqrt(soma);
        System.out.println("DESVIO: " + desvio);
    }

}
