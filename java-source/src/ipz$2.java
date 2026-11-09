class ipz$2 extends ipz$a {
   ipz$2(ipz var1, int var2, int var3, int var4, int var5) {
      this.msO = var1;
      this.msP = var2;
      this.msQ = var3;
      this.msR = var4;
      this.msS = var5;
   }

   @Override
   public void ddx() {
      this.msO.djE().b("Sprite_drawRect", new Object[]{this.msO.getId(), this.msP, this.msQ, this.msR, this.msS});
   }
}
