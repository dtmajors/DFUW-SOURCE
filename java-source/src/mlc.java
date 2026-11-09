/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import javax.swing.JTabbedPane;

public abstract class mlc
extends mkx {
    protected JTabbedPane DGH = new JTabbedPane();

    public mlc() {
        this.DGa.add((Component)this.DGH, "Center");
    }

    public void addTab(String string, Component component) {
        this.DGH.add(string, component);
    }

    public void a(Component component) {
        this.DGH.remove(component);
    }

    public mlc(boolean bl) {
        super(false);
        this.DGa.add((Component)this.DGH, "Center");
    }
}

