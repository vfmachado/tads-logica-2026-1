import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
            FAÇA UM PROGRAMA QUE DADO A LARGURA E COMPRIMENTO DE UMA PEÇA (SALA, QUARTO, COZINHA) E QUANTOS M2 TEM UMA CAIXA DE PISO (2~3) CALCULE QUANTAS CAIXAS SAO NECESSARIAS SABENDO QUE É NECESSARIO ADICIONAR UMA MARGEM DE 15% DE QUEBRA. 
            float f = 1.25f;
            int a = (int) f; 
        */

        // DECLARACAO DE VARIAVEIS
        Scanner in = new Scanner(System.in);
        float comprimento, largura, m2Caixa, area;
        int caixas;

        // ENTRADA
        System.out.println("DIGITE O COMPRIMENTO, LARGURA, QUANTOS M2 CADA CAIXA COBREs");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        m2Caixa = in.nextFloat();

        // PROCESSAMENTO

        // area + quebra de 15%
        area = comprimento * largura;
        
        // adicionar quebra de 15%
        area = area * 1.15f;       // acrescimento 1 + acrescimeno
                                   // desconto     1 - desconto

        // caixas = (int) (area / m2Caixa + 0.99999f);
        caixas = (int) Math.ceil(area/m2Caixa);

        // SAIDA
        System.out.println("CAIXAS = " + caixas);

    }
}