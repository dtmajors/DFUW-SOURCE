public class lnb$a extends lob$a {
   public static final lnb$a rFn = new lnb$a();
   public final lmu rFo;

   private lnb$a() {
      super(lmu.rET);
      this.rFo = null;
   }

   protected lnb$a(lmu var1, lmu var2) {
      super(var1);
      this.rFo = var2;
   }

   public final lmu evz() {
      assert this.rFo != null;
      return this.rFo;
   }

   public final lnb evA() {
      assert this.rFo != null;
      return this.evB();
   }

   protected lnb evB() {
      assert false;
      return null;
   }

   @Override
   protected final lob evj() {
      assert this.rFo != null;
      return this.evB();
   }

   public boolean a(lnb$a var1) {
      assert this.rFo != null;
      return var1 == this ? true : this.rFo.b(var1.rFo);
   }
}
