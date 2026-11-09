import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class las$2 extends AbstractAction {
   las$2(las var1) {
      this.qtF = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (las.b(this.qtF) != null) {
         assert las.b(this.qtF) != null;
         String var2 = las.b(this.qtF).getEffectClassName();
         kzz var3 = (kzz)las.d(this.qtF).get(var2);
         if (var3 == null) {
            lfn.b(5, "SFXMLSpecialEffectPropertyView.ChangeEffectButton", "actionPerformed() EffectPane '" + var2 + "' was not found.");
         } else if (!var3.elv()) {
            lfn.b(5, "SFXMLSpecialEffectPropertyView.ChangeEffectButton", "actionPerformed() EffectPane '" + var2 + "' contains invalid propertyvalues.");
         } else {
            var3.h(las.b(this.qtF));
            las.c(this.qtF).eky();
         }
      }
   }
}
