public class hnc$a implements lbn {
   public final hms kNS;
   public final lbn kNT;

   public hnc$a(hms var1, lbn var2) {
      this.kNS = var1;
      this.kNT = var2;
      this.nZ(true);
   }

   @Override
   public void W() {
      this.nZ(false);
      this.kNT.W();
   }

   private void nZ(boolean var1) {
      this.kNS.cql().a(var1, this);
   }
}
