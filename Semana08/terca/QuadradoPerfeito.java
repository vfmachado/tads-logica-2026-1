package terca;
public class QuadradoPerfeito {
    public static void main(String[] args) {
        
        int n = 100000000;

        // por quanto comeca o cont?
        // qual a condicao de parada?
        // de quanto em quanto aumenta?

        // condicao principal ?
        boolean ehPerfeito = false;
        for (int cont = 1; cont * cont <= n; cont++) {
            System.out.println("testando com cont " + cont);
            if (cont * cont == n) {
                ehPerfeito = true;
            }
        }

        if (ehPerfeito) System.out.println("Perfeito");
        else System.out.println("nao eh perfeito");

        // e quando nao eh perfeito?

    }
}
