import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;

class mjq$1 implements ActionListener {
   mjq$1(mjq var1, mjq var2) {
      this.DDS = var1;
      this.DDR = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Color var2 = JColorChooser.showDialog(this.DDR, "Pick a Color ", this.DDS.aWl.getColor());
      if (var2 != null) {
         float var3 = var2.getRed() / 255.0F;
         float var4 = var2.getGreen() / 255.0F;
         float var5 = var2.getBlue() / 255.0F;
         mjq.a(this.DDS, new lcq(var3, var4, var5, this.DDS.aWl.a));
      }
   }
}
