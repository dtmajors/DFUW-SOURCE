import java.util.Comparator;
import java.util.Map.Entry;

class cfh$1 implements Comparator<Entry<K, V>> {
   cfh$1(cfh var1) {
      this.euu = var1;
   }

   public int compare(Entry<K, V> var1, Entry<K, V> var2) {
      return ((Comparable)var1.getValue()).compareTo(var2.getValue());
   }
}
