import java.util.ArrayList;
import java.util.Arrays;

class mwn$37 implements lgx {
   mwn$37(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void Ad(String var1) {
      if (var1 != null) {
         assert mwn.a(this.ERI).Type != dud.hdM;
         due var2 = (due)mwn.a(this.ERI);
         dtz.b[] var3 = var2.Rewards;
         ArrayList var4 = new ArrayList<>(Arrays.asList(var3));
         var2.getClass();
         var4.add(new dtz.b(var2, var1, 1, 1.0F));
         var2.Rewards = var4.toArray(new dtz.b[var4.size()]);
         mwn.v(this.ERI);
         if (!var4.isEmpty()) {
            mwn.w(this.ERI).setRowSelectionInterval(var4.size() - 1, var4.size() - 1);
         }
      }
   }
}
