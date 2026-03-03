public class Ex1 {
    public static void main(String[] args) {

        // FACA UM PROGRAMA QUE CONVERTA SEGUNDOS PARA h m s
        int segundos = 36325; // 10h 5m 25s
        int horas, minutos;

        horas = segundos / 3600;
        System.out.println(horas + "h");

        // minutos = (segundos - horas * 3600)/60;
        // minutos = (segundos % 3600)/60;
        
        // System.out.println(minutos + "m");
        // vou tirar as horas calculadas dos segundos para ver quantos segundos sobram
        segundos = segundos - horas * 3600;
        System.out.println("Sobraram " + segundos + " segundos");
        minutos = segundos / 60;
        System.out.println(minutos + "m");

        segundos = segundos % 60;
        System.out.println(segundos + "s");
        
    }
}