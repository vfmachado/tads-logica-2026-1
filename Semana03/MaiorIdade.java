public class MaiorIdade {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // dada  idade de uma pessoa, dizer se é ou nao maior de idade
        System.out.println("Informe a idade");
        int idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");

        // else complementa o if
        } else {
            System.out.println("Menor de idade");
        }
    }
}