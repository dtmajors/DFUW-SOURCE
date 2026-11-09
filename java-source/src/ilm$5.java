import java.util.List;

final class ilm$5 implements hzq {
   ilm$5(List var1, hvy var2, int var3) {
      this.lPo = var1;
      this.lPp = var2;
      this.lPq = var3;
   }

   @Override
   public void O(float var1, float var2) {
   }

   @Override
   public void oH(boolean var1) {
      if (ilm.cyJ() != null) {
         ilm.cyJ().cHy().setVisible(false);
      }

      if (var1) {
         ilm.e(this.lPo, this.lPp.cAs(), this.lPq);
      }
   }
}
