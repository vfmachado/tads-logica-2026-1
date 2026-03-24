import java.util.Scanner;

public class L3CEx11 {
    public static void main(String[] args) {
//         Classificação de Notas com Critério de Aprovação
// Crie um programa que receba quatro notas de um aluno e determine sua situação:

// Aprovado se a média for >= 7 e nenhuma nota for inferior a 5.
// Recuperação se a média estiver entre 5 e 7 ou se houver uma nota menor que 5.
// Reprovado se a média for menor que 5 ou se houver duas ou mais notas abaixo de 5.

       Scanner in = new Scanner(System.in);
       float n1, n2, n3, n4, media;
       System.out.println("informe as 4 notas");
       n1 = in.nextFloat();
       n2 = in.nextFloat();
       n3 = in.nextFloat();
       n4 = in.nextFloat();

       media = (n1 + n2 + n3 + n4)/4;
       System.out.println("MEDIA " + media);

       int menorQue5 = 0;
       if (n1 < 5) menorQue5++; //menorQue5 = menorQue5 + 1
       if (n2 < 5) menorQue5++; //menorQue5 = menorQue5 + 1
       if (n3 < 5) menorQue5++; //menorQue5 = menorQue5 + 1
       if (n4 < 5) menorQue5++; //menorQue5 = menorQue5 + 1

       String resultado = "";
       if (media >= 7 && menorQue5 == 0) {
            resultado = "APROVADO";
       } else if ( (media >= 5 && media < 7) || menorQue5 == 1) {
            resultado = "RECUPERACAO";
       } else {
            resultado = "REPROVADO";
       }

       System.out.println(resultado);
    }
}
