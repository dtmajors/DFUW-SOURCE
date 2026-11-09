import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class cbj$b {
   private fwq ejg;
   private int Ws;
   private Map<ldv, lfs<int[], int[]>> ejh;

   public cbj$b(cbj var1, fwq var2) {
      this.ejf = var1;
      this.ejg = null;
      this.Ws = 0;
      this.ejh = null;
      this.ejh = lcn.emw();
      this.ejg = var2;
   }

   public void a(ldv var1, lfs<int[], int[]> var2) {
      this.ejh.put(var1, var2);
      this.Ws++;
   }

   public void c(fna var1) {
      this.Ws--;
      if (var1.iQK) {
         this.ejh.remove(var1.aO());
      } else {
         this.ejh.put(var1.aO(), new lfs<>(var1.bqd, var1.iIY));
      }
   }

   public boolean arm() {
      return this.Ws == 0;
   }

   public boolean aHA() {
      return !this.ejh.isEmpty();
   }

   public Set<Entry<ldv, lfs<int[], int[]>>> aHB() {
      return this.ejh.entrySet();
   }

   public fwq aHC() {
      return this.ejg;
   }
}
