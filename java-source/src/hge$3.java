import java.util.Collection;

class hge$3 implements lbn {
   hge$3(hge var1) {
      this.kmW = var1;
   }

   @Override
   public final void W() {
      assert hge.b(this.kmW);
      if (hge.e(this.kmW).isEmpty()) {
         Collection var1 = this.kmW.cbP().kci.cof().cfh();
         hge.e(this.kmW).clear();

         for (hdu var3 : var1) {
            if (var3 instanceof hdz) {
               hge.e(this.kmW).add(var3);
               hge.f(this.kmW).add(var3.kaW);
            }
         }

         hge.g(this.kmW);
         hge.h(this.kmW);
      }
   }
}
