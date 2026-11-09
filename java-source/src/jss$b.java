import java.util.LinkedHashMap;
import java.util.Map.Entry;

class jss$b<K, V> extends LinkedHashMap<K, V> {
   private int nWy;

   public jss$b(jss var1, int var2, float var3, int var4) {
      super(var2, var3, true);
      this.nWx = var1;
      this.nWy = var4;
   }

   @Override
   protected boolean removeEldestEntry(Entry<K, V> var1) {
      return this.size() >= this.nWy;
   }
}
