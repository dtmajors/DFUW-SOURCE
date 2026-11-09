/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.tree.TreeCellRenderer;

public class mop
extends JPanel
implements TreeCellRenderer {
    protected JCheckBox DSS;
    protected a DST;

    public mop() {
        this.setLayout(null);
        this.DSS = new JCheckBox();
        this.add(this.DSS);
        this.DST = new a(this);
        this.add(this.DST);
        this.DSS.setBackground(UIManager.getColor("Tree.textBackground"));
        this.DST.setForeground(UIManager.getColor("Tree.textForeground"));
    }

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n, boolean bl4) {
        String string = jTree.convertValueToText(object, bl, bl2, bl3, n, bl4);
        this.setEnabled(jTree.isEnabled());
        this.DSS.setSelected(((moo)object).isSelected());
        this.DST.setFont(jTree.getFont());
        this.DST.setText(string);
        this.DST.setSelected(bl);
        this.DST.no(bl4);
        if (bl3) {
            this.DST.setIcon(UIManager.getIcon("Tree.leafIcon"));
        } else if (bl2) {
            this.DST.setIcon(UIManager.getIcon("Tree.openIcon"));
        } else {
            this.DST.setIcon(UIManager.getIcon("Tree.closedIcon"));
        }
        return this;
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = this.DSS.getPreferredSize();
        Dimension dimension2 = this.DST.getPreferredSize();
        return new Dimension(dimension.width + dimension2.width, dimension.height < dimension2.height ? dimension2.height : dimension.height);
    }

    @Override
    public void doLayout() {
        Dimension dimension = this.DSS.getPreferredSize();
        Dimension dimension2 = this.DST.getPreferredSize();
        int n = 0;
        int n2 = 0;
        if (dimension.height < dimension2.height) {
            n = (dimension2.height - dimension.height) / 2;
        } else {
            n2 = (dimension.height - dimension2.height) / 2;
        }
        this.DSS.setLocation(0, n);
        this.DSS.setBounds(0, n, dimension.width, dimension.height);
        this.DST.setLocation(dimension.width, n2);
        this.DST.setBounds(dimension.width, n2, dimension2.width, dimension2.height);
    }

    @Override
    public void setBackground(Color color) {
        if (color instanceof ColorUIResource) {
            color = null;
        }
        super.setBackground(color);
    }
}

