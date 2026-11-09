import fjd.a;

class jol$7 implements lbi<fjc> {
   jol$7(jol var1) {
      this.nKF = var1;
   }

   public void a(fjc var1) {
      jox var2;
      try {
         var2 = jox.a(var1.ezf, jol.g(this.nKF).jWW);
      } catch (IllegalArgumentException var5) {
         jol.f(this.nKF).rnh.m(fjd.a(jol.f(this.nKF).rng, var1.aO(), a.iNA));
         return;
      }

      if (var1.akV == null) {
         jos var3 = jol.c(this.nKF).b(var2);
         if (var3 == null) {
            jol.f(this.nKF).rnh.m(fjd.a(jol.f(this.nKF).rng, var1.aO(), a.iND));
            return;
         }

         jol.c(this.nKF).a(var3, null);
         if (var3 instanceof jot) {
            jot var4 = (jot)var3;
            jol.i(this.nKF).kzI.a(false, var4, jol.h(this.nKF));
         }
      } else {
         jos var6 = jol.c(this.nKF).sZ(var1.akV);
         if (var6 == null) {
            jot var7 = new jot(var1.akV);
            jol.c(this.nKF).f(var7);
            var6 = var7;
            jol.i(this.nKF).kzI.a(true, var7, jol.h(this.nKF));
         }

         if (var6 instanceof jou) {
            if (!(var2.nKT instanceof jpg)) {
               jol.f(this.nKF).rnh.m(fjd.a(jol.f(this.nKF).rng, var1.aO(), a.iNB));
               return;
            }
         } else if (var6 instanceof jov) {
            if (!(var2.nKT instanceof jph)) {
               jol.f(this.nKF).rnh.m(fjd.a(jol.f(this.nKF).rng, var1.aO(), a.iNC));
               return;
            }
         } else {
            assert false : var2.nKT;
         }

         jol.c(this.nKF).a(var6, var2);
      }

      jol.f(this.nKF).rnh.m(fjd.a(jol.f(this.nKF).rng, var1.aO(), a.iNz));
   }
}
