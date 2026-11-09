/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class kzs
extends DefaultTreeCellRenderer {
    private Color qoG = new Color(50, 190, 100);
    private Color qoH = new Color(65, 110, 245);
    private Color qoI = new Color(155, 55, 60);
    private Color qoJ;
    private Color qoK = this.qoJ = new Color(255, 0, 255);
    private Color qov = Color.BLACK;

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n, boolean bl4) {
        lae lae2 = (lae)object;
        switch (lae2.getNodeType()) {
            case 19: {
                if (lae2.getValue() instanceof dia) {
                    this.setTextSelectionColor(this.qoG);
                    this.setTextNonSelectionColor(this.qoG);
                    break;
                }
                this.setTextSelectionColor(this.qoH);
                this.setTextNonSelectionColor(this.qoH);
                break;
            }
            case 20: {
                this.setTextSelectionColor(this.qoI);
                this.setTextNonSelectionColor(this.qoI);
                break;
            }
            case 21: {
                if (((dgj)lae2.getValue()).isRelationEffect()) {
                    this.setTextSelectionColor(this.qoJ);
                    this.setTextNonSelectionColor(this.qoJ);
                    break;
                }
                this.setTextSelectionColor(this.qoK);
                this.setTextNonSelectionColor(this.qoK);
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

