import alc.a;

class hgo$6 implements lbn {
   hgo$6(hgo var1) {
      this.koR = var1;
   }

   @Override
   public final void W() {
      hdz var1 = hgo.d(this.koR).getSelectedItem();
      if (var1 != null) {
         if (hgo.d(this.koR).kVB.H(var1)) {
            boolean var2 = hgo.d(this.koR).kVB.I(var1);
            hgo.d(this.koR).a(var1, !var2, true);
         } else {
            hee var3 = this.koR.cbP().kck.kyA;
            if (!var1.ceB().a(var3, this.koR.kdT, false)) {
               return;
            }

            this.koR.cbP().a(var1, this.koR, null, a.brl.ordinal());
         }
      }
   }
}
