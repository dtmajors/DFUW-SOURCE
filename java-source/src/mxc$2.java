import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mxc$2 extends MouseAdapter {
   mxc$2(mxc var1) {
      this.ESh = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 2) {
         try {
            mxc.a(this.ESh, mxc.a(this.ESh), mxc.a(this.ESh).eIv(), mxc.a(this.ESh).eDc().getName());
         } catch (Exception var3) {
            lfn.b(0, this.getClass().getName(), "Directory");
         }
      }
   }
}
