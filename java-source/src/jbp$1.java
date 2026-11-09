class jbp$1 extends ipx {
   jbp$1(jbp var1) {
      this.mOV = var1;
   }

   @Override
   public boolean du(int var1, int var2) {
      if (var1 > jbp.a(this.mOV).getX()
         && var1 < jbp.a(this.mOV).getX() + jbp.a(this.mOV).getWidth()
         && var2 > jbp.a(this.mOV).getY()
         && var2 < jbp.a(this.mOV).getY() + jbp.a(this.mOV).getHeight()) {
         return true;
      }

      jbp.b(this.mOV);
      return true;
   }
}
