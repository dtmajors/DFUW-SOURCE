import java.awt.Point;

class aux$9 implements Runnable {
   aux$9(aux var1, hac var2, aux var3) {
      this.DDk = var1;
      this.DDw = var2;
      this.DDx = var3;
   }

   @Override
   public void run() {
      if (this.DDw.bYW() != null) {
         if (this.DDk.DDi != null) {
            try {
               this.DDk.DDi.setClosed(true);
               this.DDk.DDj = new Point(this.DDk.DDi.getLocation());
            } catch (Exception var2) {
               var2.printStackTrace();
            }

            this.DDk.DDi = null;
         }

         this.DDk.DDi = mwg.b(this.DDw.bYW(), this.DDx);
         if (this.DDk.DDj != null) {
            this.DDk.DDi.setLocation(this.DDk.DDj);
         }

         if (mje.DAv != null) {
            mje.DAv.L();
         }
      }
   }
}
