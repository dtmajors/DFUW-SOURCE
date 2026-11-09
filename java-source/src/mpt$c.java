public class mpt$c extends mpt$a {
   int ResourceType;

   public mpt$c(mpt var1, String var2, int var3) {
      super(var1, var2);
      this.DXe = var1;
      this.ResourceType = 0;
      this.ResourceType = var3;
   }

   @Override
   public void g(amf var1, boolean var2) {
      if (var1 instanceof dqk) {
         dqk var3 = (dqk)var1;
         int var4 = var3.az();
         if (lea.enW().isDescendant(var4, this.ResourceType)) {
            var3.setVisible(var2);
         }
      }
   }
}
