import alc.a;
import java.util.Collection;
import java.util.EnumMap;

class hgn$a {
   public final alc.b bry;
   public final int fc;
   private final hpe koE;
   private final hpe koF;
   private final EnumMap<alc.c, hgn.b> koG;
   private boolean jLT;

   public hgn$a(hgn var1, alc.b var2, int var3, int var4) {
      this.koB = var1;
      this.koG = new EnumMap<>(alc.c.class);
      this.bry = var2;
      this.koE = new hpe(var1.kLu, (String)null, new lgg(var3, var4), hgn.cjB(), var1.cbO().kIX, hgn.b(var2).esy());
      var1.j(this.koE);
      if (var2 == alc.b.brG) {
         this.koF = null;
      } else {
         this.koF = new hpe(var1.kLu, (String)null, new lgg(var3, var4 + hgn.cjB().H), hgn.cjB(), var1.cbO().kIX, "");
         var1.j(this.koF);
      }

      var3 += hgn.cjB().rmN;
      var3 += hgn.cjC().rmN;
      int var5 = 0;

      for (alc.c var7 : alc.c.ListOfValue) {
         a var8 = a.getValueByEnchantmentTypeAndSlotType(this.bry, var7);
         hgn.b var9 = new hgn.b(var1, var8, new lgg(var3 + hgn.cjC().rmN / 2, var4));
         this.koG.put(var7, var9);
         lhf var10 = hgn.b.b(var9).cqv();
         var3 += var10.rmN + hgn.cjC().rmN;
         if (var10.H > var5) {
            var5 = var10.H;
         }
      }

      this.fc = var5;
      this.jLT = true;
   }

   public final void dispose() {
      assert this.jLT;
      this.koE.remove();
      if (this.koF != null) {
         this.koF.remove();
      }

      for (alc.c var2 : alc.c.ListOfValue) {
         hgn.b var3 = this.koG.get(var2);
         var3.dispose();
      }

      this.koG.clear();
      this.jLT = false;
   }

   public final Collection<hgn.b> cjD() {
      assert this.jLT;
      return this.koG.values();
   }

   public final void d(es var1) {
      assert this.jLT;
      if (this.koF != null) {
         lip var2;
         if (var1 == null) {
            var2 = ljg.roH;
         } else {
            String var3 = var1.fJ();
            if (var3 == null) {
               var3 = "";
            }

            var2 = new liw(var3, var1.fE());
         }

         this.koF.mV(var2.esy());
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
         hgn.b var5 = this.koG.get(var4);
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
      for (hgn.b var2 : this.koG.values()) {
         hdz var3 = hgn.a(this.koB, var2);
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
