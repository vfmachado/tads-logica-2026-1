package segunda;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float saldo = 0;
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("1. VER SALDO\n2. DEPOSITAR\n3. SACAR\n4. SAIR");
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.println(saldo);
            } else if (opcao == 2) {
                System.out.println("Valor do deposito");
                float deposito = in.nextFloat();
                saldo = saldo + deposito;
            } else if (opcao == 3) {
                System.out.println("Valor do saque");
                float saque = in.nextFloat();
                if (saque <= saldo) {
                    saldo = saldo - saque;
                } else {
                    System.out.println("NAO TEM SALDO SUFICIENTE");
                }
            }
        }


    }
}
