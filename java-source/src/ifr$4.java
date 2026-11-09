import java.util.Comparator;

class ifr$4 implements Comparator<ign> {
   ifr$4(ifr var1) {
      this.lRZ = var1;
   }

   public int a(ign var1, ign var2) {
      if (var1.qc() < var2.qc()) {
         return 1;
      } else {
         return var1.qc() > var2.qc() ? -1 : 0;
      }
   }
}
