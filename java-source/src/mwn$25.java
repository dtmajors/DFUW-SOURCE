import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mwn$25 implements ActionListener {
   mwn$25(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      assert mwn.a(this.ERI).Type == dud.hdS || mwn.a(this.ERI).Type == dud.hdQ;
      if (mwn.c(this.ERI).isSelected()) {
         if (mwn.d(this.ERI).getText() != null
            && !mwn.d(this.ERI).getText().trim().equals("")
            && JOptionPane.showConfirmDialog(
                  mwn.e(this.ERI), "Selecting this,will clean the target vendor Field\n,the target reward marker and any info related with it.\nAre you sure?"
               )
               != 0) {
            mwn.c(this.ERI).setSelected(false);
            return;
         }

         due var2 = (due)mwn.a(this.ERI);
         var2.QuestEndNpcName = null;
         var2.QuestEndTargetMarkerCaption = null;
         var2.ShowMarkerOnTarget = false;
         mwn.d(this.ERI).setText("");
         mwn.f(this.ERI).setEnabled(false);
         mwn.g(this.ERI).setSelected(false);
         mwn.g(this.ERI).setEnabled(false);
         mwn.h(this.ERI).setSelected(false);
         mwn.h(this.ERI).setEnabled(false);
         if (mwn.h(this.ERI).isSelected()) {
            mwn.i(this.ERI).setText("");
            mwn.i(this.ERI).setEnabled(false);
            mwn.i(this.ERI).setEditable(false);
         }

         mwn.j(this.ERI);
      } else {
         mwn.f(this.ERI).setEnabled(true);
         mwn.h(this.ERI).setEnabled(true);
         mwn.g(this.ERI).setEnabled(true);
         mwn.i(this.ERI).setText("");
         mwn.i(this.ERI).setEnabled(true);
      }
   }
}
