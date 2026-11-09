import java.util.HashMap;
import java.util.Map;

class hfs$b extends hrd<ctm, String> {
   private final Map<ctm, Integer> kkR = new HashMap<>();
   private final hro jIi;
   private ctm[] Ingredients;

   public hfs$b() {
      this(new hro());
   }

   private hfs$b(hro var1) {
      super(3, var1);
      this.jIi = var1;
   }

   public final void a(ctm[] var1, int[] var2) {
      assert var1.length == var2.length;
      this.Ingredients = var1;
      this.kkR.clear();

      for (int var3 = 0; var3 < var1.length; var3++) {
         this.kkR.put(var1[var3], new Integer(var2[var3]));
      }

      this.jIi.Oe(this.Ingredients.length);
      this.kMt.enp();
   }

   public ctm Mq(int var1) {
      return this.Ingredients[var1];
   }

   public boolean a(int var1, ctm var2) {
      assert lda.acc(var1);
      int var3 = this.kkR.get(var2);
      int var4 = var2.asi;
      return var3 < var4;
   }

   public String a(ctm var1, int var2) {
      String var3;
      switch (var2) {
         case 0:
            int var4 = var1.ResourceType;
            hdw var5 = hdw.LW(var4);
            var3 = var5.cdY().esy();
            break;
         case 1:
            var3 = Integer.toString(var1.asi);
            break;
         case 2:
            var3 = this.kkR.get(var1).toString();
            break;
         default:
            assert false;
            var3 = "";
      }

      return var3;
   }
}
