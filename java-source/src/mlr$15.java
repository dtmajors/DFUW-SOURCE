import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlr$15 implements ActionListener {
   mlr$15(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mlr.m(this.DKI).isSelected()) {
         lfn.b(0, this.getClass().getSimpleName(), "createStatesTab() : Selected!");
      } else {
         lfn.b(0, this.getClass().getSimpleName(), "createStatesTab() : N O T   Selected!");
      }
   }
}
