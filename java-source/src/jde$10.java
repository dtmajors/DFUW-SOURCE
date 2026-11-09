class jde$10 implements iub {
   jde$10(jde var1, jcb var2, jca var3) {
      this.mSR = var1;
      this.mSS = var2;
      this.mST = var3;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean a(iua var1) {
      jdd var2 = (jdd)var1;
      boolean var3 = var2.dyp().dxd() != jbz.mQj;
      if (!this.mSS.mQp.isEmpty()) {
         if (var1 instanceof jdc) {
            var3 = this.mSS.mQp.contains(jcz.mSA) && var3;
         } else if (var1 instanceof jdb) {
            var3 = this.mSS.mQp.contains(jcz.mSB) && var3;
         }
      }

      if (!this.mSS.mQq.isEmpty()) {
         switch (var2.dyp().dxe()) {
            case mPY:
               var3 = this.mSS.mQq.contains(jbx.mPY) && var3;
               break;
            case mPZ:
               var3 = this.mSS.mQq.contains(jbx.mPZ) && var3;
               break;
            case mQc:
               var3 = this.mSS.mQq.contains(jbx.mQc) && var3;
               break;
            case mQb:
               var3 = this.mSS.mQq.contains(jbx.mQb) && var3;
               break;
            case mQd:
               var3 = this.mSS.mQq.contains(jbx.mQd) && var3;
         }
      }

      if (this.mSS.mQr) {
         var3 = var2.dyp().vY() && var3;
      }

      if (var1 instanceof jdb) {
         jdb var4 = (jdb)var1;
         if (var3) {
            if (var4.dyp().dxd() == jbz.mQl) {
               this.mST.mQn++;
            }

            this.mST.mQo++;
         }
      }

      return var3;
   }
}
