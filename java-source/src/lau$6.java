import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lau$6 extends AbstractAction {
   lau$6(lau var1, String var2) {
      super(var2);
      this.quf = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      lap var2 = new lap(this.quf, this.quf.qoZ.getLocation());
      if (this.quf instanceof kzu) {
         var2.setTitle("ActionTree SearchDialog");
      } else if (this.quf instanceof laa) {
         var2.setTitle("EffectTree SearchDialog");
      } else if (this.quf instanceof lac) {
         var2.setTitle("FunctionTree SearchDialog");
      } else if (this.quf instanceof lag) {
         var2.setTitle("ObjectTree SearchDialog");
      } else if (this.quf instanceof lai) {
         var2.setTitle("PaperDollTree SearchDialog");
      } else if (this.quf instanceof lao) {
         var2.setTitle("ResourceTree SearchDialog");
      } else if (this.quf instanceof lar) {
         var2.setTitle("SkillTree SearchDialog");
      } else {
         var2.setTitle("TreeView SearchDialog");
      }
   }
}
