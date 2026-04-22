package terca;
public class ContinueBreak {
    public static void main(String[] args) {
        
        for (int a = 0;  ; a++) {
            if (a == 3) { 
                continue;  // pula o restante do bloco e volta no step
            }
            System.out.println(a);
            if (a == 10) {
                break;  // forca a parada de um laco
            }
        }

        // FACA UM PROGRAMA QUE MOSTRE A SEQUENCIA DE NUMEROS DE 1 A N
        // OS NUMEROS MULTIPLOS DE 10 DEVEM SER "PULADOS"

        // FACA UM PROGRAMA QUE IDENTIFIQUE SE UM NUMERO É UM QUADRADO PERFEITO

        // FACA UM PROGRAMA QUE MOSTRE AS TABUADAS DE 1 A 10 
        // 1x1, 1x2, ... 1x10
        // 2x1, 2x2, ... 2x10
        // ...
        // 10x1, 10x2, ... 10x10
         
        // SEQUENCIA DE FIBONACCI PARA 20 ELEMENTOS
        // 1 1 2 3 5 8 13 21 34 55 89 ...


        /*
        
            while () {
                while () {
                    break;
                }
            }
        
        */

    }
}
