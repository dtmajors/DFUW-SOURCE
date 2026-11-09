import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lam$2 extends AbstractAction {
   lam$2(lam var1, String var2) {
      super(var2);
      this.qsP = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qsP.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qsP.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         if (var3.getNodeType() == 12) {
            String var4 = this.qsP.qoZ.u();
            if (var4 == null || var4.trim().equals("")) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() No resorce has been selected.");
               return;
            }

            int var5 = lam.a(this.qsP).getType(var4);
            if (var5 <= 0) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() The selected resorce is invalid.");
               return;
            }

            Integer var6 = new Integer(var5);
            if (lam.b(this.qsP).containsKey(var6)) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() A recipe for the resource already exists.");
               return;
            }

            ctu var7 = (ctu)((ctt)var3.getValue()).bbE();
            var7.l(var5);
            lae var8 = lam.a(this.qsP, var7);
            this.qsP.qtQ.add(var8);
            this.qsP.qtP.reload(this.qsP.qtQ);
            lam.b(this.qsP).put(var6, var7);
            lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + var7);
            this.qsP.qoZ.h(var7);
         } else if (var3.getNodeType() == 13) {
            String var10 = JOptionPane.showInputDialog(this.qsP, "Enter EnchantmentName", "e_");
            if (var10 == null || var10.trim().equals("")) {
               return;
            }

            var10 = var10.trim();
            if (lam.c(this.qsP).containsKey(var10)) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() A recipe with the same name already exists.");
               return;
            }

            int var14 = lam.d(this.qsP);
            Integer var17 = new Integer(var14);
            if (lam.c(this.qsP).containsKey(var17)) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() A recipe with the same type already exists.");
               return;
            }

            ctv var20 = (ctv)((ctt)var3.getValue()).bbE();
            var20.Ps = var14;
            var20.EnchantmentName = var10;
            lae var23 = lam.a(this.qsP, var20);
            this.qsP.qtQ.add(var23);
            this.qsP.qtP.reload(this.qsP.qtQ);
            lam.c(this.qsP).put(var17, var20);
            lam.c(this.qsP).put(var10, var20);
            lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + var20);
            this.qsP.qoZ.a(var20);
         } else if (var3.getNodeType() == 7) {
            String var12 = this.qsP.qoZ.u();
            if (var12 == null || var12.trim().equals("")) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() No resorce has been selected.");
               return;
            }

            int var15 = lam.a(this.qsP).getType(var12);
            if (var15 <= 0) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() The selected resorce is invalid.");
               return;
            }

            ctm var18 = ((ctm)var3.getValue()).bbC();
            var18.ResourceType = var15;
            lae var21 = (lae)var3.getParent();
            ctt var24 = (ctt)var21.getValue();
            if (!var24.a(var18)) {
               return;
            }

            lae var9 = new lae(7, var18);
            var21.add(var9);
            this.qsP.qtP.reload(var21);
            lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + var18);
            this.qsP.qoZ.d(var18);
         } else if (var3.getNodeType() == 14) {
            String var13 = this.qsP.qoZ.eks();
            if (var13 == null || var13.trim().equals("")) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() No skill has been selected.");
               return;
            }

            int var16 = lam.e(this.qsP).getType(var13);
            if (var16 <= 0) {
               lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() The selected skill is invalid.");
               return;
            }

            ctz var19 = ((ctz)var3.getValue()).bbN();
            var19.SkillType = var16;
            lae var22 = (lae)var3.getParent();
            ctu var25 = (ctu)var22.getValue();
            if (!var25.a(var19)) {
               return;
            }

            lae var26 = new lae(14, var19);
            var22.add(var26);
            this.qsP.qtP.reload(var22);
            lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + var19);
            this.qsP.qoZ.c(var19);
         }
      }
   }
}
