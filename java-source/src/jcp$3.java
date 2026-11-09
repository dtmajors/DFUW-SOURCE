class jcp$3 extends ize {
   jcp$3(jcp var1, jch var2) {
      this.mRK = var1;
      this.mPT = var2;
   }

   @Override
   public boolean du(int var1, int var2) {
      super.du(var1, var2);
      if (jcp.a(this.mRK) != null) {
         jcp.a(this.mRK).setVisible(false);
      }

      jcp.a(this.mRK, (izm)jcp.b(this.mRK).get(this.mPT));
      if (jcp.a(this.mRK) != null) {
         jcp.a(this.mRK).setVisible(true);
      }

      return false;
   }
}
