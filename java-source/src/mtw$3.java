import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtw$3 implements ChangeListener {
   mtw$3(mtw var1) {
      this.EEM = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mtw.ePp().setText(String.valueOf(mtw.ePo().getValue()));
   }
}
