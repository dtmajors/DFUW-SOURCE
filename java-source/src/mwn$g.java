import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwn$g implements ChangeListener {
   mwn$g(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = Integer.valueOf(mwn.r(this.ERI).getValue().toString());
      int var3 = Integer.valueOf(mwn.s(this.ERI).getValue().toString());
      int var4 = Integer.valueOf(mwn.t(this.ERI).getValue().toString());
      if (var1.getSource() == mwn.r(this.ERI) && var2 < 0) {
         mwn.r(this.ERI).setValue(0);
      }

      if (var1.getSource() == mwn.s(this.ERI) && var3 < 0) {
         mwn.s(this.ERI).setValue(0);
      }

      if (var1.getSource() == mwn.t(this.ERI) && var4 < 0) {
         mwn.t(this.ERI).setValue(0);
      }

      if (var2 <= 0 && var3 <= 0 && var4 <= 0) {
         if (!mwn.q(this.ERI).isEnabled()) {
            mwn.q(this.ERI).setEnabled(true);
         }
      } else {
         if (mwn.q(this.ERI).isSelected()) {
            mwn.q(this.ERI).setSelected(false);
         }

         if (mwn.q(this.ERI).isEnabled()) {
            mwn.q(this.ERI).setEnabled(false);
         }
      }
   }
}
