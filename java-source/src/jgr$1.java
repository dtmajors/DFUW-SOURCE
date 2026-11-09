import java.util.Comparator;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFSocialPlayerDTO;

final class jgr$1 implements Comparator<SFSocialPlayerDTO> {
   jgr$1(Map var1, List var2) {
      this.naX = var1;
      this.naY = var2;
   }

   public int a(SFSocialPlayerDTO var1, SFSocialPlayerDTO var2) {
      int var3 = (Integer)this.naX.get(var1);
      int var4 = (Integer)this.naX.get(var2);
      String var5 = (String)this.naY.get(var3);
      String var6 = (String)this.naY.get(var4);
      return var5.compareTo(var6);
   }
}
