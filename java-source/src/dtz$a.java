import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SFResourceAndQuantity")
public class dtz$a {
   public String ResourceName;
   private int ResourceType;
   public int Amount;
   public int LeastTargets;

   public dtz$a(dtz var1) {
      this.this$0 = var1;
      this.ResourceType = -1;
   }

   public dtz$a(dtz var1, String var2, int var3, int var4) {
      this.this$0 = var1;
      this.ResourceType = -1;
      this.ResourceName = var2;
      this.Amount = var3;
      this.LeastTargets = var4;
   }

   public int az() {
      if (this.ResourceType == -1) {
         this.ResourceType = lea.enW().getType(this.ResourceName);
      }

      return this.ResourceType;
   }
}
