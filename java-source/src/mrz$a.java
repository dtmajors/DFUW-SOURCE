import javax.swing.JComboBox;

class mrz$a extends JComboBox {
   private duj qoj;

   public mrz$a(mrz var1, Object[] var2, duj var3) {
      super(var2);
      this.EoW = var1;
      this.qoj = var3;
   }

   public void a(duj var1) {
      this.qoj = var1;
   }

   public duj eMW() {
      return this.qoj;
   }
}
