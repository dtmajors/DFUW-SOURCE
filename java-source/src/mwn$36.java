import java.util.List;
import mld.a;

class mwn$36 implements a {
   mwn$36(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public int eDN() {
      if (mwn.a(this.ERI) != null && mwn.a(this.ERI) instanceof due) {
         due var1 = (due)mwn.a(this.ERI);
         duc[] var2 = var1.Markers;
         if (var2 != null && var2.length > 0) {
            var1.jJ(false);
            return var1.bAY().size();
         }
      }

      return 0;
   }

   @Override
   public String aeH(int var1) {
      if (mwn.a(this.ERI) != null && mwn.a(this.ERI) instanceof due) {
         due var2 = (due)mwn.a(this.ERI);
         List var3 = var2.bAY();
         if (var1 >= 0 && var1 < var3.size()) {
            return ((dub)var3.get(var1)).Caption;
         }
      }

      return "Undefined";
   }

   @Override
   public ljq aeI(int var1) {
      if (mwn.a(this.ERI) != null && mwn.a(this.ERI) instanceof due) {
         due var2 = (due)mwn.a(this.ERI);
         List var3 = var2.bAY();
         if (var1 >= 0 && var1 < var3.size()) {
            return ((dub)var3.get(var1)).Position;
         }
      }

      return null;
   }

   @Override
   public void eDO() {
      mwn.a(this.ERI, null);
   }

   @Override
   public void a(int var1, ljq var2, String var3) {
      duc var4 = new duc();
      var4.Caption = "Set Display Text Here";
      switch (var1) {
         case 64:
            var4.jw(mqm.a.Eej.name());
            var4.setFileName(var3);
            var4.c(var2);
            var4.setVisible(true);
            mwn.a(this.ERI, var4);
            break;
         case 1024:
            var4.jw(mqm.a.Eei.name());
            var4.setFileName(var3);
            var4.c(var2);
            var4.setVisible(true);
            var4.Caption = var3;
            if (!mwn.u(this.ERI)) {
               mwn.a(this.ERI, var4);
            } else {
               mwn.b(this.ERI, var4);
            }
            break;
         case 4096:
            var4.jw(mqm.a.Eed.name());
            var4.Caption = var3;
            var4.c(var2);
            mwn.b(this.ERI, var4);
            break;
         case 8192:
            var4.jw(mqm.a.Eee.name());
            var4.setFileName(var3);
            var4.c(var2);
            var4.setVisible(true);
            mwn.a(this.ERI, var4);
            break;
         case 16384:
            var4.jw(mqm.a.Eel.name());
            var4.setFileName(var3);
            var4.c(var2);
            var4.setVisible(true);
            mwn.a(this.ERI, var4);
      }
   }
}
