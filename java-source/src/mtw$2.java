import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtw$2 implements ChangeListener {
   mtw$2(mtw var1) {
      this.EEM = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mtw.ePm().setText(String.valueOf(mtw.ePn().getValue()));
   }
}
