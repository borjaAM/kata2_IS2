package kata2;

import java.util.Iterator;
import java.util.Map;

/**
 * @author Borja Álvarez
 */
public class Kata2 {

    public static void main(String[] args) {
        String[] data2 = {"Facundo", "Ana", "Pedro", "Pepe", "Maria", "Pepe", "Maria", "Pedro", "Rosa", "Rosa"};
        
        Histogram histogr = new Histogram(data2);
        Map<String, Integer> histogram = histogr.getHistogram();
        
        Iterator<Map.Entry<String, Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        
    }
    
}
