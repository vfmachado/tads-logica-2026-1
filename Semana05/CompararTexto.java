import java.util.Scanner;

public class CompararTexto {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        char letra = in.next().toUpperCase().charAt(0);
        if (letra == 'A') {
            System.out.println("ALCOOL");
        } else if (letra == 'G') {
            System.out.println("GASOLINA");
        } else {
            System.out.println("Entrada invalida");
        }

        String texto = in.next();
        if (texto.equals("sim")) {
            System.out.println("vc digitou sim");
        } else {
            System.out.println("vc nao digitou sim");
        }

    }
}
