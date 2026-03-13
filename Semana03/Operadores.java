
public class Operadores {
    public static void main(String[] args) {
    
        /*
            operadores aritmeticos

            % => resto de uma divisao
        */
        int a, b, c;
        a = 5; b = 3;

        // soma, subtracao, divisao, multiplicacao, resto
        c = a + b;
        c = a - b;
        c = a / b;
        c = a * b;
        c = a % b;
        
        // somar 1
        a++;    // a = a + 1;

        // substrair 1
        a--;    // a = a - 1;
        
       /*
            operadores relacionais / logicos
            a < b < c => a < b && b < c
            > 
            <
            >=
            <=
            ==      igual
            !=      diferente
            !    negacao do valor booleano

            && => and => e  true && true => true

            || => ou =>   true || qlqr => true
                          false || false => false
       */
        boolean res;
        res = a > b;    // true - false

    }

}