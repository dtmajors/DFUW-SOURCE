import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lat$3 extends AbstractAction {
   lat$3(lat var1, String var2) {
      super(var2);
      this.qtL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtL.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qtL.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         switch (var3.getNodeType()) {
            case 19:
               String var9 = JOptionPane.showInputDialog(this.qtL, "Enter SpecialEffectName", "se_");
               if (var9 == null || var9.trim().equals("")) {
                  return;
               }

               int var10 = del.iH(var9);
               if (var10 <= 0) {
                  lfn.b(5, "SFXMLSpecialEffectTreeView.CreateNodeCopy", "actionPerformed() Unable to create mapping for the specialeffect.");
                  return;
               }

               dgj var11 = ((dgj)var3.getValue()).createCopy();
               var11.setSpecialEffectType(var10);
               lat.c(this.qtL).put(var11.getSpecialEffectType(), var11);
               lae var12 = lat.a(this.qtL, var11, false);
               lae var13 = (lae)var3.getParent();
               var13.add(var12);
               this.qtL.qtP.reload(var13);
               this.qtL.qtO.getSelectionModel().setSelectionPath(var2.getParentPath().pathByAddingChild(var12));
               this.qtL.qoZ.a(var11, false);
               break;
            case 21:
               dgj var4 = ((dgj)var3.getValue()).createCopy();
               lae var5 = (lae)var3.getParent();
               dgj var6 = (dgj)var5.getValue();
               dkw var7 = var6.getContainerManager();
               if (var7 == null) {
                  var7 = new dkw();
                  var6.setContainerManager(var7);
               }

               var4.setEffectInstanceID(var7.bob());
               var7.e(var4);
               lae var8 = lat.a(this.qtL, var4, true);
               var5.add(var8);
               this.qtL.qtP.reload(var5);
               this.qtL.qtO.getSelectionModel().setSelectionPath(var2.getParentPath().pathByAddingChild(var8));
               this.qtL.qoZ.a(var4, true);
               break;
            default:
               return;
         }
      }
   }
}
