import java.util.Comparator;
import java.util.Map.Entry;

class leu$b<K, V extends Comparable<V>> implements Comparator<Entry<K, V>> {
   private leu$b() {
   }

   public int compare(Entry<K, V> var1, Entry<K, V> var2) {
      return ((Comparable)var1.getValue()).compareTo(var2.getValue());
   }
}
