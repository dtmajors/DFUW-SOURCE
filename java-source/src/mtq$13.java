import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtq$13 implements ActionListener {
   mtq$13(mtq var1) {
      this.EBi = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EBi.getDesktopPane().add(mtq.e(this.EBi));
      mtq.e(this.EBi).setVisible(true);
   }
}
