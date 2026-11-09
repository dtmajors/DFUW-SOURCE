import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

class mxj$1 extends InternalFrameAdapter {
   mxj$1(mxj var1) {
      this.ETL = var1;
   }

   @Override
   public void internalFrameActivated(InternalFrameEvent var1) {
      if (mxj.a(this.ETL) != null) {
         mxj.a(this.ETL).invalidate();
         mxj.b(this.ETL);
      }
   }
}
