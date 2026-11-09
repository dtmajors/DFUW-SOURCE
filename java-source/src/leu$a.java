import java.util.Comparator;
import java.util.Map.Entry;

class leu$a implements Comparator<Entry<Integer, lil<String, Float, Float>>> {
   private leu$a() {
   }

   public int compare(Entry<Integer, lil<String, Float, Float>> var1, Entry<Integer, lil<String, Float, Float>> var2) {
      lil var3 = (lil)var1.getValue();
      lil var4 = (lil)var2.getValue();
      if ((Float)var3.reZ > (Float)var4.reZ) {
         return -1;
      } else {
         return (Float)var3.reZ == (Float)var4.reZ ? 0 : 1;
      }
   }
}
