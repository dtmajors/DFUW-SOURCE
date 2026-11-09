class hbr$1 implements lbn {
   hbr$1(hbr var1) {
      this.jEb = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public final void W() {
      assert hbr.a(this.jEb);
      String var1 = "";
      switch (cu.a(this.jEb.cbq(), this.jEb.cbr(), lcw.SC, null)) {
         case lk:
            var1 = lcx.qRl.esy();
            break;
         case li:
         case lj:
            var1 = lcx.qRk.esy();
            break;
         case lc:
         case ld:
         case lg:
         case le:
         case lf:
         case lh:
            var1 = lcx.qRh.esy();
            break;
         case kY:
         case la:
            var1 = lcx.qRi.esy();
            break;
         case ll:
            var1 = lcx.qRn.esy();
            break;
         case kZ:
         case lb:
            var1 = lcx.qRj.esy();
      }

      hbr.b(this.jEb).lX(var1);
   }
}
