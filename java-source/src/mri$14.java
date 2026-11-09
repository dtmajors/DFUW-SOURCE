import haa.a;

class mri$14 implements a {
   mri$14(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      kwz var3 = (kwz)var1;
      mri.a(this.Ejc, (int[])var3.pXF.clone());
      mri.j(this.Ejc).updateUI();
      mri.j(this.Ejc).repaint();
      mri.j(this.Ejc).setSelectedIndex(0);
   }
}
