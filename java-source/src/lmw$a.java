import java.util.List;

public class lmw$a extends lob$a {
   public static final lmw$a rEV = new lmw$a();
   public final boolean rEW;

   private lmw$a() {
      super(lmu.rET);
      this.rEW = true;
   }

   protected lmw$a(lmu var1) {
      super(var1);
      this.rEW = false;
   }

   public final List<lmw$a$a> evf() {
      assert !this.rEW;
      return this.evi();
   }

   public final int AN(String var1) {
      assert !this.rEW;
      assert var1 != null;
      List var2 = this.evf();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         if (((lmw$a$a)var2.get(var3)).Name.equals(var1)) {
            return var3;
         }
      }

      return -1;
   }

   public final lmw evg() {
      assert !this.rEW;
      return this.evh();
   }

   protected lmw evh() {
      assert false;
      return null;
   }

   protected List<lmw$a$a> evi() {
      assert false;
      return null;
   }

   @Override
   protected final lob evj() {
      assert !this.rEW;
      return this.evh();
   }

   @Override
   public final boolean a(lob$a var1) {
      if (var1 instanceof lmw$a) {
         return this.a((lmw$a)var1);
      }

      assert false;
      return false;
   }

   public boolean a(lmw$a var1) {
      List var2 = this.evf();
      List var3 = var1.evf();
      if (var2.size() != var3.size()) {
         return false;
      }

      for (int var4 = 0; var4 < var2.size(); var4++) {
         lmu var5 = ((lmw$a$a)var3.get(var4)).kza;
         if (!((lmw$a$a)var2.get(var4)).kza.b(var5)) {
            return false;
         }
      }

      return true;
   }
}
