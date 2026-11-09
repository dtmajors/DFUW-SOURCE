import dfq.a;

class cby$1 implements a {
   cby$1(cby var1) {
      this.ekV = var1;
   }

   @Override
   public void a(dfq var1) {
      cbp var2 = (cbp)cby.a(this.ekV).get(var1.getGUID());
      if (var2 == null) {
         lfn.b(5, "SFPhysicalObjectAttachedObjectExtrasManager", "onCreated() :newly created light atom not found!");
      } else {
         var2.ejU = cby.a(this.ekV, var1.bmO(), var2.biE);
      }
   }
}
