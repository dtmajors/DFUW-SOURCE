import haa.a;

class mrj$50 implements a {
   mrj$50(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      String var3 = (String)var2;
      kru var4 = (kru)mrj.d(this.EkK).j(22);
      var4.pYW = lcw.qLb + "xml/terrain/" + var3 + ".xml";
      var4.pYX = var4.pYW;
      var4.pYV = 2;
      var4.pZa = false;
      var4.pYY = true;
      if (nab.EXr == null) {
         nab.eTR();
      }

      var4.pYZ = nab.EXr;
      var4.daN = 1.0F;
      mrj.d(this.EkK, true);
      mrj.d(this.EkK).d(var4);
   }
}
