final class iha$1 implements jbb {
   iha$1(ign var1) {
      this.lUr = var1;
   }

   @Override
   public jba cVQ() {
      iha var1 = new iha(this.lUr);
      var1.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
      hso.cxK().cxP().cyJ().getMessageDelegator().a(var1);
      return var1;
   }
}
