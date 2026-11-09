import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import mje.a;

class mrj$9 implements InternalFrameListener {
   mrj$9(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
      mrj.a(this.EkK, false);
      mrj.o(null);
      mje.DAR = a.DCn;
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      mrj.p(this.EkK).setValue(1);
      mrj.q(this.EkK).setSelected(false);
      mrj.i(this.EkK);
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
