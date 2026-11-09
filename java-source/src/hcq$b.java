import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class hcq$b extends hrd<jos, String> {
   private final lbn jIf = new hcq$b$1(this);
   private final joz jHO;
   private final jow jIg;
   private List<jos> jIh;
   private final hro jIi;

   public hcq$b(joz var1, jow var2) {
      this(var1, var2, new hro());
   }

   private hcq$b(joz var1, jow var2, hro var3) {
      super(2, var3);
      this.jHO = var1;
      this.jIg = var2;
      this.jIi = var3;
      this.nb(true);
      this.refresh();
   }

   public final void dispose() {
      this.nb(false);
   }

   public jos LP(int var1) {
      assert var1 >= 0 && var1 < this.jIh.size() : var1;
      return this.jIh.get(var1);
   }

   public boolean a(int var1, jos var2) {
      assert lda.by(var2, new Integer(var1));
      return false;
   }

   public String a(jos var1, int var2) {
      assert var2 >= 0 && var2 < 2;
      switch (var2) {
         case 0:
            lip var5 = var1.awO();
            return var5.esy();
         case 1:
            jox var3 = this.jHO.e(var1);
            lip var4 = var3 == null ? lcy.qRt : var3.awO();
            return var4.esy();
         default:
            assert false : var2;
            return null;
      }
   }

   private void refresh() {
      this.jIh = new ArrayList<>(this.jHO.a(this.jIg));
      Collections.sort(this.jIh);
      this.jIi.Oe(this.jIh.size());
      this.kMt.enp();
   }

   private void nb(boolean var1) {
      this.jHO.cec().a(var1, this.jIf);
   }
}
