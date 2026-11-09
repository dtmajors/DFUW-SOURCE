class iea$e extends ipx {
   private iea$e(iea var1) {
      this.lLV = var1;
   }

   @Override
   public boolean du(int var1, int var2) {
      if (var1 > iea.a(this.lLV).getX()
         && var1 < iea.a(this.lLV).getX() + iea.a(this.lLV).getWidth()
         && var2 > iea.a(this.lLV).getY()
         && var2 < iea.a(this.lLV).getY() + iea.a(this.lLV).getHeight()) {
         return true;
      }

      this.lLV.closeWindow();
      return true;
   }
}
