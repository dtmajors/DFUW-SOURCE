import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class mrz$f extends JPanel {
   private ljq Qi;
   private final JTextField Epj;
   private final JTextField Epk;
   private final JTextField Epl;
   private final List<ActionListener> DDQ;
   private boolean bdP;

   mrz$f(mrz var1, ljq var2) {
      super(new FlowLayout());
      this.EoW = var1;
      this.Qi = null;
      this.DDQ = new ArrayList<>();
      this.bdP = false;
      this.Epj = new JTextField("100000");
      this.Epk = new JTextField("100000");
      this.Epl = new JTextField("100000");
      this.Epj.setPreferredSize(new Dimension(40, 18));
      this.Epk.setPreferredSize(new Dimension(40, 18));
      this.Epl.setPreferredSize(new Dimension(40, 18));
      this.add(new JLabel("X:"));
      this.add(this.Epj);
      this.add(new JLabel("Y:"));
      this.add(this.Epk);
      this.add(new JLabel("Z:"));
      this.add(this.Epl);
      mrz$f$1 var3 = new mrz$f$1(this, var1);
      mrz$f$2 var4 = new mrz$f$2(this, var1);
      this.Epj.addActionListener(var3);
      this.Epj.addFocusListener(var4);
      this.Epk.addActionListener(var3);
      this.Epk.addFocusListener(var4);
      this.Epl.addActionListener(var3);
      this.Epl.addFocusListener(var4);
      this.aO(var2);
   }

   private void eNb() {
      try {
         float var1 = Float.parseFloat(this.Epj.getText());
         float var2 = Float.parseFloat(this.Epk.getText());
         float var3 = Float.parseFloat(this.Epl.getText());
         this.aO(new ljq(var1, var2, var3));
      } catch (NumberFormatException var4) {
      }
   }

   public void addActionListener(ActionListener var1) {
      this.DDQ.add(var1);
   }

   void aO(ljq var1) {
      if (!this.bdP) {
         this.bdP = true;
         ljq var2 = this.Qi;
         this.Qi = var1;
         this.Epj.setText(Float.toString(this.Qi.x));
         this.Epk.setText(Float.toString(this.Qi.y));
         this.Epl.setText(Float.toString(this.Qi.rlV));
         this.bdP = false;
         if (var2 == null || !var2.equals(this.Qi)) {
            for (ActionListener var4 : this.DDQ) {
               var4.actionPerformed(new ActionEvent(this, 0, ""));
            }
         }
      }
   }

   ljq bny() {
      return this.Qi;
   }
}
