/*
 * Decompiled with CFR.
 */
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionListener;

public class mtz
extends JPanel {
    private JTextField EEU;
    private JList EEV;

    public mtz() {
        this.EEU = new JTextField();
        this.EEU.addActionListener(new ActionListener(this){
            final /* synthetic */ mtz EEW;
            {
                this.EEW = mtz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtz.a(this.EEW, actionEvent);
            }
        });
        this.EEU.setFont(UIManager.getFont("TextField.font"));
        this.EEU.setEnabled(true);
        this.EEU.setEditable(true);
        this.EEU.setToolTipText("Filter list item");
        this.EEU.setColumns(10);
        JButton jButton = new JButton("Filter");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mtz EEW;
            {
                this.EEW = mtz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtz.a(this.EEW, actionEvent);
            }
        });
        JButton jButton2 = new JButton("Clear");
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ mtz EEW;
            {
                this.EEW = mtz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtz.b(this.EEW, actionEvent);
            }
        });
        JScrollPane jScrollPane = new JScrollPane();
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.EEU, -2, 111, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton2, -2, 65, -2)).addComponent(jScrollPane, -1, 257, Short.MAX_VALUE)).addGap(0)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EEU, -2, -1, -2).addComponent(jButton).addComponent(jButton2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane, -1, 270, Short.MAX_VALUE).addGap(1)));
        this.EEV = new JList(new mty(new DefaultListModel()));
        this.EEV.setSelectionMode(0);
        jScrollPane.setViewportView(this.EEV);
        this.setLayout(groupLayout);
    }

    private void ck(ActionEvent actionEvent) {
        ((mty)this.EEV.getModel()).a(new muh(""));
    }

    private void cl(ActionEvent actionEvent) {
        String string = this.EEU.getText();
        ((mty)this.EEV.getModel()).a(new muh(string));
    }

    public mtz(boolean bl) {
        super(bl);
    }

    public mtz(LayoutManager layoutManager, boolean bl) {
        super(layoutManager, bl);
    }

    public Object ePr() {
        return this.EEV.getSelectedValue();
    }

    public void aO(Object object) {
        ((mty)this.EEV.getModel()).addElement(object);
        this.EEV.updateUI();
    }

    public void ePs() {
        ((mty)this.EEV.getModel()).removeAllElements();
        this.EEV.updateUI();
    }

    public void addListSelectionListener(ListSelectionListener listSelectionListener) {
        this.EEV.addListSelectionListener(listSelectionListener);
    }

    public void a(MouseAdapter mouseAdapter) {
        this.EEV.addMouseListener(mouseAdapter);
    }

    public void c(KeyListener keyListener) {
        this.EEV.addKeyListener(keyListener);
    }

    public void ePt() {
        this.EEV.clearSelection();
    }

    public void Do(String string) {
        this.EEV.setSelectedValue(string, true);
    }

    public void a(ListCellRenderer listCellRenderer) {
        this.EEV.setCellRenderer(listCellRenderer);
    }

    static /* synthetic */ void a(mtz mtz2, ActionEvent actionEvent) {
        mtz2.cl(actionEvent);
    }

    static /* synthetic */ void b(mtz mtz2, ActionEvent actionEvent) {
        mtz2.ck(actionEvent);
    }
}

