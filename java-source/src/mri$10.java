import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mri$10 implements ActionListener {
   mri$10(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = mri.j(this.Ejc).getSelectedIndex();
      if (var2 != -1) {
         this.Ejc.Ejb = -1;
         mri.k(this.Ejc);
         if (this.Ejc.Ejb != -1) {
            mri.g(this.Ejc)[var2] = this.Ejc.Ejb;
            krc var3 = (krc)mri.c(this.Ejc).ii(4104);
            var3.pXF = (int[])mri.g(this.Ejc).clone();
            mri.c(this.Ejc).a(var3, null, null);
            mri.j(this.Ejc).updateUI();
            mri.j(this.Ejc).repaint();
         }
      }
   }
}
