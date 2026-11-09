/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import java.util.Set;

public class mqm {
    private a EdU;
    private Color EdV;
    private Color EdW = new Color(50, 255, 50);
    private Color EdX;
    private Point EdY;
    private String dKw;
    private final Dimension bV = new Dimension(8, 8);
    private final Dimension EdZ = new Dimension(12, 12);
    private Dimension Eea = this.bV;
    private float Radius = 10.0f;
    private ljq Eeb;
    private String ft;
    private List<String> Eec = lcn.emv();

    public Color eJo() {
        return this.EdV;
    }

    public void h(Color color) {
        this.EdV = color;
    }

    public a eJp() {
        return this.EdU;
    }

    public void a(a a2) {
        this.EdU = a2;
    }

    public Point eGU() {
        return this.EdY;
    }

    public void h(Point point) {
        this.EdY = point;
    }

    public String axo() {
        return this.dKw;
    }

    public void gi(String string) {
        this.dKw = string;
    }

    public Dimension eJq() {
        return this.EdZ;
    }

    public Dimension getDefaultSize() {
        return this.bV;
    }

    public Dimension getSize() {
        return this.Eea;
    }

    public void setSize(Dimension dimension) {
        this.Eea = dimension;
    }

    public Color eJr() {
        return this.EdW;
    }

    public void i(Color color) {
        this.EdW = color;
    }

    public Color eJs() {
        return this.EdX;
    }

    public void j(Color color) {
        this.EdX = color;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public ljq eJt() {
        return this.Eeb;
    }

    public void eY(ljq ljq2) {
        this.Eeb = ljq2;
    }

    public String getObjectName() {
        return this.ft;
    }

    public void t(String string) {
        this.ft = string;
    }

    public List eJu() {
        return this.Eec;
    }

    public void v(Set<String> set) {
        this.Eec.clear();
        for (String string : set) {
            this.Eec.add(string.replace("r_", ""));
        }
    }
}

