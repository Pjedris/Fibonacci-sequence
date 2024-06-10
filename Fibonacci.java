package fibonnaci;

import java.util.HashMap;

public class Fibonnaci {

    public static int fib_rek(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fib_rek(n - 1) + fib_rek(n - 2));
        }
    }
    
    
    static HashMap<Integer, Integer> hm = null;
    
    public static int fib_hm(int n) {
        if(!hm.containsKey(n)) {
            hm.put(n, fib_hm(n-1) + fib_hm(n-2));
        }
        return hm.get(n);
    }
    
    public static int fib_it(int n) {
        int prev = 0;
        int cur = 1;
        if(n == 0) {
            return prev;
        } else {
            for(int i = 2; i <= n; i++) {
                int tmp = prev + cur;
                prev = cur;
                cur = tmp;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        //fib rek
        System.out.println("Fib_rek");
        for (int i = 0; i <= 45; i++) {
            System.out.println(i + " : " + fib_rek(i));
        }
        
        //fib hm
        System.out.println("Fib_hm");
        hm = new HashMap<>();
        hm.put(0, 0);
        hm.put(1, 1);
        for(int i = 0; i <= 45; i++) {
            System.out.println(i + " : " + fib_hm(i));
        }
        
        //fib it
        System.out.println("Fib_it");
        for(int i = 0; i <= 45; i++) {
            System.out.println(i + " : " + fib_it(i));
        }
    }
}
