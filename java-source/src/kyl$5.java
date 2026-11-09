import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class kyl$5 implements ListSelectionListener {
   kyl$5(kyl var1) {
      this.qkV = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (kyl.h(this.qkV).getSelectedIndex() == -1) {
         kyl.a(this.qkV).setSelectedIndex(0);
         kyl.b(this.qkV).setSelectedIndex(0);
         kyl.c(this.qkV).setSelectedIndex(0);
         kyl.d(this.qkV).setText(null);
         kyl.e(this.qkV).setSelected(false);
      } else {
         kyk var2 = (kyk)kyl.h(this.qkV).getSelectedValue();
         kyl.a(this.qkV).setSelectedIndex(var2.eiJ().ordinal());
         kyl.b(this.qkV).setSelectedIndex(var2.eiK().ordinal());
         kyl.c(this.qkV).setSelectedIndex(var2.eiL());
         kyl.d(this.qkV).setText(var2.getExpression());
         kyl.e(this.qkV).setSelected(var2.isEnabled());
      }
   }
}
