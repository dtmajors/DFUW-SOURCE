/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class jqk
extends jqj
implements jpi {
    public final String Name;
    public final String nSc;
    public final String nSd;
    public final a nSe;
    public final short nuN;
    public final short nuM;
    public final int nSf;
    private final lbi<jpk> kuT;
    private final List<jqp> nSg = new ArrayList<jqp>();
    public final List<jqp> nSh = Collections.unmodifiableList(this.nSg);
    private final List<jpf> nSi = new ArrayList<jpf>();
    public final Collection<jpf> nSj = Collections.unmodifiableCollection(this.nSi);
    private int[] nSk = new int[0];

    public jqk(jqx jqx2, ldv ldv2, lbi<jpk> lbi2, String string, String string2, String string3, short s, short s2, int n, joe[] joeArray) {
        super(jqx2, ldv2);
        assert (string != null);
        assert (joeArray != null);
        this.Name = string;
        this.kuT = lbi2;
        this.nSc = string2;
        this.nSd = string3;
        this.nuN = s;
        this.nuM = s2;
        this.nSf = n;
        assert (lda.by(this.nSc));
        assert (lda.acc(this.nuN));
        assert (lda.acc(this.nuM));
        assert (lda.acc(this.nSf));
        switch (n) {
            case 19: {
                this.nSe = a.nSl;
                break;
            }
            case 18: {
                this.nSe = a.nSm;
                break;
            }
            case 20: {
                this.nSe = a.nSn;
                break;
            }
            case 21: {
                this.nSe = a.nSo;
                break;
            }
            case 22: {
                this.nSe = a.nSp;
                break;
            }
            case 23: {
                this.nSe = a.nSq;
                break;
            }
            case 24: {
                this.nSe = a.nSr;
                break;
            }
            case 25: {
                this.nSe = a.nSs;
                break;
            }
            case 26: {
                this.nSe = a.nSt;
                break;
            }
            case 27: {
                this.nSe = a.nSu;
                break;
            }
            case 28: {
                this.nSe = a.nSv;
                break;
            }
            case 17: {
                this.nSe = a.nSw;
                break;
            }
            default: {
                this.nSe = a.nSx;
            }
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        for (int i = 0; i < joeArray.length; ++i) {
            jqp jqp2;
            joe joe2 = joeArray[i];
            ljg ljg2 = new ljg(joe2.getName());
            int n11 = joe2.dOD();
            switch (n11) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    String string4;
                    jpf[] jpfArray;
                    int n12 = -1;
                    switch (n11) {
                        case 1: {
                            jpfArray = jqp.a.nSU;
                            string4 = "AXIS_X_";
                            n12 = n2++;
                            break;
                        }
                        case 2: {
                            jpfArray = jqp.a.nSV;
                            string4 = "AXIS_Y_";
                            n12 = n3++;
                            break;
                        }
                        case 3: {
                            jpfArray = jqp.a.nSW;
                            string4 = "AXIS_Z_";
                            n12 = n4++;
                            break;
                        }
                        case 4: {
                            jpfArray = jqp.a.nSX;
                            string4 = "AXIS_ROTX_";
                            n12 = n5++;
                            break;
                        }
                        case 5: {
                            jpfArray = jqp.a.nSY;
                            string4 = "AXIS_ROTY_";
                            n12 = n6++;
                            break;
                        }
                        case 6: {
                            jpfArray = jqp.a.nSZ;
                            string4 = "AXIS_ROTZ_";
                            n12 = n7++;
                            break;
                        }
                        case 7: {
                            jpfArray = jqp.a.nTa;
                            string4 = "SLIDER_";
                            n12 = n8++;
                            break;
                        }
                        default: {
                            assert (false);
                            jpfArray = jqp.a.nSR;
                            string4 = "UNSUPPORTED_";
                        }
                    }
                    if (n12 != -1) {
                        string4 = string4 + Integer.toString(n12);
                    }
                    jqp2 = new jqr(this, (jqp.a)jpfArray, string4, ljg2, i, joe2.dOH(), this.kuT);
                    break;
                }
                case 8: {
                    int n13 = n9++;
                    String string4 = "BUTTON_" + n13;
                    jqp2 = new jqt(this, string4, ljg2, i, this.kuT);
                    break;
                }
                case 9: {
                    int n14 = joe2.dMu();
                    String string4 = lhc.Vl(n14);
                    jqp2 = new jqu(this, string4, ljg2, i, joe2.dMu(), this.kuT);
                    break;
                }
                default: {
                    int n15 = n10++;
                    String string4 = "UNKNOWN_" + n15;
                    jqp2 = new jqw(this, string4, ljg2, i, this.kuT);
                    break;
                }
            }
            this.nSg.add(jqp2);
            for (jpf jpf2 : jqp2.dRl()) {
                this.nSi.add(jpf2);
            }
        }
    }

    public final void uE(boolean bl) {
        int[] nArray = new int[this.nSg.size()];
        int n = 0;
        for (jqp jqp2 : this.nSg) {
            if (jqp2.adk == -1) continue;
            nArray[n++] = jqp2.adk;
        }
        this.a(bl, Arrays.copyOf(nArray, n));
    }

    public final void a(boolean bl, int[] nArray) {
        assert (nArray != null);
        this.nSk = nArray;
        if (nArray.length != 0) {
            this.nHJ.a(this.dbx, bl, nArray);
        }
    }

    public final void dRh() {
        this.nHJ.th(this.dbx);
    }

    public final void J(int n, int n2, int n3, int n4) {
        int n5 = this.nSk[n];
        jqp jqp2 = this.nSg.get(n5);
        this.a(jqp2, n2, n3, n4);
    }

    public final jqp te(String string) {
        for (jqp jqp2 : this.nSg) {
            if (!jqp2.Name.equalsIgnoreCase(string)) continue;
            return jqp2;
        }
        return null;
    }

    @Override
    public final jpj dPo() {
        return this.nHJ.jWW;
    }

    @Override
    public final String getName() {
        return this.Name;
    }

    @Override
    public final lip awO() {
        return new ljg(this.nSd);
    }

    @Override
    public final jpf ta(String string) {
        for (jpf jpf2 : this.nSi) {
            if (!jpf2.getName().equalsIgnoreCase(string)) continue;
            return jpf2;
        }
        return null;
    }

    @Override
    protected String ccJ() {
        return this.Name;
    }

    protected void a(jqp jqp2, int n, int n2, int n3) {
        assert (lda.acc(n3));
        jqp2.fG(n, n2);
    }
}

