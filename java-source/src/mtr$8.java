import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JOptionPane;

class mtr$8 extends MouseAdapter {
   mtr$8(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (mtr.c(this.ECh) != null && !mtr.r(this.ECh)) {
         JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "You have To Specify A Missile Special Effect With Fired Type");
         mtr.s(this.ECh).setSelectedValue(mtr.c(this.ECh).getName(), true);
      } else {
         Iterator var2 = mtr.t(this.ECh).keySet().iterator();
         String var3 = (String)mtr.s(this.ECh).getSelectedValue();
         if (var3 != null) {
            while (var2.hasNext()) {
               Object var4 = var2.next();
               if (var4 instanceof String && ((String)var4).equalsIgnoreCase(var3)) {
                  mtr.a(this.ECh, (bwo)mtr.t(this.ECh).get(var3));
                  lfn.b(0, "SFMissileInfoEditor", "loadSelectedMissileInfo() SelectedMissileInfo " + mtr.c(this.ECh));
                  mtr.u(this.ECh);
               }
            }
         }
      }
   }
}
