import aux.a;

class mqz$6 implements a {
   mqz$6(mqz var1) {
      this.EhA = var1;
   }

   @Override
   public void a(eg var1) {
      ldv var2 = var1.dU();
      dld var3 = (dld)var1.getMessageDelegator().bzx().bzt().d(var2);
      ljq var4 = var3.av();
      edc var5 = (edc)var1.getMessageDelegator().h(2049, var1.getGUID(), var1.dU());
      var5.DH(12);
      var5.c(new ljq(var4.getX(), this.EhA.Ehz, var4.bdV()));
      var5.a(new lgl(new ljq(0.0F, 0.0F, 0.0F)));
      var1.getMessageDelegator().H(var5);
   }
}
