class hfs$5 implements lbn {
   hfs$5(hfs var1) {
      this.kkP = var1;
   }

   @Override
   public final void W() {
      hdw var1 = hfs.b(this.kkP).getSelectedItem();
      if (var1 != null) {
         int var2 = (int)hfs.e(this.kkP).cqg().cpZ();
         if (var2 < 1) {
            assert false : "Invalid value: " + var2;
            var2 = 1;
         }

         this.kkP.cbP().kcf.a(hfs.d(this.kkP), var1, --var2);
      }
   }
}
