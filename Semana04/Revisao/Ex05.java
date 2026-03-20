package Revisao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int horaInicio, minInicio, horaFim, minFim;
        Scanner in = new Scanner(System.in);

        int horas = 0, minutos = 0;

        System.out.println("informe hora inicial, minuto inicial, hora final, minuto final");
        horaInicio = in.nextInt();
        minInicio = in.nextInt();
        horaFim = in.nextInt();
        minFim = in.nextInt();

        // caso padrao (10h30 as 12h45 => 2h15)
        if (horaFim >= horaInicio && minFim >= minInicio) {
            horas = horaFim - horaInicio;
            minutos = minFim - minInicio;

        } else if (horaFim > horaInicio && minFim < minInicio) {
            horas = horaFim - 1 - horaInicio;
            minutos = minFim + 60 - minInicio;
        
        // mudou de dia
        } else if (horaFim < horaInicio) {
            horas = 24 + horaFim - horaInicio;
            if (minFim < minInicio) {
                minFim = minFim + 60;
                horas = horas-1;
            }
            minutos = minFim - minInicio;
        }

        System.out.printf("%d horas e %d minutos\n", horas, minutos);

        /*
        Até 15 minutos → Grátis.
        De 16 a < 60 minutos → R$ 5,00.
        >= 1h a 3h → R$ 10,00.
        Acima de 3h → R$ 10,00 + R$ 2,00 por hora extra.
        */
        int valor = 0;
        if (horas == 0 && minFim <= 15) {
            System.out.println("GRATUITO");
        } else if (horas == 0) {
            //System.out.println("R$ 5,00");
            valor = 5;
        } else if (horas < 3 || (horas == 3 && minutos == 0)) {
            valor = 10;
        } else {
            valor = 10;
            int horaExtra = horas - 3;
            valor = valor + horaExtra * 2;
            if (minutos > 0) {
                valor = valor + 2;
            }
        }


        System.out.println("R$ " + valor);
    }
}
