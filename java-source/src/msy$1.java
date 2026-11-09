import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class msy$1 implements ActionListener {
   msy$1(msy var1) {
      this.EwJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msy.a(this.EwJ, new msj(msy.a(this.EwJ)));
      String var2 = msy.b(this.EwJ).eNq().Name;
      msy.c(this.EwJ).i(msy.a(this.EwJ));
      if (var2.equals(msy.a(this.EwJ).getText())) {
         JOptionPane.showMessageDialog(null, "A feat can not have itself as a prerequisite.");
      } else {
         if (msy.a(this.EwJ).getText() != null && !msy.a(this.EwJ).getText().equals("") && !msy.d(this.EwJ).contains(msy.a(this.EwJ).getText())) {
            msy.d(this.EwJ).add(msy.a(this.EwJ).getText());
            msy.e(this.EwJ).setListData(msy.d(this.EwJ));
            msy.e(this.EwJ).revalidate();
            msy.e(this.EwJ).repaint();
         }
      }
   }
}
