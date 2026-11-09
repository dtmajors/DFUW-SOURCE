import java.util.Comparator;

class jix$g$1 implements Comparator<jix$c> {
   jix$g$1(jix$g var1) {
      this.nhG = var1;
   }

   public int a(jix$c var1, jix$c var2) {
      if (!(var1 instanceof jix$h)) {
         assert false;
         return 0;
      }

      if (!(var2 instanceof jix$h)) {
         assert false;
         return 0;
      }

      jix$h var3 = (jix$h)var1;
      jix$h var4 = (jix$h)var2;
      int var5 = jix$h.a(var3).awK().awR().getName().compareTo(jix$h.a(var4).awK().awR().getName());
      if (var5 == 0) {
         if (jix$h.a(var3).Bb() != jix$h.a(var4).Bb()) {
            return jix$h.a(var3).Bb() > jix$h.a(var4).Bb() ? 1 : -1;
         } else {
            return jix$h.a(var3).awK().getName().compareTo(jix$h.a(var4).awK().getName());
         }
      } else {
         return var5;
      }
   }
}
