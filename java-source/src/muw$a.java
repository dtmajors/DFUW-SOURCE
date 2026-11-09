import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class muw$a implements ActionListener {
   muw$a(muw var1) {
      this.EJb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JButton var2 = (JButton)var1.getSource();
      JPanel var3 = (JPanel)muw.j(this.EJb).get(var1.getSource());
      muw.k(this.EJb).remove(var3);
      muw.k(this.EJb).revalidate();
      muw.l(this.EJb).remove(var2.getName());
   }
}
