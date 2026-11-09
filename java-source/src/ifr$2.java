import java.util.Comparator;

class ifr$2 implements Comparator<ign> {
   ifr$2(ifr var1) {
      this.lRZ = var1;
   }

   public int a(ign var1, ign var2) {
      return var1.cTx() > var2.cTx() ? -1 : (var1.cTx() < var2.cTx() ? 1 : 0);
   }
}
