import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrj$45 implements ActionListener {
   mrj$45(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = mrj.a(this.EkK).getSelectedIndex();
      if (var2 != -1) {
         this.EkK.Ejb = -1;
         mrj.b(this.EkK);
         if (this.EkK.Ejb != -1) {
            if (var2 >= mrj.c(this.EkK).length) {
               int[] var3 = new int[var2 + 1];

               for (int var4 = 0; var4 < var3.length; var4++) {
                  if (var4 < mrj.c(this.EkK).length) {
                     var3[var4] = mrj.c(this.EkK)[var4];
                  } else {
                     var3[var4] = 0;
                  }
               }

               mrj.a(this.EkK, var3);
            }

            mrj.c(this.EkK)[var2] = this.EkK.Ejb;
            krc var5 = (krc)mrj.d(this.EkK).ii(4104);
            var5.pXF = (int[])mrj.c(this.EkK).clone();
            mrj.d(this.EkK).a(var5, null, null);
            mrj.a(this.EkK).updateUI();
            mrj.a(this.EkK).repaint();
         }
      }
   }
}
