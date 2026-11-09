/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  mrr
 */
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

final class mqk
extends JLabel {
    private mrr Edv;
    private String Edw = "no name";
    final String bb;
    private BufferedImage Edx = null;
    private Rectangle Edy = null;
    private List<mqm> Edz = lcn.emv();
    private boolean EdA = false;
    private boolean EdB = false;
    private boolean EdC = false;
    private boolean EdD = false;
    private boolean EdE = false;
    private mqm EdF = null;
    private mqm EdG = null;
    public static final int EdH = 1;
    public static final int EdI = 1;
    public static final int EdJ = 768;
    public static final int EdK = 768;
    public static final int EdL = 256;
    public static final int EdM = 256;

    public mqk(String string, mrr mrr2, Rectangle rectangle, jrw jrw2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        assert (rectangle != null);
        this.EdA = bl;
        this.EdB = bl2;
        this.EdC = bl3;
        this.EdD = bl4;
        this.EdE = bl5;
        this.Edv = mrr2;
        this.bb = string;
        if (jrw2 == null) {
            assert (false);
            jrw2 = new jrw(lcw.qLb + "worldbuilder/" + "minimap_default.jpg");
        } else if (!jrw2.exists()) {
            jrw2 = new jrw(lcw.qLb + "worldbuilder/" + "minimap_default.jpg");
        }
        try {
            this.Edx = ImageIO.read(jrw2);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.Edy = rectangle;
        b b2 = new b(this, this);
        this.addMouseMotionListener(b2);
        this.addMouseListener(new a(this, null));
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.drawImage(this.Edx, 0, 0, 768, 768, this);
        Font font = graphics.getFont();
        graphics.setFont(font.deriveFont(20.0f));
        Color color = graphics.getColor();
        graphics.setColor(Color.white);
        graphics.drawString(this.Edw, 60, 30);
        if (this.Edz != null && !this.Edz.isEmpty()) {
            for (mqm mqm2 : this.Edz) {
                int n;
                int n2;
                Point point;
                boolean bl = false;
                switch (mqm2.eJp()) {
                    case Eed: {
                        if (!this.EdA) break;
                        bl = true;
                        break;
                    }
                    case Eei: {
                        if (!this.EdB) break;
                        bl = true;
                        break;
                    }
                    case Eee: {
                        if (!this.EdC) break;
                        graphics.setColor(Color.lightGray);
                        point = mqm2.eGU();
                        graphics2D.setComposite(AlphaComposite.getInstance(3, 0.7f));
                        n2 = (int)mqm2.getRadius();
                        n = (int)mqm2.getRadius();
                        graphics.fillOval(point.x - n2, point.y - n, (int)mqm2.getRadius() * 2, (int)mqm2.getRadius() * 2);
                        graphics2D.setComposite(AlphaComposite.Src);
                        graphics.setColor(Color.black);
                        graphics.drawOval(point.x - n2, point.y - n, (int)mqm2.getRadius() * 2, (int)mqm2.getRadius() * 2);
                        bl = true;
                        break;
                    }
                    case Eej: {
                        if (!this.EdD) break;
                        graphics.setColor(Color.lightGray);
                        point = mqm2.eGU();
                        graphics2D.setComposite(AlphaComposite.getInstance(3, 0.7f));
                        n2 = (int)mqm2.getRadius();
                        n = (int)mqm2.getRadius();
                        graphics.fillOval(point.x - n2, point.y - n, (int)mqm2.getRadius() * 2, (int)mqm2.getRadius() * 2);
                        graphics2D.setComposite(AlphaComposite.Src);
                        graphics.setColor(Color.black);
                        graphics.drawOval(point.x - n2, point.y - n, (int)mqm2.getRadius() * 2, (int)mqm2.getRadius() * 2);
                        bl = true;
                        break;
                    }
                    case Eek: {
                        if (!this.EdE) break;
                        graphics.setColor(Color.lightGray);
                        point = mqm2.eGU();
                        graphics2D.setComposite(AlphaComposite.getInstance(3, 0.7f));
                        n2 = (int)mqm2.getRadius();
                        n = (int)mqm2.getRadius();
                        graphics.fillOval(point.x - n2, point.y - n, (int)mqm2.getRadius() * 2, (int)mqm2.getRadius() * 2);
                        graphics2D.setComposite(AlphaComposite.Src);
                        graphics.setColor(Color.black);
                        graphics.drawOval(point.x - n2, point.y - n, (int)mqm2.getRadius() * 2, (int)mqm2.getRadius() * 2);
                        bl = true;
                        break;
                    }
                    case Eef: {
                        lfn.b(0, this.getClass().getSimpleName(), "paintComponent() : Found CITY!");
                        break;
                    }
                    case Eeg: {
                        lfn.b(0, this.getClass().getSimpleName(), "paintComponent() : Found Bindstone!");
                        break;
                    }
                    case Eeh: {
                        lfn.b(0, this.getClass().getSimpleName(), "paintComponent() : Found GuardTower!");
                    }
                }
                if (!bl) continue;
                if (this.EdF != null && this.EdF == mqm2) {
                    graphics.setColor(mqm2.eJr());
                    point = mqm2.eGU();
                    n2 = (int)((double)mqm2.eJq().width / 2.0);
                    n = (int)((double)mqm2.eJq().height / 2.0);
                    graphics.fillOval(point.x - n2, point.y - n, mqm2.eJq().width, mqm2.eJq().height);
                    graphics.setColor(Color.black);
                    graphics.drawString(mqm2.getObjectName(), mqm2.eGU().x + 2, mqm2.eGU().y + 2);
                    graphics.setColor(Color.white);
                    graphics.drawString(mqm2.getObjectName(), mqm2.eGU().x, mqm2.eGU().y);
                    continue;
                }
                graphics.setColor(mqm2.eJo());
                point = mqm2.eGU();
                n2 = (int)((double)mqm2.getSize().width / 2.0);
                n = (int)((double)mqm2.getSize().height / 2.0);
                graphics.fillOval(point.x - n2, point.y - n, mqm2.getSize().width, mqm2.getSize().height);
            }
        }
        graphics.setColor(color);
    }

    public List<mqm> eJk() {
        return this.Edz;
    }

    public void cz(List<mqm> list) {
        this.Edz = list;
    }

    public String eJl() {
        return this.Edw;
    }

    public void CO(String string) {
        this.Edw = string;
    }

    public Rectangle eJm() {
        return this.Edy;
    }

    private ljq gr(int n, int n2) {
        float f = 768.0f;
        float f2 = lcw.qGD.bdV();
        float f3 = (float)n * lcw.qGD.getX() / 768.0f;
        float f4 = (f - (float)n2) * f2 / f;
        float f5 = 0.0f;
        ljq ljq2 = lcw.zh((String)this.bb);
        ljq ljq3 = new ljq(f3, 0.0f, f4);
        ljq2.es(ljq3);
        return ljq2;
    }

    static /* synthetic */ List a(mqk mqk2) {
        return mqk2.Edz;
    }

    static /* synthetic */ mqm a(mqk mqk2, mqm mqm2) {
        mqk2.EdF = mqm2;
        return mqk2.EdF;
    }

    static /* synthetic */ mqm b(mqk mqk2, mqm mqm2) {
        mqk2.EdG = mqm2;
        return mqk2.EdG;
    }

    static /* synthetic */ mqm b(mqk mqk2) {
        return mqk2.EdG;
    }

    static /* synthetic */ mrr c(mqk mqk2) {
        return mqk2.Edv;
    }

    static /* synthetic */ ljq a(mqk mqk2, int n, int n2) {
        return mqk2.gr(n, n2);
    }
}

