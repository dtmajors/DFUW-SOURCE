import java.util.Collections;
import java.util.List;

public class lmw$a$a {
   public static final List<lmw$a$a> rEX = Collections.emptyList();
   public final lmu kza;
   public final String Name;

   public lmw$a$a(lmu var1, String var2) {
      assert var1 != null;
      assert var2 != null;
      assert lin.An(var2);
      this.kza = var1;
      this.Name = var2;
   }

   @Override
   public String toString() {
      return super.toString() + ":" + this.Name + ":" + this.kza.toString();
   }
}
