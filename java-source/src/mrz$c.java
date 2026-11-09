import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

class mrz$c extends JPanel {
   private JTextField DXb;
   private JSlider DGv;
   private Double Epd;
   private Double Epe;
   private final Double Epf;
   private Object qrm;
   private boolean bdP;
   private final List<ActionListener> DDQ;

   public mrz$c(mrz var1, Object var2, Double var3, Double var4) {
      super(new FlowLayout());
      this.EoW = var1;
      this.DXb = null;
      this.DGv = null;
      this.Epd = -10.0;
      this.Epe = 15.0;
      this.Epf = 0.1;
      this.qrm = null;
      this.bdP = false;
      this.DDQ = new ArrayList<>();
      this.Epd = var3;
      this.Epe = var4;
      this.DXb = new JTextField();
      this.DXb.setPreferredSize(new Dimension(100, 15));
      this.DXb.addActionListener(new mrz$c$1(this, var1));
      this.DXb.addFocusListener(new mrz$c$2(this, var1));
      this.add(this.DXb);
      this.qrm = var2;
      this.DGv = new JSlider();
      this.DGv.setSize(new Dimension(100, 15));
      this.eMY();
      this.DGv.addChangeListener(new mrz$c$3(this, var1));
      this.add(new JLabel(this.Epd.toString()));
      this.add(this.DGv);
      this.add(new JLabel(this.Epe.toString()));
      this.setValue(var2);
   }

   private void eMX() {
      String var1 = this.DXb.getText();

      try {
         if (this.qrm instanceof Integer) {
            this.setValue(Integer.valueOf(var1));
         } else if (this.qrm instanceof Float) {
            this.setValue(Float.valueOf(var1));
         } else if (this.qrm instanceof Double) {
            this.setValue(Double.valueOf(var1));
         } else if (this.qrm instanceof Long) {
            this.setValue(Long.valueOf(var1));
         } else {
            lfn.b(5, this.getClass().getName(), "handleTextValueChanged() : unhandled value type");
         }
      } catch (Exception var3) {
         JOptionPane.showMessageDialog(this, "Invalid Input '" + var1 + "'");
         this.setValue(this.qrm);
      }
   }

   public void addActionListener(ActionListener var1) {
      this.DDQ.add(var1);
   }

   public Object getValue() {
      return this.qrm;
   }

   private void setValue(Object var1) {
      if (!this.bdP) {
         this.bdP = true;
         Object var2 = this.qrm;
         this.qrm = var1;
         if (this.qrm instanceof Double) {
            Double var3 = (Double)this.qrm;
            this.DXb.setText(var3.toString());
         } else {
            this.DXb.setText(var1.toString());
         }

         Double var7 = 0.0;
         if (this.qrm instanceof Double) {
            var7 = (Double)this.qrm;
         } else if (this.qrm instanceof Float) {
            var7 = ((Float)this.qrm).doubleValue();
         } else if (this.qrm instanceof Integer) {
            var7 = ((Integer)this.qrm).doubleValue();
         } else {
            if (!(this.qrm instanceof Long)) {
               lfn.b(5, this.getClass().getName(), "setValue() : unhandled value type");
               return;
            }

            var7 = ((Long)this.qrm).doubleValue();
         }

         int var4 = (int)((var7 - this.Epd) / this.Epf);
         this.DGv.setValue(var4);
         this.bdP = false;
         if (this.qrm != var2) {
            for (ActionListener var6 : this.DDQ) {
               var6.actionPerformed(new ActionEvent(this, 0, ""));
            }
         }
      }
   }

   private void eMY() {
      int var1 = (int)((this.Epe - this.Epd) / this.Epf);
      this.DGv.setMinimum(0);
      this.DGv.setMaximum(var1);
   }
}
