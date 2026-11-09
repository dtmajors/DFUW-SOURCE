import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lmx$a extends lmw$a {
   public static final lmx$a rEY = new lmx$a();
   private final Class<? extends lmx> rEZ;
   protected final List<lmx$a$a> rFa;
   protected final List<lmw$a$a> rFb;

   private lmx$a() {
      this(lmw$a.rEV);
   }

   protected lmx$a(lmu var1) {
      super(var1);
      this.rEZ = null;
      this.rFa = null;
      this.rFb = null;
   }

   public lmx$a(Class<? extends lmx> var1, List<lmx$a$a> var2) {
      this(rEY, var1, var2);
   }

   protected lmx$a(lmu var1, Class<? extends lmx> var2, List<lmx$a$a> var3) {
      super(var1);
      this.rEZ = var2;
      this.rFa = var3;
      List var4 = llv.cc(var3);
      this.rFb = Collections.unmodifiableList(var4);
   }

   public final lmx evl() {
      return this.evm();
   }

   protected lmx evm() {
      if (this.rEZ == lmx.class) {
         return new lmx(this);
      }

      try {
         return this.rEZ.newInstance();
      } catch (Exception var2) {
         assert false;
         return null;
      }
   }

   @Override
   protected final lmw evh() {
      return this.evl();
   }

   @Override
   protected String ccJ() {
      return super.ccJ();
   }

   @Override
   protected List<lmw$a$a> evi() {
      return this.rFb;
   }

   public List<lmx$a$a> evn() {
      return llv.cc(this.evf());
   }

   public ArrayList<lmv> evo() {
      ArrayList var1 = new ArrayList(this.evf().size());

      for (lmx$a$a var3 : this.evn()) {
         lmv var4 = var3.kza.euX();
         if (var3.kuI != null) {
            assert var4.evb().b(var3.kuI.evb());
            var4.i(var3.kuI);
         }

         var1.add(var4);
      }

      return var1;
   }
}
