/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import org.jdesktop.layout.GroupLayout;

public class mog
extends JInternalFrame {
    private JSlider DRN;
    private JTextField DRO;
    private mkq DRP;
    private JTextField DRQ;
    private JPanel DRR;
    private JPanel DRS;
    private JSlider DRT;
    private JTextField DRU;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JPanel aa;
    private JPanel bN;
    private mof DRV = null;
    private aux DEC = null;
    private mjp DRW = null;
    private String DEV = ".jpg";

    public mog() {
        this.b();
    }

    public mog(mof mof2) {
        this.DRV = mof2;
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.DRQ = new JTextField();
        this.DRP = new mkq();
        this.DRS = new JPanel();
        this.P = new JLabel();
        this.DRT = new JSlider();
        this.DRU = new JTextField();
        this.Q = new JLabel();
        this.DRN = new JSlider();
        this.DRO = new JTextField();
        this.bN = new JPanel();
        this.DRR = new JPanel();
        this.setClosable(true);
        this.setTitle("ScatterObject Properties");
        this.addInternalFrameListener(new InternalFrameListener(this){
            final /* synthetic */ mog DRX;
            {
                this.DRX = mog2;
            }

            public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameClosed(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
                mog.a(this.DRX, internalFrameEvent);
            }

            public void internalFrameDeactivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameDeiconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameIconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameOpened(InternalFrameEvent internalFrameEvent) {
            }
        });
        this.I.setText("Filename:");
        this.DRQ.setEditable(false);
        GroupLayout groupLayout = new GroupLayout((Container)this.DRS);
        this.DRS.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 68, Short.MAX_VALUE));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 44, Short.MAX_VALUE));
        this.P.setText("Weighting(%):");
        this.DRT.setMajorTickSpacing(20);
        this.DRT.setMinorTickSpacing(5);
        this.DRT.setPaintLabels(true);
        this.DRT.setPaintTicks(true);
        this.DRU.setEditable(false);
        this.Q.setText("Distance(meters):");
        this.DRN.setMajorTickSpacing(10);
        this.DRN.setMaximum(30);
        this.DRN.setMinorTickSpacing(2);
        this.DRN.setPaintLabels(true);
        this.DRN.setPaintTicks(true);
        this.DRO.setEditable(false);
        GroupLayout groupLayout2 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((GroupLayout.Group)groupLayout2.createParallelGroup(2).add((Component)this.I).add((Component)this.P).add((Component)this.Q)).addPreferredGap(1).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.DRQ, -1, 278, Short.MAX_VALUE).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.DRN, -1, 217, Short.MAX_VALUE).add((Component)this.DRT, -1, 217, Short.MAX_VALUE)).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.DRU, -1, 55, Short.MAX_VALUE).add((Component)this.DRO, -1, 55, Short.MAX_VALUE))))).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.DRP, -2, -1, -2).addPreferredGap(0).add((Component)this.DRS, -1, -1, Short.MAX_VALUE))).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.I).add((Component)this.DRQ, -2, -1, -2)).add(33, 33, 33).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.P).add((Component)this.DRT, -2, -1, -2).add((Component)this.DRU, -2, -1, -2)).add(33, 33, 33).add((GroupLayout.Group)groupLayout2.createParallelGroup(2).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.Q).add((Component)this.DRN, -2, -1, -2)).add((Component)this.DRO, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.DRS, -1, -1, Short.MAX_VALUE).add((Component)this.DRP, -1, 44, Short.MAX_VALUE)).addContainerGap()));
        this.bN.setBorder(BorderFactory.createTitledBorder("Thumbnail preview"));
        this.DRR.setLayout(new BorderLayout());
        GroupLayout groupLayout3 = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).add((Component)this.DRR, -2, 293, -2)));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.DRR, -2, 273, -2).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.bN, -2, 312, -2).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.bN, -2, -1, -2).add((Component)this.aa, -2, -1, -2)).addContainerGap(15, Short.MAX_VALUE)));
        this.pack();
    }

    private void c(InternalFrameEvent internalFrameEvent) {
    }

    private void c() {
        if (this.DRV == null) {
            assert (false) : "Scatter object is null";
            return;
        }
        this.DRU.setText(Integer.toString(this.DRV.eHt()));
        this.DRO.setText(Integer.toString((int)this.DRV.eHr()));
        Color color = this.DRV.eHs();
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue());
        this.DRS.setBackground(color2);
        this.DRW = new mjp(color2, "Choose Preview Type color for [" + this.DRV.eHq() + "]");
        this.DRW.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mog DRX;
            {
                this.DRX = mog2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mog.b(this.DRX).g(mog.a(this.DRX).getColor());
                mog.c(this.DRX).setColor(mog.a(this.DRX).getColor());
                mog.d(this.DRX).setBackground(mog.a(this.DRX).getColor());
            }
        });
        this.DRP.c(this);
        this.DRP.a(this.DRW);
        this.DRT.setMinimum(0);
        this.DRT.setMaximum(100);
        this.DRT.setValue(this.DRV.eHt());
        this.DRT.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mog DRX;
            {
                this.DRX = mog2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mog.b(this.DRX).afa(mog.e(this.DRX).getValue());
                mog.f(this.DRX).setText(Integer.toString(mog.e(this.DRX).getValue()));
            }
        });
        this.DRN.setMinimum(0);
        this.DRN.setMaximum(30);
        this.DRN.setValue((int)this.DRV.eHr());
        this.DRN.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mog DRX;
            {
                this.DRX = mog2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mog.b(this.DRX).oB(mog.g(this.DRX).getValue());
                mog.h(this.DRX).setText(Integer.toString(mog.g(this.DRX).getValue()));
            }
        });
        this.DRQ.setText(this.DRV.eHq());
        String string = jry.tp(this.DRV.eHq());
        string = jry.tu(string) + ".xml";
        int n = string.lastIndexOf(".");
        if (n > 0) {
            File file = null;
            String string2 = lcw.qLb + "worldbuilder/thumbnails/" + string.substring(0, n);
            if (!string.substring(n).equalsIgnoreCase(this.DEV)) {
                file = new jrw(string2 + this.DEV);
            }
            if (this.DRV.eHv() != null) {
                this.DRR.add(new JLabel(this.DRV.eHv()));
            }
            if (file != null && file.exists()) {
                this.DRR.add(new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath()))));
            } else {
                lfn.b(0, "SFScatterObjectDialog", "initDialog() File does not exist = " + file);
            }
        }
    }

    static /* synthetic */ void a(mog mog2, InternalFrameEvent internalFrameEvent) {
        mog2.c(internalFrameEvent);
    }

    static /* synthetic */ mjp a(mog mog2) {
        return mog2.DRW;
    }

    static /* synthetic */ mof b(mog mog2) {
        return mog2.DRV;
    }

    static /* synthetic */ mkq c(mog mog2) {
        return mog2.DRP;
    }

    static /* synthetic */ JPanel d(mog mog2) {
        return mog2.DRS;
    }

    static /* synthetic */ JSlider e(mog mog2) {
        return mog2.DRT;
    }

    static /* synthetic */ JTextField f(mog mog2) {
        return mog2.DRU;
    }

    static /* synthetic */ JSlider g(mog mog2) {
        return mog2.DRN;
    }

    static /* synthetic */ JTextField h(mog mog2) {
        return mog2.DRO;
    }
}

