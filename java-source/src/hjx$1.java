class hjx$1 implements lbi<ffk> {
   hjx$1(hjx var1) {
      this.kBk = var1;
   }

   public void a(ffk var1) {
      boolean var2 = false;
      if (hjx.a(this.kBk) != var1.iKY) {
         hjx.a(this.kBk, var1.iKY);
         var2 = true;
      }

      if (hjx.a(this.kBk)) {
         ej[] var3 = var1.DR;
         if (!lin.a(var3, hjx.b(this.kBk))) {
            hjx.a(this.kBk, var3);
            var2 = true;
         }

         if (var1.ResourceType != (hjx.c(this.kBk) == null ? -1 : hjx.c(this.kBk).Type)) {
            hjx.a(this.kBk, hdw.LW(var1.ResourceType));
            var2 = true;
         }

         if (!ldq.ai(var1.dNb, hjx.d(this.kBk))) {
            hjx.a(this.kBk, var1.dNb);
            var2 = true;
         }

         if (var1.iKZ != hjx.e(this.kBk)) {
            hjx.b(this.kBk, var1.iKZ);
            var2 = true;
         }
      }

      if (var2) {
         hjx.f(this.kBk).enp();
      }
   }
}
