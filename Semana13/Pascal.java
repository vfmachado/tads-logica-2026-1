public class Pascal {
    
    public static void main(String[] args) {
        
        int[] v = { 1, 1};

        /*
            1 1          
            
            
            1 2 1       2 => [0]+[1]
            1 3 3 1     3 => [0]+[1]  [1]+[2]
            1 4 6 4 1   [1] => [0]+[1]     [2] => [1]+[2]   [3] => [2]+[3]
            1 5 10 10 5 1
            1 6 15 20 15 6 1
            ...
        */
            
        for (int linha = 0; linha < 10; linha++) {
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "  ");
            }
            System.out.println();

            int [] v2 = new int[v.length+1];
            v2[0] = 1;
            v2[v2.length-1] = 1;
            for (int i = 1; i < v2.length-1; i++) {
                v2[i] = v[i-1]+v[i];
            }

            v = v2;
        }


    }

}
