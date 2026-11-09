/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

public class moj
implements Icon {
    private Color DSG;
    private int size;

    public moj() {
        this(null, 11);
    }

    public moj(Color color, int n) {
        this.DSG = color;
        this.size = n;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n, int n2) {
        if (this.DSG != null) {
            graphics.setColor(this.DSG);
            graphics.drawRect(n, n2, this.size - 1, this.size - 1);
        }
    }

    @Override
    public int getIconWidth() {
        return this.size;
    }

    @Override
    public int getIconHeight() {
        return this.size;
    }
}

