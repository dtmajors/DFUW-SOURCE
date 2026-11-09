/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class kzo
extends DefaultTreeCellRenderer {
    private Color qou = new Color(50, 190, 100);
    private Color qov = new Color(128, 128, 128);
    private Color qow = new Color(255, 128, 0);
    private Color qox = new Color(128, 128, 128);
    private Color qoy = new Color(155, 55, 60);
    private Color qoz = new Color(65, 110, 245);

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n, boolean bl4) {
        int n2 = ((lae)object).getNodeType();
        switch (n2) {
            case 2: {
                this.setTextSelectionColor(this.qou);
                this.setTextNonSelectionColor(this.qou);
                break;
            }
            case 3: {
                this.setTextSelectionColor(this.qow);
                this.setTextNonSelectionColor(this.qow);
                break;
            }
            case 8: {
                this.setTextSelectionColor(this.qox);
                this.setTextNonSelectionColor(this.qox);
                break;
            }
            case 10: 
            case 11: {
                this.setTextSelectionColor(this.qoy);
                this.setTextNonSelectionColor(this.qoy);
                break;
            }
            case 22: {
                this.setTextSelectionColor(this.qoz);
                this.setTextNonSelectionColor(this.qoz);
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

