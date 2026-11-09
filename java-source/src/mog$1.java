import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

class mog$1 implements InternalFrameListener {
   mog$1(mog var1) {
      this.DRX = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      mog.a(this.DRX, var1);
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
