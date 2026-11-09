import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lah$1 extends AbstractAction {
   lah$1(lah var1) {
      this.qrS = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = (String)lah.a(this.qrS).getSelectedItem();
      cak.d var3 = cak.d.getMaterialPriorityLevel(var2);
      if (var3 == null) {
         lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() PriorityLevel is null.");
      } else {
         String var4 = lah.b(this.qrS).getText();
         if (var4 != null && !var4.trim().equals("")) {
            int var5 = Integer.parseInt(var4);
            if (var5 < 0) {
               lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() MaterialID is invalid.");
            } else {
               String var6 = lah.c(this.qrS).getText();
               if (var6 != null && !var6.trim().equals("")) {
                  String var7 = lah.d(this.qrS).getText();
                  if (var7 != null && !var7.trim().equals("")) {
                     lah.e(this.qrS).a(var3);
                     lah.e(this.qrS).aFT().oo(var5);
                     lah.e(this.qrS).aFT().j(new String[]{var6});
                     lah.e(this.qrS).aFU().oo(var5);
                     lah.e(this.qrS).aFU().gW(var7);
                     lah.f(this.qrS).ekw();
                  } else {
                     lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() ShaderName is invalid.");
                  }
               } else {
                  lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() TextureName is invalid.");
               }
            }
         } else {
            lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() MaterialID is invalid.");
         }
      }
   }
}
