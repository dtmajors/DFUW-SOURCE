import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class msu$3 implements ChangeListener {
   msu$3(msu var1) {
      this.EvB = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if ((Integer)msu.e(this.EvB).getModel().getValue() < 0) {
         msu.e(this.EvB).setValue(0);
         msu.e(this.EvB).repaint();
      } else if ((Integer)msu.e(this.EvB).getModel().getValue() > 3) {
         msu.e(this.EvB).setValue(3);
         msu.e(this.EvB).repaint();
      }

      if (!msu.d(this.EvB).getSelectedItem().toString().equals("")) {
         msu.a(this.EvB).setText(lea.epw().aW(msu.d(this.EvB).getSelectedIndex(), (Integer)msu.e(this.EvB).getModel().getValue()).getName());
         msu.a(this.EvB).repaint();
      }
   }
}
