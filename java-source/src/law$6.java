import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class law$6 extends AbstractAction {
   law$6(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = law.b(this.quD).getText();
      if (var2 != null && !var2.trim().equals("")) {
         String var3 = (String)law.c(this.quD).getSelectedItem();
         law$a var4 = law$a.getOperationType(var3);
         if (var4 != null) {
            switch (var4) {
               case quF:
                  if (law.d(this.quD).isSelected()) {
                     String var8 = law.e(this.quD).u();
                     if (var8 == null) {
                        lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is null.");
                        return;
                     }

                     int var10 = lea.enW().getType(var8);
                     if (var10 <= 0) {
                        lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is invalid.");
                        return;
                     }

                     law.f(this.quD).Z(var2, var10);
                  } else {
                     law.f(this.quD).Z(var2, 0);
                  }
                  break;
               case quG:
               case quH:
                  if (law.d(this.quD).isSelected()) {
                     String var7 = law.e(this.quD).eks();
                     if (var7 == null) {
                        lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedSkill is null.");
                        return;
                     }

                     int var9 = lea.enZ().getType(var7);
                     if (var9 <= 0) {
                        lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedSkill is invalid.");
                        return;
                     }

                     law.f(this.quD).aa(var2, var9);
                  } else {
                     law.f(this.quD).aa(var2, 0);
                  }
                  break;
               case quI:
                  law.f(this.quD).yO(var2);
                  break;
               case quJ:
                  law.f(this.quD).yR(var2);
                  break;
               case quK:
                  law.f(this.quD).elS();
                  break;
               case quL:
                  law.f(this.quD).elT();
                  break;
               case quM:
                  law.f(this.quD).elR();
                  break;
               case quN:
                  String var5 = law.e(this.quD).u();
                  if (var5 == null) {
                     lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is null.");
                     return;
                  }

                  int var6 = lea.enW().getType(var5);
                  if (var6 <= 0) {
                     lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is invalid.");
                     return;
                  }

                  law.f(this.quD).Y(law.g(this.quD), var6);
                  break;
               default:
                  lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() Invalid operationtype found: " + var4);
                  return;
            }
         }
      }
   }
}
