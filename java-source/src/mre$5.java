import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

class mre$5 extends InternalFrameAdapter {
   mre$5(mre var1) {
      this.Eiu = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
      dsk.a(mre.b(this.Eiu));
   }

   @Override
   public void internalFrameClosing(InternalFrameEvent var1) {
      this.Eiu.eKl();
   }
}
