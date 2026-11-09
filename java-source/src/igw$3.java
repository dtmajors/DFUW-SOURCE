import java.util.Comparator;

class igw$3 implements Comparator<ign> {
   igw$3(igw var1) {
      this.lUp = var1;
   }

   public int a(ign var1, ign var2) {
      return var1.getTitle().compareToIgnoreCase(var2.getTitle());
   }
}
