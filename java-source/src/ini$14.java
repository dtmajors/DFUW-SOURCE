class ini$14 extends inh {
   ini$14(ini var1, lgw var2) {
      this.mmm = var1;
      this.mmn = var2;
   }

   @Override
   public void cVa() {
      if (this.getSelected()) {
         ini.a(this.mmm).mjn.add(this.mmn.getType());
      } else {
         ini.a(this.mmm).mjn.remove(this.mmn.getType());
      }
   }
}
