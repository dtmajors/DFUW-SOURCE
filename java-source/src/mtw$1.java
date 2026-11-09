import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtw$1 implements ActionListener {
   mtw$1(mtw var1) {
      this.EEM = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mtw.ePm().getText();

      try {
         int var3 = Integer.parseInt(var2);
         mtw.ePn().setValue(var3);
      } catch (Exception var4) {
      }
   }
}
