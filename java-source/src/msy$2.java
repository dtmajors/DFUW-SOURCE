import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msy$2 implements ActionListener {
   msy$2(msy var1) {
      this.EwJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (msy.e(this.EwJ).getSelectedIndex() != -1) {
         msy.d(this.EwJ).remove(msy.e(this.EwJ).getSelectedIndex());
         msy.e(this.EwJ).setListData(msy.d(this.EwJ));
         msy.e(this.EwJ).revalidate();
         msy.e(this.EwJ).repaint();
      }
   }
}
