import java.util.List;

public class mwj$a {
   public int ID;
   public dud Type;
   public String Name;
   public String Filename;
   private List<String> EPq;
   private List<String> EPr;

   public mwj$a(mwj var1, dud var2, int var3) {
      this.EPs = var1;
      this.EPq = lcn.emv();
      this.EPr = lcn.emv();
      this.Type = var2;
      this.ID = var3;
   }

   public void DJ(String var1) {
      this.EPq.add(var1);
   }

   public void DK(String var1) {
      this.EPr.add(var1);
   }

   public boolean eRs() {
      return this.EPq.isEmpty() && this.EPr.isEmpty();
   }

   public List<String> eRt() {
      return this.EPq;
   }

   public List<String> eRu() {
      return this.EPr;
   }
}
