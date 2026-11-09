import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class mup$7 implements ActionListener {
   mup$7(mup var1) {
      this.EHo = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!mup.a(this.EHo).isSelectionEmpty()) {
         int[] var2 = mup.a(this.EHo).getSelectionRows();
         if (var2 != null) {
            DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mup.a(this.EHo).getLastSelectedPathComponent();
            System.out.println("Selected Node :" + var3.getUserObject());
            muu var4 = new muu();
            var4.SkillName = var3.getUserObject().toString();
            mup.b(this.EHo).add(var4);
            mup.c(this.EHo);
         }
      }
   }
}
