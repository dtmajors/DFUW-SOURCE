/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class mji
extends JDesktopPane {
    private static int DCB = 20;
    private mjh DCC = new mjh(this);

    public mji() {
        this.setDesktopManager(this.DCC);
        this.setDragMode(1);
    }

    @Override
    public void setBounds(int n, int n2, int n3, int n4) {
        super.setBounds(n, n2, n3, n4);
        this.ezK();
    }

    public Component a(JInternalFrame jInternalFrame) {
        Point point;
        JInternalFrame[] jInternalFrameArray = this.getAllFrames();
        Component component = super.add(jInternalFrame);
        this.ezK();
        if (jInternalFrameArray.length > 0) {
            point = jInternalFrameArray[0].getLocation();
            point.x += DCB;
            point.y += DCB;
        } else {
            point = new Point(0, 0);
        }
        jInternalFrame.setLocation(point.x, point.y);
        if (jInternalFrame.isResizable()) {
            int n = this.getWidth() - this.getWidth() / 3;
            int n2 = this.getHeight() - this.getHeight() / 3;
            if ((double)n < jInternalFrame.getMinimumSize().getWidth()) {
                n = (int)jInternalFrame.getMinimumSize().getWidth();
            }
            if ((double)n2 < jInternalFrame.getMinimumSize().getHeight()) {
                n2 = (int)jInternalFrame.getMinimumSize().getHeight();
            }
            jInternalFrame.setSize(n, n2);
        }
        this.moveToFront(jInternalFrame);
        jInternalFrame.setVisible(true);
        try {
            jInternalFrame.setSelected(true);
        }
        catch (PropertyVetoException propertyVetoException) {
            jInternalFrame.toBack();
        }
        return component;
    }

    @Override
    public void remove(Component component) {
        super.remove(component);
        this.ezK();
    }

    public void ezI() {
        int n = 0;
        int n2 = 0;
        JInternalFrame[] jInternalFrameArray = this.getAllFrames();
        this.DCC.ezF();
        int n3 = this.getBounds().height - 5 - jInternalFrameArray.length * DCB;
        int n4 = this.getBounds().width - 5 - jInternalFrameArray.length * DCB;
        for (int i = jInternalFrameArray.length - 1; i >= 0; --i) {
            jInternalFrameArray[i].setSize(n4, n3);
            jInternalFrameArray[i].setLocation(n, n2);
            n += DCB;
            n2 += DCB;
        }
    }

    public void ezJ() {
        JInternalFrame[] jInternalFrameArray = this.getAllFrames();
        this.DCC.ezF();
        int n = this.getBounds().height / jInternalFrameArray.length;
        int n2 = 0;
        for (int i = 0; i < jInternalFrameArray.length; ++i) {
            jInternalFrameArray[i].setSize(this.getBounds().width, n);
            jInternalFrameArray[i].setLocation(0, n2);
            n2 += n;
        }
    }

    public void a(Dimension dimension) {
        this.setMinimumSize(dimension);
        this.setMaximumSize(dimension);
        this.setPreferredSize(dimension);
    }

    public void gm(int n, int n2) {
        this.a(new Dimension(n, n2));
    }

    private void ezK() {
        if (this.getParent() != null && this.isVisible()) {
            this.DCC.ezH();
        }
    }
}

