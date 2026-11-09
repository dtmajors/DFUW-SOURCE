import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

class mmg$10 extends InternalFrameAdapter {
   mmg$10(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      this.DMB.ccp();
   }
}
