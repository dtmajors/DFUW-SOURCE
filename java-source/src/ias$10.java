class ias$10 extends iau {
   ias$10(ias var1, int var2, int var3) {
      super(var2);
      this.lCC = var1;
      this.lCD = var3;
   }

   @Override
   public boolean du(int var1, int var2) {
      if (super.du(var1, var2)) {
         return true;
      }

      ias.a(this.lCC, this.lCD);
      return false;
   }
}
