/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.Caret;
import javax.swing.text.StyledDocument;

public class kyn
extends JFrame {
    private final int qlS = 320;
    private final int qlT = 225;
    private final kyr qkM;
    private JTextField qlU;
    private JRadioButton qlV;
    private JCheckBox qlW;
    private JCheckBox qlX;
    private kyy qlY = null;
    private kyv qlZ = null;
    private List<kyu> qma = lcn.emv();

    public kyn(kyr kyr2) {
        this.qkM = kyr2;
        this.eiQ();
        this.setSize(320, 225);
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter(this){
            final /* synthetic */ kyn qmb;
            {
                this.qmb = kyn2;
            }

            public void windowClosing(WindowEvent windowEvent) {
                kyn.a(this.qmb, null);
            }
        });
    }

    public void a(kyy kyy2) {
        assert (kyy2 != null);
        assert (this.qlY == null);
        this.qlY = kyy2;
        this.qlU.requestFocusInWindow();
        this.qlU.selectAll();
        this.setVisible(true);
    }

    private void eiQ() {
        JPanel jPanel = new JPanel();
        this.setContentPane(jPanel);
        JLabel jLabel = new JLabel("Find");
        this.qlU = new JTextField();
        this.qlU.setEditable(true);
        this.qlU.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ kyn qmb;
            {
                this.qmb = kyn2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    kyn.a(this.qmb);
                }
            }
        });
        JButton jButton = new JButton("Find");
        jButton.setMinimumSize(new Dimension(100, 20));
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ kyn qmb;
            {
                this.qmb = kyn2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kyn.a(this.qmb);
            }
        });
        JButton jButton2 = new JButton("Cancel");
        jButton2.setMinimumSize(new Dimension(100, 20));
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ kyn qmb;
            {
                this.qmb = kyn2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kyn.a(this.qmb, null);
                this.qmb.setVisible(false);
            }
        });
        JPanel jPanel2 = new JPanel(new GridLayout(1, 1, 4, 0));
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qlU, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.eiR(), gridBagConstraints);
        gridBagConstraints.gridx = 2;
        jPanel.add((Component)this.eiS(), gridBagConstraints);
        gridBagConstraints.anchor = 12;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        jPanel.add((Component)jPanel2, gridBagConstraints);
    }

    private JPanel eiR() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Direction"));
        jPanel.setLayout(new BoxLayout(jPanel, 3));
        this.qlV = new JRadioButton("Forward");
        this.qlV.setAlignmentX(0.0f);
        this.qlV.setSelected(true);
        JRadioButton jRadioButton = new JRadioButton("Backward");
        jRadioButton.setAlignmentX(0.0f);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.qlV);
        buttonGroup.add(jRadioButton);
        jPanel.add(this.qlV);
        jPanel.add(jRadioButton);
        return jPanel;
    }

    private JPanel eiS() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Options"));
        jPanel.setLayout(new BoxLayout(jPanel, 3));
        this.qlW = new JCheckBox("Case Sensitive");
        this.qlW.setAlignmentX(0.0f);
        this.qlW.setSelected(false);
        this.qlX = new JCheckBox("Wrap Search");
        this.qlX.setAlignmentX(0.0f);
        this.qlX.setSelected(true);
        jPanel.add(this.qlW);
        jPanel.add(this.qlX);
        return jPanel;
    }

    private void eiT() {
        kyv kyv2 = new kyv();
        kyv2.mHf = this.qlU.getText();
        kyv2.qmZ = this.qlV.isSelected();
        kyv2.qna = this.qlW.isSelected();
        kyv2.qnb = this.qlX.isSelected();
        if (this.qlZ == null || !this.qlZ.a(kyv2)) {
            lfn.b(0, "SFLogViewSearchDialog", "checkSearchConfig() NEW SEARCH  ......");
            this.qlZ = kyv2;
            this.eiV();
        } else {
            lfn.b(0, "SFLogViewSearchDialog", "checkSearchConfig()  ......");
            SwingUtilities.invokeLater(new Runnable(this){
                final /* synthetic */ kyn qmb;
                {
                    this.qmb = kyn2;
                }

                public void run() {
                    kyn.b(this.qmb);
                }
            });
        }
        lfn.b(0, "SFLogViewSearchDialog", "checkSearchConfig() DotPosition=" + this.qlY.ejO().ejI().getCaret().getDot());
    }

    private int al(int n, boolean bl) {
        assert (n >= 0);
        assert (!this.qma.isEmpty());
        if (bl) {
            int n2 = this.qma.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                kyu kyu2 = this.qma.get(i2);
                if (kyu2.qmX <= n) continue;
                lfn.b(0, "SFLogViewSearchDialog", "getCurrentMatchIndex() Match for index=" + i2 + " CaretPosition=" + n + " Match.StartIndex=" + kyu2.qmX);
                return i2;
            }
            lfn.b(0, "SFLogViewSearchDialog", "getCurrentMatchIndex() No match.");
            return -1;
        }
        for (int i3 = this.qma.size() - 1; i3 >= 0; --i3) {
            kyu kyu3 = this.qma.get(i3);
            if (kyu3.qmY >= n) continue;
            return i3;
        }
        return -1;
    }

    private synchronized void eiU() {
        StyledDocument styledDocument = (StyledDocument)this.qlY.ejO().ejI().getDocument();
        int n = this.qlY.ejO().ejI().getCaret().getDot();
        int n2 = styledDocument.getRootElements()[0].getElementIndex(n) + 1;
        int n3 = n + n2 - 1;
        int n4 = this.al(n3, this.qlZ.qmZ);
        lfn.b(0, "SFLogViewSearchDialog", "highlightPatternMatch() CaretPosition=" + n + " StartPosition=" + n3 + " PatternMatchIndex=" + n4);
        if (n4 < 0 && this.qlZ.qnb) {
            n3 = this.qlZ.qmZ ? 0 : this.qlY.ejO().ejI().getText().length();
            lfn.b(0, "SFLogViewSearchDialog", "highlightPatternMatch() Wrapped StartPosition=" + n3);
            n4 = this.al(n3, this.qlZ.qmZ);
        }
        if (n4 < 0) {
            lfn.b(0, "SFLogViewSearchDialog", "highlightPatternMatch() No match was found.");
            return;
        }
        kyu kyu2 = this.qma.get(n4);
        n2 = styledDocument.getRootElements()[0].getElementIndex(kyu2.qmX) + 1;
        lfn.b(0, "SFLogViewSearchDialog", "highlightPatternMatch() Showing: " + kyu2 + " on line " + n2);
        Caret caret = this.qlY.ejO().ejI().getCaret();
        lfn.b(0, "SFLogViewSearchDialog", "highlightPatternMatch() CaretPosition before: " + caret.getDot());
        caret.setDot(kyu2.qmX - n2 + 1);
        caret.moveDot(kyu2.qmY - n2 + 1);
        lfn.b(0, "SFLogViewSearchDialog", "highlightPatternMatch() CaretPosition after: " + caret.getDot());
    }

    private void eiV() {
        assert (this.qlZ != null);
        if (this.qlZ.mHf == null || this.qlZ.mHf.trim().equals("")) {
            return;
        }
        lfn.b(0, "SFLogViewSearchDialog", "performSearch() SearchText='" + this.qlZ.mHf + "'");
        Pattern pattern = null;
        pattern = this.qlW.isSelected() ? Pattern.compile(this.qlZ.mHf) : Pattern.compile(this.qlZ.mHf, 2);
        this.qma.clear();
        Matcher matcher = pattern.matcher(this.qlY.ejO().ejI().getText());
        while (matcher.find()) {
            kyu kyu2 = new kyu(matcher.start(), matcher.end());
            this.qma.add(kyu2);
        }
        if (!this.qma.isEmpty()) {
            SwingUtilities.invokeLater(new Runnable(this){
                final /* synthetic */ kyn qmb;
                {
                    this.qmb = kyn2;
                }

                public void run() {
                    kyn.b(this.qmb);
                }
            });
        }
    }

    static /* synthetic */ kyy a(kyn kyn2, kyy kyy2) {
        kyn2.qlY = kyy2;
        return kyn2.qlY;
    }

    static /* synthetic */ void a(kyn kyn2) {
        kyn2.eiT();
    }

    static /* synthetic */ void b(kyn kyn2) {
        kyn2.eiU();
    }
}

