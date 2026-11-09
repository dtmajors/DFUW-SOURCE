import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrt$1 implements ActionListener {
   mrt$1(mrt var1) {
      this.Env = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrt.a(this.Env, var1);
   }
}
