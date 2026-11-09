/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import org.jdesktop.layout.GroupLayout;

public class mrq
extends JPanel {
    private BufferedImage DOV = null;
    private BufferedImage Edx = null;
    private int[][] ElB = new int[32][32];
    private Point ElC = null;
    private Rectangle ElD = new Rectangle(0, 0, 512, 512);
    private Color EdV = new Color(1, 0, 0);
    private Color ElE = new Color(1.0f, 0.0f, 0.0f, 0.3f);
    private boolean ElF = true;
    private boolean ElG = false;
    private String ElH;
    private static final int ba = 16;
    private boolean ElI;
    private Point ElJ = null;
    private List<mqm> ElK = lcn.emv();
    private boolean ElL = true;
    private boolean ElM = false;
    private mrp ElN;

    public mrq() {
        this.b();
        this.c();
    }

    private void b() {
        GroupLayout groupLayout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 600, Short.MAX_VALUE));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 556, Short.MAX_VALUE));
    }

    private void c() {
        try {
            this.DOV = ImageIO.read(new jrw(lcw.qLb + "worldbuilder/" + "worldmap512x512.jpg"));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        b b2 = new b(this, null);
        c c2 = new c(this, null);
        this.addMouseListener(b2);
        this.addMouseMotionListener(c2);
        this.setBackground(Color.red);
        this.setBounds(this.ElD);
        a a2 = new a(this, null);
        new Thread(a2).start();
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics graphics2 = graphics.create();
        super.paintComponent(graphics2);
        if (this.ElI) {
            this.d(graphics2);
        } else {
            this.e(graphics2);
        }
        graphics2.dispose();
    }

    private void d(Graphics graphics) {
        Serializable serializable;
        if (this.Edx == null) {
            serializable = new jrw(this.CY(this.ElH));
            if (!serializable.exists()) {
                serializable = new jrw(lcw.qLb + "worldbuilder/" + "minimap_default.jpg");
            }
            try {
                this.Edx = ImageIO.read(serializable);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return;
            }
        }
        graphics.drawImage(this.Edx, 0, 0, this.getWidth(), this.getHeight(), this);
        serializable = graphics.getColor();
        graphics.setColor(Color.white);
        graphics.drawString(this.ElH, 60, 10);
        if (this.ElK != null && !this.ElK.isEmpty()) {
            for (mqm mqm2 : this.ElK) {
                graphics.setColor(mqm2.eJo());
                Point point = mqm2.eGU();
                int n = (int)((double)mqm2.getSize().width / 2.0);
                int n2 = (int)((double)mqm2.getSize().height / 2.0);
                graphics.fillOval(point.x - n, point.y - n2, mqm2.getSize().width, mqm2.getSize().height);
            }
        }
        graphics.setColor((Color)serializable);
    }

    private void e(Graphics graphics) {
        int n;
        int n2;
        graphics.drawImage(this.DOV, 0, 0, this);
        if (this.ElF) {
            for (n2 = 0; n2 < this.ElB.length; ++n2) {
                for (n = 0; n < this.ElB.length; ++n) {
                    if (this.ElB[n2][n] == 0) continue;
                    int n3 = n2 * 16;
                    int n4 = n * 16;
                    graphics.setColor(this.ElE);
                    graphics.fillRect(n3 + 0, n4 + 0, 16, 16);
                }
            }
        }
        if (this.ElG && this.ElC != null) {
            n2 = this.ElC.x * 16;
            n = this.ElC.y * 16;
            graphics.setColor(this.EdV);
            graphics.drawRoundRect(n2 + 0, n + 0, 16, 16, 2, 2);
        }
    }

    private String CY(String string) {
        String string2 = lcw.qLb + "worldbuilder/" + "minimap-bmps" + "/" + "gui_minimap_tile_";
        return string2 + string + ".jpg";
    }

    private void a(Point point, boolean bl) {
        if (!this.ElL) {
            return;
        }
        int n = point.x / 16;
        int n2 = point.y / 16;
        if (n > 31 || n2 > 31 || n < 0 || n2 < 0) {
            return;
        }
        if (this.ElN != null && !this.ElN.gu(n, n2)) {
            return;
        }
        this.ElB[n][n2] = bl ? 1 : 0;
    }

    private void l(Point point) {
        int n = point.x / 16;
        int n2 = point.y / 16;
        if (n > 31 || n2 > 31 || n < 0 || n2 < 0) {
            return;
        }
        if (!this.ElI) {
            this.ElH = lcw.f((lej)new lej(n, n2)).toLowerCase();
        }
        this.ElC = new Point(n, n2);
    }

    public String eLw() {
        return this.ElH;
    }

    public String egz() {
        String string = "";
        for (int i = 0; i < this.ElB.length; ++i) {
            for (int j = 0; j < this.ElB[i].length; ++j) {
                if (this.ElB[i][j] == 0) continue;
                string = string + lcw.f((lej)new lej(i, j)).toLowerCase() + ", ";
            }
        }
        return string;
    }

    public void selectAll() {
        for (int i = 0; i < this.ElB.length; ++i) {
            for (int j = 0; j < this.ElB[i].length; ++j) {
                this.ElB[i][j] = 1;
            }
        }
    }

    public synchronized void eLx() {
        for (int i = 0; i < this.ElB.length; ++i) {
            for (int j = 0; j < this.ElB[i].length; ++j) {
                this.ElB[i][j] = 0;
            }
        }
        this.ElK.clear();
    }

    public synchronized int[][] eLy() {
        return this.ElB;
    }

    public Point eLz() {
        return this.ElJ;
    }

    public List<mqm> eLA() {
        return this.ElK;
    }

    public void cA(List<mqm> list) {
        this.ElK = list;
    }

    public void m(Point point) {
        this.ElJ = point;
    }

    public boolean eLB() {
        return this.ElL;
    }

    public void zS(boolean bl) {
        this.ElL = bl;
    }

    public boolean eLC() {
        return this.ElI;
    }

    public void zT(boolean bl) {
        this.ElI = bl;
    }

    public boolean eLD() {
        return this.ElM;
    }

    public void zU(boolean bl) {
        this.ElM = bl;
    }

    public void eLE() {
        this.removeMouseMotionListener(this.getMouseMotionListeners()[0]);
    }

    public void eLF() {
        this.removeMouseListener(this.getMouseListeners()[0]);
    }

    public void eLG() {
        this.addMouseListener(new d(this, null));
    }

    private void u(MouseEvent mouseEvent) {
        this.l(mouseEvent.getPoint());
    }

    public String eLv() {
        return this.ElH;
    }

    public void a(mrp mrp2) {
        this.ElN = mrp2;
    }

    static /* synthetic */ void a(mrq mrq2, Point point) {
        mrq2.l(point);
    }

    static /* synthetic */ boolean a(mrq mrq2) {
        return mrq2.ElI;
    }

    static /* synthetic */ void a(mrq mrq2, Point point, boolean bl) {
        mrq2.a(point, bl);
    }

    static /* synthetic */ boolean a(mrq mrq2, boolean bl) {
        mrq2.ElG = bl;
        return mrq2.ElG;
    }

    static /* synthetic */ String a(mrq mrq2, String string) {
        mrq2.ElH = string;
        return mrq2.ElH;
    }

    static /* synthetic */ Point b(mrq mrq2, Point point) {
        mrq2.ElJ = point;
        return mrq2.ElJ;
    }

    static /* synthetic */ boolean b(mrq mrq2) {
        return mrq2.ElM;
    }

    static /* synthetic */ boolean b(mrq mrq2, boolean bl) {
        mrq2.ElI = bl;
        return mrq2.ElI;
    }

    static /* synthetic */ List c(mrq mrq2) {
        return mrq2.ElK;
    }

    static /* synthetic */ BufferedImage a(mrq mrq2, BufferedImage bufferedImage) {
        mrq2.Edx = bufferedImage;
        return mrq2.Edx;
    }

    static /* synthetic */ Color a(mrq mrq2, Color color) {
        mrq2.EdV = color;
        return mrq2.EdV;
    }

    static /* synthetic */ void a(mrq mrq2, MouseEvent mouseEvent) {
        mrq2.u(mouseEvent);
    }
}

