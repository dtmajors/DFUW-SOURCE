class jjd$c$a {
   public boolean niR;
   public boolean niS;
   public boolean niT;
   public boolean niU;
   public boolean niV;
   public boolean niW;

   private jjd$c$a(jjd$c var1) {
      this.niX = var1;
      this.niR = false;
      this.niS = false;
      this.niT = false;
      this.niU = false;
      this.niV = false;
      this.niW = false;
   }

   public String dIy() {
      String var1 = "";
      if (this.niR) {
         var1 = var1 + "KEYBOARD.LEFT_SHIFT,";
      }

      if (this.niS) {
         var1 = var1 + "KEYBOARD.RIGHT_SHIFT,";
      }

      if (this.niT) {
         var1 = var1 + "KEYBOARD.LEFT_CTRL,";
      }

      if (this.niU) {
         var1 = var1 + "KEYBOARD.RIGHT_CTRL,";
      }

      if (this.niV) {
         var1 = var1 + "KEYBOARD.LEFT_ALT,";
      }

      if (this.niW) {
         var1 = var1 + "KEYBOARD.RIGHT_ALT,";
      }

      return var1;
   }

   public int cAN() {
      int var1 = 0;
      if (this.niR) {
         var1++;
      }

      if (this.niS) {
         var1++;
      }

      if (this.niT) {
         var1++;
      }

      if (this.niU) {
         var1++;
      }

      if (this.niV) {
         var1++;
      }

      if (this.niW) {
         var1++;
      }

      return var1;
   }

   private boolean b(jmf var1) {
      if (var1.dMq() == "LEFT_SHIFT") {
         this.niR = var1.dMt();
         return true;
      } else if (var1.dMq() == "RIGHT_SHIFT") {
         this.niS = var1.dMt();
         return true;
      } else if (var1.dMq() == "LEFT_CTRL") {
         this.niT = var1.dMt();
         return true;
      } else if (var1.dMq() == "RIGHT_CTRL") {
         this.niU = var1.dMt();
         return true;
      } else if (var1.dMq() == "LEFT_ALT") {
         this.niV = var1.dMt();
         return true;
      } else if (var1.dMq() == "RIGHT_ALT") {
         this.niW = var1.dMt();
         return true;
      } else {
         return false;
      }
   }

   boolean dIz() {
      return this.niR || this.niS;
   }
}
