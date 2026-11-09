import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mqy$6 implements ListSelectionListener {
   mqy$6(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var2 = mqy.i(this.Ehw).getSelectedIndex();
      if (var2 >= 0 && var2 < mqy.c(this.Ehw).byb().size()) {
         mqy.j(this.Ehw).setText(String.valueOf(mqy.c(this.Ehw).byb().get(var2).bxK()));
         mqy.k(this.Ehw).nG(mqy.c(this.Ehw).byb().get(var2).getGUID());
      }
   }
}
