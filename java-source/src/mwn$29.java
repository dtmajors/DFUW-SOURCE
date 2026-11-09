import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$29 implements ActionListener {
   mwn$29(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.d(this.ERI).setText("");
      due var2 = (due)mwn.a(this.ERI);
      var2.QuestEndNpcName = null;
      var2.QuestEndTargetMarkerCaption = null;
      var2.ShowMarkerOnTarget = false;
      var2.NonAliveTarget = mwn.g(this.ERI).isSelected();
      mwn.h(this.ERI).setSelected(false);
      mwn.h(this.ERI).setEnabled(false);
      mwn.i(this.ERI).setEditable(false);
      mwn.i(this.ERI).setText("");
      mwn.i(this.ERI).setEnabled(false);
      mwn.j(this.ERI);
   }
}
