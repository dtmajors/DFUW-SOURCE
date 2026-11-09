import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mxg$19 implements ActionListener {
   mxg$19(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         switch (var2.eDE.aPY()) {
            case SKILL:
               cjn var3 = (cjn)var2.eDE;
               var3.SkillType = lea.enZ().getType(this.ETz.ESX.getSelectedItem().toString());
         }
      }
   }
}
