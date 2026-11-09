import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class lct$a implements ActionListener {
   lct$a(lct var1) {
      this.qET = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == this.qET.qEJ) {
         this.qET.t(var1);
      }
   }
}
