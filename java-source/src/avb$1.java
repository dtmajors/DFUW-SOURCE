class avb$1 implements lbi<fjd> {
   avb$1(avb var1) {
      this.ciX = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void a(fjd var1) {
      switch (var1.bPU()) {
         case iND:
            this.ciX.h(maf.InputBindNotBound.bD());
         case iNz:
            break;
         case iNA:
            this.ciX.h(maf.InputBindInvalidBinding.bD());
            break;
         case iNB:
            this.ciX.h(maf.InputBindExpectedLinear.bD());
            break;
         case iNC:
            this.ciX.h(maf.InputBindExpectedSwitch.bD());
            break;
         default:
            assert false : var1.bPU();
      }
   }
}
