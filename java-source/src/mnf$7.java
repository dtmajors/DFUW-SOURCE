import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

class mnf$7 extends AbstractAction {
   mnf$7(mnf var1, String var2, Icon var3) {
      super(var2, var3);
      this.DOK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = null;
      mnf.a(this.DOK).setPortsVisible(!mnf.a(this.DOK).isPortsVisible());
      if (mnf.a(this.DOK).isPortsVisible()) {
         var2 = new ImageIcon(mnf.d(this.DOK) + "ConnectOn.gif");
      } else {
         var2 = new ImageIcon(mnf.d(this.DOK) + "ConnectOff.gif");
      }

      this.putValue("SmallIcon", var2);
   }
}
