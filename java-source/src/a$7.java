import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class a$7 implements ActionListener {
   a$7(a var1) {
      this.aH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getActionCommand() == "Remove item") {
         Object[] var2 = a.e(this.aH).getSelectedValues();
         if (var2 != null) {
            for (Object var6 : var2) {
               cte var7 = (cte)var6;
               this.aH.a(var7);
            }
         }
      }
   }
}
