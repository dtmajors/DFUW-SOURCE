/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class lct
extends JFrame {
    JButton qEJ;
    private JFormattedTextField qEK;
    private JLabel qEL;
    private JFormattedTextField qEM;
    private JFormattedTextField qEN;
    private JLabel qEO;
    private JFormattedTextField qEP;
    private JFormattedTextField qEQ;
    private JFormattedTextField qER;
    private JLabel qES;
    private JLabel I;
    private JLabel P;
    private JLabel S;
    private JLabel T;

    public lct() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.b();
        this.setLocationRelativeTo(null);
    }

    private void b() {
        this.qEL = new JLabel();
        this.qEO = new JLabel();
        this.qEP = new JFormattedTextField();
        this.qEJ = new JButton();
        this.qES = new JLabel();
        this.qEQ = new JFormattedTextField();
        this.qEK = new JFormattedTextField();
        this.I = new JLabel();
        this.P = new JLabel();
        this.qEM = new JFormattedTextField();
        this.S = new JLabel();
        this.qEN = new JFormattedTextField();
        this.T = new JLabel();
        this.qER = new JFormattedTextField();
        a a2 = new a(this);
        this.setDefaultCloseOperation(3);
        this.qEL.setText("Lat");
        this.qEO.setText("Lon");
        try {
            this.qEP.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##")));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        this.qEP.setToolTipText("minutes");
        this.qEJ.setText("GO");
        this.qEJ.addActionListener(a2);
        this.qES.setFont(new Font("Tahoma", 0, 24));
        this.qES.setHorizontalAlignment(0);
        this.qES.setText("Tile");
        this.qES.setToolTipText("if a \"?\" is displayed then the coordinates are outside the known world.");
        try {
            this.qEQ.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##")));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        this.qEQ.setToolTipText("seconds");
        try {
            this.qEK.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("?")));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        this.qEK.setToolTipText("E or W");
        this.I.setText("'");
        this.P.setText("\"");
        try {
            this.qEM.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##")));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        this.qEM.setToolTipText("minutes");
        this.S.setText("'");
        try {
            this.qEN.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##")));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        this.qEN.setToolTipText("seconds");
        this.T.setText("\"");
        try {
            this.qER.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("?")));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        this.qER.setToolTipText("N or S");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.qES, GroupLayout.Alignment.LEADING, -1, 173, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.qEO).addComponent(this.qEL)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.qEP, -2, 23, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qEQ, -2, 23, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qEK, -2, 23, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.qEM, -2, 23, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.S).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qEN, -2, 23, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.T).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qER, -2, 23, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qEJ, -2, 55, -2))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.qEO).addComponent(this.qEP, -2, -1, -2).addComponent(this.qEQ, -2, -1, -2).addComponent(this.I).addComponent(this.P).addComponent(this.qEK, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.qEL).addComponent(this.qEM, -2, -1, -2).addComponent(this.qEN, -2, -1, -2).addComponent(this.S).addComponent(this.T).addComponent(this.qER, -2, -1, -2))).addComponent(this.qEJ, -2, 47, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qES).addContainerGap(-1, Short.MAX_VALUE)));
        this.pack();
    }

    void t(ActionEvent actionEvent) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        String string = "";
        try {
            n3 = Integer.parseInt(this.qEP.getText());
            n4 = Integer.parseInt(this.qEQ.getText());
        }
        catch (NumberFormatException numberFormatException) {
            this.qES.setText("Lon?");
            return;
        }
        string = this.qEK.getText();
        if ("w".equalsIgnoreCase(string)) {
            n3 *= -1;
            n4 *= -1;
        } else if (!"e".equalsIgnoreCase(string)) {
            this.qES.setText("Lon?");
            return;
        }
        n = n3 * 60 + n4 % 60;
        try {
            n3 = Integer.parseInt(this.qEM.getText());
            n4 = Integer.parseInt(this.qEN.getText());
        }
        catch (NumberFormatException numberFormatException) {
            this.qES.setText("Lat?");
            return;
        }
        string = this.qER.getText();
        if ("n".equalsIgnoreCase(string)) {
            n3 *= -1;
            n4 *= -1;
        } else if (!"s".equalsIgnoreCase(string)) {
            this.qES.setText("Lat?");
            return;
        }
        n2 = n3 * 60 + n4 % 60;
        lej lej2 = new lej();
        lej2.RH(n);
        lej2.RI(n2);
        ljq ljq2 = lcw.e((lej)lej2);
        lej lej3 = lcw.dW((ljq)ljq2);
        String string2 = "?";
        if (lej3.getX() >= 0 && lej3.getX() < lcw.fyk.rmN && lej3.getY() >= 0 && lej3.getY() < lcw.fyk.H) {
            string2 = lcw.f((lej)lej3);
        }
        this.qES.setText(string2);
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new lct().setVisible(true);
            }
        });
    }
}

