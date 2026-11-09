public class mpt$d extends mpt$a {
   int ObjectType;

   public mpt$d(mpt var1, String var2, int var3) {
      super(var1, var2);
      this.DXe = var1;
      this.ObjectType = 0;
      this.ObjectType = var3;
   }

   @Override
   public void g(amf var1, boolean var2) {
      if (var1.getObjectType() == this.ObjectType) {
         dqk var3 = (dqk)var1;
         var3.setVisible(var2);
      }
   }
}
