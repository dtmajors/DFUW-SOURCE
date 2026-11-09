import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mjq$2 implements ChangeListener {
   mjq$2(mjq var1) {
      this.DDS = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      float var2 = this.DDS.DDP.getValue() / 255.0F;
      mjq.a(this.DDS, new lcq(this.DDS.aWl.r, this.DDS.aWl.g, this.DDS.aWl.b, var2));
   }
}
