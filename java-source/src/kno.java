/*
 * Decompiled with CFR.
 */
public class kno
extends knm {
    public static final int jfl = 1;
    public static final int pPn = 2;
    public static final int pPA = 4;
    public static final int pPW = 8;
    public static final int pPX = 16;
    public static final int pPY = 32;
    public static final int pPZ = 64;
    public static final int pQa = 128;
    public static final int pQb = 256;
    public static final int pQc = 512;
    public static final int pQd = 1024;
    public static final int pQe = 2048;
    public static final int pQf = 4096;
    public static final int pQg = 8192;
    public static final int pQh = 16384;
    public static final int pQi = 32768;
    public static final int pQj = 65536;
    public static final int pQk = 0;
    public static final int pQl = 1;
    public static final int pQm = 0;
    public static final int pQn = 1;
    public static final int pQo = 2;
    public static final int pQp = 3;
    public static final int pQq = 4;
    public static final int pQr = 5;
    public static final int pQs = 6;
    private int pQt = 0;
    private int pQu = 0;
    private int gDu = 0;
    private ljq gvb = null;
    private ljq gvc = null;
    private ljq Offset = null;
    private boolean guA = false;
    private lcq gzP = null;
    private lcq gzQ = null;
    private int guF = 0;
    private boolean avz = false;
    private float gDv = 0.0f;
    private float gDw = 0.0f;
    private float gDx = 0.0f;
    private float gDy = 0.0f;
    private float daN = 0.0f;
    private boolean guO = false;
    private float gDz;
    private float gDA;
    private float pQv = 0.0f;
    private ldv pQw = null;
    private float gDh = 0.3f;
    private ljq pQx = null;

    kno() {
        this.Jv(779);
    }

    public void a(kno kno2) {
        this.pQt = kno2.pQt;
        this.pQu = kno2.pQu;
        this.gDu = kno2.gDu;
        this.gvb = kno2.gvb;
        this.gvc = kno2.gvc;
        this.Offset = kno2.Offset;
        this.guA = kno2.guA;
        this.gzP = kno2.gzP;
        this.gzQ = kno2.gzQ;
        this.guF = kno2.guF;
        this.avz = kno2.avz;
        this.gDv = kno2.gDv;
        this.gDw = kno2.gDw;
        this.gDx = kno2.gDx;
        this.gDy = kno2.gDy;
        this.daN = kno2.daN;
        this.guO = kno2.guO;
        this.gDz = kno2.gDz;
        this.gDA = kno2.gDA;
        this.pQv = kno2.pQv;
        this.pQw = kno2.pQw;
        this.gDh = kno2.gDh;
        super.a(kno2);
    }

    public int eee() {
        return this.pQu;
    }

    public void Zu(int n) {
        this.pQu = n;
    }

    public int eef() {
        return this.pQt;
    }

    public void Zv(int n) {
        this.pQt = n;
    }

    public int getTracerCreationType() {
        return this.gDu;
    }

    public void setTracerCreationType(int n) {
        this.gDu = n;
    }

    public ljq getFirstPoint() {
        return this.gvb;
    }

    public void setFirstPoint(ljq ljq2) {
        this.gvb = ljq2;
    }

    public ljq getSecondPoint() {
        return this.gvc;
    }

    public void setSecondPoint(ljq ljq2) {
        this.gvc = ljq2;
    }

    public ljq getOffset() {
        return this.Offset;
    }

    public void setOffset(ljq ljq2) {
        this.Offset = ljq2;
    }

    public boolean isFallOff() {
        return this.guA;
    }

    public void setFallOff(boolean bl) {
        this.guA = bl;
    }

    public lcq getTracerColorStart() {
        return this.gzP;
    }

    public void setTracerColorStart(lcq lcq2) {
        this.gzP = lcq2;
    }

    public lcq getTracerColorEnd() {
        return this.gzQ;
    }

    public void setTracerColorEnd(lcq lcq2) {
        this.gzQ = lcq2;
    }

    public int getMaxNumberOfTracePoints() {
        return this.guF;
    }

    public void setMaxNumberOfTracePoints(int n) {
        this.guF = n;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }

    public float getUpperTransparencyStart() {
        return this.gDv;
    }

    public void setUpperTransparencyStart(float f) {
        this.gDv = f;
    }

    public float getUpperTransparencyEnd() {
        return this.gDw;
    }

    public void setUpperTransparencyEnd(float f) {
        this.gDw = f;
    }

    public float getLowerTransparencyStart() {
        return this.gDx;
    }

    public void setLowerTransparencyStart(float f) {
        this.gDx = f;
    }

    public float getLowerTransparencyEnd() {
        return this.gDy;
    }

    public void setLowerTransparencyEnd(float f) {
        this.gDy = f;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public boolean isFaceCamera() {
        return this.guO;
    }

    public void setFaceCamera(boolean bl) {
        this.guO = bl;
    }

    public float getMaxTracerPointLifeTime() {
        return this.gDA;
    }

    public void setMaxTracerPointLifeTime(float f) {
        this.gDA = f;
    }

    public float getMinDistanceBetweenTracePoints() {
        return this.gDz;
    }

    public void setMinDistanceBetweenTracePoints(float f) {
        this.gDz = f;
    }

    public float eeg() {
        return this.pQv;
    }

    public void gy(float f) {
        this.pQv = f;
    }

    public ldv eeh() {
        return this.pQw;
    }

    public void mI(ldv ldv2) {
        this.pQw = ldv2;
    }

    public float getMaxLength() {
        return this.gDh;
    }

    public void setMaxLength(float f) {
        this.gDh = f;
    }

    public ljq eei() {
        return this.pQx;
    }

    public void dx(ljq ljq2) {
        this.pQx = ljq2;
    }
}

