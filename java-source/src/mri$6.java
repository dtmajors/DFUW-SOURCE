import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import mje.a;

class mri$6 implements InternalFrameListener {
   mri$6(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
      mri.e(null);
      mje.DAR = a.DCn;
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      mri.f(this.Ejc).setValue(1);
      mri.b(this.Ejc);
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
