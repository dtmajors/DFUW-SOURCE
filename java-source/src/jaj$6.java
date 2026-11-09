import java.util.Comparator;

class jaj$6 implements Comparator<jai> {
   jaj$6(jaj var1) {
      this.mHd = var1;
   }

   public int a(jai var1, jai var2) {
      int var3 = var1.dbQ().getText().compareTo(var2.dbQ().getText());
      return var3 != 0 ? var3 : var1.duK() - var2.duK();
   }
}
