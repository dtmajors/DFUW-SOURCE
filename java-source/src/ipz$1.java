import ipz.a;

class ipz$1 extends a {
   ipz$1(ipz var1, int var2, float var3) {
      this.msO = var1;
      this.msM = var2;
      this.msN = var3;
   }

   @Override
   public void ddx() {
      this.msO.djE().b("Sprite_beginFill", new Object[]{this.msO.getId(), this.msM, this.msN});
   }
}
