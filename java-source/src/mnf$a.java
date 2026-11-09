import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

public class mnf$a extends AbstractAction {
   protected Action DOL;

   public mnf$a(mnf var1, Action var2) {
      super("", (ImageIcon)var2.getValue("SmallIcon"));
      this.DOK = var1;
      this.DOL = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      var1 = new ActionEvent(mnf.a(this.DOK), var1.getID(), var1.getActionCommand(), var1.getModifiers());
      this.DOL.actionPerformed(var1);
   }
}
