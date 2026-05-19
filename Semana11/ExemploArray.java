import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArray {
    public static void main(String[] args) {
        
        List<Integer> v = new ArrayList<>();
        System.out.println(v.size());
        v.add(10);
        v.add(5);
        v.add(7);
        v.add(38);
        System.out.println(v.size());
        Collections.sort(v);
        System.out.println(v);
    }
}
