import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hqi$a {
   public final hqh$b kKx;
   public final List<lcq> kYW;

   public hqi$a(hqh$b var1, lcq[] var2) {
      assert var1 != null;
      assert var2 != null;
      assert var2.length > 0;
      this.kKx = var1;
      this.kYW = Collections.unmodifiableList(Arrays.asList(var2));
   }
}
