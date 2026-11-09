import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lai$2 extends AbstractAction {
   lai$2(lai var1, String var2) {
      super(var2);
      this.qrW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qrW.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qrW.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         switch (var3.getNodeType()) {
            case 2:
            case 3:
            case 22:
               cai var14 = ((cai)var3.getValue()).aGb();
               lae var17 = (lae)var3.getParent();
               cam var20 = (cam)var17.getValue();
               var20.b(var14);
               lae var23 = lai.a(this.qrW, var14);
               var17.add(var23);
               this.qrW.qtP.reload(var17);
               this.qrW.qtO.getSelectionModel().setSelectionPath(var2.getParentPath().pathByAddingChild(var23));
               this.qrW.qoZ.d(var14);
               break;
            case 8:
               cah var13 = ((cah)var3.getValue()).aFX();
               lae var16 = (lae)var3.getParent();
               cai var19 = (cai)var16.getValue();
               var13.oo(var19.aGe());
               var19.a(var13);
               lae var22 = lai.a(this.qrW, var13);
               var16.add(var22);
               this.qrW.qtP.reload(var16);
               this.qrW.qtO.getSelectionModel().setSelectionPath(var2.getParentPath().pathByAddingChild(var22));
               this.qrW.qoZ.d(var13);
               break;
            case 10:
               String var12 = this.qrW.qoZ.u();
               if (var12 == null || var12.trim().equals("")) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() No resorce has been selected.");
                  return;
               }

               int var15 = lai.a(this.qrW).getType(var12);
               if (var15 <= 0) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resorce is invalid.");
                  return;
               }

               can var18 = new can(var15);
               if (lai.c(this.qrW).containsKey(var18)) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resorce already has a paperdollitem.");
                  return;
               }

               cam var21 = ((cam)var3.getValue()).aGj();
               var21.l(var15);
               lai.c(this.qrW).put(var18, var21);
               lae var24 = lai.a(this.qrW, var21);
               this.qrW.qtQ.add(var24);
               this.qrW.qtP.reload(this.qrW.qtQ);
               this.qrW.qtO.getSelectionModel().setSelectionPath(new TreePath(new Object[]{this.qrW.qtQ, var24}));
               this.qrW.qoZ.b((cam)var24.getValue());
               break;
            case 11:
               String var4 = this.qrW.qoZ.u();
               if (var4 == null || var4.trim().equals("")) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() No resorce has been selected.");
                  return;
               }

               int var5 = lai.a(this.qrW).getType(var4);
               if (var5 <= 0) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resorce is invalid.");
                  return;
               }

               if (!lai.a(this.qrW).isDescendant(var5, cug.fia)) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resource is not an npc resource.");
                  return;
               }

               String[] var6 = bqm.auC();
               String var7 = (String)JOptionPane.showInputDialog(this.qrW, "Select NPCType", "Create NodeCopy", 3, null, var6, "NULL");
               if (var7 == null) {
                  return;
               }

               int var8 = bqm.gc(var7);
               if (var8 <= 0) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() NPCName '" + var7 + "' is invalid.");
                  return;
               }

               cap var9 = new cap(var5, var8);
               if (lai.c(this.qrW).containsKey(var9)) {
                  lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() A paperdollitemnpc is already mapped to key: " + var9);
                  return;
               }

               cao var10 = (cao)((cam)var3.getValue()).aGj();
               var10.l(var5);
               var10.fx(var8);
               lai.c(this.qrW).put(var9, var10);
               lae var11 = lai.a(this.qrW, var10);
               this.qrW.qtQ.add(var11);
               this.qrW.qtP.reload(this.qrW.qtQ);
               this.qrW.qtO.getSelectionModel().setSelectionPath(new TreePath(new Object[]{this.qrW.qtQ, var11}));
               this.qrW.qoZ.b((cam)var11.getValue());
               break;
            default:
               return;
         }
      }
   }
}
