import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mtq$7 extends KeyAdapter {
   mtq$7(mtq var1) {
      this.EBi = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         int var2 = mtq.k(this.EBi).getSelectedRow();
         if (mtq.k(this.EBi).getModel().getValueAt(var2, 4).toString().toLowerCase().equals("string")) {
            lfn.b(0, "SFItemCreator", "keyReleased() *** Item Display Name Changed");
            ej var3 = mtq.l(this.EBi).fi().ae(1328);
            mtq.m(this.EBi).setText(var3.getValue().toString());
         }
      }
   }
}
