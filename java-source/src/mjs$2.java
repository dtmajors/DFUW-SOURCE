import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mjs$2 implements ActionListener {
   mjs$2(mjs var1) {
      this.DEc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mjs.b(this.DEc, var1);
   }
}
