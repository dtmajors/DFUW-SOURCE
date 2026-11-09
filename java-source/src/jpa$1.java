import java.util.Collections;

class jpa$1 implements lbi<jpk> {
   jpa$1(jpa var1) {
      this.nLd = var1;
   }

   public void a(jpk var1) {
      if (var1 instanceof jpm) {
         this.nLd.b((jpm)var1);
      } else if (var1 instanceof jpl) {
         jpa.a(this.nLd, (jpl)var1, Collections.unmodifiableSet(jpa.a(this.nLd)));
      }
   }
}
