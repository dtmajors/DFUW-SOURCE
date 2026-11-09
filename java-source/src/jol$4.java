import java.util.Iterator;

class jol$4 implements lbn {
   jol$4(jol var1) {
      this.nKF = var1;
   }

   @Override
   public final void W() {
      Iterator var1 = jol.c(this.nKF).a((jow)null).iterator();

      while (var1.hasNext()) {
         jos var2 = (jos)var1.next();
         if (var2 instanceof jot && jol.c(this.nKF).e(var2) == null) {
            var1.remove();
         }
      }

      jol.a(this.nKF, jol.c(this.nKF));
      jol.d(this.nKF);
   }
}
