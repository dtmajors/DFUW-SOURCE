import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mxf$2 implements ActionListener {
   mxf$2(mxf var1) {
      this.ETs = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mxf.a(this.ETs, var1);
   }
}
