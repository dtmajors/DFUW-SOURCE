import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

class moh$1 implements InternalFrameListener {
   moh$1(moh var1) {
      this.DSw = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      moh.a(this.DSw, var1);
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
