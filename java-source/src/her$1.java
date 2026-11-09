class her$1 implements lbn {
   her$1(her var1) {
      this.kfN = var1;
   }

   @Override
   public final void W() {
      if (her.a(this.kfN) == null) {
         lfn.b(5, this.getClass().getSimpleName(), "observeEvent() : MainMenuComponent is null!");
      } else if (this.kfN.kLu.csd()) {
         her.a(this.kfN).cki();
         this.kfN.d(her.b(this.kfN));
         if (her.a(this.kfN).isExpanded()) {
            int var1 = this.kfN.cqw().cf;
            int var2 = this.kfN.cqw().cg;
            int var3 = this.kfN.cbO().jZH.getWidth() - (var1 + her.a(this.kfN).getWidth());
            if (var3 < 0) {
               this.kfN.a(new lgg(var1 + var3, var2), this.kfN.cbO().crO());
            }
         }
      }
   }
}
