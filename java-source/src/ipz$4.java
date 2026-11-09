class ipz$4 extends ipz$a {
   ipz$4(ipz var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      this.msO = var1;
      this.msT = var2;
      this.msU = var3;
      this.msV = var4;
      this.msW = var5;
      this.msX = var6;
      this.msY = var7;
   }

   @Override
   public void ddx() {
      this.msO.djE().b("Sprite_drawArc", new Object[]{this.msO.getId(), this.msT, this.msU, this.msV, this.msW, this.msX, this.msY});
   }
}
