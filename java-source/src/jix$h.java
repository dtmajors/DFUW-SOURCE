public class jix$h extends jix$c {
   private bsc nhH;

   public bsc dHQ() {
      return this.nhH;
   }

   @Override
   public jix$c f(bsf var1) {
      return var1 instanceof bsc && this.nhH.zg() == ((bsc)var1).zg() ? this : null;
   }

   @Override
   protected void dHJ() {
   }

   private jix$h(jix var1, ldy var2, bsc var3) {
      super(var1, var2, new hww(var3), null);
      this.nhA = var1;
      this.nhH = var3;
   }

   @Override
   public void sort() {
   }
}
