import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msu$4 implements ActionListener {
   msu$4(msu var1) {
      this.EvB = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msu.a(this.EvB).setText(lea.epw().aW(msu.d(this.EvB).getSelectedIndex(), (Integer)msu.e(this.EvB).getModel().getValue()).getName());
      msu.a(this.EvB).repaint();
   }
}
