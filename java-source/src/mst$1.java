import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mst$1 implements ActionListener {
   mst$1(mst var1) {
      this.Evh = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mst.a(this.Evh, new msj(mst.a(this.Evh)));
      mst.b(this.Evh).e(mst.a(this.Evh));
   }
}
