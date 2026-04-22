package terca;
public class For {
    public static void main(String[] args) {
        
        int a = 0;  // incializacao
        while (a < 10) { // condicao
            System.out.println(a);
            a++; // step - passo
        }

        // for (inicializacao; condicao; step)
        //   1           2       4 (e volta 2)
        for (int b = 0; b < 10; b++) {
            System.out.println(b); // 3
        }

        // todos os parametros sao opcionais, porem ainda separados por ;
        
        // while true
        for ( ; ; ) {
            System.out.println("E VERDADE");
        } 


    }
}
