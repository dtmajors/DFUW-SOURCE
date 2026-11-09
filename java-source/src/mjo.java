/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

class mjo
extends JButton {
    private Color DDK = Color.WHITE;

    public void setColor(Color color) {
        this.DDK = color;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        graphics.setColor(this.DDK);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}

