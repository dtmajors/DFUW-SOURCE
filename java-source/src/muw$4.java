import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

class muw$4 implements ActionListener {
   muw$4(muw var1, JPanel var2, String var3) {
      this.EJb = var1;
      this.EHm = var2;
      this.EJc = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muw.n(this.EJb).remove(this.EHm);
      muw.n(this.EJb).revalidate();
      muw.o(this.EJb).remove(this.EJc);
      muw.p(this.EJb);
   }
}
