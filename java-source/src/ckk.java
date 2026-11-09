/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class ckk {
    private ckj eGL;
    private int adk;
    private int ID;
    private String Name;
    private String DisplayName;
    private String eGM;
    private Map<Integer, cki> eGN = lcn.emw();

    public final ckj aQS() {
        return this.eGL;
    }

    public final void a(ckj ckj2) {
        this.eGL = ckj2;
    }

    public final int getIndex() {
        return this.adk;
    }

    public final void setIndex(int n) {
        this.adk = n;
    }

    public final String getDisplayName() {
        return this.DisplayName;
    }

    public final void setDisplayName(String string) {
        this.DisplayName = string;
    }

    public final String aQT() {
        return this.eGM;
    }

    public final void hy(String string) {
        this.eGM = string;
    }

    public final void hG(int n) {
        this.ID = n;
    }

    public final int getID() {
        return this.ID;
    }

    public final String getName() {
        return this.Name;
    }

    public final void setName(String string) {
        this.Name = string;
    }

    public final Map<Integer, cki> aQU() {
        return this.eGN;
    }

    public final void C(Map<Integer, cki> map) {
        this.eGN = map;
    }

    public final float rf(int n) {
        cki cki2 = this.eGN.get(n);
        return cki2 != null ? cki2.aQR() : 0.0f;
    }

    public static int m(int n, int n2, int n3) {
        int n4 = n * 4;
        int n5 = ~(15 << n4);
        n3 = n3 & n5 | n2 << n4;
        return n3;
    }

    public static int aV(int n, int n2) {
        int n3 = n * 4;
        int n4 = 15 << n3;
        return (n2 & n4) >> n3;
    }
}

