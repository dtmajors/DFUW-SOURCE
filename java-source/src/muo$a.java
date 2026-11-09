import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muo$a implements ActionListener {
   muo$a(muo var1) {
      this.EHi = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == muo.b(this.EHi)) {
         mkb var2 = new mkb();
         switch (muo.c(this.EHi)) {
            case EJd:
               var2.setCurrentDirectory(new jrw(muo.pEh + "trainingTemplates"));
            default:
               int var3 = var2.showOpenDialog(muo.d(this.EHi));
               if (var3 == 0) {
                  muo.a(this.EHi, var2.eDc().getName());
                  muo.a(this.EHi, var2.eDc());
               }
         }
      }
   }
}
