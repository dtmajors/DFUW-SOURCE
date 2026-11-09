/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.UIManager;

public class moi
implements Icon {
    public static final int UP = 0;
    public static final int DOWN = 1;
    private static final int DEFAULT_SIZE = 11;
    private Color DSD;
    private Color DSE;
    private Color DSF;
    private int size;
    private int direction;

    public moi(int n, boolean bl, boolean bl2) {
        if (bl) {
            if (bl2) {
                this.a(UIManager.getColor("controlLtHighlight"), UIManager.getColor("controlDkShadow"), UIManager.getColor("controlShadow"), 11, n);
            } else {
                this.a(UIManager.getColor("controlHighlight"), UIManager.getColor("controlShadow"), UIManager.getColor("control"), 11, n);
            }
        } else if (bl2) {
            this.a(UIManager.getColor("controlDkShadow"), UIManager.getColor("controlLtHighlight"), UIManager.getColor("controlShadow"), 11, n);
        } else {
            this.a(UIManager.getColor("controlShadow"), UIManager.getColor("controlHighlight"), UIManager.getColor("control"), 11, n);
        }
    }

    public moi(Color color, Color color2, Color color3, int n, int n2) {
        this.a(color, color2, color3, n, n2);
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n, int n2) {
        switch (this.direction) {
            case 1: {
                this.c(graphics, n, n2);
                break;
            }
            case 0: {
                this.d(graphics, n, n2);
            }
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

    private void a(Color color, Color color2, Color color3, int n, int n2) {
        this.DSD = color;
        this.DSE = color2;
        this.DSF = color3;
        this.size = n;
        this.direction = n2;
    }

    private void c(Graphics graphics, int n, int n2) {
        graphics.setColor(this.DSD);
        graphics.drawLine(n, n2, n + this.size - 1, n2);
        graphics.drawLine(n, n2 + 1, n + this.size - 3, n2 + 1);
        graphics.setColor(this.DSE);
        graphics.drawLine(n + this.size - 2, n2 + 1, n + this.size - 1, n2 + 1);
        int n3 = n + 1;
        int n4 = n2 + 2;
        int n5 = this.size - 6;
        while (n4 + 1 < n2 + this.size) {
            graphics.setColor(this.DSD);
            graphics.drawLine(n3, n4, n3 + 1, n4);
            graphics.drawLine(n3, n4 + 1, n3 + 1, n4 + 1);
            if (0 < n5) {
                graphics.setColor(this.DSF);
                graphics.drawLine(n3 + 2, n4, n3 + 1 + n5, n4);
                graphics.drawLine(n3 + 2, n4 + 1, n3 + 1 + n5, n4 + 1);
            }
            graphics.setColor(this.DSE);
            graphics.drawLine(n3 + n5 + 2, n4, n3 + n5 + 3, n4);
            graphics.drawLine(n3 + n5 + 2, n4 + 1, n3 + n5 + 3, n4 + 1);
            ++n3;
            n4 += 2;
            n5 -= 2;
        }
        graphics.setColor(this.DSD);
        graphics.drawLine(n + this.size / 2, n2 + this.size - 1, n + this.size / 2, n2 + this.size - 1);
    }

    private void d(Graphics graphics, int n, int n2) {
        graphics.setColor(this.DSD);
        int n3 = n + this.size / 2;
        graphics.drawLine(n3, n2, n3, n2);
        --n3;
        int n4 = n2 + 1;
        int n5 = 0;
        while (n4 + 3 < n2 + this.size) {
            graphics.setColor(this.DSD);
            graphics.drawLine(n3, n4, n3 + 1, n4);
            graphics.drawLine(n3, n4 + 1, n3 + 1, n4 + 1);
            if (0 < n5) {
                graphics.setColor(this.DSF);
                graphics.drawLine(n3 + 2, n4, n3 + 1 + n5, n4);
                graphics.drawLine(n3 + 2, n4 + 1, n3 + 1 + n5, n4 + 1);
            }
            graphics.setColor(this.DSE);
            graphics.drawLine(n3 + n5 + 2, n4, n3 + n5 + 3, n4);
            graphics.drawLine(n3 + n5 + 2, n4 + 1, n3 + n5 + 3, n4 + 1);
            --n3;
            n4 += 2;
            n5 += 2;
        }
        graphics.setColor(this.DSD);
        graphics.drawLine(n, n2 + this.size - 3, n + 1, n2 + this.size - 3);
        graphics.setColor(this.DSE);
        graphics.drawLine(n + 2, n2 + this.size - 2, n + this.size - 1, n2 + this.size - 2);
        graphics.drawLine(n, n2 + this.size - 1, n + this.size, n2 + this.size - 1);
    }
}

