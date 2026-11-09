public class ash$a implements Comparable<ash$a> {
   private static final int bUM = 2;
   private static final int bUN = 1;
   private static final int bUO = 4;
   private float bUP;
   private byte aYY;
   private byte bUQ;
   private byte bUR;
   private byte bUS;
   float bUT;

   ash$a(ash var1, float var2, boolean var3, boolean var4) {
      this.bUU = var1;
      this.bUT = var2;
      this.bUP = var2;
      if (var3) {
         this.aYY = (byte)(this.aYY | 1);
      }

      if (var4) {
         this.aYY = (byte)(this.aYY | 2);
      }

      this.bU(false);
      this.TF();
   }

   public int a(ash$a var1) {
      return this.equals(var1) ? 0 : (int)Math.signum(var1.bUT - this.bUT);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (this.getClass() != var1.getClass()) {
         return false;
      }

      ash$a var2 = (ash$a)var1;
      return Float.floatToIntBits(this.bUT) == Float.floatToIntBits(var2.bUT);
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      byte var2 = 1;
      return 31 * var2 + Float.floatToIntBits(this.bUT);
   }

   void a(int var1, byte var2) {
      switch (var1) {
         case 0:
            this.bUQ = var2;
            break;
         case 1:
            this.bUR = var2;
            break;
         case 2:
            this.bUS = var2;
      }
   }

   boolean bT(float var1) {
      if (this.TK()) {
         return false;
      }

      if (var1 >= this.bUT) {
         float var2 = var1 - this.bUT;
         if (var2 > this.bUU.bUu) {
            return false;
         }

         this.bUT = var1;
      } else if (var1 < this.bUP) {
         float var3 = this.bUP - var1;
         if (var3 > this.bUU.bUu) {
            return false;
         }

         this.bUP = var1;
      }

      return true;
   }

   void TF() {
      this.bUQ = this.bUR = this.bUS = -1;
   }

   float TG() {
      return this.bUP;
   }

   byte hX(int var1) {
      switch (var1) {
         case 0:
            return this.bUQ;
         case 1:
            return this.bUR;
         case 2:
            return this.bUS;
         default:
            return -1;
      }
   }

   float TH() {
      return this.bUT;
   }

   boolean TI() {
      if (this.bUQ < 0) {
         return false;
      } else {
         return this.bUR < 0 ? false : this.bUS >= 0;
      }
   }

   boolean TJ() {
      return (this.aYY & 2) == 2;
   }

   boolean TK() {
      return (this.aYY & 1) == 1;
   }

   boolean TL() {
      return (this.aYY & 4) == 4;
   }

   void bU(float var1) {
      this.bUP = var1;
   }

   void bV(float var1) {
      this.bUT = var1;
   }

   void bU(boolean var1) {
      this.aYY = (byte)(this.aYY | 4);
      if (!var1) {
         this.aYY = (byte)(this.aYY ^ 4);
      }
   }
}
