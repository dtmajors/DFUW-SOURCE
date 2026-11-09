import java.util.List;

public class dqu$d {
   public float gqa;
   public float gQh;
   public int gQi;
   public int gQj;
   public List<dqu$a> gQk;
   public List<dqu$a> gQl;
   public double gQm;

   public dqu$d(dqu var1) {
      this.gPM = var1;
      this.gqa = 1.0F;
      this.gQh = 0.1F;
      this.gQi = -20;
      this.gQj = 45;
      this.gQk = lcn.emv();
      this.gQl = lcn.emv();
      this.gQm = 0.0;
   }

   public dqu$a bux() {
      if (this.gQl.size() == 0) {
         this.gQl.addAll(this.gQk);
      }

      int var1 = (int)(Math.random() * this.gQl.size());
      dqu$a var2 = this.gQl.get(var1);
      this.gQl.remove(var1);
      return var2;
   }
}
