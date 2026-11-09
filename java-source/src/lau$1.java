import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class lau$1 implements TreeSelectionListener {
   lau$1(lau var1) {
      this.quf = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      lae var2 = (lae)var1.getPath().getLastPathComponent();
   }
}
