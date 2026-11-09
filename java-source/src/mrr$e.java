import javax.swing.SwingUtilities;

class mrr$e extends mjg {
   private mrr$e(mrr var1) {
      this.EmC = var1;
   }

   @Override
   public Object Hv() {
      SwingUtilities.invokeLater(new mrr$e$1(this));
      return "Done";
   }

   @Override
   public void start() {
      mrr.a(this.EmC, false);
      super.start();
   }

   @Override
   public void finished() {
      mrr.a(this.EmC, true);
   }
}
