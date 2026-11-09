class aux$2 implements aux$a {
   aux$2(aux var1, int var2) {
      this.DDk = var1;
      this.mhh = var2;
   }

   @Override
   public void a(eg var1) {
      if (mje.DAS != null) {
         dta var2 = var1.getMessageDelegator().bzx().bzt().od(mje.DAS);
         bsx var3 = new bsx();
         mjc var4 = mje.DCk.get(this.mhh);
         bsx var5 = new bsx();
         var4.d(var5);
         var3.setValue("Position", mje.DBl.esF());
         var3.setValue("Rotation", new ljq(0.0F, 0.0F, 0.0F));
         dsc var6 = new dsc(this.mhh, var3, var5, "");
         var6.setGUID(var2.bzv());
         var2.a(var6);
      }
   }
}
