import java.awt.event.MouseListener;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.plaf.metal.MetalFileChooserUI;

public class mkb$d extends MetalFileChooserUI {
   private JFileChooser DFf;

   public mkb$d(mkb var1, JFileChooser var2) {
      super(var2);
      this.DEO = var1;
      this.DFf = var2;
   }

   @Override
   protected MouseListener createDoubleClickListener(JFileChooser var1, JList var2) {
      return new mkb$d$a(this, var2);
   }
}
