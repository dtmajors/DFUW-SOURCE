class hfs$2 implements lbn {
   hfs$2(hfs var1) {
      this.kkP = var1;
   }

   @Override
   public final void W() {
      hdw var1 = hfs.b(this.kkP).getSelectedItem();
      if (var1 != null) {
         if (hfs.b(this.kkP).kVB.H(var1)) {
            boolean var2 = hfs.b(this.kkP).kVB.I(var1);
            hfs.b(this.kkP).a(var1, !var2, true);
         } else if (!this.kkP.cbP().kcf.a(hfs.c(this.kkP), var1)) {
            this.kkP.kLu.a(this.kkP.cbO().kIn.kEB);
         } else {
            this.kkP.cbP().kcf.a(hfs.d(this.kkP), var1, 0);
         }
      }
   }
}
