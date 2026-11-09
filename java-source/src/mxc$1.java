import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mxc$1 extends KeyAdapter {
   mxc$1(mxc var1) {
      this.ESh = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         try {
            mxc.a(this.ESh, mxc.a(this.ESh), mxc.a(this.ESh).eIv(), mxc.a(this.ESh).eDc().getName());
         } catch (Exception var3) {
            lfn.b(0, this.getClass().getName(), "Directory");
         }
      }
   }
}
