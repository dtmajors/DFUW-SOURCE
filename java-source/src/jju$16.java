class jju$16 implements htl {
   jju$16(jju var1, ldv var2, ldv var3, jjw var4) {
      this.nrc = var1;
      this.nrs = var2;
      this.nrt = var3;
      this.nru = var4;
   }

   @Override
   public void b(aym var1) {
      if (var1.iG().equals(this.nrs)) {
         ayp[] var2 = var1.abb();
         ayp var3 = null;

         for (int var4 = 0; var4 < var2.length; var4++) {
            var3 = var2[var4];
            if (var3.getGUID().equals(this.nrt)) {
               break;
            }
         }

         if (var3 != null) {
            idr var6 = (idr)idx.a(iee.lMw);
            var6.t(var1);
            hyn.cyJ().a(iee.lMw, false);
            idi var5 = (idi)idx.a(iee.lMx);
            var5.a(this.nru.getGUID(), var3);
            hyn.cyJ().a(iee.lMx, true);
            var5.cFc();
            hyn.cyJ().updateLayout();
            jju.dwK().czb().b(this);
         }
      }
   }

   @Override
   public void oj() {
   }
}
