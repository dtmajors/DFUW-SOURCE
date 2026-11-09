import java.util.List;

public class joz$a extends lmu {
   public final jpj iNU;
   public final List<jos> nLa;

   public joz$a(jpj var1, List<jos> var2) {
      super(lmu.rET);
      assert var1 != null;
      assert var2 != null;
      this.iNU = var1;
      this.nLa = var2;
   }

   public final boolean a(joz$a var1) {
      return this.iNU == var1.iNU && this.nLa.equals(var1.nLa);
   }

   @Override
   protected lmv dPk() {
      return new joz(this);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof joz$a) {
         return this.a((joz$a)var1);
      }

      assert false;
      return false;
   }

   @Override
   protected String ccJ() {
      return "Input Bindings";
   }
}
