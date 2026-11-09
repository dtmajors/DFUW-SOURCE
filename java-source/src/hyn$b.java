class hyn$b extends btk implements bto {
   StringBuilder lpg;

   private hyn$b(hyn var1) {
      this.loY = var1;
      this.lpg = new StringBuilder();
   }

   @Override
   public void doTick(ldz var1) {
      if (this.loY.cFe() && this.lpg.length() > 0) {
         String var2 = this.lpg.toString();
         this.loY.a("exec", new Object[]{var2});
         this.lpg.setLength(0);
      }
   }
}
