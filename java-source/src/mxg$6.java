import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.SortedMap;
import javax.swing.JOptionPane;

class mxg$6 extends MouseAdapter {
   mxg$6(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         int var3 = JOptionPane.showConfirmDialog(mxg.d(this.ETz), "WARNING : Do you want to delete permantly task : " + var2.Name, "Warning", 2);
         if (var3 == 0) {
            mxg.f(this.ETz).aQi().remove(var2.adk);
            SortedMap var4 = lcn.emD();
            int var5 = 0;

            for (cjr var7 : mxg.f(this.ETz).aQi().values()) {
               var7.adk = var5;
               var4.put(var5, var7);
               var5++;
            }

            mxg.f(this.ETz).aQi().clear();
            mxg.f(this.ETz).aQi().putAll(var4);
            mxg.e(this.ETz);
         }
      }
   }
}
