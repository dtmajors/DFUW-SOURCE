class igw$4 extends ism {
   igw$4(igw var1, String var2) {
      super(var2);
      this.lUp = var1;
   }

   @Override
   public boolean du(int var1, int var2) {
      igw.a(this.lUp).setVisible(true);
      this.setVisible(false);
      return true;
   }
}
