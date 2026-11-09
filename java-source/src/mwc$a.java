import java.awt.LayoutManager;
import javax.swing.JPanel;

class mwc$a extends JPanel implements mxy {
   public mwc$a(mwc var1, LayoutManager var2) {
      super(var2);
      this.EOU = var1;
   }

   @Override
   public void a(String var1, double var2, double var4) {
      jrw var6 = new jrw(var1);
      ((mwe)mwc.c(this.EOU).getModel()).ac(var6);
   }
}
