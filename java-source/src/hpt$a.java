import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hpt$a {
   public final hpt$b kWB;
   public final hpw$a kWC;
   public final List<hqg.b> kWD;
   public final lhu kWE;

   public hpt$a(hpt$b var1, hpw$a var2, lhu var3, hqg.b[] var4) {
      assert var1 != null;
      assert var1 == hpt$b.kWF || var2 != null;
      assert var3 != null;
      assert var4.length == ldb.ListOfValue.size();
      assert var4[0] != null;
      assert var4[1] != null;
      this.kWB = var1;
      this.kWC = var2;
      this.kWD = Collections.unmodifiableList(Arrays.asList(var4));
      this.kWE = var3;
   }
}
