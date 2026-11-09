import dtz.a;
import java.util.ArrayList;
import java.util.Arrays;

class mwn$38 implements lgx {
   mwn$38(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void Ad(String var1) {
      if (var1 != null) {
         assert mwn.a(this.ERI).Type != dud.hdM;
         due var2 = (due)mwn.a(this.ERI);
         a[] var3 = var2.TargetedResources;
         ArrayList var4 = new ArrayList<>(Arrays.asList(var3));
         var2.getClass();
         var4.add(new a(var2, var1, 1, -1));
         var2.TargetedResources = var4.toArray(new a[var4.size()]);
         mwn.x(this.ERI);
         if (!var4.isEmpty()) {
            mwn.y(this.ERI).setRowSelectionInterval(var4.size() - 1, var4.size() - 1);
         }
      }
   }
}
