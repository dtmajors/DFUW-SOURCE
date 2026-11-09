import java.util.Comparator;

class kaq$2 implements Comparator {
   kaq$2(kaq var1) {
      this.pbe = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      int var3 = ((cao)var1).pa().compareTo(((cam)var2).pa());
      if (var3 == 0) {
         var3 = ((cao)var1).Yq().compareTo(((cao)var2).Yq());
      }

      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      return false;
   }
}
