class ipz$6 extends ipz$a {
   ipz$6(ipz var1, int var2, int var3, int var4, int var5, int var6, float var7, int var8, String var9) {
      this.msO = var1;
      this.msT = var2;
      this.msU = var3;
      this.msV = var4;
      this.mth = var5;
      this.mti = var6;
      this.msY = var7;
      this.mtj = var8;
      this.mtk = var9;
   }

   @Override
   public void ddx() {
      this.msO.djE().b("Sprite_fillArc", new Object[]{this.msO.getId(), this.msT, this.msU, this.msV, this.mth, this.mti, this.msY, this.mtj, this.mtk});
   }
}
