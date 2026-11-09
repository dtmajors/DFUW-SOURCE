import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrt$10 implements ActionListener {
   mrt$10(mrt var1) {
      this.Env = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrt.d(this.Env, var1);
   }
}
