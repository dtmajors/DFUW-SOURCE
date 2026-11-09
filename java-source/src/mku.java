/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class mku
extends JPanel {
    private boolean DDT = false;
    private ljq DFO = null;
    private mkt DFK = null;
    private mkt DFL = null;
    private mkt DFM = null;
    private JLabel DFP = new JLabel("no title");
    ActionListener DFQ;
    private boolean DFR = false;
    private a DFS;

    public mku(boolean bl) {
    }

    public mku() {
        this("no title", new ljq(0.0f, 0.0f, 0.0f), false);
    }

    public mku(String string, ljq ljq2) {
        this(string, ljq2, true);
    }

    public mku(String string, ljq ljq2, boolean bl) {
        this.a(string, ljq2, bl);
    }

    public mku(String string) {
        this(string, new ljq());
    }

    public void a(String string, ljq ljq2, boolean bl) {
        this.addComponentListener(new ComponentAdapter(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ mku DFT;
            {
                this.DFT = mku2;
            }

            public void componentHidden(ComponentEvent componentEvent) {
                if (mku.a(this.DFT) != null) {
                    mku.a((mku)this.DFT).mY = false;
                    mku.a(this.DFT, null);
                }
            }

            public void componentShown(ComponentEvent componentEvent) {
                if (mku.b(this.DFT)) {
                    if (!$assertionsDisabled && mku.a(this.DFT) != null) {
                        throw new AssertionError();
                    }
                    mku.a(this.DFT, false);
                    this.DFT.eDw();
                }
            }

            static {
                $assertionsDisabled = !mku.class.desiredAssertionStatus();
            }
        });
        assert (ljq2 != null) : "The SFVector object must be non-null!";
        this.DFO = ljq2;
        this.setLayout(new FlowLayout(0));
        if (bl) {
            this.setBorder(new EtchedBorder());
        }
        this.DFP = new JLabel(string);
        this.add(this.DFP);
        this.DFK = new mkt("X", Float.toString(this.DFO.getX()), false);
        this.DFK.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mku DFT;
            {
                this.DFT = mku2;
            }

            public void keyReleased(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10 && this.DFT.DFQ != null) {
                    this.DFT.DFQ.actionPerformed(null);
                }
            }
        });
        this.add(this.DFK);
        this.DFL = new mkt("Y", Float.toString(this.DFO.getY()), false);
        this.DFL.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mku DFT;
            {
                this.DFT = mku2;
            }

            public void keyReleased(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10 && this.DFT.DFQ != null) {
                    this.DFT.DFQ.actionPerformed(null);
                }
            }
        });
        this.add(this.DFL);
        this.DFM = new mkt("Z", Float.toString(this.DFO.bdV()), false);
        this.DFM.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mku DFT;
            {
                this.DFT = mku2;
            }

            public void keyReleased(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10 && this.DFT.DFQ != null) {
                    this.DFT.DFQ.actionPerformed(null);
                }
            }
        });
        this.add(this.DFM);
    }

    public ljq bSh() {
        float f = 0.0f;
        try {
            f = Float.parseFloat(this.DFK.eCU());
        }
        catch (Exception exception) {
            System.out.println("The XLnT string is not FLOAT compatible!");
            f = 0.0f;
        }
        this.DFO.x = f;
        try {
            f = Float.parseFloat(this.DFL.eCU());
        }
        catch (Exception exception) {
            System.out.println("The YLnT string is not FLOAT compatible!");
            f = 0.0f;
        }
        this.DFO.y = f;
        try {
            f = Float.parseFloat(this.DFM.eCU());
        }
        catch (Exception exception) {
            System.out.println("The ZLnT string is not FLOAT compatible!");
            f = 0.0f;
        }
        this.DFO.rlV = f;
        return this.DFO;
    }

    public void cL(ljq ljq2) {
        if (ljq2 != null) {
            this.DFO = ljq2;
            this.DFK.Cf(Float.toString(this.DFO.getX()));
            this.DFL.Cf(Float.toString(this.DFO.getY()));
            this.DFM.Cf(Float.toString(this.DFO.bdV()));
            this.DDT = true;
        } else {
            this.DFO = new ljq();
        }
    }

    public boolean hasChanged() {
        if (this.DFK.hasChanged() || this.DFL.hasChanged() || this.DFM.hasChanged()) {
            this.DDT = true;
        }
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.DFK.setEnabled(bl);
        this.DFL.setEnabled(bl);
        this.DFM.setEnabled(bl);
    }

    public void setEditable(boolean bl) {
        this.DFK.setEditable(bl);
        this.DFL.setEditable(bl);
        this.DFM.setEditable(bl);
    }

    public void d(ActionListener actionListener) {
        this.DFQ = actionListener;
    }

    public void a(KeyListener keyListener) {
        this.DFK.addKeyListener(keyListener);
        this.DFL.addKeyListener(keyListener);
        this.DFM.addKeyListener(keyListener);
    }

    public void setTitle(String string) {
        this.DFP.setText(string);
    }

    public void eDw() {
        if (this.DFR) {
            lfn.b(4, this.getClass().getSimpleName(), "updateFromVector() : Updater Thread already started.");
            return;
        }
        this.DFK.setEditable(false);
        this.DFL.setEditable(false);
        this.DFM.setEditable(false);
        this.DFS = new a(this, null);
        new Thread(this.DFS).start();
        this.DFR = true;
    }

    public void eDx() {
        if (this.DFS != null) {
            this.DFS.mY = false;
            this.DFS = null;
            this.DFR = false;
        }
    }

    @Override
    public void addNotify() {
        super.addNotify();
    }

    @Override
    public void removeNotify() {
        super.removeNotify();
        this.eDx();
    }

    static /* synthetic */ a a(mku mku2) {
        return mku2.DFS;
    }

    static /* synthetic */ a a(mku mku2, a a2) {
        mku2.DFS = a2;
        return mku2.DFS;
    }

    static /* synthetic */ boolean b(mku mku2) {
        return mku2.DFR;
    }

    static /* synthetic */ boolean a(mku mku2, boolean bl) {
        mku2.DFR = bl;
        return mku2.DFR;
    }

    static /* synthetic */ ljq c(mku mku2) {
        return mku2.DFO;
    }

    static /* synthetic */ mkt d(mku mku2) {
        return mku2.DFK;
    }

    static /* synthetic */ mkt e(mku mku2) {
        return mku2.DFL;
    }

    static /* synthetic */ mkt f(mku mku2) {
        return mku2.DFM;
    }
}

