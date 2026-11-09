import javax.swing.JCheckBoxMenuItem;
import javax.swing.JInternalFrame;

class mjl$a extends JCheckBoxMenuItem {
   private JInternalFrame frame;

   public mjl$a(mjl var1, JInternalFrame var2) {
      super(var2.getTitle());
      this.DCP = var1;
      this.frame = var2;
   }

   public JInternalFrame ezN() {
      return this.frame;
   }
}
