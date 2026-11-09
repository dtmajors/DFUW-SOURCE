import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlr$8 implements ActionListener {
   mlr$8(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      jzo var2 = new jzo();

      try {
         var2.dTX();
      } catch (Exception var4) {
         lfn.b(5, this.getClass().getName(), "createStatesTab() : error reloading attach  point file" + var4);
      }
   }
}
