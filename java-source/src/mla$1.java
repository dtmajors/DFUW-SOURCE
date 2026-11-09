import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mla$1 implements ChangeListener {
   mla$1(mla var1) {
      this.DGE = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      float var2 = (float)((double)mla.a(this.DGE).getValue() / mla.b(this.DGE));
      mla.c(this.DGE).setText(Float.toString(var2));
   }
}
