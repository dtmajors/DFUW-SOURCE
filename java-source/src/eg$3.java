import mjj.a;

class eg$3 implements a {
   eg$3(eg var1) {
      this.tn = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      if (!(var1 instanceof kto)) {
         lfn.b(5, this.getClass().getName(), "handleResponse() : response not sfcamerainforesponse");
      } else {
         kto var3 = (kto)var1;
         this.tn.sX = new mfy(var3.qbD);
         this.tn.sX.b(new mfy(var3.qbF));
      }
   }
}
