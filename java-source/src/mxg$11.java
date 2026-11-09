import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class mxg$11 extends AbstractAction {
   mxg$11(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         mxh var3 = (mxh)var1.getSource();
         if (var3.getColumn() == 2) {
            System.out.println("Row   : " + var3.getRow());
            System.out.println("Column: " + var3.getColumn());
            System.out.println("Old   : " + var3.getOldValue());
            System.out.println("New   : " + var3.getNewValue());
            mxg.b(this.ETz, var2);
         }
      }
   }
}
