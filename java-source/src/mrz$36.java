import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

class mrz$36 implements ActionListener {
   mrz$36(mrz var1, JList var2) {
      this.EoW = var1;
      this.EoZ = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JDialog var2 = new JDialog(mrz.z(this.EoW), true);
      var2.setTitle("Please specify field name and range.");
      var2.setSize(new Dimension(300, 200));
      JPanel var3 = new JPanel();
      var3.setLayout(new BoxLayout(var3, 3));
      JPanel var4 = new JPanel(new FlowLayout(0));
      var4.add(new JLabel("Field Name:"));
      JTextField var5 = new JTextField();
      var4.add(var5);
      var5.setPreferredSize(new Dimension(150, 18));
      JPanel var6 = new JPanel(new FlowLayout(0));
      var6.add(new JLabel("MinValue:"));
      JTextField var7 = new JTextField("-15.00");
      var6.add(var7);
      JPanel var8 = new JPanel(new FlowLayout(0));
      var8.add(new JLabel("MaxValue:"));
      JTextField var9 = new JTextField("15.00");
      var8.add(var9);
      JPanel var10 = new JPanel(new FlowLayout());
      JButton var11 = new JButton("Ok");
      var11.addActionListener(new mrz$36$1(this, var7, var9, var5, var2));
      JButton var12 = new JButton("Cancel");
      var12.addActionListener(new mrz$36$2(this, var2));
      var10.add(var11);
      var10.add(var12);
      var3.add(var4);
      var3.add(var6);
      var3.add(var8);
      var3.add(var10);
      var2.add(var3);
      var2.setVisible(true);
   }
}
