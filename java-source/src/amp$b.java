import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

class amp$b {
   TreeMap<String, cts> bzT;

   amp$b(amp var1) {
      this.bzS = var1;
   }

   private cts dA(String var1) {
      return this.bzT == null ? null : this.bzT.get(var1);
   }

   private cts dB(String var1) {
      if (this.bzT == null) {
         this.bzT = lcn.emG();
      }

      cts var2 = this.bzT.get(var1);
      if (var2 == null) {
         var2 = new cts();
         this.bzT.put(var1, var2);
      }

      return var2;
   }

   cts dC(String var1) {
      return this.dA("" + var1);
   }

   Collection<cts> Hu() {
      return this.bzT == null ? null : this.bzT.values();
   }

   cts dD(String var1) {
      return this.dB("" + var1);
   }

   cts dE(String var1) {
      if (this.bzT == null) {
         return null;
      }

      cts var2 = this.bzT.remove("" + var1);
      if (this.bzT.size() == 0) {
         this.bzT = null;
      }

      return var2;
   }

   void h(Collection<cts> var1) {
      Set var2 = lcn.emx();
      var2.addAll(var1);
      if (this.bzT == null) {
         this.bzT = lcn.emG();
      }

      for (cts var4 : var2) {
         if (amp.Ht().contains(var4.ResourceName)) {
            this.bzT.put(var4.ResourceName, var4);
         } else {
            this.bzS.bzH.setEnabled(true);
         }
      }
   }
}
