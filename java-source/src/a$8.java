import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;

class a$8 implements ActionListener {
   a$8(a var1, JList var2) {
      this.aH = var1;
      this.aI = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getActionCommand() == "Select All") {
         int var2 = this.aI.getModel().getSize();

         for (int var3 = 0; var3 < var2; var3++) {
            ((a$b)this.aI.getModel().getElementAt(var3)).setSelected(true);
         }

         this.aI.repaint();
      } else if (var1.getActionCommand() == "Select None") {
         int var4 = this.aI.getModel().getSize();

         for (int var5 = 0; var5 < var4; var5++) {
            ((a$b)this.aI.getModel().getElementAt(var5)).setSelected(false);
         }

         this.aI.repaint();
      }
   }
}
