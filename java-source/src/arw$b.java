import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum arw$b {
   bSr(0.0),
   bSs(Math.PI / 2),
   bSt(Math.PI * 3.0 / 4.0),
   bSu(Math.PI),
   bSv(Math.PI / 4);

   public static final List<arw$b> Values = Collections.unmodifiableList(Arrays.asList(arw$b.class.getEnumConstants()));
   private double bSw;

   public static arw$b getValue(int var0) {
      for (arw$b var2 : Values) {
         if (var2.name().contains(Integer.toString(var0))) {
            return var2;
         }
      }

      return bSs;
   }

   arw$b(double var3) {
      this.bSw = var3;
   }

   public int SB() {
      switch (this) {
         case bSs:
            return 180;
         case bSt:
            return 270;
         case bSu:
            return 360;
         case bSv:
            return 90;
         case bSr:
            return 0;
         default:
            return -1;
      }
   }

   public boolean j(float var1, float var2) {
      if (var1 < 3.0F) {
         return var2 >= -this.bSw && var2 <= this.bSw;
      }

      if (var1 > 250.0F) {
         return false;
      }

      double var3 = 0.0;
      double var5 = 0.0;
      double var7 = 0.0;
      switch (this) {
         case bSs:
            var3 = 30.0;
            var5 = 1.02;
            break;
         case bSt:
            var3 = 10.0;
            var5 = 1.6;
            break;
         case bSu:
            var3 = 3.0;
            var5 = 2.51;
            break;
         case bSv:
            var3 = 300.0;
            var5 = 0.5;
            break;
         case bSr:
            return false;
      }

      var7 = Math.atan(var3 / var1) * var5;
      return var2 >= -var7 && var2 <= var7;
   }
}
