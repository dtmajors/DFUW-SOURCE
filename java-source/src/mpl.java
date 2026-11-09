/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collections;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mpl
extends mkx {
    private JTextField DVq;
    private JTextField DVr;
    private JTextField DVs;
    private JTextField DVt;
    private JButton DVu;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    aux DEC = null;
    dsa DVv = null;
    private String DVw = null;

    public mpl(aux aux2, dsa dsa2) {
        super(false);
        this.setClosable(true);
        this.DVv = dsa2;
        this.DEC = aux2;
        this.b();
        this.c();
    }

    public mpl() {
        this.b();
        this.c();
    }

    private void b() {
        this.I = new JLabel();
        this.P = new JLabel();
        this.Q = new JLabel();
        this.R = new JLabel();
        this.DVq = new JTextField();
        this.S = new JLabel();
        this.DVr = new JTextField();
        this.DVs = new JTextField();
        this.DVt = new JTextField();
        this.DVu = new JButton();
        this.setTitle("Decal Properties...");
        this.I.setText("Texture");
        this.P.setText("Rotation");
        this.Q.setText("Scale");
        this.R.setText("Projection Depth");
        this.DVq.setText("0.5f");
        this.DVq.setToolTipText("This determines on which faces the decal is projected. Starting from the decal position all faces at 'Projection Depth' distance are checked.");
        this.S.setText("Offset");
        this.DVr.setText("0");
        this.DVr.setToolTipText("This is an integer that can be used to force sorting of ovelapping decals that have the same texture. Unfortunately the effects of this value can only be seen In game and not in the worldbuilder.  ");
        this.DVs.setText("0");
        this.DVs.setToolTipText("Rotation of the decal around its center in Degrees. Press Shift and move the mouse along the X-Axis to rotate from the Render Window.");
        this.DVt.setText("1.f");
        this.DVt.setToolTipText("Uniform scale of the decal. Press Space and move the mouse along the X-Axis to change the Scale from the Render Window.");
        this.DVu.setToolTipText("Select the decal texture here. It displays all the dds textures in dfdata\\texture\\dds\\ that contain the keyword \"decal\" in their name.");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.I, -2, 53, -2).addComponent(this.Q, -2, 51, -2).addComponent(this.P, -1, 53, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.DVt, -2, 73, -2).addComponent(this.DVs, -2, 73, -2)).addComponent(this.DVu, -2, 287, -2))).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.R, -2, 93, -2).addComponent(this.S)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.DVr).addComponent(this.DVq, -1, 69, Short.MAX_VALUE)))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I, -1, 31, Short.MAX_VALUE).addComponent(this.DVu, -2, 31, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P, -1, 26, Short.MAX_VALUE).addComponent(this.DVs, -2, -1, -2)).addGap(28, 28, 28).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.DVt, -2, -1, -2)).addGap(18, 29, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.R).addComponent(this.DVq, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.S).addComponent(this.DVr, -2, -1, -2)).addGap(33, 33, 33)));
        this.pack();
    }

    void c() {
        this.DVu.setText(this.DVv.getTextureName());
        this.DVu.addActionListener(new ActionListener(this){
            final /* synthetic */ mpl DVx;
            {
                this.DVx = mpl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = mpl.a(this.DVx);
                if (mpl.b(this.DVx) != null) {
                    mpl.c(this.DVx).setText(string);
                    this.DVx.DVv.setTextureName(string);
                    this.DVx.DVv.bxn();
                }
            }
        });
        this.DVt.addActionListener(new ActionListener(this){
            final /* synthetic */ mpl DVx;
            {
                this.DVx = mpl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpl.d(this.DVx).getText());
                this.DVx.DVv.l(new ljp(f, f));
                this.DVx.DVv.bxn();
            }
        });
        this.DVt.setText(String.valueOf(this.DVv.bxq().x));
        this.DVs.addActionListener(new ActionListener(this){
            final /* synthetic */ mpl DVx;
            {
                this.DVx = mpl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n = Integer.parseInt(mpl.e(this.DVx).getText());
                this.DVx.DVv.BK(n);
                this.DVx.DVv.bxn();
            }
        });
        this.DVs.setText(String.valueOf(this.DVv.bxr()));
        this.DVq.addActionListener(new ActionListener(this){
            final /* synthetic */ mpl DVx;
            {
                this.DVx = mpl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(mpl.f(this.DVx).getText());
                this.DVx.DVv.io(f);
                this.DVx.DVv.bxn();
            }
        });
        this.DVq.setText(String.valueOf(this.DVv.bxs()));
        this.DVr.addActionListener(new ActionListener(this){
            final /* synthetic */ mpl DVx;
            {
                this.DVx = mpl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n = Integer.parseInt(mpl.g(this.DVx).getText());
                this.DVx.DVv.BL(n);
                this.DVx.DVv.bxn();
            }
        });
        this.DVr.setText(String.valueOf(this.DVv.bxt()));
    }

    private String eIA() {
        String string = lcw.qLb + "Texture/dds";
        File file = new File(string);
        File[] fileArray = file.listFiles();
        aux aux2 = this.DEC;
        JDialog jDialog = new JDialog((Frame)aux2, true);
        jDialog.setTitle("Please Pick a texture");
        jDialog.setSize(new Dimension(300, 700));
        JPanel jPanel = new JPanel(new BorderLayout());
        Vector<String> vector = new Vector<String>();
        for (File file2 : fileArray) {
            if (!file2.getName().toLowerCase().contains("decal")) continue;
            vector.add(file2.getName());
        }
        Collections.sort(vector);
        JList jList = new JList(vector);
        JScrollPane jScrollPane = new JScrollPane(jList);
        JPanel jPanel2 = new JPanel(new FlowLayout(1));
        JButton jButton = new JButton("Ok");
        jButton.addActionListener(new ActionListener(this, jList, jDialog){
            final /* synthetic */ JList DVy;
            final /* synthetic */ JDialog DVz;
            final /* synthetic */ mpl DVx;
            {
                this.DVx = mpl2;
                this.DVy = jList;
                this.DVz = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpl.a(this.DVx, (String)this.DVy.getSelectedValue());
                this.DVz.dispose();
            }
        });
        JButton jButton2 = new JButton("Cancel");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog DVz;
            final /* synthetic */ mpl DVx;
            {
                this.DVx = mpl2;
                this.DVz = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DVz.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        this.DVw = null;
        jDialog.setVisible(true);
        return this.DVw;
    }

    static /* synthetic */ String a(mpl mpl2) {
        return mpl2.eIA();
    }

    static /* synthetic */ String b(mpl mpl2) {
        return mpl2.DVw;
    }

    static /* synthetic */ JButton c(mpl mpl2) {
        return mpl2.DVu;
    }

    static /* synthetic */ JTextField d(mpl mpl2) {
        return mpl2.DVt;
    }

    static /* synthetic */ JTextField e(mpl mpl2) {
        return mpl2.DVs;
    }

    static /* synthetic */ JTextField f(mpl mpl2) {
        return mpl2.DVq;
    }

    static /* synthetic */ JTextField g(mpl mpl2) {
        return mpl2.DVr;
    }

    static /* synthetic */ String a(mpl mpl2, String string) {
        mpl2.DVw = string;
        return mpl2.DVw;
    }
}

