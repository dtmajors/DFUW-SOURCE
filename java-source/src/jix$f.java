public class jix$f extends jix$c implements jix$b {
   private brt nhF;

   public brt dHP() {
      return this.nhF;
   }

   @Override
   public lgw dhm() {
      return (lgw)this.dHM();
   }

   @Override
   public jix$c f(bsf var1) {
      return var1 instanceof brt && this.nhF.az() == ((brt)var1).az() ? this : null;
   }

   @Override
   protected void dHJ() {
   }

   private jix$f(jix var1, lgw var2, brt var3) {
      super(var1, var2, new hwr(var3), null);
      this.nhA = var1;
      this.nhF = var3;
   }

   @Override
   public void sort() {
   }
}
