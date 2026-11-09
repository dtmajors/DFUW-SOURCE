import java.awt.LayoutManager;
import java.util.List;
import javax.swing.JPanel;

class mlh$a extends JPanel implements mxu, mxy {
   public mlh$a(mlh var1, LayoutManager var2) {
      super(var2);
      this.DIX = var1;
   }

   @Override
   public void a(String var1, double var2, double var4) {
      lfn.b(0, this.getClass().getName(), "dropString called with String: " + var1);
      jrw var6 = new jrw(var1);
      mlh.a(this.DIX, var6);
   }

   @Override
   public void a(List var1, double var2, double var4) {
      lfn.b(0, this.getClass().getName(), "dropFileList() : called with FileList: " + var1);

      for (jrw var7 : var1) {
         mlh.a(this.DIX, var7);
      }
   }
}
