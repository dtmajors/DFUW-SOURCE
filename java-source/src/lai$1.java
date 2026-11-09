import cai.a;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lai$1 extends AbstractAction {
   lai$1(lai var1, String var2) {
      super(var2);
      this.qrW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qrW.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qrW.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         int var4 = -1;
         Object[] var5 = null;
         switch (var3.getNodeType()) {
            case 2:
            case 3:
            case 22:
               var5 = new String[]{"MaterialShaderPairNode"};
               break;
            case 10:
            case 11:
               var5 = new String[]{"AttachedMeshNode", "DummyMeshNode", "SubsetMeshNode"};
               break;
            case 16:
               String var6 = this.qrW.qoZ.u();
               if (var6 == null || var6.trim().equals("")) {
                  lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() No resorce has been selected.");
                  return;
               }

               var4 = lai.a(this.qrW).getType(var6);
               if (var4 <= 0) {
                  lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                  return;
               }

               if (lai.b(this.qrW)) {
                  var5 = new String[]{"PaperdollNPCNode"};
               } else {
                  can var7 = new can(var4);
                  if (lai.c(this.qrW).containsKey(var7)) {
                     lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() The selected resorce already has a paperdollitem.");
                     return;
                  }

                  var5 = new String[]{"PaperdollNode"};
               }
               break;
            default:
               return;
         }

         String var14 = (String)JOptionPane.showInputDialog(this.qrW, "Select NodeType", "Add Node", 3, null, var5, "MaterialNode");
         if (var14 != null) {
            lae var15 = null;
            if (var14.equals("AttachedMeshNode")) {
               cai var8 = lai.a(this.qrW, a.eeL);
               cam var9 = (cam)var3.getValue();
               var9.b(var8);
               var15 = lai.a(this.qrW, var8);
            } else if (var14.equals("DummyMeshNode")) {
               cai var16 = lai.a(this.qrW, a.eeM);
               cam var21 = (cam)var3.getValue();
               var21.b(var16);
               var15 = lai.a(this.qrW, var16);
            } else if (var14.equals("MaterialShaderPairNode")) {
               cah var17 = lai.d(this.qrW);
               cai var22 = (cai)var3.getValue();
               var17.oo(var22.aGe());
               var22.a(var17);
               var15 = lai.a(this.qrW, var17);
            } else if (var14.equals("PaperdollNode")) {
               cam var18 = lai.e(this.qrW);
               var18.l(var4);
               can var23 = new can(var18.az());
               lai.c(this.qrW).put(var23, var18);
               var15 = lai.a(this.qrW, var18);
            } else if (var14.equals("PaperdollNPCNode")) {
               String[] var19 = bqm.auC();
               String var24 = (String)JOptionPane.showInputDialog(this.qrW, "Select NPCType", "Add Node", 3, null, var19, "NULL");
               if (var24 == null) {
                  return;
               }

               int var10 = bqm.gc(var24);
               if (var10 <= 0) {
                  lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() NPCName '" + var24 + "' is invalid.");
                  return;
               }

               if (!lai.a(this.qrW).k(var4, cug.fia, false)) {
                  lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() The selected resource is not an npc resource.");
                  return;
               }

               cap var11 = new cap(var4, var10);
               if (lai.c(this.qrW).containsKey(var11)) {
                  lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() A paperdollitemnpc is already mapped to key: " + var11);
                  return;
               }

               cao var12 = lai.f(this.qrW);
               var12.l(var4);
               var12.fx(var10);
               lai.c(this.qrW).put(var11, var12);
               var15 = lai.a(this.qrW, var12);
            } else if (var14.equals("SubsetMeshNode")) {
               cai var20 = lai.a(this.qrW, a.eeN);
               cam var25 = (cam)var3.getValue();
               var25.b(var20);
               var15 = lai.a(this.qrW, var20);
            }

            assert var15 != null;
            var3.add(var15);
            this.qrW.qtP.reload(var3);
            this.qrW.qtO.getSelectionModel().setSelectionPath(var2.pathByAddingChild(var15));
            switch (var15.getNodeType()) {
               case 2:
               case 3:
               case 22:
                  this.qrW.qoZ.d((cai)var15.getValue());
                  break;
               case 8:
                  this.qrW.qoZ.d((cah)var15.getValue());
                  break;
               case 10:
               case 11:
                  this.qrW.qoZ.b((cam)var15.getValue());
                  break;
               default:
                  return;
            }
         }
      }
   }
}
