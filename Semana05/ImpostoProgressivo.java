public class ImpostoProgressivo {
    public static void main(String[] args) {
        
        float salario, imposto = 0;
        salario = 2500;

        if (salario <= 2000) {
            imposto = 0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000 ) * 0.08f;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18f + 80;
        } else {
            imposto = (salario - 4500) * 0.28f + 80 + 270;
        }

        System.out.println("IMPOSTO " + imposto);
    }
}
