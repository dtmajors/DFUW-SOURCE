import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class kze$1 implements ActionListener {
   kze$1(kze var1) {
      this.qnG = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.qnG.abo(kze.a(this.qnG).getSelectedIndex());
   }
}
