/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

class mud
implements TreeCellRenderer {
    final JLabel EGb = new JLabel(" ");
    final JPanel EGc = new JPanel();
    final DefaultTreeCellRenderer EGd = new DefaultTreeCellRenderer();
    final Color backgroundSelectionColor;
    final Color backgroundNonSelectionColor;

    public mud() {
        this.EGb.setForeground(Color.black);
        this.EGb.setHorizontalAlignment(2);
        this.EGb.setVerticalAlignment(1);
        this.EGc.add(this.EGb);
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setVgap(1);
        this.EGc.setLayout(flowLayout);
        this.backgroundSelectionColor = this.EGd.getBackgroundSelectionColor();
        this.backgroundNonSelectionColor = this.EGd.getBackgroundNonSelectionColor();
    }

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n, boolean bl4) {
        Component component = null;
        if (n == 0) {
            mue mue2 = (mue)jTree.getModel();
            String string = mue2.ePE() != null ? "'" + mue2.ePE() + "' Items" : "Items";
            this.EGb.setText(string);
            this.EGb.setForeground(Color.black);
            this.EGc.setBackground(bl ? this.backgroundSelectionColor : this.backgroundNonSelectionColor);
            this.EGc.setEnabled(jTree.isEnabled());
            component = this.EGc;
        } else if (jTree.getModel().getRoot() instanceof muf && (object == ((muf)jTree.getModel().getRoot()).EGg || object == ((muf)jTree.getModel().getRoot()).EGh)) {
            muf muf2 = (muf)jTree.getModel().getRoot();
            assert (object instanceof ArrayList);
            if (object == muf2.EGg) {
                this.EGb.setText("Inventory");
            } else if (object == muf2.EGh) {
                this.EGb.setText("Skinning");
            }
            this.EGb.setForeground(Color.black);
            this.EGc.setBackground(bl ? this.backgroundSelectionColor : this.backgroundNonSelectionColor);
            this.EGc.setEnabled(jTree.isEnabled());
            component = this.EGc;
        } else if (object instanceof cto) {
            this.EGb.setForeground(Color.black);
            this.EGb.setToolTipText(null);
            cto cto2 = (cto)object;
            String string = lea.enW().getName(cto2.ResourceType);
            String string2 = "Res:'" + string;
            if (cto2.Probability > 0.0f) {
                string2 = string2 + "' Prob:" + cto2.Probability;
            }
            if (cto2.asi > 0) {
                string2 = string2 + " Q:" + cto2.asi;
            } else if (cto2.asi == 0) {
                if (cto2.dpS < 0 || cto2.dpT <= 0 || cto2.dpS > cto2.dpT) {
                    this.EGb.setForeground(Color.red);
                    this.EGb.setToolTipText("Invalid Min/Max quantities!");
                }
                string2 = string2 + " minQ:" + cto2.dpS + " maxQ:" + cto2.dpT;
            } else {
                this.EGb.setForeground(Color.red);
                this.EGb.setToolTipText("Invalid quantity!");
                string2 = string2 + " Q:" + cto2.asi;
            }
            this.EGb.setText(string2);
            this.EGc.setBackground(bl ? this.backgroundSelectionColor : this.backgroundNonSelectionColor);
            this.EGc.setEnabled(jTree.isEnabled());
            component = this.EGc;
        } else if (object instanceof ArrayList) {
            this.EGb.setForeground(Color.black);
            ArrayList arrayList = (ArrayList)object;
            float f2 = 0.0f;
            for (Object e2 : arrayList) {
                if (!(e2 instanceof cto)) continue;
                f2 += ((cto)e2).Probability;
            }
            this.EGc.setBackground(bl ? this.backgroundSelectionColor : this.backgroundNonSelectionColor);
            if (f2 > 1.0f) {
                this.EGb.setForeground(Color.red);
            }
            String string = "Random, Prob:" + f2;
            this.EGb.setText(string);
            this.EGc.setEnabled(jTree.isEnabled());
            component = this.EGc;
        } else {
            component = this.EGd.getTreeCellRendererComponent(jTree, object, bl, bl2, bl3, n, bl4);
        }
        return component;
    }
}

