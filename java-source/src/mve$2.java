import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mve$2 extends KeyAdapter {
   mve$2(mve var1) {
      this.EJP = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         mve.a(this.EJP, 0);
      } else if (var1.getKeyCode() == 27) {
         mve.a(this.EJP).setSelectedIndex(0);
         mve.b(this.EJP).setText(mve.a(this.EJP).getSelectedItem().toString());
         mve.a(this.EJP, 0);
      }
   }
}
