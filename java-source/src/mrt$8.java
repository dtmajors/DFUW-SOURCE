import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrt$8 implements ActionListener {
   mrt$8(mrt var1) {
      this.Env = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrt.b(this.Env, var1);
   }
}
