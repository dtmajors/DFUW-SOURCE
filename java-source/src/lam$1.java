import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lam$1 extends AbstractAction {
   lam$1(lam var1, String var2) {
      super(var2);
      this.qsP = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qsP.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qsP.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         Object[] var4 = null;
         switch (var3.getNodeType()) {
            case 12:
               var4 = new String[]{"Ingredient", "RequiredSkill"};
               break;
            case 13:
               var4 = new String[]{"EnchantmentConfiguration", "Ingredient"};
               break;
            case 14:
            case 15:
            default:
               return;
            case 16:
               var4 = new String[]{"RecipeCrafting", "RecipeEnchanting"};
         }

         String var5 = (String)JOptionPane.showInputDialog(this.qsP, "Select NodeType", "Add Node", 3, null, var4, "Null");
         if (var5 != null) {
            lae var6 = null;
            if (var5.equals("RecipeCrafting")) {
               String var7 = this.qsP.qoZ.u();
               if (var7 == null || var7.trim().equals("")) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No resorce has been selected.");
                  return;
               }

               int var8 = lam.a(this.qsP).getType(var7);
               if (var8 <= 0) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                  return;
               }

               Integer var9 = new Integer(var8);
               if (lam.b(this.qsP).containsKey(var9)) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() A recipe for the resource already exists.");
                  return;
               }

               ctm var10 = new ctm();
               var10.ResourceType = var8;
               var10.asi = 1;
               var10.fgb = 0.0F;
               ctm[] var11 = new ctm[]{var10};
               ctu var12 = new ctu();
               var12.l(var8);
               var12.do(1);
               var12.eR(0.0F);
               var12.eS(1.0F);
               var12.un(cug.fgE);
               var12.Ingredients = var11;
               var6 = lam.a(this.qsP, var12);
               lam.b(this.qsP).put(var9, var12);
               lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Added " + var12);
            } else if (var5.equals("RecipeEnchanting")) {
               String var16 = this.qsP.qoZ.u();
               if (var16 == null || var16.trim().equals("")) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No resorce has been selected. It is needed as an ingredient.");
                  return;
               }

               int var20 = lam.a(this.qsP).getType(var16);
               if (var20 <= 0) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                  return;
               }

               String var24 = JOptionPane.showInputDialog(this.qsP, "Enter EnchantmentName", "Add Enchantment", 3);
               if (var24 == null || var24.trim().equals("")) {
                  return;
               }

               var24 = var24.trim();
               if (lam.c(this.qsP).containsKey(var24)) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() A recipe with the same name already exists.");
                  return;
               }

               int var29 = lam.d(this.qsP);
               Integer var33 = new Integer(var29);
               if (lam.c(this.qsP).containsKey(var33)) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() A recipe with the same type already exists.");
                  return;
               }

               ctm var35 = new ctm();
               var35.ResourceType = var20;
               var35.asi = 1;
               var35.fgb = 0.0F;
               ctm[] var10000 = new ctm[]{var35};
               all var14 = new all();
               var14.fU(5);
               var14.fV(3);
               var14.fC(1104);
               var14.ap(0.0F);
            } else if (var5.equals("Ingredient")) {
               String var17 = this.qsP.qoZ.u();
               if (var17 == null || var17.trim().equals("")) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No resorce has been selected.");
                  return;
               }

               int var21 = lam.a(this.qsP).getType(var17);
               if (var21 <= 0) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                  return;
               }

               ctm var26 = new ctm();
               var26.ResourceType = var21;
               var26.asi = 1;
               var26.fgb = 0.0F;
               ctt var30 = (ctt)var3.getValue();
               if (!var30.a(var26)) {
                  return;
               }

               var6 = new lae(7, var26);
               lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Adding " + var26);
            } else if (var5.equals("RequiredSkill")) {
               String var18 = this.qsP.qoZ.eks();
               if (var18 == null || var18.trim().equals("")) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No skill has been selected.");
                  return;
               }

               int var22 = lam.e(this.qsP).getType(var18);
               if (var22 <= 0) {
                  lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected skill is invalid.");
                  return;
               }

               ctz var27 = new ctz();
               var27.SkillType = var22;
               var27.SkillLevel = 1.0F;
               var27.fgs = 0.0F;
               var27.fgt = false;
               ctu var31 = (ctu)var3.getValue();
               if (!var31.a(var27)) {
                  return;
               }

               var6 = new lae(14, var27);
               lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Adding " + var27);
            } else {
               if (!var5.equals("EnchantmentConfiguration")) {
                  lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Invalid nodetype provided: '" + var5 + "'");
                  return;
               }

               String[] var19 = aln.DP();
               String var23 = (String)JOptionPane.showInputDialog(this.qsP, "EnchantmentConfiguration", "Select EnchantmentClassName", 3, null, var19, "Null");
               if (var23 == null) {
                  return;
               }

               int var28 = aln.cL(var23);
               if (var28 <= 0) {
                  lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() EnchantmentClassName '" + var23 + "' is invalid.");
                  return;
               }

               String[] var32 = aln.DQ();
               String var34 = (String)JOptionPane.showInputDialog(this.qsP, "EnchantmentConfiguration", "Select ItemClassName", 3, null, var32, "Null");
               if (var34 == null) {
                  return;
               }

               int var36 = aln.cM(var34);
               if (var36 <= 0) {
                  lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() ItemClassName '" + var34 + "' is invalid.");
                  return;
               }

               all var13 = new all();
               var13.fU(var28);
               var13.fV(var36);
               switch (var28) {
                  case 1:
                     var13.fJ(bfk.dgM);
                     var13.eI(cxd.fIa);
                     var13.ap(5.0F);
                     break;
                  case 2:
                     var13.eI(cxd.fIa);
                     var13.ap(0.0F);
                     break;
                  case 3:
                     var13.l(cug.fgJ);
                     var13.ap(5.0F);
                     break;
                  case 4:
                     var13.fC(208);
                     var13.ap(0.0F);
                     break;
                  case 5:
                     var13.fC(1104);
                     var13.ap(0.0F);
                     break;
                  case 6:
                     var13.eI(cxd.fIa);
                     break;
                  default:
                     lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() EnchantmentClassName '" + var23 + "' is invalid.");
                     return;
               }

               var6 = new lae(5, var13);
               lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Adding " + var13);
            }

            assert var6 != null;
            var3.add(var6);
            this.qsP.qtP.reload(var3);
            this.qsP.qtO.getSelectionModel().setSelectionPath(var2.pathByAddingChild(var6));
            switch (var6.getNodeType()) {
               case 5:
                  this.qsP.qoZ.a((all)var6.getValue());
                  break;
               case 6:
               case 8:
               case 9:
               case 10:
               case 11:
               default:
                  return;
               case 7:
                  this.qsP.qoZ.d((ctm)var6.getValue());
                  break;
               case 12:
                  this.qsP.qoZ.h((ctu)var6.getValue());
                  break;
               case 13:
                  this.qsP.qoZ.a((ctv)var6.getValue());
                  break;
               case 14:
                  this.qsP.qoZ.c((ctz)var6.getValue());
            }
         }
      }
   }
}
