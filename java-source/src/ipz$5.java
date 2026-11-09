class ipz$5 extends ipz$a {
   ipz$5(ipz var1, float var2, int var3, float var4, boolean var5, String var6, String var7, String var8, float var9) {
      this.msO = var1;
      this.msZ = var2;
      this.mta = var3;
      this.mtb = var4;
      this.mtc = var5;
      this.mtd = var6;
      this.mte = var7;
      this.mtf = var8;
      this.mtg = var9;
   }

   @Override
   public void ddx() {
      this.msO.djE().b("Sprite_lineStyle", new Object[]{this.msO.getId(), this.msZ, this.mta, this.mtb, this.mtc, this.mtd, this.mte, this.mtf, this.mtg});
   }
}
