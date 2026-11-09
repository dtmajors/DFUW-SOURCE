class jqi$1 implements lbi<fja> {
   jqi$1(jqi var1) {
      this.nRZ = var1;
   }

   public final void a(fja var1) {
      ldv var2 = var1.aO();
      if (var1.iNw instanceof jov) {
         jqi.a(this.nRZ, var1.ila, (jov)var1.iNw, var2);
      } else if (var1.iNw instanceof jou) {
         jqi.a(this.nRZ, var1.ila, (jou)var1.iNw, var2);
      } else {
         assert false;
      }
   }
}
