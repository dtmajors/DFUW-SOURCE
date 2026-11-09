import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

class aux$4 extends mjg {
   private JMenuItem DDl;

   aux$4(aux var1, ActionEvent var2) {
      this.DDk = var1;
      this.DDm = var2;
   }

   @Override
   public Object Hv() {
      if (this.DDm.getSource() instanceof JMenuItem) {
         this.DDl = (JMenuItem)this.DDm.getSource();
         this.DDl.setEnabled(false);
      }

      mwz var1 = new mwz();
      var1.eSp();
      return "done";
   }

   @Override
   public void finished() {
      String var1 = "All spawnpoints were exported to file.";
      this.DDk.Ca(var1);
      this.DDl.setEnabled(true);
   }
}
