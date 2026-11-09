import haa.a;

class mlz$5 implements a {
   mlz$5(mlz var1) {
      this.DLU = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      if (!(var1 instanceof kvk)) {
         lfn.b(5, this.getClass().getName(), "handleResponse() : response is no ObjectInfoResponse!!!");
      } else {
         kvk var3 = (kvk)var1;
         ljq var4 = new ljq(mje.DBl);
         ljq var5 = var3.ehe();
         float var6 = var3.ehf();
         float var7 = 5.0F;
         if (var6 > 7.0F) {
            var7 = 15.0F;
         }

         if (var6 == 0.0F) {
            var6 = 7.0F;
         }

         var4.et(var5);
         var4.es(new ljq(0.0F, 0.0F, var7 * var6));
         if (!(var2 instanceof bvf)) {
            lfn.b(5, this.getClass().getName(), "handleResponse() : response data not an SFAnimatedMeshObjectClient");
         } else {
            bvf var8 = (bvf)var2;
            var8.c(var4);
            if (mlz.b(this.DLU) != null) {
               var4.es(new ljq(var6 * 1.5, 0.0, -0.5));
               mlz.b(this.DLU).c(var4);
            }
         }
      }
   }
}
