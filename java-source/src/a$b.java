class a$b implements Comparable<a$b> {
   private final Object aK;
   private boolean isSelected;

   public a$b(a var1, Object var2) {
      this.aH = var1;
      this.aK = var2;
      this.isSelected = true;
   }

   public void setSelected(boolean var1) {
      this.isSelected = var1;
   }

   public boolean isSelected() {
      return this.isSelected;
   }

   @Override
   public String toString() {
      return this.aK.toString();
   }

   public Object i() {
      return this.aK;
   }

   public int a(a$b var1) {
      String var2 = var1.aK.toString();
      String var3 = this.aK.toString();
      return -var2.compareTo(var3);
   }
}
