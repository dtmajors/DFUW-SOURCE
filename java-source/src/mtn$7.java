import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtn$7 implements ActionListener {
   mtn$7(mtn var1, eq var2) {
      this.EzC = var1;
      this.EzI = var2;
   }

   @Override
   public final void actionPerformed(ActionEvent var1) {
      this.EzI.x(mtn.g(this.EzC).eDr());
   }
}
