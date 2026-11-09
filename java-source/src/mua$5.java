import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mua$5 implements ChangeListener {
   mua$5(mua var1) {
      this.EFo = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      String var2 = (String)mua.d(this.EFo).ePr();
      int var3 = cug.hV(var2);
      this.EFo.EFn.add(var3);
      mua.a(this.EFo, true);
   }
}
