import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Reward")
public class dtz$b {
   public String ResourceName;
   public int Amount;
   public float Probability;

   public dtz$b(dtz var1) {
      this.this$0 = var1;
   }

   public dtz$b(dtz var1, String var2, int var3, float var4) {
      this.this$0 = var1;
      this.ResourceName = var2;
      this.Amount = var3;
      this.Probability = var4;
   }
}
