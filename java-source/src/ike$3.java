import java.util.Comparator;

class ike$3 implements Comparator<ije> {
   ike$3(ike var1) {
      this.mfS = var1;
   }

   public int a(ije var1, ije var2) {
      return var1.daS().getText().compareToIgnoreCase(var2.daS().getText());
   }
}
