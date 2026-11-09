class nac$1 extends mjg {
   nac$1(nac var1) {
      this.EXE = var1;
   }

   @Override
   public Object Hv() {
      nac.a(this.EXE);
      return "done";
   }

   @Override
   public void finished() {
   }
}
