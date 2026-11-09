import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lar$1 extends AbstractAction {
   lar$1(lar var1, String var2) {
      super(var2);
      this.qtw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtw.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qtw.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         String var4 = JOptionPane.showInputDialog(this.qtw, "Enter SkillName", "Add Skill to '" + var3.getName() + "'", 3);
         if (var4 != null && !var4.trim().equals("")) {
            var4 = var4.trim();
            if (!this.qtw.aqN.contains(var4)) {
               lae var5 = new lae(17, this.qtw.aqN.getType(var4), var4);
               var3.add(var5);
               this.qtw.qtP.reload(var3);
               int var6 = this.qtw.aqN.getType(var3.getName());
               ler var7 = this.qtw.aqN.acv(var6);
               lhg var8 = new lhg();
               var8.setName(var4);
               var8.setType(this.qtw.aqN.eqp());
               var8.yu(false);
               var8.a(new lhu(32, 32, "gui_icon_generic_32x32.bmp"));
               var8.yv(false);
               var8.yw(false);
               this.qtw.aqN.a(var7, var8, null);
            }
         }
      }
   }
}
