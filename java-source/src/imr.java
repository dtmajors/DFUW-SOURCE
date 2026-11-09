/*
 * Decompiled with CFR.
 */
import java.util.List;

public class imr {
    public final jlk mkr = new jlk();
    public final jlk mks = new jlk();
    public final jlk mkt = new jlk();
    public final jlk mku = new jlk();
    public final jlk mkv = new jlk();
    public final jlk mkw = new jlk();
    public final jlk mkx = new jlk();
    private static final int mky = 20;
    private ilq mkz;
    private List<ilq> mkA = lcn.emv();
    private int mkB = -1;
    private imh mkC = new imh();
    private imm mkD = new imm();
    private boolean mkE;
    private imn mkF = new imn();
    private imi mkG = new imi();

    public imr(ilq ilq2) {
        this.mkz = ilq2;
        this.a(ilq2);
        ilw.ddy().miC.a((jlg<ilq, ilx>)new jls<imr, ilq, ilx>(this, this){
            final /* synthetic */ imr mkH;
            {
                this.mkH = imr2;
                super(imr3);
            }

            public void b(imr imr2, ilq ilq2, ilx ilx2) {
                imr.a(imr2, ilq2, ilx2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((imr)object, (ilq)object2, (ilx)object3);
            }
        });
    }

    public ilq dem() {
        return this.mkz;
    }

    public boolean den() {
        return this.mkB > 0;
    }

    public boolean deo() {
        return this.mkB < this.mkA.size() - 1;
    }

    public void dep() {
        if (this.mkB > 0) {
            --this.mkB;
            this.mkr.dLF();
        }
    }

    public void deq() {
        if (this.mkB < this.mkA.size() - 1) {
            ++this.mkB;
            this.mkr.dLF();
        }
    }

    public ilq der() {
        return this.mkB >= 0 && this.mkB < this.mkA.size() ? this.mkA.get(this.mkB) : null;
    }

    public void a(ilq ilq2) {
        if (!this.mkA.isEmpty()) {
            if (this.mkB == this.mkA.size() - 1) {
                this.mkA.add(ilq2);
                if (this.mkA.size() > 20) {
                    this.mkA.remove(0);
                } else {
                    ++this.mkB;
                }
            } else {
                ++this.mkB;
                ilq ilq3 = this.mkA.get(this.mkB);
                if (ilq3 != ilq2) {
                    this.mkA.set(this.mkB, ilq2);
                    for (int i = this.mkA.size() - 1; i > this.mkB; --i) {
                        this.mkA.remove(i);
                    }
                }
            }
        } else {
            this.mkA.add(ilq2);
            this.mkB = 0;
        }
        this.mkr.dLF();
    }

    public void qz(String string) {
        for (ilq ilq2 = this.der(); ilq2 != null; ilq2 = ilq2.ddA()) {
            if (!lhn.equalsIgnoreCase(ilq2.ddF().exA(), string)) continue;
            this.a(ilq2);
            break;
        }
    }

    public void des() {
        ilq ilq2;
        ilq ilq3 = this.der();
        if (ilq3 != null && (ilq2 = ilq3.ddA()) != null) {
            this.a(ilq2);
        }
    }

    public imh det() {
        return this.mkC;
    }

    public void qA(String string) {
        if (lhn.equal(string, this.mkC.deb())) {
            return;
        }
        this.mkC.qy(string);
        this.mks.dLF();
    }

    public imm deu() {
        return this.mkD.dej();
    }

    public void b(imm imm2) {
        if (imm2 == null) {
            imm2 = new imm();
        }
        this.mkD = imm2.dej();
        this.mkt.dLF();
    }

    public boolean dev() {
        return this.mkE;
    }

    public void qP(boolean bl) {
        if (bl == this.mkE) {
            return;
        }
        this.mkE = bl;
        this.mku.dLF();
    }

    public imn dew() {
        return this.mkF.dek();
    }

    public void a(imn imn2) {
        if (imn2 == null) {
            imn2 = new imn();
        }
        this.mkF = imn2.dek();
        this.mkv.dLF();
    }

    public imi dex() {
        return this.mkG.ded();
    }

    public void a(imi imi2) {
        if (imi2 == null) {
            imi2 = new imi();
        }
        this.mkG = imi2.ded();
        this.mkw.dLF();
    }

    private void a(ilq ilq2, ilx ilx2) {
        boolean bl = false;
        int n = 1;
        while (n < this.mkA.size()) {
            ilq ilq3 = this.mkA.get(n);
            if (!ilq3.f(ilx2)) {
                ++n;
                continue;
            }
            this.mkA.remove(n);
            if (n == this.mkB) {
                this.mkB = n - 1;
                bl = true;
                continue;
            }
            if (n >= this.mkB) continue;
            --this.mkB;
        }
        if (bl) {
            this.mkr.dLF();
        }
    }

    static /* synthetic */ void a(imr imr2, ilq ilq2, ilx ilx2) {
        imr2.a(ilq2, ilx2);
    }
}

