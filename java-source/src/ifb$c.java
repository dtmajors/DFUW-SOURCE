import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

class ifb$c {
   lgw lQt;
   hwp lQu;
   boolean lQv;
   boolean lQw;

   ifb$c(ifb var1, lgw var2, hwp var3, boolean var4, boolean var5) {
      this.lQj = var1;
      this.lQt = var2;
      this.lQu = var3;
      this.lQv = var4;
      this.lQw = var5;
   }

   public SFGUIElementDTO Qw(int var1) {
      SFGUIElementDTO var2 = this.lQu.cBj();
      var2.id = var1;
      var2.nameLabelColor = this.lQv ? 16777215 : 16711680;
      var2.state = this.lQw ? hxw.llv.ordinal() : hxw.llw.ordinal();
      var2.quantity = ifb.a(this.lQj, this.lQt);
      return var2;
   }
}
