import alc.a;
import java.util.Collection;
import java.util.EnumMap;

class hgo$a {
   public final alc.b bry;
   public final int fc;
   private final hpe koE;
   private final hpe koF;
   private final EnumMap<alc.c, hgo$b> koG;
   private boolean jLT;

   public hgo$a(hgo var1, alc.b var2, int var3, int var4) {
      this.koR = var1;
      this.koG = new EnumMap<>(alc.c.class);
      this.bry = var2;
      this.koE = new hpe(var1.kLu, (String)null, new lgg(var3 + 8, var4 - 16), hgo.cjB(), var1.cbO().kIT, hgo.b(var2).esy());
      var1.j(this.koE);
      this.koF = new hpe(var1.kLu, (String)null, new lgg(var3 + hgo.cjB().rmN + 15, var4 - 16), new lhf(180, 16), var1.cbO().kIT, "");
      var1.j(this.koF);
      var3 -= 2;
      int var5 = 0;
      int var6 = 0;

      for (alc.c var8 : alc.c.ListOfValue) {
         a var9 = a.getValueByEnchantmentTypeAndSlotType(this.bry, var8);
         hgo$b var10 = new hgo$b(var1, var9, new lgg(var3 + hgo.cjC().rmN / 2, var4));
         this.koG.put(var8, var10);
         lhf var11 = hgo$b.b(var10).cqv();
         if (var5 == 2) {
            var3 += var11.rmN + hgo.cjC().rmN + 13;
         } else {
            var3 += var11.rmN + hgo.cjC().rmN;
         }

         if (var11.H > var6) {
            var6 = var11.H;
         }

         var5++;
      }

      this.fc = var6;
      this.jLT = true;
   }

   public final void dispose() {
      assert this.jLT;
      this.koE.remove();
      if (this.koF != null) {
         this.koF.remove();
      }

      for (alc.c var2 : alc.c.ListOfValue) {
         hgo$b var3 = this.koG.get(var2);
         var3.dispose();
      }

      this.koG.clear();
      this.jLT = false;
   }

   public final Collection<hgo$b> cjD() {
      assert this.jLT;
      return this.koG.values();
   }

   public final void d(es var1) {
      assert this.jLT;
      if (this.koF != null) {
         lip var2;
         if (var1 == null) {
            var2 = lcy.rcb;
         } else {
            String var3 = var1.fJ();
            if (var3 == null) {
               var3 = "";
            }

            var2 = new liw(var3, var1.fE());
         }

         this.koF.mV("- " + var2.esy());
      }

      ali[] var9 = null;
      if (var1 != null) {
         var9 = var1.fI();
         if (var9 == null) {
         }
      }

      if (var9 == null) {
         var9 = new ali[this.koG.values().size()];
      }

      for (alc.c var4 : this.koG.keySet()) {
         hgo$b var5 = this.koG.get(var4);
         int var6 = var4.ordinal();
         hdy var7;
         if (var9[var6] == null) {
            var7 = null;
         } else {
            hdw var8 = hdw.LW(var9[var6].ResourceType);
            var7 = new hdy(var8, var9[var6].brN);
         }

         var5.l(var7);
      }
   }

   public boolean cjE() {
      for (hgo$b var2 : this.koG.values()) {
         hdz var3 = hgo.a(this.koR, var2);
         if (var3 == null) {
            return false;
         }

         if (!alc.a(var2.koH, var3.vf())) {
            return false;
         }
      }

      return true;
   }

   @Override
   public String toString() {
      return null;
   }
}
