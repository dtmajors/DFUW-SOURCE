import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ldz.a;

public enum arw$c {
   bSy,
   bSz,
   bSA,
   bSB;

   public static final List<arw$c> Values = Collections.unmodifiableList(Arrays.asList(arw$c.class.getEnumConstants()));

   public boolean a(float var1, a var2, float var3) {
      float var4;
      float var5;
      var4 = 250.0F;
      var5 = 50.0F;
      label45:
      switch (this) {
         case bSz:
            switch (var2) {
               case rgB:
               case rgC:
               default:
                  break label45;
               case rgD:
               case rgE:
                  var4 = (float)(var4 * 0.75);
                  break label45;
            }
         case bSA:
            switch (var2) {
               case rgB:
                  var4 = (float)(var4 * 0.8);
                  var5 = (float)(var5 * 0.5);
                  break label45;
               case rgC:
                  var5 = (float)(var5 * 0.5);
                  break label45;
               case rgD:
                  var4 = (float)(var4 * 0.5);
                  var5 = (float)(var5 * 0.3);
                  break label45;
               case rgE:
                  var4 = (float)(var4 * 0.3);
                  var5 = (float)(var5 * 0.1);
               default:
                  break label45;
            }
         case bSy:
            switch (var2) {
               case rgB:
                  var4 = (float)(var4 * 0.5);
                  var5 = (float)(var5 * 0.3);
                  break label45;
               case rgC:
                  var4 = (float)(var4 * 0.3);
                  var5 = (float)(var5 * 0.1);
                  break label45;
               case rgD:
                  var4 = (float)(var4 * 0.8);
                  var5 = (float)(var5 * 0.5);
                  break label45;
               case rgE:
                  var5 = (float)(var5 * 0.5);
               default:
                  break label45;
            }
         case bSB:
            switch (var2) {
               case rgB:
               case rgC:
                  var5 = (float)(var5 * 0.5);
                  break;
               case rgD:
               case rgE:
                  var4 = (float)(var4 * 0.6);
                  var5 = (float)(var5 * 0.2);
            }
      }

      if (var1 <= var5) {
         return true;
      }

      if (var1 >= var4) {
         return false;
      }

      double var6 = Math.sqrt((var1 - var5) / (var4 - var5));
      return !(arw.Sw() * var3 < var6);
   }

   public static arw$c getValue(String var0) {
      for (arw$c var2 : Values) {
         if (var2.toString().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return bSA;
   }
}
