import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class mnf$1 extends AbstractAction {
   mnf$1(mnf var1, String var2, Icon var3) {
      super(var2, var3);
      this.DOK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mnf.a(this.DOK).e(new Point(10, 10));
   }
}
