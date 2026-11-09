/*
 * Decompiled with CFR.
 */
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class mjh
extends DefaultDesktopManager {
    private mji DCA;

    public mjh(mji mji2) {
        this.DCA = mji2;
    }

    @Override
    public void endResizingFrame(JComponent jComponent) {
        super.endResizingFrame(jComponent);
        this.ezH();
    }

    @Override
    public void endDraggingFrame(JComponent jComponent) {
        super.endDraggingFrame(jComponent);
        this.ezH();
    }

    public void ezF() {
        JScrollPane jScrollPane = this.getScrollPane();
        int n = 0;
        int n2 = 0;
        Insets insets = this.ezG();
        if (jScrollPane != null) {
            Dimension dimension = jScrollPane.getVisibleRect().getSize();
            if (jScrollPane.getBorder() != null) {
                dimension.setSize(dimension.getWidth() - (double)insets.left - (double)insets.right, dimension.getHeight() - (double)insets.top - (double)insets.bottom);
            }
            dimension.setSize(dimension.getWidth() - 20.0, dimension.getHeight() - 20.0);
            this.DCA.gm(n, n2);
            jScrollPane.invalidate();
            jScrollPane.validate();
        }
    }

    private Insets ezG() {
        JScrollPane jScrollPane = this.getScrollPane();
        if (jScrollPane == null) {
            return new Insets(0, 0, 0, 0);
        }
        return this.getScrollPane().getBorder().getBorderInsets(jScrollPane);
    }

    private JScrollPane getScrollPane() {
        JViewport jViewport;
        if (this.DCA.getParent() instanceof JViewport && (jViewport = (JViewport)this.DCA.getParent()).getParent() instanceof JScrollPane) {
            return (JScrollPane)jViewport.getParent();
        }
        return null;
    }

    protected void ezH() {
        int n = 0;
        int n2 = 0;
        JScrollPane jScrollPane = this.getScrollPane();
        Insets insets = this.ezG();
        if (jScrollPane != null) {
            JInternalFrame[] jInternalFrameArray = this.DCA.getAllFrames();
            for (int i = 0; i < jInternalFrameArray.length; ++i) {
                if (jInternalFrameArray[i].getX() + jInternalFrameArray[i].getWidth() > n) {
                    n = jInternalFrameArray[i].getX() + jInternalFrameArray[i].getWidth();
                }
                if (jInternalFrameArray[i].getY() + jInternalFrameArray[i].getHeight() <= n2) continue;
                n2 = jInternalFrameArray[i].getY() + jInternalFrameArray[i].getHeight();
            }
            Dimension dimension = jScrollPane.getVisibleRect().getSize();
            if (jScrollPane.getBorder() != null) {
                dimension.setSize(dimension.getWidth() - (double)insets.left - (double)insets.right, dimension.getHeight() - (double)insets.top - (double)insets.bottom);
            }
            if ((double)n <= dimension.getWidth()) {
                n = (int)dimension.getWidth() - 20;
            }
            if ((double)n2 <= dimension.getHeight()) {
                n2 = (int)dimension.getHeight() - 20;
            }
            this.DCA.gm(n, n2);
            jScrollPane.invalidate();
            jScrollPane.validate();
        }
    }
}

