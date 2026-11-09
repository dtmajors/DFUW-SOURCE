/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.tree.TreePath;

public class lap
extends JFrame {
    private final lau qrn;
    private JTextField qte;
    private JButton qtf;
    private JButton qtg;
    private JPanel qmr;
    private JPanel qth;
    private JPanel qpe;
    private JList qti;
    private List qtj;

    public lap(lau lau2, Point point) {
        this.qrn = lau2;
        this.qmr = new JPanel();
        this.setContentPane(this.qmr);
        this.qmr.setLayout(new BorderLayout());
        this.qmr.add((Component)this.elE(), "North");
        this.qmr.add((Component)this.elF(), "Center");
        this.qte.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ lap qtk;
            {
                this.qtk = lap2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    lap.a(this.qtk);
                }
            }
        });
        this.setSize(500, 300);
        this.setLocation((int)point.getX() + 100, (int)point.getY() + 100);
        this.setVisible(true);
    }

    private JPanel elE() {
        this.qte = new JTextField(2);
        this.qtf = new JButton("Search");
        this.qtf.addActionListener(new ActionListener(this){
            final /* synthetic */ lap qtk;
            {
                this.qtk = lap2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                lap.a(this.qtk);
            }
        });
        this.qtg = new JButton("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ lap qtk;
            {
                this.qtk = lap2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qtk.setVisible(false);
            }
        });
        JPanel jPanel = new JPanel(new FlowLayout());
        jPanel.add(this.qtf);
        jPanel.add(this.qtg);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel2.add((Component)new JLabel("NodeName"), gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add((Component)this.qte, gridBagConstraints);
        gridBagConstraints.anchor = 13;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.0;
        jPanel2.add((Component)jPanel, gridBagConstraints);
        return jPanel2;
    }

    private JPanel elF() {
        JPanel jPanel = new JPanel();
        this.qti = new JList();
        this.qti.setSelectionMode(0);
        this.qti.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ lap qtk;
            {
                this.qtk = lap2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                int n = lap.b(this.qtk).locationToIndex(mouseEvent.getPoint());
                lap.a(this.qtk, n);
            }
        });
        this.qti.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ lap qtk;
            {
                this.qtk = lap2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    int n = lap.b(this.qtk).getSelectedIndex();
                    lap.a(this.qtk, n);
                }
            }
        });
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel.add((Component)new JScrollPane(this.qti), gridBagConstraints);
        return jPanel;
    }

    private void elG() {
        String string = this.qte.getText();
        if (string != null && string.trim() == "") {
            string = null;
        }
        this.qtj = this.qrn.yM(string);
        DefaultListModel defaultListModel = new DefaultListModel();
        for (int i = 0; i < this.qtj.size(); ++i) {
            defaultListModel.addElement(this.qtj.get(i));
        }
        this.qti.setModel(defaultListModel);
        if (this.qtj.size() <= 10) {
            this.qti.setVisibleRowCount(this.qtj.size());
        } else {
            this.qti.setVisibleRowCount(10);
        }
    }

    private void aby(int n) {
        if (n == -1) {
            lfn.b(0, "SFXMLSearchDialog", "showSelectedPath() List is empty.");
        } else {
            this.qrn.a((TreePath)this.qti.getSelectedValue());
        }
    }

    static /* synthetic */ void a(lap lap2) {
        lap2.elG();
    }

    static /* synthetic */ JList b(lap lap2) {
        return lap2.qti;
    }

    static /* synthetic */ void a(lap lap2, int n) {
        lap2.aby(n);
    }
}

