import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlw$8 implements ActionListener {
   mlw$8(mlw var1) {
      this.DLp = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      lfn.b(0, this.getClass().getName(), "actionPerformed() : jaja");
      if (mlw.c(this.DLp) != null && mlw.e(this.DLp).getSelectedItem() != null) {
         mlw.c(this.DLp).yX((String)mlw.e(this.DLp).getSelectedItem());
      }
   }
}
