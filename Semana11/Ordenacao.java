import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        
        int [] v = new int[20];
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(1000);
        }
       
        int trocas = 0;

        for (int i = 0; i < v.length -1; i++) {
            for (int j = i +1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    trocas++;
                    // troca de duas variaveis
                    int tmp = v[j];
                    v[j] = v[i];
                    v[i] = tmp;
                }       
            }
        }
            
        System.out.println("total de trocas: " + trocas);
        
    }
}
