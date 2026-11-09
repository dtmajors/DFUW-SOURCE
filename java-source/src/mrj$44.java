import haa.a;

class mrj$44 implements a {
   mrj$44(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      kwu var3 = (kwu)var1;
      String[] var4 = var3.ehT();
      if (var4.length > 0) {
         mrj.a(this.EkK, var4[0]);
      } else {
         lfn.b(5, this.getClass().getName(), "setEditedMesh() : shader names in response has length 0. as if the mesh has 0 subsets??");
      }
   }
}
