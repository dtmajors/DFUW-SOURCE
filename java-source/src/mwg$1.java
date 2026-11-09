import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

class mwg$1 extends InternalFrameAdapter {
   mwg$1(mwg var1) {
      this.EPd = var1;
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      mwg.a(this.EPd, false);
   }
}
