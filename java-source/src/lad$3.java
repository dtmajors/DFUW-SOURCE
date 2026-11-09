import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lad$3 extends AbstractAction {
   lad$3(lad var1) {
      this.qqV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = (String)lad.e(this.qqV).getSelectedItem();
      int var3 = lad.f(this.qqV).getType(var2);
      if (var3 <= 0) {
         lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() SkillName '" + var2 + "' is invalid.");
      } else {
         String var4 = (String)lad.g(this.qqV).getSelectedItem();
         String var5 = lad.h(this.qqV).getText();
         if (var5 == null || var5.trim().equals("")) {
            lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() PropertyValue '" + var5 + "' is invalid.");
         }
      }
   }
}
