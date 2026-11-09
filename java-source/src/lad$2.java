import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lad$2 extends AbstractAction {
   lad$2(lad var1) {
      this.qqV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = (String)lad.b(this.qqV).getSelectedItem();
      int var3 = ep.as(var2);
      if (var3 <= 0) {
         lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() AttributeName '" + var2 + "' is invalid.");
      } else {
         if (ep.aR(var3)) {
            String var4 = (String)lad.a(this.qqV).getSelectedItem();
            byte var5 = 0;
            if (var4.equals("Plain")) {
               var5 = 0;
            } else if (var4.equals("Min")) {
               var5 = 1;
            } else if (var4.equals("Max")) {
               var5 = 2;
            } else {
               if (!var4.equals("MaxMax")) {
                  lfn.b(5, "SFXMLGamelogicConfigPropertyView", "createAttributePane() AttributeRelationName '" + var4 + "' is invalid.");
                  return;
               }

               var5 = 4;
            }

            var3 = ep.k(var3, var5);
         }

         String var7 = lad.c(this.qqV).getText();
         if (var7 != null && !var7.trim().equals("")) {
            boolean var9 = lad.d(this.qqV).isSelected();
         } else {
            lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() AttributeValue '" + var7 + "' is invalid.");
         }
      }
   }
}
