/*
 * Decompiled with CFR.
 */
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class mpk
extends JTabbedPane {
    public mpk(boolean bl) {
        System.out.println("*** Power User :" + bl);
        if (!bl) {
            this.setEnabled(false);
        }
    }

    public void a(String string, JPanel jPanel) {
        this.addTab(string, jPanel);
    }

    public void eIw() {
        if (this.eIy()) {
            int n = this.getSelectedIndex();
            if (n < this.getTabCount() - 1) {
                int n2 = n + 1;
                this.setSelectedIndex(n2);
            } else {
                this.setSelectedIndex(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Validation Failed.\nPlease Check if Everything Filled Correctly", "Error", 0);
        }
    }

    public void eIx() {
        int n = this.getSelectedIndex();
        if (n > 0) {
            int n2 = n - 1;
            this.setSelectedIndex(n2);
        }
    }

    private boolean eIy() {
        return true;
    }

    public boolean eIz() {
        return this.getSelectedIndex() == this.getTabCount() - 1;
    }
}

