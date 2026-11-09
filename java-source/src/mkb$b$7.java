import java.io.File;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mkb$b$7 implements ListSelectionListener {
   mkb$b$7(mkb$b var1) {
      this.DFa = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var2 = mkb$b.a(this.DFa).getSelectedIndex();
      if (var2 != -1) {
         this.DFa.DEO.setCurrentDirectory(new File((String)mkb.g(this.DFa.DEO).get(var2)));
      }
   }
}
