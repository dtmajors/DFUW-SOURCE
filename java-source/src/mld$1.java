import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

class mld$1 extends InternalFrameAdapter {
   mld$1(mld var1) {
      this.DHD = var1;
   }

   @Override
   public void internalFrameClosed(InternalFrameEvent var1) {
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      if (this.DHD.DHh != null) {
         this.DHD.DHh.eDO();
      }
   }
}
