import java.util.ArrayList;

class hnf$1 implements lbn {
   hnf$1(hnf var1) {
      this.kOh = var1;
   }

   @Override
   public final void W() {
      assert hnf.a(this.kOh);

      for (lbn var3 : new ArrayList(hnf.b(this.kOh))) {
         var3.W();
      }

      if (!hnf.c(this.kOh)) {
         hnf.e(this.kOh).setDuration(hnf.d(this.kOh).cpX());
         hnf.a(this.kOh, true);
      }
   }
}
