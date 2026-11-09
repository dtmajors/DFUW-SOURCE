import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class las$1 extends AbstractAction {
   las$1(las var1) {
      this.qtF = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = las.a(this.qtF).getText();
      if (var2 != null && !var2.trim().equals("")) {
         if (del.t(las.b(this.qtF).getSpecialEffectType(), var2)) {
            las.c(this.qtF).eky();
         }
      }
   }
}
