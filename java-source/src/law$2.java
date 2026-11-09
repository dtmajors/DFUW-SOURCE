import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

class law$2 extends AbstractAction {
   law$2(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JFileChooser var2 = null;
      if (law.l(this.quD).isSelected()) {
         var2 = new JFileChooser(law.n(this.quD));
      } else {
         var2 = new JFileChooser(law.o(this.quD));
      }

      var2.setFileSelectionMode(0);
      int var3 = var2.showDialog(this.quD, "Select");
      if (var3 == 0) {
         String var4 = var2.getSelectedFile().getName();
         var4 = var4.substring(0, var4.lastIndexOf(46));
         law.m(this.quD).setText(var4);
      }
   }
}
