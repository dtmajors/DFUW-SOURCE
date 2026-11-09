import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

public class mwn$c extends DefaultCellEditor {
   public mwn$c(mwn var1, Vector var2) {
      super(new JComboBox(var2));
      this.ERI = var1;
   }
}
