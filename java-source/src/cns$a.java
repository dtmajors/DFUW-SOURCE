import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Edge")
public class cns$a {
   public String TileID;
   public int Cost;

   public cns$a(cns var1) {
      this.this$0 = var1;
      this.TileID = null;
      this.Cost = -1;
   }

   public cns$a(cns var1, String var2, int var3) {
      this.this$0 = var1;
      this.TileID = null;
      this.Cost = -1;
      this.TileID = var2;
      this.Cost = var3;
   }
}
