public final class hee$a implements lbn {
   private final hee kdT;

   public hee$a(hee var1) {
      this.kdT = var1;
      this.cc(true);
   }

   @Override
   public final void W() {
      this.cc(false);
      this.kdT.dispose();
      this.kdT.kdQ = null;
   }

   public final void cc(boolean var1) {
      this.kdT.ceZ().a(var1, this);
   }
}
