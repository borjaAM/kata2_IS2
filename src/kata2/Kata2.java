package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Borja Álvarez
 */
public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {0, 1, 2, 3, 1, 2, 5, 8, 9, 1, 4, 3, 2, 0, 8};
        String[] data2 = {"facundo", "ana", "pedro", "pepe", "maria", "pepe", "maria", "pedro"};
        
        Histogram meta_histogram = new Histogram(data);
        Map<Integer, Integer> histogram = meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        
    }
    
}
