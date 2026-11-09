/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class mma
extends mkx {
    private static final Dimension DJA = new Dimension(600, 700);
    private List DLW;
    private String gsj;
    private mkj DLX;

    public mma(String string, List list) {
        super(false);
        this.gsj = string;
        this.DLW = list;
        assert (this.DLW != null) : "AnimationSetFrames is null!";
        this.setTitle("Animation Bone names for Set [" + this.gsj + "]");
        this.setPreferredSize(DJA);
        this.setMinimumSize(DJA);
        this.setClosable(true);
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout(2));
        JPanel jPanel3 = new JPanel(new FlowLayout());
        this.f(jPanel);
        this.DGa.add((Component)jPanel3, "North");
        this.DGa.add((Component)jPanel, "Center");
        this.DGa.add((Component)jPanel2, "South");
    }

    private void f(JPanel jPanel) {
        mmc mmc2 = new mmc(this.DLW);
        this.DLX = new mkj(mmc2);
        this.DLX.setSelectionMode(0);
        JTableHeader jTableHeader = this.DLX.getTableHeader();
        this.DLX.setShowVerticalLines(true);
        this.DLX.setShowHorizontalLines(true);
        jTableHeader.setReorderingAllowed(false);
        jTableHeader.setVerifyInputWhenFocusTarget(true);
        mol mol2 = new mol();
        a a2 = new a(this);
        jTableHeader.addMouseListener(new mok(jTableHeader, mol2));
        TableColumnModel tableColumnModel = this.DLX.getColumnModel();
        int n = tableColumnModel.getColumnCount();
        for (int i = 0; i < n; ++i) {
            tableColumnModel.getColumn(i).setHeaderRenderer(mol2);
            tableColumnModel.getColumn(i).setCellRenderer(a2);
        }
        JScrollPane jScrollPane = new JScrollPane(this.DLX);
        jPanel.add(jScrollPane);
    }
}

