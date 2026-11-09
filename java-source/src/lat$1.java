import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lat$1 extends AbstractAction {
   lat$1(lat var1, String var2) {
      super(var2);
      this.qtL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtL.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qtL.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         switch (var3.getNodeType()) {
            case 16:
               String var10 = JOptionPane.showInputDialog(this.qtL, "Enter SpecialEffectName", "se_");
               if (var10 == null || var10.trim().equals("")) {
                  return;
               }

               if (del.iI(var10)) {
                  lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() There already exists a specialeffect with the name='" + var10 + "'");
                  return;
               }

               String var11 = (String)JOptionPane.showInputDialog(this.qtL, "Select EffectClassType", "Add Node", 3, null, lat.a(this.qtL), lat.a(this.qtL)[0]);
               if (var11 == null) {
                  return;
               }

               if (!lat.b(this.qtL).containsKey(var11)) {
                  lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() EffectClass '" + var11 + "' has not been reflected.");
                  return;
               }

               lae var12 = lat.a(this.qtL, var10, var11);
               if (var12 == null) {
                  lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() NewEffectNode is null for EffectClass='" + var11 + "'");
                  return;
               }

               dgj var13 = (dgj)var12.getValue();
               lat.c(this.qtL).put(var13.getSpecialEffectType(), var13);
               var3.add(var12);
               this.qtL.qtP.reload(var3);
               this.qtL.qtO.getSelectionModel().setSelectionPath(var2.pathByAddingChild(var12));
               this.qtL.qoZ.a(var13, false);
               break;
            case 19:
               String var4 = (String)JOptionPane.showInputDialog(this.qtL, "Select EffectClassType", "Add Node", 3, null, lat.a(this.qtL), lat.a(this.qtL)[0]);
               if (var4 == null) {
                  return;
               }

               int var5 = del.iF(var4);
               if (var5 <= 0) {
                  lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() EffectClassName '" + var4 + "' is invalid.");
                  return;
               }

               dgj var6 = lat.d(this.qtL).Al(var5);
               lae var7 = lat.a(this.qtL, var6, true);
               if (var7 == null) {
                  lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() NewEffectNode is null for EffectClass='" + var4 + "'");
                  return;
               }

               dgj var8 = (dgj)var3.getValue();
               dkw var9 = var8.getContainerManager();
               if (var9 == null) {
                  var9 = new dkw();
                  var8.setContainerManager(var9);
               }

               var6.setEffectInstanceID(var9.bob());
               var6.setDefaultValues();
               var9.e(var6);
               var3.add(var7);
               this.qtL.qtP.reload(var3);
               this.qtL.qtO.getSelectionModel().setSelectionPath(var2.pathByAddingChild(var7));
               this.qtL.qoZ.a(var6, true);
               break;
            default:
               return;
         }
      }
   }
}
