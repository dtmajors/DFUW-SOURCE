import javax.swing.SwingUtilities;

class mjg$2 implements Runnable {
   mjg$2(mjg var1, Runnable var2) {
      this.DCy = var1;
      this.DCz = var2;
   }

   @Override
   public void run() {
      try {
         mjg.a(this.DCy, this.DCy.Hv());
      } finally {
         mjg.a(this.DCy).clear();
      }

      SwingUtilities.invokeLater(this.DCz);
   }
}
