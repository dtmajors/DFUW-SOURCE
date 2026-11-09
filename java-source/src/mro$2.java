import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mro$2 implements ActionListener {
   mro$2(mro var1) {
      this.ElA = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mro.a(this.ElA, var1);
   }
}
