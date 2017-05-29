import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
    
        }
        
                    
            Set<Integer> map = new HashSet<Integer>();
        for(int a_i=0; a_i < n; a_i++) {
            int d=a[a_i];
            if(map.contains(d)) {
                map.remove(d);
            }
            else {
                map.add(d);
            }
        
        }
        System.out.println(map.iterator().next());        
}
}
