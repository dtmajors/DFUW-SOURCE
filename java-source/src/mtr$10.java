import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mtr$10 implements ActionListener {
   mtr$10(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = JOptionPane.showInternalInputDialog(mtr.d(this.ECh), "New Missile Info Name");
      if (var2 != null && !var2.trim().equals("")) {
         int var3 = mtr.w(this.ECh);
         if (!var2.startsWith("m_")) {
            var2 = "m_" + var2;
         }

         if (!mtr.x(this.ECh).contains(var2)) {
            bwo var4 = new bwo();
            var4.setName(var2);
            var4.setType(var3);
            mtr.t(this.ECh).put(var2, var4);
            mtr.t(this.ECh).put(new Integer(var3), var4);
            mtr.x(this.ECh).add(var2);
            mtr.s(this.ECh).setListData(mtr.x(this.ECh));
            mtr.s(this.ECh).revalidate();
         }
      }
   }
}
