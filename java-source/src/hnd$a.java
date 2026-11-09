import java.util.Collections;
import java.util.Set;

public final class hnd$a {
   public final int kNW;
   public final Set<jpn> kvi;

   public hnd$a(int var1, Set<jpn> var2) {
      this.kNW = var1;
      this.kvi = Collections.unmodifiableSet(var2);
   }

   public final boolean a(hnd$a var1) {
      return this.kNW == var1.kNW && this.kvi.equals(var1.kvi);
   }

   @Override
   public boolean equals(Object var1) {
      return this.a((hnd$a)var1);
   }

   @Override
   public int hashCode() {
      return this.kvi.hashCode() << 16 | this.kNW;
   }
}
