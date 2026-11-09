/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class s {
    public static final lfo ct = new lfo("Worldbuilder");
    private static final d[] cu = new d[]{new d(1, 27), new d(59, 112), new d(60, 113), new d(61, 114), new d(62, 115), new d(63, 116), new d(64, 117), new d(65, 118), new d(66, 119), new d(67, 120), new d(68, 121), new d(87, 122), new d(88, 123), new d(100, 61440), new d(101, 61441), new d(102, 61442), new d(183, 154), new d(70, 145), new d(197, 19), new d(41, 192), new d(2, 49), new d(3, 50), new d(4, 51), new d(5, 52), new d(6, 53), new d(7, 54), new d(8, 55), new d(9, 56), new d(10, 57), new d(11, 48), new d(12, 523), new d(13, 61), new d(12, 45), new d(14, 8), new d(15, 9), new d(16, 81), new d(17, 87), new d(18, 69), new d(19, 82), new d(20, 84), new d(21, 89), new d(22, 85), new d(23, 73), new d(24, 79), new d(25, 80), new d(26, 91), new d(27, 93), new d(43, 92), new d(58, 20), new d(30, 65), new d(31, 83), new d(32, 68), new d(33, 70), new d(34, 71), new d(35, 72), new d(36, 74), new d(37, 75), new d(38, 76), new d(39, 59), new d(40, 222), new d(28, 10), new d(42, 16, 2), new d(44, 90), new d(45, 88), new d(46, 67), new d(47, 86), new d(48, 66), new d(49, 78), new d(50, 77), new d(51, 44), new d(52, 46), new d(53, 47), new d(54, 16, 3), new d(29, 17, 2), new d(219, 524, 2), new d(56, 18, 2), new d(57, 32), new d(184, 18, 3), new d(220, 524, 3), new d(157, 17, 3), new d(210, 155), new d(211, 127), new d(199, 36), new d(207, 35), new d(201, 33), new d(209, 34), new d(200, 38), new d(208, 40), new d(203, 37), new d(205, 39), new d(69, 144, 4), new d(181, 111, 4), new d(55, 106, 4), new d(74, 109, 4), new d(71, 36, 4), new d(72, 38, 4), new d(73, 33, 4), new d(78, 107, 4), new d(75, 37, 4), new d(76, 12, 4), new d(77, 39, 4), new d(79, 35, 4), new d(80, 40, 4), new d(81, 34, 4), new d(156, 10, 4), new d(82, 155, 4), new d(83, 127, 4), new d(82, 96, 4), new d(79, 97, 4), new d(80, 98, 4), new d(81, 99, 4), new d(75, 100, 4), new d(76, 101, 4), new d(77, 102, 4), new d(71, 103, 4), new d(72, 104, 4), new d(73, 105, 4), new d(83, 110, 4), new d(121, 28), new d(123, 29), new d(112, 21), new d(148, 25)};
    static final Map<c, d> cv = new HashMap<c, d>();
    private final ldl cw = new ldl();
    private final ldl cx = new ldl();
    private final ldl cy = new ldl();
    private final ldl cz = new ldl();
    private final ldl cA = new ldl();
    private final JFrame cB = new JFrame();
    private final lgs cC = new lgs();
    private final Cursor cD;
    private final Robot cE;
    private final MouseListener cF = new MouseListener(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ s cS;
        {
            this.cS = s2;
        }

        public void mouseClicked(MouseEvent mouseEvent) {
            if (!$assertionsDisabled && !lda.by(mouseEvent)) {
                throw new AssertionError();
            }
        }

        public void mousePressed(MouseEvent mouseEvent) {
            s.a(this.cS, mouseEvent, true);
        }

        public void mouseReleased(MouseEvent mouseEvent) {
            s.a(this.cS, mouseEvent, false);
        }

        public void mouseEntered(MouseEvent mouseEvent) {
            if (!$assertionsDisabled && !lda.by(mouseEvent)) {
                throw new AssertionError();
            }
        }

        public void mouseExited(MouseEvent mouseEvent) {
            if (!$assertionsDisabled && !lda.by(mouseEvent)) {
                throw new AssertionError();
            }
        }

        static {
            $assertionsDisabled = !s.class.desiredAssertionStatus();
        }
    };
    private final MouseWheelListener cG = new MouseWheelListener(this){
        final /* synthetic */ s cS;
        {
            this.cS = s2;
        }

        public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
            boolean bl = (mouseWheelEvent.getModifiers() & 0x80) != 0;
            boolean bl2 = (mouseWheelEvent.getModifiers() & 0x40) != 0;
            boolean bl3 = (mouseWheelEvent.getModifiers() & 0x200) != 0;
            int n = mouseWheelEvent.getWheelRotation();
            int n2 = n < 0 ? 309 : 308;
            n = Math.abs(n);
            for (int i = 0; i < n; ++i) {
                s.a(this.cS, true, n2, bl, bl2, bl3);
                s.a(this.cS, false, n2, bl, bl2, bl3);
            }
        }
    };
    private final KeyListener cH = new KeyListener(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ s cS;
        {
            this.cS = s2;
        }

        public void keyTyped(KeyEvent keyEvent) {
            if (!$assertionsDisabled && !lda.by(keyEvent)) {
                throw new AssertionError();
            }
        }

        public void keyPressed(KeyEvent keyEvent) {
            s.a(this.cS, keyEvent, true);
        }

        public void keyReleased(KeyEvent keyEvent) {
            s.a(this.cS, keyEvent, false);
        }

        static {
            $assertionsDisabled = !s.class.desiredAssertionStatus();
        }
    };
    private final MouseMotionListener cI = new MouseMotionListener(this){
        final /* synthetic */ s cS;
        {
            this.cS = s2;
        }

        public void mouseDragged(MouseEvent mouseEvent) {
            Insets insets = s.a(this.cS).getInsets();
            lgg lgg2 = new lgg(mouseEvent.getX() - insets.left, mouseEvent.getY() - insets.top);
            s.a(this.cS, lgg2);
        }

        public void mouseMoved(MouseEvent mouseEvent) {
            Insets insets = s.a(this.cS).getInsets();
            lgg lgg2 = new lgg(mouseEvent.getX() - insets.left, mouseEvent.getY() - insets.top);
            s.a(this.cS, lgg2);
        }
    };
    private final WindowListener cJ = new WindowListener(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ s cS;
        {
            this.cS = s2;
        }

        public void windowOpened(WindowEvent windowEvent) {
            if (!$assertionsDisabled && !lda.by(windowEvent)) {
                throw new AssertionError();
            }
        }

        public void windowClosing(WindowEvent windowEvent) {
            if (!$assertionsDisabled && !lda.by(windowEvent)) {
                throw new AssertionError();
            }
            lfn.b(0, this.getClass().getSimpleName(), "windowClosing() : Closing");
            s.b(this.cS).enp();
        }

        public void windowClosed(WindowEvent windowEvent) {
            if (!$assertionsDisabled && !lda.by(windowEvent)) {
                throw new AssertionError();
            }
        }

        public void windowIconified(WindowEvent windowEvent) {
            if (!$assertionsDisabled && !lda.by(windowEvent)) {
                throw new AssertionError();
            }
            if (s.a(this.cS).getState() != 1) {
                return;
            }
            s.c(this.cS).enp();
        }

        public void windowDeiconified(WindowEvent windowEvent) {
            if (!$assertionsDisabled && !lda.by(windowEvent)) {
                throw new AssertionError();
            }
            if (s.a(this.cS).getState() != 0) {
                return;
            }
            s.c(this.cS).enp();
        }

        public void windowActivated(WindowEvent windowEvent) {
            if (!$assertionsDisabled && !lda.by(windowEvent)) {
                throw new AssertionError();
            }
        }

        public void windowDeactivated(WindowEvent windowEvent) {
            if (!$assertionsDisabled && !lda.by(windowEvent)) {
                throw new AssertionError();
            }
        }

        static {
            $assertionsDisabled = !s.class.desiredAssertionStatus();
        }
    };
    private final ComponentListener cK = new ComponentListener(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ s cS;
        {
            this.cS = s2;
        }

        public void componentResized(ComponentEvent componentEvent) {
            if (!$assertionsDisabled && !lda.by(componentEvent)) {
                throw new AssertionError();
            }
            if (s.d(this.cS) != null) {
                int n = componentEvent.getComponent().getWidth();
                int n2 = componentEvent.getComponent().getHeight();
                Insets insets = s.a(this.cS).getInsets();
                s.d(this.cS).resize(n - insets.left - insets.right + 2, n2 - insets.top - insets.bottom + 2);
            }
            s.e(this.cS);
        }

        public void componentMoved(ComponentEvent componentEvent) {
            if (!$assertionsDisabled && !lda.by(componentEvent)) {
                throw new AssertionError();
            }
            s.e(this.cS);
            mje.PositionRenderWindow = new Point(s.a(this.cS).getLocation());
        }

        public void componentShown(ComponentEvent componentEvent) {
            if (!$assertionsDisabled && !lda.by(componentEvent)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !s.a(this.cS).isShowing()) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !s.a(this.cS).isVisible()) {
                throw new AssertionError();
            }
        }

        public void componentHidden(ComponentEvent componentEvent) {
            if (!$assertionsDisabled && !lda.by(componentEvent)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && s.a(this.cS).isShowing()) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && s.a(this.cS).isVisible()) {
                throw new AssertionError();
            }
        }

        static {
            $assertionsDisabled = !s.class.desiredAssertionStatus();
        }
    };
    private Cursor cL;
    private boolean cM;
    private e cN;
    private lgg cO = lgg.rlI;
    private Set<Integer> cP = lcn.emx();
    private b cQ = null;
    private a cR = null;

    public s() {
        Robot robot;
        this.cD = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("nonexistent.jpg").getImage(), new Point(1, 1), "Custom");
        try {
            robot = new Robot();
        }
        catch (AWTException aWTException) {
            robot = null;
        }
        this.cE = robot;
        Serializable serializable = new mjb();
        this.cB.getContentPane().setLayout(new FlowLayout(0, 5, 5));
        serializable.setBounds(0, 0, 0, 0);
        this.cB.getContentPane().add((Component)serializable);
        this.cB.setBounds(0, 0, lcw.qFT, lcw.qFU);
        this.cB.setVisible(true);
        this.cB.setIgnoreRepaint(true);
        serializable.setIgnoreRepaint(true);
        this.cB.addComponentListener(this.cK);
        this.cB.addWindowListener(this.cJ);
        this.cB.addMouseMotionListener(this.cI);
        this.cB.addMouseListener(this.cF);
        this.cB.addKeyListener(this.cH);
        this.cB.addMouseWheelListener(this.cG);
        this.M();
        serializable = this.cB.getInsets();
        int n = lcw.qFT + ((Insets)serializable).left + ((Insets)serializable).right - 2;
        int n2 = lcw.qFU + ((Insets)serializable).top + ((Insets)serializable).bottom - 2;
        int n3 = 0;
        int n4 = 0;
        if (mje.PositionRenderWindow != null) {
            Point point = mje.PositionRenderWindow;
            n3 = point.x;
            n4 = point.y;
        } else {
            mje.PositionRenderWindow = new Point(this.cB.getLocation());
        }
        this.cB.setBounds(n3, n4, n, n2);
        this.cB.setResizable(true);
        this.cB.setBackground(Color.red);
        this.cB.setMinimumSize(new Dimension(128 + ((Insets)serializable).left + ((Insets)serializable).right, 128 + ((Insets)serializable).bottom + ((Insets)serializable).top));
        this.cB.setDropTarget(new DropTarget(this.cB, new DropTargetListener(this){
            final /* synthetic */ s cS;
            {
                this.cS = s2;
            }

            public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {
            }

            public void dragExit(DropTargetEvent dropTargetEvent) {
            }

            public void dragOver(DropTargetDragEvent dropTargetDragEvent) {
            }

            public void drop(DropTargetDropEvent dropTargetDropEvent) {
                Transferable transferable = dropTargetDropEvent.getTransferable();
                try {
                    Object object = dropTargetDropEvent.getTransferable().getTransferData(DataFlavor.stringFlavor);
                    if (object != null && object instanceof String) {
                        String string = (String)object;
                        if (s.f(this.cS) != null) {
                            Insets insets = s.a(this.cS).getInsets();
                            s.f(this.cS).a(string, dropTargetDropEvent.getLocation().x - insets.left, dropTargetDropEvent.getLocation().y - insets.top);
                            dropTargetDropEvent.dropComplete(true);
                        }
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }

            public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {
            }
        }));
        this.cB.addFocusListener(new FocusListener(this){
            final /* synthetic */ s cS;
            {
                this.cS = s2;
            }

            public void focusGained(FocusEvent focusEvent) {
            }

            public void focusLost(FocusEvent focusEvent) {
                ArrayList<Integer> arrayList = lcn.emv();
                for (Integer n : s.g(this.cS)) {
                    arrayList.add(n);
                }
                for (Integer n : arrayList) {
                    s.a(this.cS, false, n, false, false, false);
                }
            }
        });
    }

    public void setLocation(Point point) {
        this.cB.setLocation(point);
    }

    public void A() {
        String string = "c:\\dfdata\\worldbuilder\\WB_splash2.gif";
        MediaTracker mediaTracker = new MediaTracker(this.cB);
        Image image = Toolkit.getDefaultToolkit().getImage(string);
        if (image == null) {
            System.out.println("ERROR Loading Image [" + string + "]. Image returned was null!");
            return;
        }
        mediaTracker.addImage(image, 1);
        try {
            mediaTracker.waitForID(1);
        }
        catch (InterruptedException interruptedException) {
            System.out.println("Exception while loading image: " + interruptedException);
        }
        ah ah2 = new ah(this.cB, image);
        try {
            Thread.sleep(3000L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        ah2.dispose();
    }

    public void B() {
        Insets insets = this.cB.getInsets();
        int n = lcw.qFT + insets.left + insets.right - 2;
        int n2 = lcw.qFU + insets.top + insets.bottom - 2;
        this.cB.setSize(n, n2);
    }

    public boolean C() {
        return this.cB.getState() == 1;
    }

    public void q(String string) {
        this.cB.setTitle(string);
    }

    public void a(lcu lcu2) {
        this.cL = lcu2 == null ? null : this.b(lcu2);
        Cursor cursor = this.cL == null ? this.cD : this.cL;
        this.cB.setCursor(cursor);
    }

    public lgg D() {
        return this.cO;
    }

    public void a(lgg lgg2) {
        this.cM = true;
        if (this.cE != null) {
            this.cE.mouseMove(this.cC.cf + lgg2.cf, this.cC.cg + lgg2.cg);
        }
        this.cM = false;
    }

    public e E() {
        return this.cN;
    }

    public lgs F() {
        return new lgs(lgg.rlI, this.cC.cqv());
    }

    public lbl<lbn> G() {
        return this.cw;
    }

    public lbl<lbn> H() {
        return this.cz;
    }

    public lbl<lbn> I() {
        return this.cx;
    }

    public lbl<lbn> J() {
        return this.cy;
    }

    public lbl<lbn> K() {
        return this.cA;
    }

    public void L() {
        this.cB.requestFocus();
    }

    private void M() {
        Insets insets = this.cB.getInsets();
        if (lcw.qGS) {
            this.cC.cf = 0;
            this.cC.cg = 0;
            this.cC.rmN = lcw.qFT;
            this.cC.H = lcw.qFU;
        } else {
            this.cC.cf = this.cB.getX() + insets.left;
            this.cC.cg = this.cB.getY() + insets.top;
            this.cC.rmN = this.cB.getWidth() - (insets.left + insets.right);
            this.cC.H = this.cB.getHeight() - (insets.top + insets.bottom);
        }
        this.cy.enp();
    }

    private void b(lgg lgg2) {
        if (lgg2.T(this.cO)) {
            return;
        }
        this.cO = lgg2;
        if (!this.cM) {
            this.cw.enp();
        }
    }

    private void a(KeyEvent keyEvent, boolean bl) {
        int n = this.a(keyEvent.getKeyCode(), keyEvent.getKeyLocation());
        if (n == 0) {
            return;
        }
        boolean bl2 = (keyEvent.getModifiers() & 0x80) != 0;
        boolean bl3 = (keyEvent.getModifiers() & 0x40) != 0;
        boolean bl4 = (keyEvent.getModifiers() & 0x200) != 0;
        this.a(bl, n, bl2, bl3, bl4);
    }

    private int a(int n, int n2) {
        c c2 = new c(n, n2);
        d d2 = cv.get(c2);
        if (d2 == null) {
            return 0;
        }
        return d2.cY;
    }

    private int c(int n) {
        switch (n) {
            case 1: {
                return 240;
            }
            case 2: {
                return 241;
            }
            case 3: {
                return 242;
            }
        }
        return 0;
    }

    private void a(MouseEvent mouseEvent, boolean bl) {
        int n = this.c(mouseEvent.getButton());
        if (n == 0) {
            assert (false) : mouseEvent.getButton();
            return;
        }
        boolean bl2 = (mouseEvent.getModifiers() & 0x80) != 0;
        boolean bl3 = (mouseEvent.getModifiers() & 0x40) != 0;
        boolean bl4 = (mouseEvent.getModifiers() & 0x200) != 0;
        this.a(bl, n, bl2, bl3, bl4);
    }

    private final Cursor b(lcu lcu2) {
        int n;
        switch (lcu2.qEU) {
            case qEV: {
                n = 3;
                break;
            }
            case qEW: {
                n = 0;
                break;
            }
            case qEX: {
                n = 1;
                break;
            }
            case qEY: {
                n = 12;
                break;
            }
            case qEZ: {
                n = 0;
                break;
            }
            case qFa: {
                n = 2;
                break;
            }
            case qFb: {
                n = 0;
                break;
            }
            case qFc: {
                n = 0;
                break;
            }
            case qFd: {
                n = 0;
                break;
            }
            case qFe: {
                n = 0;
                break;
            }
            case qFf: {
                n = 0;
                break;
            }
            case qFg: {
                n = 0;
                break;
            }
            case qFh: {
                n = 0;
                break;
            }
            case qFi: {
                n = 3;
                break;
            }
            default: {
                assert (false);
                n = 0;
            }
        }
        return new Cursor(n);
    }

    private void a(boolean bl, int n, boolean bl2, boolean bl3, boolean bl4) {
        if (bl) {
            this.cP.add(n);
        } else {
            this.cP.remove(n);
        }
        this.cN = new e(bl, n, bl2, bl3, bl4);
        this.cz.enp();
        this.cN = null;
    }

    public void a(b b2) {
        this.cQ = b2;
    }

    public void a(a a2) {
        this.cR = a2;
    }

    static /* synthetic */ void a(s s2, MouseEvent mouseEvent, boolean bl) {
        s2.a(mouseEvent, bl);
    }

    static /* synthetic */ void a(s s2, boolean bl, int n, boolean bl2, boolean bl3, boolean bl4) {
        s2.a(bl, n, bl2, bl3, bl4);
    }

    static /* synthetic */ void a(s s2, KeyEvent keyEvent, boolean bl) {
        s2.a(keyEvent, bl);
    }

    static /* synthetic */ JFrame a(s s2) {
        return s2.cB;
    }

    static /* synthetic */ void a(s s2, lgg lgg2) {
        s2.b(lgg2);
    }

    static /* synthetic */ ldl b(s s2) {
        return s2.cA;
    }

    static /* synthetic */ ldl c(s s2) {
        return s2.cx;
    }

    static /* synthetic */ b d(s s2) {
        return s2.cQ;
    }

    static /* synthetic */ void e(s s2) {
        s2.M();
    }

    static /* synthetic */ a f(s s2) {
        return s2.cR;
    }

    static /* synthetic */ Set g(s s2) {
        return s2.cP;
    }

    static {
        for (int i = 0; i < cu.length; ++i) {
            d d2 = cu[i];
            c c2 = new c(d2.cW, d2.cX);
            assert (!cv.containsKey(c2));
            cv.put(c2, d2);
        }
    }
}

