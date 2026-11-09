import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JTree;

class msj$1 implements ActionListener {
   msj$1(msj var1, JTree var2, JDialog var3) {
      this.Euq = var1;
      this.Eup = var2;
      this.EtI = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Eup.clearSelection();
      this.Eup.setSelectionPath(null);
      this.EtI.dispose();
   }
}
