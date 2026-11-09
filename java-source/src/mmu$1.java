import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

class mmu$1 implements InternalFrameListener {
   mmu$1(mmu var1) {
      this.DNV = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      mmu.a(this.DNV, var1);
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
