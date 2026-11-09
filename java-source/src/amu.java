/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class amu
extends JFrame
implements PropertyChangeListener {
    private JButton bAW;
    private File bAX;
    private JTextField bAY;
    private JProgressBar bAZ;
    private JLabel I;
    private JLabel P;
    private JComboBox bBa;

    public static void main(String[] stringArray) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException classNotFoundException) {
            Logger.getLogger(amu.class.getName()).log(Level.SEVERE, null, classNotFoundException);
        }
        catch (InstantiationException instantiationException) {
            Logger.getLogger(amu.class.getName()).log(Level.SEVERE, null, instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            Logger.getLogger(amu.class.getName()).log(Level.SEVERE, null, illegalAccessException);
        }
        catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
            Logger.getLogger(amu.class.getName()).log(Level.SEVERE, null, unsupportedLookAndFeelException);
        }
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new amu().setVisible(true);
            }
        });
    }

    public amu() {
        lcw.qHF = 20;
        this.b();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if ("progress" == propertyChangeEvent.getPropertyName()) {
            int n = (Integer)propertyChangeEvent.getNewValue();
            this.bAZ.setValue(n);
            this.bAZ.setString(n + "%");
            if (n >= 100) {
                this.bAW.setEnabled(true);
                this.setCursor(new Cursor(0));
            }
        }
    }

    private void Hx() {
        this.bAW.setEnabled(false);
        this.setCursor(new Cursor(3));
        amt amt2 = new amt(this.bAX, (amt.a)((Object)this.bBa.getSelectedItem()));
        amt2.addPropertyChangeListener(this);
        amt2.execute();
    }

    private void m(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File("C:/DarkFall/Data/Dev/dfdata/xml-files/zones/spawn-distribution/"));
            int n = jFileChooser.showOpenDialog(this);
            if (n == 0) {
                this.bAX = jFileChooser.getSelectedFile();
                this.bAY.setText(this.bAX.getAbsolutePath());
            }
        }
    }

    private void b() {
        this.I = new JLabel();
        this.bAY = new JTextField();
        this.bAW = new JButton();
        this.P = new JLabel();
        this.bBa = new JComboBox();
        this.bAZ = new JProgressBar();
        a a2 = new a(this);
        this.setDefaultCloseOperation(3);
        this.setTitle("SFSpawnpointDistributor");
        this.setAlwaysOnTop(true);
        this.setLocationByPlatform(true);
        this.I.setText("Distribution File:");
        this.bAY.setToolTipText("Double click to select file (can be null)");
        this.bAY.addMouseListener(a2);
        this.bAW.setText("Distribute");
        this.bAW.addActionListener(a2);
        this.P.setText("Server:");
        this.bBa.setModel(new DefaultComboBoxModel<amt.a>(amt.a.values()));
        this.bAZ.setStringPainted(true);
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bAZ, -1, 256, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bBa, -2, 87, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bAW)).addGroup(groupLayout.createSequentialGroup().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAY, -1, 175, Short.MAX_VALUE))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.bAY, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bAW).addComponent(this.bBa, -2, -1, -2).addComponent(this.P)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAZ, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.pack();
    }

    static /* synthetic */ JButton a(amu amu2) {
        return amu2.bAW;
    }

    static /* synthetic */ void b(amu amu2) {
        amu2.Hx();
    }

    static /* synthetic */ JTextField c(amu amu2) {
        return amu2.bAY;
    }

    static /* synthetic */ void a(amu amu2, MouseEvent mouseEvent) {
        amu2.m(mouseEvent);
    }
}

