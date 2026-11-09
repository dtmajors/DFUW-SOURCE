class mla$3 extends mjg {
   mla$3(mla var1) {
      this.DGE = var1;
   }

   @Override
   public Object Hv() {
      mla.d(this.DGE);
      return "done";
   }

   @Override
   public void finished() {
      System.out.println("finished");
   }
}
