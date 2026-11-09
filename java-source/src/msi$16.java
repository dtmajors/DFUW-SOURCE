import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class msi$16 implements ActionListener {
   msi$16(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msg var2 = (msg)msi.j(this.EtH).getLastSelectedPathComponent();
      msg var3 = var2;
      if (var3 != null && var3.getParent() != null) {
         var2 = var3.getParent();
         msg var4 = var2;
         System.out.println(var4.getType());
         if (var3.getType().equals("Group")) {
            msi.J(this.EtH).setExpanded(true);
            msi.I(this.EtH).setExpanded(false);
            msi.H(this.EtH).setExpanded(false);
            msi.P(this.EtH).setText("");

            while (msi.P(this.EtH).getText() == null || msi.P(this.EtH).getText().isEmpty()) {
               msi.P(this.EtH).setText(JOptionPane.showInputDialog("Please enter the name of the group:"));
            }

            msi.R(this.EtH).setText("");
            msi.P(this.EtH).revalidate();
            msi.P(this.EtH).repaint();
            msi.R(this.EtH).revalidate();
            msi.R(this.EtH).repaint();
            msi.J(this.EtH).revalidate();
            msi.S(this.EtH).setSelected(false);
         } else if (var3.getType().equals("SubGroup")) {
            msi.J(this.EtH).setExpanded(false);
            msi.I(this.EtH).setExpanded(true);
            msi.H(this.EtH).setExpanded(false);
            msi.K(this.EtH).setText("");

            while (msi.K(this.EtH).getText() == null || msi.K(this.EtH).getText().isEmpty()) {
               msi.K(this.EtH).setText(JOptionPane.showInputDialog("Please enter the name of the subgroup:"));
            }

            msi.M(this.EtH).setText("");
            msi.K(this.EtH).revalidate();
            msi.K(this.EtH).repaint();
            msi.M(this.EtH).revalidate();
            msi.M(this.EtH).repaint();
            msi.I(this.EtH).revalidate();
            msi.N(this.EtH).setSelected(false);
         } else if (var3.getType().equals("Feat")) {
            msi.J(this.EtH).setExpanded(false);
            msi.I(this.EtH).setExpanded(false);
            msi.H(this.EtH).setExpanded(true);
            msi.s(this.EtH).setText("");

            while (msi.s(this.EtH).getText() == null || msi.s(this.EtH).getText().isEmpty()) {
               msi.s(this.EtH).setText(JOptionPane.showInputDialog("Please enter the name of the feat:"));
            }
         }
      }
   }
}
