import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtw$4 implements ActionListener {
   mtw$4(mtw var1) {
      this.EEM = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mtw.ePp().getText();

      try {
         int var3 = Integer.parseInt(var2);
         mtw.ePo().setValue(var3);
      } catch (Exception var4) {
      }
   }
}
