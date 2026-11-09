import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.MemoryImageSource;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class mkb$b extends JComponent implements PropertyChangeListener {
   private mkb$a DEQ;
   private JLabel DER;
   private final String DES;
   public final Dimension DET;
   public final Dimension DEU;
   private String DEV;
   private String DEW;
   Map<String, JButton> DEX;
   private JList DEY;

   public mkb$b(mkb var1, mkb var2, int var3) {
      this.DEO = var1;
      this.DEQ = null;
      this.DER = null;
      this.DES = "No Preview";
      this.DET = new Dimension(134, 128);
      this.DEU = new Dimension(128, 128);
      this.DEV = ".jpg";
      this.DEW = ".bmp";
      this.DEX = lcn.emw();
      this.DEY = null;
      var2.addPropertyChangeListener(this);
      this.setLayout(new BorderLayout());
      this.setPreferredSize(this.DET);
      this.setSize(this.DET);
      this.setMaximumSize(this.DET);
      this.setMinimumSize(this.DET);
      JPanel var4 = new JPanel(new BorderLayout());
      this.setBackground(Color.white);
      this.setForeground(Color.BLACK);
      this.setBorder(new EtchedBorder(1));
      this.DEQ = new mkb$a(var1, this.DEU);
      this.DEQ.setMinimumSize(new Dimension(128, 128));
      this.DER = new JLabel("No Preview");
      this.add(this.DER, "North");
      String[] var5 = new String[]{"32x32", "64x64", "96x96", "128x128", "256x256", "Classic"};
      JComboBox var6 = new JComboBox<>(var5);
      mkb.a(var1, var6);
      var6.setSelectedIndex(var3);
      var6.addActionListener(new mkb$b$1(this, var1));
      var4.add(this.DEQ, "North");
      var4.add(this.eDi(), "Center");
      this.add(var6, "North");
      this.add(var4, "Center");
   }

   public void eCY() {
      this.DEY.updateUI();
   }

   private JPanel eDi() {
      JPanel var1 = new JPanel(new BorderLayout());
      var1.setBorder(BorderFactory.createTitledBorder("Favorites..."));
      this.DEY = new JList();
      this.DEY.setModel(new mkb$b$5(this));
      this.DEY.setCellRenderer(new mkb$b$6(this));
      this.DEY.addListSelectionListener(new mkb$b$7(this));
      this.DEY.addMouseListener(new mkb$b$8(this));
      JScrollPane var2 = new JScrollPane(this.DEY);
      JPanel var3 = new JPanel(new GridLayout(3, 2));
      JButton var4 = new JButton("Add");
      JButton var5 = new JButton("Del");
      var3.add(var4);
      var4.addActionListener(new mkb$b$9(this));
      var3.add(var5);
      var5.addActionListener(new mkb$b$10(this));
      JButton var6 = new JButton("Up");
      JButton var7 = new JButton("Down");
      var3.add(var6);
      var6.addActionListener(new mkb$b$11(this));
      var3.add(var7);
      var7.addActionListener(new mkb$b$12(this));
      JCheckBox var8 = new JCheckBox("Multi");
      var3.add(var8);
      var8.addActionListener(new mkb$b$2(this, var8));
      JButton var9 = new JButton("Thumbs");
      var9.addActionListener(new mkb$b$3(this));
      var3.add(var9);
      var1.add(var2, "Center");
      var1.add(var3, "South");
      return var1;
   }

   private void eDj() {
      jrw[] var1 = this.DEO.eDe();
      dta var2 = (dta)mkb.b(this.DEO).am().get(mje.DAS);
      if (var2 != null && var2.bzz() == 0) {
         JDialog var3 = new JDialog();
         var3.setTitle("Thumb Params...");
         Dimension var4 = new Dimension(150, 100);
         var3.setPreferredSize(var4);
         var3.setMinimumSize(var4);
         var3.setMaximumSize(var4);
         var3.setLayout(new GridLayout(4, 2));
         var3.add(new JLabel("Angle Horz"));
         JTextField var5 = new JTextField();
         var5.setText("35");
         var3.add(var5);
         var3.add(new JLabel("Angle Vert"));
         JTextField var6 = new JTextField();
         var3.add(var6);
         var6.setText("20");
         var3.add(new JLabel("DistFactor"));
         JTextField var7 = new JTextField();
         var7.setText("1.5");
         var3.add(var7);
         JButton var8 = new JButton("Ok");
         var8.addActionListener(new mkb$b$4(this, var3));
         var3.add(var8);
         var3.setModal(true);
         var3.setVisible(true);
         int var9 = 35;

         try {
            var9 = Integer.parseInt(var5.getText());
         } catch (NumberFormatException var19) {
         }

         int var10 = 20;

         try {
            var10 = Integer.parseInt(var6.getText());
         } catch (NumberFormatException var18) {
         }

         float var11 = 1.5F;

         try {
            var11 = Float.parseFloat(var7.getText());
         } catch (NumberFormatException var17) {
         }

         ed var12 = new ed();
         var12.setGUID(var2.bzv());
         var12.Z(var9);
         var12.aa(var10);
         var12.j(var11);

         for (jrw var16 : var1) {
            var12.addFile(var16);
         }

         if (var1.length == 0 && this.DEO.eDc() != null) {
            var12.addFile(this.DEO.eDc());
         }

         var2.a(var12);
      } else {
         JOptionPane.showConfirmDialog(this, "no valid object space selected...");
      }
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      jrw var2 = null;
      if ("SelectedFilesChangedProperty".equals(var1.getPropertyName()) && mje.DAY) {
         File[] var3 = (File[])var1.getNewValue();
         if (var3 != null && var3.length > 0) {
            var2 = var3[var3.length - 1];
         }
      }

      if ("SelectedFileChangedProperty".equals(var1.getPropertyName()) && mje.DAY) {
         File var12 = (File)var1.getNewValue();
         if (var12 != null) {
            var2 = new jrw(var12.getAbsolutePath());
         }
      }

      if (var2 != null) {
         if (!var2.isDirectory() && var2.exists()) {
            this.DEO.DEB = new jrw(var2.getAbsolutePath());
            jrw var13 = new jrw(var2.getAbsolutePath());
            if (var13.getName().toLowerCase().endsWith(".xml")) {
               String var4 = jry.tr(var13.getAbsolutePath());
               this.DER.setText(mkb.h(this.DEO).tO(var4));
            } else {
               this.DER.setText("Not XML file");
            }

            String var14 = var2.getName();
            int var5 = var14.lastIndexOf(".");
            if (var5 > 0) {
               String var6 = lcw.qLb + "worldbuilder/thumbnails/" + var14.substring(0, var5);
               if (!var14.substring(var5).equalsIgnoreCase(this.DEV)) {
                  var2 = new jrw(var6 + this.DEV);
               }

               if (var2.exists()) {
                  Image var7 = Toolkit.getDefaultToolkit().getImage(var2.getAbsolutePath());
                  if (var7 != null) {
                     var7 = var7.getScaledInstance(this.DEU.width, this.DEU.height, 2);
                  }

                  this.DEQ.a(var7);
               } else {
                  var2 = var13;
                  if (!var14.substring(var5).equalsIgnoreCase(this.DEW)) {
                     var2 = new jrw(var6 + this.DEW);
                  }

                  if (var2.exists()) {
                     InputStream var15 = null;

                     try {
                        var15 = new FileInputStream(var2);
                        this.DEO.DEA.read(var15);
                     } catch (Exception var10) {
                        lfn.b(5, this.getClass().getName(), "File [" + var2 + "] not found!");
                        var10.printStackTrace();
                     }

                     MemoryImageSource var8 = this.DEO.DEA.dRP();
                     if (var8 != null) {
                        Image var9 = Toolkit.getDefaultToolkit().createImage(var8);
                        if (var9 != null) {
                           var9 = var9.getScaledInstance(this.DEU.width, this.DEU.height, 2);
                        }

                        this.DEQ.a(var9);
                     } else {
                        lfn.b(5, this.getClass().getName(), "Invalid BMP Format: " + var2.toString());
                        this.DEQ.a(null);
                     }
                  } else {
                     this.DEQ.a(null);
                  }
               }
            }
         } else {
            this.DEO.DEB = null;
            this.DEQ.a(null);
         }

         this.repaint();
      }
   }
}
