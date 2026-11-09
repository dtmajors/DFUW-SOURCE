import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlw$7 implements ActionListener {
   mlw$7(mlw var1) {
      this.DLp = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      lfn.b(0, this.getClass().getName(), "actionPerformed() : jaja");
      if (mlw.c(this.DLp) != null) {
         mlw.c(this.DLp).ade(del.dr(((msa)mlw.d(this.DLp).getSelectedItem()).getName()));
      }
   }
}
