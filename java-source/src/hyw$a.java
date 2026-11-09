import java.util.HashMap;
import java.util.Map;

class hyw$a {
   private final Map<Integer, ej> jAK = new HashMap<>();

   private hyw$a(ej[] var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            ej var3 = var1[var2];
            if (var3 != null) {
               this.jAK.put(new Integer(var3.getType()), var3);
            }
         }
      }
   }

   public final String MF(int var1) {
      Integer var2 = new Integer(var1);
      ej var3 = this.jAK.get(var2);
      if (var3 == null) {
         return null;
      } else {
         return !(var3 instanceof ff) ? null : ((ff)var3).getStringValue();
      }
   }

   public final ldv OW(int var1) {
      ej var2 = this.jAK.get(var1);
      if (var2 == null) {
         return null;
      } else {
         return !(var2 instanceof ev) ? null : ((ev)var2).fP();
      }
   }

   public final ljq OX(int var1) {
      ej var2 = this.jAK.get(var1);
      if (var2 == null) {
         return null;
      } else {
         return !(var2 instanceof fh) ? null : ((fh)var2).gy();
      }
   }

   public final lip MG(int var1) {
      String var2 = this.MF(var1);
      return var2 == null ? null : new ljg(var2);
   }

   public final Float MH(int var1) {
      Integer var2 = new Integer(var1);
      ej var3 = this.jAK.get(var2);
      if (var3 == null) {
         return null;
      } else {
         return !(var3 instanceof et) ? null : new Float(((et)var3).fN());
      }
   }

   public final Integer MI(int var1) {
      Integer var2 = new Integer(var1);
      ej var3 = this.jAK.get(var2);
      if (var3 == null) {
         return null;
      } else {
         return !(var3 instanceof ew) ? null : new Integer(((ew)var3).fQ());
      }
   }

   public final Double OY(int var1) {
      ej var2 = this.jAK.get(var1);
      if (var2 == null) {
         return null;
      } else {
         return !(var2 instanceof er) ? null : ((er)var2).fC();
      }
   }

   public final Boolean MJ(int var1) {
      Integer var2 = new Integer(var1);
      ej var3 = this.jAK.get(var2);
      if (var3 == null) {
         return null;
      } else {
         return !(var3 instanceof eq) ? null : ((eq)var3).getBooleanValue();
      }
   }

   public final loz OZ(int var1) {
      ej var2 = this.jAK.get(var1);
      if (var2 == null) {
         return null;
      } else {
         return !(var2 instanceof fg) ? null : ((fg)var2).gx();
      }
   }
}
