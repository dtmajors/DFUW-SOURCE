import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlr$7 implements ActionListener {
   mlr$7(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mmw var2 = new mmw(mlr.h(this.DKI), mlr.c(this.DKI));
      mlr.h(this.DKI).eCu().add(var2);
      var2.setVisible(true);
   }
}
