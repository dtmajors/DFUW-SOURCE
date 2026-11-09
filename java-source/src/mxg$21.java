import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mxg$21 implements ActionListener {
   mxg$21(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         switch (var2.eDE.aPY()) {
            case EQUIP_UNSHEATH:
               cjh var3 = (cjh)var2.eDE;
               var3.ayN = Integer.parseInt(this.ETz.ESL.getSelectedItem().toString());
               break;
            case SKILL:
               cjn var4 = (cjn)var2.eDE;
               var4.ayN = Integer.parseInt(this.ETz.ESL.getSelectedItem().toString());
               break;
            case KILL:
               cjj var5 = (cjj)var2.eDE;
               var5.ayN = Integer.parseInt(this.ETz.ESL.getSelectedItem().toString());
         }
      }
   }
}
