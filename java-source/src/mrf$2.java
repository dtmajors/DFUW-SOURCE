import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mrf$2 extends KeyAdapter {
   mrf$2(mrf var1) {
      this.EiE = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 127) {
         Object[] var2 = this.EiE.DHd.getSelectedValues();
         if (var2 != null) {
            for (int var3 = 0; var3 < var2.length; var3++) {
               mrf.b(this.EiE).remove(var2[var3]);
            }
         }

         this.EiE.DHd.setListData(mrf.b(this.EiE));
         this.EiE.DHd.repaint();
      }
   }
}
