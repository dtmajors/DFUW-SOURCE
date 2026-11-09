/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class kzp
extends DefaultTreeCellRenderer {
    private Color qov = Color.BLACK;
    private Color qoA = new Color(128, 128, 128);
    private Color qoB = new Color(155, 55, 60);
    private Color qoC = new Color(50, 190, 100);
    private Color qoD = new Color(65, 110, 245);
    private Color qoE = new Color(255, 128, 0);

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n, boolean bl4) {
        int n2 = ((lae)object).getNodeType();
        switch (n2) {
            case 5: {
                this.setTextSelectionColor(this.qoA);
                this.setTextNonSelectionColor(this.qoA);
                break;
            }
            case 7: {
                this.setTextSelectionColor(this.qoB);
                this.setTextNonSelectionColor(this.qoB);
                break;
            }
            case 12: {
                this.setTextSelectionColor(this.qoC);
                this.setTextNonSelectionColor(this.qoC);
                break;
            }
            case 13: {
                this.setTextSelectionColor(this.qoD);
                this.setTextNonSelectionColor(this.qoD);
                break;
            }
            case 14: {
                this.setTextSelectionColor(this.qoE);
                this.setTextNonSelectionColor(this.qoE);
                break;
            }
            default: {
                this.setTextSelectionColor(this.qov);
                this.setTextNonSelectionColor(this.qov);
            }
        }
        super.getTreeCellRendererComponent(jTree, object, bl, bl2, bl3, n, bl4);
        return this;
    }
}

