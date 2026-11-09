public class mpt$b extends mpt$a {
   String DXi;

   public mpt$b(mpt var1, String var2, String var3) {
      super(var1, var2);
      this.DXe = var1;
      this.DXi = null;
      this.DXi = var3;
   }

   @Override
   public void g(amf var1, boolean var2) {
      if (var1 instanceof dqk) {
         dqk var3 = (dqk)var1;
         if (var3.getObjectDescriptionFilename().toLowerCase().contains(this.DXi)) {
            var3.setVisible(var2);
         }
      }
   }

   public String eIR() {
      return this.DXi;
   }

   public void CM(String var1) {
      this.DXi = var1;
   }
}
