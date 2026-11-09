import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hqw$a {
   public final hpx$b kJH;
   public final List<hqw$a$a> kZF;
   public final lbf<lhv> kqB;
   public final lgg kNZ;

   public hqw$a(hpx$b var1, hqw$a$a[] var2, lhv[][] var3, lgg var4) {
      assert var1 != null;
      assert var2 != null;
      assert var2.length == ldb.ListOfValue.size();
      assert var2[ldb.reo.ordinal()].kOc != null;
      assert var2[ldb.rep.ordinal()].kOc != null;
      assert var2[ldb.reo.ordinal()].kOc.length > 0;
      assert var2[ldb.rep.ordinal()].kOc.length > 0;
      assert var3 != null;
      assert var3.length == var2[ldb.rep.ordinal()].kOc.length;
      assert var3[0].length == var2[ldb.reo.ordinal()].kOc.length;
      assert var4 == null || var4.cf >= 0 && var4.cf < var3[0].length && var4.cg >= 0 && var4.cg < var3.length;
      this.kJH = var1;
      this.kZF = Collections.unmodifiableList(Arrays.asList(var2));
      this.kqB = new lax<>(var3);
      this.kNZ = var4;
   }

   public hqw$a(hpx$b var1, lhv var2, boolean var3) {
      this(var1, new hqw$a$a[]{new hqw$a$a(var2.kLY.rmN), new hqw$a$a(var2.kLY.H)}, new lhv[][]{{var2}}, var3 ? lgg.rlI : null);
   }

   public lhf cwu() {
      return new lhf(this.kZF.get(ldb.reo.ordinal()).kOc.length, this.kZF.get(ldb.rep.ordinal()).kOc.length);
   }

   public lhf cwv() {
      return new lhf(this.kZF.get(ldb.reo.ordinal()).cww(), this.kZF.get(ldb.rep.ordinal()).cww());
   }
}
