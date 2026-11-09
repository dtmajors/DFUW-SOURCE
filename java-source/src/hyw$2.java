import spenefett.hid.gui.serialization.dto.SFContextMenuOptionListDTO;

class hyw$2 extends lie {
   hyw$2(hyw var1, double var2, boolean var4, SFContextMenuOptionListDTO var5) {
      super(var2, var4);
      this.lqY = var1;
      this.lqZ = var5;
   }

   @Override
   public void dh(double var1) {
      if (var1 > 0.1) {
         hyw.a(this.lqY, this.lqZ);
         if (hyw.e(this.lqY) != null) {
            hyw.e(this.lqY).stop();
            hyw.a(this.lqY, (lie)null);
         }
      }
   }
}
