import haa.a;

class mrj$43 implements a {
   mrj$43(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      kwz var3 = (kwz)var1;
      mrj.a(this.EkK, (int[])var3.pXF.clone());
      mrj.a(this.EkK).updateUI();
      mrj.a(this.EkK).repaint();
      mrj.a(this.EkK).setSelectedIndex(0);
   }
}
