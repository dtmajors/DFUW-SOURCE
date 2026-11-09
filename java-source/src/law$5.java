import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

class law$5 extends AbstractAction {
   law$5(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = law.a(this.quD);
      JFileChooser var3 = new JFileChooser(var2);
      var3.setFileSelectionMode(1);
      int var4 = var3.showDialog(this.quD, "Select");
      if (var4 == 0) {
         law.b(this.quD).setText(var3.getSelectedFile().getPath());
      }
   }
}
