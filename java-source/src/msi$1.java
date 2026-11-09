import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

class msi$1 implements ActionListener {
   msi$1(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JPanel var2 = new JPanel();
      JButton var3 = new JButton("Item");
      JButton var4 = new JButton("Selentine");
      JButton var5 = new JButton("SubGroup");
      JButton var6 = new JButton("Group");
      JButton var7 = new JButton("Feat");
      var2.add(var3);
      var2.add(var4);
      var2.add(var6);
      var2.add(var5);
      var2.add(var7);
      JDialog var8 = new JDialog();
      var8.add(var2);
      var3.addActionListener(new msi$1$1(this, var8));
      var4.addActionListener(new msi$1$2(this, var8));
      var5.addActionListener(new msi$1$3(this, var8));
      var6.addActionListener(new msi$1$4(this, var8));
      var7.addActionListener(new msi$1$5(this, var8));
      var8.setTitle("Choose a reward type");
      var8.setModal(true);
      var8.setSize(60, 182);
      var8.setResizable(false);
      var8.setLocation((int)msi.f(this.EtH).getWidth() / 2, (int)msi.f(this.EtH).getHeight() / 2);
      var8.setVisible(true);
   }

   private void a(cgw var1) {
      List var2 = lea.eps().aOg().get(msi.d(this.EtH).adk);
      var2.add(var1);
   }

   private cgw a(cgl var1) {
      msl var2 = new msl();
      return var2.b(var1);
   }
}
