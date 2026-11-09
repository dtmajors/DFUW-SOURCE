import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class s$5 implements WindowListener {
   s$5(s var1) {
      this.cS = var1;
   }

   @Override
   public void windowOpened(WindowEvent var1) {
      assert lda.by(var1);
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      assert lda.by(var1);
      lfn.b(0, this.getClass().getSimpleName(), "windowClosing() : Closing");
      s.b(this.cS).enp();
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      assert lda.by(var1);
   }

   @Override
   public void windowIconified(WindowEvent var1) {
      assert lda.by(var1);
      if (s.a(this.cS).getState() == 1) {
         s.c(this.cS).enp();
      }
   }

   @Override
   public void windowDeiconified(WindowEvent var1) {
      assert lda.by(var1);
      if (s.a(this.cS).getState() == 0) {
         s.c(this.cS).enp();
      }
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      assert lda.by(var1);
   }

   @Override
   public void windowDeactivated(WindowEvent var1) {
      assert lda.by(var1);
   }
}
