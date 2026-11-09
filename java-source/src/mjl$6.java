import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

class mjl$6 implements ActionListener {
   mjl$6(mjl var1) {
      this.DCP = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JInternalFrame var2 = ((mjl$a)var1.getSource()).ezN();
      if (var2.isIcon()) {
         try {
            var2.setIcon(false);
         } catch (PropertyVetoException var5) {
            var5.printStackTrace();
         }
      }

      var2.moveToFront();

      try {
         var2.setSelected(true);
      } catch (PropertyVetoException var4) {
         var4.printStackTrace();
      }
   }
}
