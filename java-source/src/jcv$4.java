class jcv$4 extends jcw {
   jcv$4(jcv var1, jco var2, jco var3) {
      super(var2);
      this.mSp = var1;
      this.mSq = var3;
   }

   @Override
   public void az(ipf var1) {
      ioc var2 = var1.eo(0, 0);
      jcv$4$1 var3 = new jcv$4$1(this, this.djE(), new joa(var2.cf, var2.cg, var1.getWidth(), var1.getHeight()), this.mSq.dxT());
      var3.setGUID(this.djE().getMessageDelegator().bzv());
      this.djE().getMessageDelegator().a(var3);
   }
}
