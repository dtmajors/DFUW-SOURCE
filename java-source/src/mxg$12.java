import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mxg$12 extends FocusAdapter {
   mxg$12(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      lea.epr().eEn = this.ETz.ETk.getText();
   }
}
