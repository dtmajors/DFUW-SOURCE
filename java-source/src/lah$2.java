import cak.a;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lah$2 extends AbstractAction {
   lah$2(lah var1) {
      this.qrS = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = cak.gV((String)lah.g(this.qrS).getSelectedItem());
      if (var2 < 0) {
         lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() SubsetID is invalid.");
      } else {
         String var3 = (String)lah.h(this.qrS).getSelectedItem();
         switch (lah.i(this.qrS).aFY()) {
            case eeL:
               a var9 = a.getAttachedMeshPriorityLevel(var3);
               if (var9 == null) {
                  lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() PriorityLevel is null.");
                  return;
               }

               String var11 = (String)lah.j(this.qrS).getSelectedItem();
               if (var11 == null || var11.trim().equals("")) {
                  lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() AttachPointName is invalid.");
                  return;
               }

               String var12 = lah.k(this.qrS).getText();
               if (var12 == null || var12.trim().equals("")) {
                  lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() FileName is invalid.");
                  return;
               }

               bzu var7 = (bzu)lah.i(this.qrS);
               var7.eA(var2);
               var7.a(var9);
               var7.setAttachPointName(var11);
               var7.setFileName(var12);
               break;
            case eeM:
               cak.b var8 = cak.b.getDummyMeshPriorityLevel(var3);
               if (var8 == null) {
                  lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() PriorityLevel is null.");
                  return;
               }

               caa var10 = (caa)lah.i(this.qrS);
               var10.eA(var2);
               var10.a(var8);
               break;
            case eeN:
               cak.g var4 = cak.g.getSubsetMeshPriorityLevel(var3);
               if (var4 == null) {
                  lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() PriorityLevel is null.");
                  return;
               }

               String var5 = lah.k(this.qrS).getText();
               if (var5 == null || var5.trim().equals("")) {
                  lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() FileName is invalid.");
                  return;
               }

               cax var6 = (cax)lah.i(this.qrS);
               var6.eA(var2);
               var6.a(var4);
               var6.setFileName(var5);
               break;
            default:
               lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() Invalid meshitemtype provided: " + lah.i(this.qrS).aFY());
               assert false;
               return;
         }

         lah.f(this.qrS).ekw();
      }
   }
}
