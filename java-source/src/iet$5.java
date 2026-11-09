import java.util.List;

class iet$5 implements hzq {
   iet$5(iet var1, List var2, hvy var3, int var4) {
      this.lPm = var1;
      this.lPo = var2;
      this.lPp = var3;
      this.lPq = var4;
   }

   @Override
   public void O(float var1, float var2) {
   }

   @Override
   public void oH(boolean var1) {
      if (hyn.cyJ() != null) {
         hyn.cyJ().cHy().setVisible(false);
      }

      if (var1) {
         this.lPm.c(this.lPo, this.lPp.cAs(), this.lPq);
      }
   }
}
