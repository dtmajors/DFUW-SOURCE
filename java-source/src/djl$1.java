class djl$1 implements dfq$a {
   djl$1(djl var1) {
      this.gBX = var1;
   }

   @Override
   public void a(dfq var1) {
      if (this.gBX.getState() != 6) {
         this.gBX.setupPositionalRelation(this.gBX.getTargetObjectGUID(), var1.bmO(), this.gBX.getMainEffectObjectType());
      }
   }
}
