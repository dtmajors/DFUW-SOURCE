class hrx$4 implements lbi<miz> {
   hrx$4(hrx var1) {
      this.laO = var1;
   }

   public final void a(miz var1) {
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         assert var1.dRw().equals(hrx.j(this.laO));
         hrx$a var2 = hrx.c(this.laO, var1.getState());
         hrx.a(this.laO, var2);
      }
   }
}
