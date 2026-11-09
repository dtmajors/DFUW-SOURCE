import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

class mre$7 implements InternalFrameListener {
   mre$7(mre var1) {
      this.Eiu = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
      if (mre.b(this.Eiu) != null) {
         this.Eiu.eKi();
      }
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
      mre.Eiq = null;
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameDeactivated(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameDeiconified(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameIconified(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameOpened(InternalFrameEvent var1) {
   }
}
