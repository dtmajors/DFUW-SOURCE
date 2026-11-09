/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mpz
extends mkx {
    private static final int DXt = 100000;
    private JButton DXu;
    private JButton DFA;
    private JSlider DXv;
    private JTextField DXw;
    private JSlider DXx;
    private JTextField DXy;
    private JSlider DXz;
    private JTextField DXA;
    private JSlider DXB;
    private JTextField DXC;
    private JSlider DXD;
    private JTextField DXE;
    private JButton DXF;
    private JSlider DXG;
    private JTextField DXH;
    private JToggleButton DXI;
    private JLabel DXJ;
    private JSlider DXK;
    private JTextField DXL;
    private JSlider DXM;
    private JTextField DXN;
    private JSlider DXO;
    private JTextField DXP;
    private JSlider DXQ;
    private JTextField DXR;
    private JSlider DXS;
    private JTextField DXT;
    private JButton DXU;
    private JCheckBox DXV;
    private JLabel J;
    private JLabel K;
    private JLabel L;
    private JLabel M;
    private JLabel N;
    private JLabel O;
    private JLabel DXW;
    private JLabel R;
    private JLabel S;
    private JLabel V;
    private JLabel Z;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JPanel ad;
    private JPanel bAw;
    private JPanel af;
    dsg DXX = null;
    aux DEC = null;
    public static mpz DXY = null;
    private JPanel DXZ;
    private JTextField DJj;

    public mpz(aux aux2, dsg dsg2) {
        super(false);
        this.setClosable(true);
        this.DXX = dsg2;
        this.DEC = aux2;
        this.b();
        this.c();
    }

    public mpz() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.DFA = new JButton();
        this.DXD = new JSlider();
        this.V = new JLabel();
        this.DXE = new JTextField();
        this.ad = new JPanel();
        this.DXF = new JButton();
        this.DXG = new JSlider();
        this.J = new JLabel();
        this.DXH = new JTextField();
        this.af = new JPanel();
        this.DXS = new JSlider();
        this.M = new JLabel();
        this.DXT = new JTextField();
        this.ac = new JPanel();
        this.DXu = new JButton();
        this.DXI = new JToggleButton();
        this.DXJ = new JLabel();
        this.DXV = new JCheckBox();
        this.DXU = new JButton();
        this.bN = new JPanel();
        this.R = new JLabel();
        this.DXv = new JSlider();
        this.DXw = new JTextField();
        this.Z = new JLabel();
        this.DXx = new JSlider();
        this.DXy = new JTextField();
        this.K = new JLabel();
        this.DXB = new JSlider();
        this.DXC = new JTextField();
        this.L = new JLabel();
        this.DXz = new JSlider();
        this.DXA = new JTextField();
        this.bAw = new JPanel();
        this.S = new JLabel();
        this.DXK = new JSlider();
        this.DXL = new JTextField();
        this.N = new JLabel();
        this.DXM = new JSlider();
        this.DXN = new JTextField();
        this.O = new JLabel();
        this.DXQ = new JSlider();
        this.DXR = new JTextField();
        this.DXW = new JLabel();
        this.DXO = new JSlider();
        this.DXP = new JTextField();
        this.setTitle("Light Properties...");
        this.aa.setBorder(BorderFactory.createEtchedBorder());
        this.DFA.setText("Light Color");
        this.DFA.setToolTipText("Press this button to select a color for the light");
        this.V.setText("Multiplier");
        this.DXE.setHorizontalAlignment(4);
        this.DXE.setText("1");
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.DFA, -2, 91, -2).addGap(18, 18, 18).addComponent(this.V).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DXD, -2, 144, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DXE, -2, 61, -2).addContainerGap(79, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.DXE, -2, -1, -2).addComponent(this.DXD, -2, -1, -2).addComponent(this.V).addComponent(this.DFA, -2, 34, -2)));
        this.ad.setBorder(BorderFactory.createEtchedBorder());
        this.DXF.setText("Flicker Color");
        this.DXF.setToolTipText("Press this button to select a color for the light");
        this.J.setText("Multiplier");
        this.DXH.setHorizontalAlignment(4);
        this.DXH.setText("1");
        GroupLayout groupLayout2 = new GroupLayout(this.ad);
        this.ad.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.DXF, -2, 91, -2).addGap(18, 18, 18).addComponent(this.J).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DXG, -2, 144, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DXH, -2, 62, -2).addContainerGap(78, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.DXH, -2, -1, -2).addComponent(this.DXG, -2, -1, -2).addComponent(this.J).addComponent(this.DXF, -2, 34, -2)));
        this.af.setBorder(BorderFactory.createEtchedBorder());
        this.M.setText("LightRange");
        this.DXT.setHorizontalAlignment(4);
        this.DXT.setText("1");
        GroupLayout groupLayout3 = new GroupLayout(this.af);
        this.af.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.M).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DXS, -2, 241, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DXT, -2, 60, -2).addContainerGap(80, Short.MAX_VALUE)));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.DXS, -2, -1, -2).addComponent(this.M).addComponent(this.DXT, -2, -1, -2)));
        this.ac.setBorder(BorderFactory.createEtchedBorder());
        this.DXu.setText("ClearPlane");
        this.DXu.setToolTipText("Press this button to reset the Cutoff Plane");
        this.DXu.setEnabled(false);
        this.DXI.setText("PickPlane");
        this.DXI.setToolTipText("Enters pick plane mode. Use Alt + Click + mouse drag in the Render window to pick a plane from the scene. The light will be cutoff behind this plane.");
        this.DXI.setEnabled(false);
        this.DXJ.setText("PlaneLabel");
        this.DXJ.setEnabled(false);
        this.DXV.setText("Use Plane");
        this.DXU.setText("Select");
        GroupLayout groupLayout4 = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.DXu).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DXI, -2, 80, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DXJ, -2, 105, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DXV).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DXU).addContainerGap(31, Short.MAX_VALUE)));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.DXu).addComponent(this.DXI).addComponent(this.DXJ).addComponent(this.DXV).addComponent(this.DXU)));
        this.bN.setBorder(BorderFactory.createTitledBorder("ColorFlicker Parameters"));
        this.R.setFont(new Font("Tahoma", 0, 12));
        this.R.setText("Amount");
        this.DXw.setHorizontalAlignment(4);
        this.DXw.setText("jTextField1");
        this.Z.setFont(new Font("Tahoma", 0, 12));
        this.Z.setText("Frequency");
        this.DXy.setHorizontalAlignment(4);
        this.DXy.setText("jTextField1");
        this.K.setFont(new Font("Tahoma", 0, 12));
        this.K.setText("Phase");
        this.DXC.setHorizontalAlignment(4);
        this.DXC.setText("jTextField1");
        this.L.setFont(new Font("Tahoma", 0, 12));
        this.L.setText("Noise");
        this.DXA.setHorizontalAlignment(4);
        this.DXA.setText("jTextField1");
        GroupLayout groupLayout5 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Z).addComponent(this.R).addComponent(this.K).addComponent(this.L)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DXz, GroupLayout.Alignment.TRAILING, -1, 282, Short.MAX_VALUE).addComponent(this.DXB, -1, 282, Short.MAX_VALUE).addComponent(this.DXx, -1, 282, Short.MAX_VALUE).addComponent(this.DXv, GroupLayout.Alignment.TRAILING, -1, 282, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.DXw, GroupLayout.Alignment.TRAILING, -1, 84, Short.MAX_VALUE).addComponent(this.DXy, GroupLayout.Alignment.TRAILING).addComponent(this.DXC, GroupLayout.Alignment.TRAILING).addComponent(this.DXA, GroupLayout.Alignment.TRAILING)).addContainerGap()));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.R).addComponent(this.DXv, -2, -1, -2).addComponent(this.DXw, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.Z).addComponent(this.DXx, -2, -1, -2).addComponent(this.DXy, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.K).addComponent(this.DXB, -2, -1, -2).addComponent(this.DXC, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.L).addComponent(this.DXz, -2, -1, -2).addComponent(this.DXA, -2, -1, -2))));
        this.bAw.setBorder(BorderFactory.createTitledBorder("RangeFlicker Parameters"));
        this.S.setFont(new Font("Tahoma", 0, 12));
        this.S.setText("Amount");
        this.DXL.setHorizontalAlignment(4);
        this.DXL.setText("jTextField1");
        this.N.setFont(new Font("Tahoma", 0, 12));
        this.N.setText("Frequency");
        this.DXN.setHorizontalAlignment(4);
        this.DXN.setText("jTextField1");
        this.O.setFont(new Font("Tahoma", 0, 12));
        this.O.setText("Phase");
        this.DXR.setHorizontalAlignment(4);
        this.DXR.setText("jTextField1");
        this.DXW.setFont(new Font("Tahoma", 0, 12));
        this.DXW.setText("Noise");
        this.DXP.setHorizontalAlignment(4);
        this.DXP.setText("jTextField1");
        GroupLayout groupLayout6 = new GroupLayout(this.bAw);
        this.bAw.setLayout(groupLayout6);
        groupLayout6.setHorizontalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addContainerGap().addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.N).addComponent(this.S).addComponent(this.O).addComponent(this.DXW)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DXO, GroupLayout.Alignment.TRAILING, -1, 282, Short.MAX_VALUE).addComponent(this.DXQ, GroupLayout.Alignment.TRAILING, -1, 282, Short.MAX_VALUE).addComponent(this.DXM, GroupLayout.Alignment.TRAILING, -1, 282, Short.MAX_VALUE).addComponent(this.DXK, GroupLayout.Alignment.TRAILING, -1, 282, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.DXL, GroupLayout.Alignment.TRAILING, -1, 84, Short.MAX_VALUE).addComponent(this.DXN, GroupLayout.Alignment.TRAILING).addComponent(this.DXR, GroupLayout.Alignment.TRAILING).addComponent(this.DXP, GroupLayout.Alignment.TRAILING)).addContainerGap()));
        groupLayout6.setVerticalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.S).addComponent(this.DXK, -2, -1, -2).addComponent(this.DXL, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.N).addComponent(this.DXM, -2, -1, -2).addComponent(this.DXN, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.O).addComponent(this.DXQ, -2, -1, -2).addComponent(this.DXR, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.DXW).addComponent(this.DXO, -2, -1, -2).addComponent(this.DXP, -2, -1, -2))));
        this.DXZ = new JPanel();
        GroupLayout groupLayout7 = new GroupLayout(this.getContentPane());
        groupLayout7.setHorizontalGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout7.createSequentialGroup().addContainerGap().addGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bN, -1, -1, Short.MAX_VALUE).addComponent(this.af, GroupLayout.Alignment.CENTER, -1, -1, Short.MAX_VALUE).addComponent(this.aa, GroupLayout.Alignment.CENTER, -1, -1, Short.MAX_VALUE).addComponent(this.ad, GroupLayout.Alignment.CENTER, -1, -1, Short.MAX_VALUE).addComponent(this.ac, GroupLayout.Alignment.CENTER, -1, -1, Short.MAX_VALUE).addComponent(this.bAw, -1, -1, Short.MAX_VALUE).addComponent(this.DXZ, -2, 506, -2)).addContainerGap()));
        groupLayout7.setVerticalGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout7.createSequentialGroup().addComponent(this.af, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.aa, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ad, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ac, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bN, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAw, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DXZ, -1, 22, Short.MAX_VALUE).addContainerGap()));
        JLabel jLabel = new JLabel("Fade protection");
        this.DXZ.add(jLabel);
        this.DJj = new JTextField();
        this.DJj.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.a(this.DYa).getText());
                if (f > 800.0f) {
                    f = 800.0f;
                    mpz.a(this.DYa).setText("800");
                }
                if (f < 0.0f) {
                    f = 0.0f;
                    mpz.a(this.DYa).setText("0.0");
                }
                float f2 = f;
                this.DYa.DEC.b(new Runnable(this, f2){
                    final /* synthetic */ float DYb;
                    final /* synthetic */ 1 DYc;
                    {
                        this.DYc = var1_1;
                        this.DYb = f;
                    }

                    public void run() {
                        this.DYc.DYa.DXX.gt(this.DYb);
                    }
                });
            }
        });
        this.DJj.setText("0");
        this.DXZ.add(this.DJj);
        this.DJj.setColumns(10);
        this.getContentPane().setLayout(groupLayout7);
        this.pack();
    }

    private void c() {
        this.setTitle(this.getTitle() + " Light GUID : " + this.DXX.getGUID().toString());
        this.DXS.setMinimum(1);
        this.DXS.setMaximum(2000);
        this.DXT.setText(String.valueOf(this.DXX.bxE().getRange()));
        this.eIZ().setText(String.valueOf(this.DXX.bxE().bmI()));
        mjm.a(this.DXS, this.DXT, 100.0f);
        this.DXT.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.b(this.DYa).getText());
                if (f > 800.0f) {
                    f = 800.0f;
                    mpz.b(this.DYa).setText("800");
                }
                if (f < 0.1f) {
                    f = 0.1f;
                    mpz.b(this.DYa).setText("0.1");
                }
                float f2 = f;
                this.DYa.DEC.b(new Runnable(this, f2){
                    final /* synthetic */ float DYo;
                    final /* synthetic */ 12 DYp;
                    {
                        this.DYp = var1_1;
                        this.DYo = f;
                    }

                    public void run() {
                        this.DYp.DYa.DXX.setRange(this.DYo);
                    }
                });
            }
        });
        this.DXD.setMinimum(-300);
        this.DXD.setMaximum(300);
        this.DXE.setText(String.valueOf(this.DXX.bxE().getColorMultiplier()));
        mjm.a(this.DXD, this.DXE, 100.0f);
        this.DXE.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.c(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYq;
                    final /* synthetic */ 13 DYr;
                    {
                        this.DYr = var1_1;
                        this.DYq = f;
                    }

                    public void run() {
                        this.DYr.DYa.DXX.bxE().setColorMultiplier(this.DYq);
                    }
                });
            }
        });
        this.DXG.setMinimum(-300);
        this.DXG.setMaximum(300);
        this.DXH.setText(String.valueOf(this.DXX.bxE().getFlickerColorMultiplier()));
        mjm.a(this.DXG, this.DXH, 100.0f);
        this.DXH.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.d(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYq;
                    final /* synthetic */ 14 DYs;
                    {
                        this.DYs = var1_1;
                        this.DYq = f;
                    }

                    public void run() {
                        this.DYs.DYa.DXX.bxE().setFlickerColorMultiplier(this.DYq);
                    }
                });
            }
        });
        this.DXv.setMinimum(0);
        this.DXv.setMaximum(100);
        this.DXw.setText(String.valueOf(this.DXX.bxE().bmJ().x));
        mjm.a(this.DXv, this.DXw, 100.0f);
        this.DXw.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.e(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 15 DYt;
                    {
                        this.DYt = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYt.DYa.DXX.bxE().bmJ();
                        ljr2.x = this.DYd;
                        this.DYt.DYa.DXX.bxE().c(ljr2);
                    }
                });
            }
        });
        this.DXx.setMinimum(0);
        this.DXx.setMaximum(2000);
        this.DXy.setText(String.valueOf(this.DXX.bxE().bmJ().y));
        mjm.a(this.DXx, this.DXy, 100.0f);
        this.DXy.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.f(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 16 DYu;
                    {
                        this.DYu = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYu.DYa.DXX.bxE().bmJ();
                        ljr2.y = this.DYd;
                        this.DYu.DYa.DXX.bxE().c(ljr2);
                    }
                });
            }
        });
        this.DXB.setMinimum(0);
        this.DXB.setMaximum(628);
        this.DXC.setText(String.valueOf(this.DXX.bxE().bmJ().rlV));
        mjm.a(this.DXB, this.DXC, 100.0f);
        this.DXC.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.g(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 17 DYv;
                    {
                        this.DYv = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYv.DYa.DXX.bxE().bmJ();
                        ljr2.rlV = this.DYd;
                        this.DYv.DYa.DXX.bxE().c(ljr2);
                    }
                });
            }
        });
        this.DXz.setMinimum(0);
        this.DXz.setMaximum(100);
        this.DXA.setText(String.valueOf(this.DXX.bxE().bmJ().rlW));
        mjm.a(this.DXz, this.DXA, 100.0f);
        this.DXA.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.h(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 18 DYw;
                    {
                        this.DYw = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYw.DYa.DXX.bxE().bmJ();
                        ljr2.rlW = this.DYd;
                        this.DYw.DYa.DXX.bxE().c(ljr2);
                    }
                });
            }
        });
        this.DXK.setMinimum(0);
        this.DXK.setMaximum(100);
        this.DXL.setText(String.valueOf(this.DXX.bxE().bmK().x));
        mjm.a(this.DXK, this.DXL, 100.0f);
        this.DXL.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.i(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 19 DYx;
                    {
                        this.DYx = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYx.DYa.DXX.bxE().bmK();
                        ljr2.x = this.DYd;
                        this.DYx.DYa.DXX.bxE().d(ljr2);
                    }
                });
            }
        });
        this.DXM.setMinimum(0);
        this.DXM.setMaximum(2000);
        this.DXN.setText(String.valueOf(this.DXX.bxE().bmK().y));
        mjm.a(this.DXM, this.DXN, 100.0f);
        this.DXN.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.j(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 2 DYe;
                    {
                        this.DYe = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYe.DYa.DXX.bxE().bmK();
                        ljr2.y = this.DYd;
                        this.DYe.DYa.DXX.bxE().d(ljr2);
                    }
                });
            }
        });
        this.DXQ.setMinimum(0);
        this.DXQ.setMaximum(628);
        this.DXR.setText(String.valueOf(this.DXX.bxE().bmK().rlV));
        mjm.a(this.DXQ, this.DXR, 100.0f);
        this.DXR.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.k(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 3 DYf;
                    {
                        this.DYf = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYf.DYa.DXX.bxE().bmK();
                        ljr2.rlV = this.DYd;
                        this.DYf.DYa.DXX.bxE().d(ljr2);
                    }
                });
            }
        });
        this.DXO.setMinimum(0);
        this.DXO.setMaximum(100);
        this.DXP.setText(String.valueOf(this.DXX.bxE().bmK().rlW));
        mjm.a(this.DXO, this.DXP, 100.0f);
        this.DXP.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpz.l(this.DYa).getText());
                this.DYa.DEC.b(new Runnable(this, f){
                    final /* synthetic */ float DYd;
                    final /* synthetic */ 4 DYg;
                    {
                        this.DYg = var1_1;
                        this.DYd = f;
                    }

                    public void run() {
                        ljr ljr2 = this.DYg.DYa.DXX.bxE().bmK();
                        ljr2.rlW = this.DYd;
                        this.DYg.DYa.DXX.bxE().d(ljr2);
                    }
                });
            }
        });
        this.DFA.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                lco lco2 = this.DYa.DXX.bxE().bmL();
                Color color = new Color(lco2.qwk, lco2.qwl, lco2.qwm);
                mjp mjp2 = new mjp(color, "Choose Color for light ");
                mpz.m(this.DYa).setBackground(color);
                mjp2.getColorSelectionModel().addChangeListener(new ChangeListener(this, mjp2){
                    final /* synthetic */ mjp DYh;
                    final /* synthetic */ 5 DYi;
                    {
                        this.DYi = var1_1;
                        this.DYh = mjp2;
                    }

                    public final void stateChanged(ChangeEvent changeEvent) {
                        lco lco2 = new lco(this.DYh.getColor());
                        this.DYi.DYa.DEC.b(new Runnable(this, lco2){
                            final /* synthetic */ lco DYj;
                            final /* synthetic */ 1 DYk;
                            {
                                this.DYk = var1_1;
                                this.DYj = lco2;
                            }

                            public void run() {
                                this.DYk.DYi.DYa.DXX.bxE().g(this.DYj);
                            }
                        });
                        mpz.m(this.DYi.DYa).setBackground(this.DYh.getColor());
                    }
                });
                this.DYa.DEC.eCu().add(mjp2);
                mjp2.setVisible(true);
            }
        });
        this.DFA.setBackground(this.DXX.bxE().bmL().emK());
        this.DXF.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                lco lco2 = this.DYa.DXX.bxE().bmM();
                Color color = new Color(lco2.qwk, lco2.qwl, lco2.qwm);
                mjp mjp2 = new mjp(color, "Choose Color for light ");
                mpz.n(this.DYa).setBackground(color);
                mjp2.getColorSelectionModel().addChangeListener(new ChangeListener(this, mjp2){
                    final /* synthetic */ mjp DYh;
                    final /* synthetic */ 6 DYl;
                    {
                        this.DYl = var1_1;
                        this.DYh = mjp2;
                    }

                    public final void stateChanged(ChangeEvent changeEvent) {
                        lco lco2 = new lco(this.DYh.getColor());
                        this.DYl.DYa.DEC.b(new Runnable(this, lco2){
                            final /* synthetic */ lco DYj;
                            final /* synthetic */ 1 DYm;
                            {
                                this.DYm = var1_1;
                                this.DYj = lco2;
                            }

                            public void run() {
                                this.DYm.DYl.DYa.DXX.bxE().h(this.DYj);
                            }
                        });
                        mpz.n(this.DYl.DYa).setBackground(this.DYh.getColor());
                    }
                });
                this.DYa.DEC.eCu().add(mjp2);
                mjp2.setVisible(true);
            }
        });
        this.DXF.setBackground(this.DXX.bxE().bmM().emK());
        this.DXI.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (!mpz.o(this.DYa).isSelected()) {
                    DXY = null;
                } else {
                    this.DYa.eIY();
                }
            }
        });
        this.DXu.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DYa.p(new ljr(0.0f, 0.0f, 0.0f, 0.0f));
            }
        });
        this.DXV.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JCheckBox jCheckBox = (JCheckBox)actionEvent.getSource();
                this.DYa.DXX.jm(jCheckBox.isSelected());
            }
        });
        this.DXV.setSelected(this.DXX.bxH());
        this.DXU.addActionListener(new ActionListener(this){
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (this.DYa.DXX.bxI() != null) {
                    this.DYa.DEC.nG(this.DYa.DXX.bxI().getGUID());
                }
            }
        });
    }

    void eIY() {
        DXY = this;
    }

    public void p(ljr ljr2) {
        this.DEC.b(new Runnable(this, ljr2){
            final /* synthetic */ ljr DYn;
            final /* synthetic */ mpz DYa;
            {
                this.DYa = mpz2;
                this.DYn = ljr2;
            }

            public void run() {
                this.DYa.DXX.bxE().e(this.DYn);
            }
        });
        this.DXJ.setText("[" + ljr2.getX() + "," + ljr2.getY() + "," + ljr2.bdV() + "," + ljr2.eqM() + "]");
        this.DXI.setSelected(false);
    }

    public JTextField eIZ() {
        return this.DJj;
    }

    static /* synthetic */ JTextField a(mpz mpz2) {
        return mpz2.DJj;
    }

    static /* synthetic */ JTextField b(mpz mpz2) {
        return mpz2.DXT;
    }

    static /* synthetic */ JTextField c(mpz mpz2) {
        return mpz2.DXE;
    }

    static /* synthetic */ JTextField d(mpz mpz2) {
        return mpz2.DXH;
    }

    static /* synthetic */ JTextField e(mpz mpz2) {
        return mpz2.DXw;
    }

    static /* synthetic */ JTextField f(mpz mpz2) {
        return mpz2.DXy;
    }

    static /* synthetic */ JTextField g(mpz mpz2) {
        return mpz2.DXC;
    }

    static /* synthetic */ JTextField h(mpz mpz2) {
        return mpz2.DXA;
    }

    static /* synthetic */ JTextField i(mpz mpz2) {
        return mpz2.DXL;
    }

    static /* synthetic */ JTextField j(mpz mpz2) {
        return mpz2.DXN;
    }

    static /* synthetic */ JTextField k(mpz mpz2) {
        return mpz2.DXR;
    }

    static /* synthetic */ JTextField l(mpz mpz2) {
        return mpz2.DXP;
    }

    static /* synthetic */ JButton m(mpz mpz2) {
        return mpz2.DFA;
    }

    static /* synthetic */ JButton n(mpz mpz2) {
        return mpz2.DXF;
    }

    static /* synthetic */ JToggleButton o(mpz mpz2) {
        return mpz2.DXI;
    }
}

