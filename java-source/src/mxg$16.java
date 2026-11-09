import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mxg$16 implements ActionListener {
   mxg$16(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mxg.b(this.ETz) != null) {
         mxg.b(this.ETz).eEj = this.ETz.ESY.getSelectedItem().toString();
      }
   }
}
