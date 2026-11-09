import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

class mmw$1 implements InternalFrameListener {
   mmw$1(mmw var1) {
      this.DOe = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      mmw.a(this.DOe, var1);
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
