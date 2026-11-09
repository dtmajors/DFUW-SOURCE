import java.awt.Color;

class mrr$a implements Runnable {
   private boolean ElO;
   private int ElP;
   private int ElQ;

   private mrr$a(mrr var1) {
      this.EmC = var1;
      this.ElO = true;
      this.ElP = 40;
      this.ElQ = 40;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }

         if (this.ElO) {
            this.ElP = this.ElP + this.ElQ;
         } else {
            this.ElP = this.ElP - this.ElQ;
         }

         if (this.ElP >= 250) {
            this.ElP = 254;
            this.ElO = false;
         } else if (this.ElP <= 40) {
            this.ElP = 40;
            this.ElO = true;
         }

         mrr.a(this.EmC, new Color(this.ElP, 30, 30));
         mrr.q(this.EmC).repaint();
      }
   }
}
