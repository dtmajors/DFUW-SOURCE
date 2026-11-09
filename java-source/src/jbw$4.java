import java.util.List;

class jbw$4 implements jbb {
   jbw$4(jbw var1, Integer var2, List var3, Boolean var4) {
      this.mPR = var1;
      this.mPU = var2;
      this.mPV = var3;
      this.mPW = var4;
   }

   @Override
   public jba cVQ() {
      jct var1 = new jct((jch)jcc.dwT().TO(this.mPU), this.mPV, this.mPW);
      var1.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
      hso.cxK().cxP().cyJ().getMessageDelegator().a(var1);
      return var1;
   }
}
