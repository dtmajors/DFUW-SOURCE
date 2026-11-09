public class lob$a extends lmu {
   public static final lob$a rGf = new lob$a();
   private final boolean rEW;

   private lob$a() {
      super(lmu.rET);
      this.rEW = true;
   }

   protected lob$a(lmu var1) {
      super(var1);
      this.rEW = false;
   }

   public final lob ewz() {
      assert !this.rEW;
      return this.evj();
   }

   protected lob evj() {
      assert false;
      return null;
   }

   @Override
   protected final lmv dPk() {
      assert !this.rEW;
      return this.evj();
   }

   @Override
   public final boolean equals(Object var1) {
      if (var1 instanceof lob$a) {
         return this.b((lob$a)var1);
      }

      assert false;
      return false;
   }

   public final boolean b(lob$a var1) {
      assert !this.rEW;
      return var1 == this ? true : this.a(var1);
   }

   protected boolean a(lob$a var1) {
      assert lda.by(var1);
      assert false;
      return false;
   }
}
