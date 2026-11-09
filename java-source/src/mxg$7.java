import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

class mxg$7 extends MouseAdapter {
   mxg$7(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String var2 = JOptionPane.showInputDialog(mxg.d(this.ETz), "Task Name");
      if (var2 != null && !var2.trim().isEmpty()) {
         cjr var3 = new cjr();
         var3.adk = mxg.f(this.ETz).aQi().size();
         var3.Name = var2;
         var3.eDE = new cjn();
         mxg.f(this.ETz).aQi().put(var3.adk, var3);
         mxg.e(this.ETz);
      }
   }
}
