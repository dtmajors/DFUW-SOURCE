import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mtt$7 implements ActionListener {
   mtt$7(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!mtt.l(this.EDj)) {
         int var2 = JOptionPane.showInternalConfirmDialog(mtt.h(this.EDj), "Do you want to Save Changes?");
         if (var2 == 0) {
            if (mtt.i(this.EDj).isVisible()) {
               mtt.c(this.EDj, 1);
            } else {
               mtt.c(this.EDj, 2);
            }

            mtt.a(this.EDj, true);
         }

         if (var2 == 1) {
            mtt.h(this.EDj).remove(mtt.i(this.EDj));
            mtt.h(this.EDj).remove(mtt.g(this.EDj));
            mtt.j(this.EDj).setVisible(true);
            mtt.h(this.EDj).revalidate();
            mtt.h(this.EDj).updateUI();
         }
      } else {
         mtt.h(this.EDj).remove(mtt.i(this.EDj));
         mtt.h(this.EDj).remove(mtt.g(this.EDj));
         mtt.j(this.EDj).setVisible(true);
         mtt.h(this.EDj).revalidate();
         mtt.h(this.EDj).updateUI();
      }
   }
}
