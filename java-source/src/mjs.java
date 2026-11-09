/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mjs
extends JInternalFrame {
    private JTextField DDX;
    private JTextField DDY;
    private JTextField DDZ;
    private JTextField DEa;
    private JTextField DEb;
    private JButton G;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    private JPanel aa;
    private JPanel bN;

    public mjs() {
        this.b();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.P = new JLabel();
        this.DEa = new JTextField();
        this.DDX = new JTextField();
        this.Q = new JLabel();
        this.DDZ = new JTextField();
        this.DEb = new JTextField();
        this.R = new JLabel();
        this.S = new JLabel();
        this.DDY = new JTextField();
        this.bN = new JPanel();
        this.G = new JButton();
        this.setClosable(true);
        this.setTitle("Coords Converter");
        this.I.setText("South:");
        this.P.setText("East:");
        this.Q.setText("World Coords:");
        this.DDZ.setEditable(false);
        this.DEb.addActionListener(new ActionListener(this){
            final /* synthetic */ mjs DEc;
            {
                this.DEc = mjs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mjs.a(this.DEc, actionEvent);
            }
        });
        this.R.setText("'");
        this.S.setText("'");
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Q).addComponent(this.P).addComponent(this.I)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DDZ, -1, 311, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.DDX, GroupLayout.Alignment.LEADING).addComponent(this.DEa, GroupLayout.Alignment.LEADING, -1, 60, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout.createSequentialGroup().addComponent(this.R).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DEb, -2, 74, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.S).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DDY))))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DEa, -2, -1, -2).addComponent(this.R).addComponent(this.DEb, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.DDX, -2, -1, -2).addComponent(this.S).addComponent(this.DDY, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.DDZ, -2, -1, -2)).addContainerGap(19, Short.MAX_VALUE)));
        this.G.setText("Convert");
        this.G.addActionListener(new ActionListener(this){
            final /* synthetic */ mjs DEc;
            {
                this.DEc = mjs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mjs.b(this.DEc, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap(329, Short.MAX_VALUE).addComponent(this.G).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addComponent(this.G).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.aa, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.bN, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bN, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void x(ActionEvent actionEvent) {
        this.eCR();
    }

    private void y(ActionEvent actionEvent) {
    }

    private void eCR() {
        int n = 0;
        try {
            n = Integer.parseInt(this.DEa.getText());
        }
        catch (NumberFormatException numberFormatException) {
            this.DDZ.setText("incorrect format for south field");
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(this.DEb.getText());
        }
        catch (NumberFormatException numberFormatException) {
            this.DDZ.setText("incorrect format for SouthMinutes field");
            return;
        }
        int n3 = 0;
        try {
            n3 = Integer.parseInt(this.DDX.getText());
        }
        catch (NumberFormatException numberFormatException) {
            this.DDZ.setText("incorrect format for East field");
            return;
        }
        int n4 = 0;
        try {
            n4 = Integer.parseInt(this.DDY.getText());
        }
        catch (NumberFormatException numberFormatException) {
            this.DDZ.setText("incorrect format for EastMinutes field");
            return;
        }
        int n5 = n3 * 60 + n4 % 60;
        int n6 = n * 60 + n2 % 60;
        ljq ljq2 = lcw.e((lej)new lej(n5, n6));
        String string = lcw.dX((ljq)ljq2);
        String string2 = ljq2.toString() + " (" + string + ")";
        this.DDZ.setText(string2);
    }

    static /* synthetic */ void a(mjs mjs2, ActionEvent actionEvent) {
        mjs2.y(actionEvent);
    }

    static /* synthetic */ void b(mjs mjs2, ActionEvent actionEvent) {
        mjs2.x(actionEvent);
    }
}

