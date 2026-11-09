import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lmy$a extends lmx$a {
   public static final lmy$a rFf = new lmy$a();
   private final lmy$b rFg = new lmy$b(null);
   private final lmy$c rFh = new lmy$c(null);
   protected final String Name;

   private lmy$a() {
      super(lmx$a.rEY);
      this.Name = null;
   }

   public lmy$a(String var1) {
      this(var1, evu());
   }

   public lmy$a(String var1, List<lmx$a$a> var2) {
      this(var1, new ArrayList<>(var2));
   }

   private lmy$a(String var1, ArrayList<lmx$a$a> var2) {
      super(rFf, lmy.class, var2);
      this.Name = var1;
   }

   lbl<lmy$d> evq() {
      return this.rFg;
   }

   lbl<lmy$e> evr() {
      return this.rFh;
   }

   public final lmy evs() {
      return this.evt();
   }

   @Override
   protected final lmx evm() {
      return this.evs();
   }

   protected lmy evt() {
      return new lmy(this);
   }

   public final int a(String var1, lmu var2, lmv var3) {
      assert var2 != null;
      assert this.AN(var1) == -1;
      lmx$a$a var4 = new lmx$a$a(var2, var1, var3);
      int var5 = this.rFa.size();
      this.rFa.add(var5, var4);
      this.rFg.adG(var5);
      return var5;
   }

   public final int c(String var1, lmv var2) {
      return this.a(var1, var2.evb(), var2);
   }

   public final void removeField(String var1) {
      int var2 = this.AN(var1);
      assert var2 != -1;
      this.rFa.remove(var2);
      this.rFh.adH(var2);
   }

   @Override
   protected String ccJ() {
      return this.Name;
   }

   private static List<lmx$a$a> evu() {
      return Collections.emptyList();
   }
}
