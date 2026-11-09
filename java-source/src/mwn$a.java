import java.util.Comparator;

class mwn$a implements Comparator<due> {
   mwn$a(mwn var1) {
      this.ERI = var1;
   }

   public int a(due var1, due var2) {
      String var3 = var1.Filename;
      String var4 = var2.Filename;
      return var3.compareToIgnoreCase(var4);
   }
}
