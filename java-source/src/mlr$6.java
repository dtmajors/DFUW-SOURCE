import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mlr$6 implements ActionListener {
   mlr$6(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mlr.f(this.DKI);
      if (var2 != null) {
         JOptionPane.showMessageDialog(this.DKI, "Found template [" + var2 + "] for Animation [" + mlr.c(this.DKI).ayY() + "]. Auto-mapping and saving files.");
         mlr.a(this.DKI, var2);
         jzi var3 = new jzi();
         jrw var4 = new jrw(lcw.qLb + "xml-files/object/animation/" + mlr.c(this.DKI).ayY());
         var3.a(mlr.c(this.DKI), var4, true);
      } else {
         JOptionPane.showMessageDialog(this.DKI, "Found no valid template for Animation [" + mlr.c(this.DKI).ayY() + "]. Falling back to simple auto-mapping.");
         mlr.g(this.DKI);
      }
   }
}
