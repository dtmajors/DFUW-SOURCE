import java.util.HashMap;
import java.util.Map;

class his$a {
   private final Map<Integer, ej> jAK = new HashMap<>();

   private his$a(ej[] var1) {
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

   public final Boolean MJ(int var1) {
      Integer var2 = new Integer(var1);
      ej var3 = this.jAK.get(var2);
      if (var3 == null) {
         return null;
      } else {
         return !(var3 instanceof eq) ? null : ((eq)var3).getBooleanValue();
      }
   }
}
