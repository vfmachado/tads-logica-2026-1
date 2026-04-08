package segunda;

public class RepeticaoDupla {
    
    public static void main(String[] args) {
        
        // se while é um bloco, eu posso ter outro while dentro?

        // dado a altura e largura de um retangulo, desenhar com asteriscos
        /*
            3 5
            * * * * *
            * * * * * 
            * * * * * 
            
            4 4
            * * * * 
            * * * * 
            * * * *
            * * * *
            
        */

        int altura = 8;
        int largura = 15;

        int linha = 0;
        while (linha < altura) {
            int coluna = 0;
            while (coluna < largura) {
                if ((linha + coluna) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
                coluna++;
            }
            System.out.println();
            linha++;
        }
    }

}
