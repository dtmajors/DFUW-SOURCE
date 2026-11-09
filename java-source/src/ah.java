/*
 * Decompiled with CFR.
 */
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JWindow;

public class ah
extends JWindow {
    Image dK;

    public ah(Frame frame, Image image) {
        super(frame);
        this.dK = image;
        this.setSize(650, 488);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = this.getBounds();
        this.setLocation((dimension.width - rectangle.width) / 2, (dimension.height - rectangle.height) / 2);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        if (this.dK != null) {
            graphics.drawImage(this.dK, 0, 0, this);
        }
    }
}

