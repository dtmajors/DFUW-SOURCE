import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mxg$15 extends FocusAdapter {
   mxg$15(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      if (mxg.b(this.ETz) != null) {
         mxg.b(this.ETz).eEi = this.ETz.ETb.getText();
      }
   }
}
