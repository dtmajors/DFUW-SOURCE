/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class bou
extends btk {
    private final bot dyq;
    private Map<Integer, bok> dyr = lcn.emw();
    private int dys = 0;
    private Map<Integer, bok> dyt = lcn.emw();
    private int dyu = 0;

    public bou(bot bot2) {
        this.dyq = bot2;
    }

    public void g(bok bok2) {
        if (bok2 == null) {
            assert (false);
            return;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null || !(bop2 instanceof bom)) {
            assert (false);
            return;
        }
        bom bom2 = (bom)bop2;
        int[] nArray = bom2.asJ();
        if (nArray == null) {
            assert (false);
            return;
        }
        int[] nArray2 = new int[nArray.length];
        for (int i = 0; i < nArray2.length; ++i) {
            nArray2[i] = 1;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), bok2.asz());
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.aqs = this.dys;
        fmz2.hsP = true;
        fmz2.b(bqy.dGu);
        this.MessageDelegator.F(fmz2);
        this.dyr.put(this.dys, bok2);
        ++this.dys;
    }

    private void b(fna fna2) {
        int n = fna2.aqs;
        if (!this.dyr.containsKey(n)) {
            return;
        }
        bok bok2 = this.dyr.get(fna2.aqs);
        if (!fna2.iQK) {
            this.dyq.D(bok2.asw(), bok2.asz());
            this.dyq.a(bok2, bok2.asA(), "", -1, 4);
            this.dyq.im(bok2.asw());
            return;
        }
        this.dyr.remove(n);
    }

    public void h(bok bok2) {
        assert (bok2 != null);
        int n = bok2.asy();
        bop bop2 = bok2.lp(n);
        assert (bop2 != null);
        assert (bop2.asH() == dud.hdO.ordinal());
        bom bom2 = (bom)bop2;
        List<String> list = bom2.asI();
        if (list == null || list.isEmpty()) {
            assert (false);
            return;
        }
        int[] nArray = new int[list.size()];
        int[] nArray2 = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            int n2 = lea.enW().getType(list.get(i));
            if (n2 == -1) {
                assert (false);
                return;
            }
            nArray[i] = n2;
            nArray2[i] = 1;
        }
        fmt fmt2 = (fmt)this.MessageDelegator.h(7964, this.getGUID(), bok2.asz());
        fmt2.bqd = nArray;
        fmt2.iIY = nArray2;
        fmt2.iQw = bqm.c.dEV.ordinal();
        fmt2.iQx = true;
        fmt2.sk(this.dyu);
        this.MessageDelegator.F(fmt2);
        this.dyt.put(this.dyu, bok2);
        ++this.dyu;
    }

    private void b(fmu fmu2) {
        bok bok2 = this.dyt.get(fmu2.aVk());
        if (bok2 == null) {
            assert (false);
            return;
        }
        if (fmu2.iQy) {
            assert (false);
            return;
        }
        bop bop2 = bok2.lp(bok2.asy());
        assert (bop2.asH() == dud.hdO.ordinal());
        bsa[] bsaArray = fmu2.iQz;
        assert (bsaArray != null && bsaArray.length > 0);
        for (int i = 0; i < bsaArray.length; ++i) {
            bsa bsa2 = bsaArray[i];
            brp[] brpArray = bsa2.avX();
            assert (brpArray != null && brpArray.length > 0);
            brp brp2 = brpArray[0];
            assert (brp2 != null);
            fmv fmv2 = (fmv)this.MessageDelegator.h(7940, this.getGUID(), bok2.asz());
            fmv2.aCK = brp2.GUID;
            fmv2.dIW = bsa2.awJ()[0];
            fmv2.iQA = true;
            fmv2.iQC = true;
            fmv2.b(bqy.dHK);
            this.MessageDelegator.F(fmv2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        block10: {
            switch (dxq2.bEz()) {
                case 7956: {
                    this.b((fna)dxq2);
                    break;
                }
                case 7965: {
                    this.b((fmu)dxq2);
                    break;
                }
                case 11034: {
                    gre gre2 = (gre)dxq2;
                    int n = gre2.bWS();
                    int n2 = gre2.bWR();
                    int n3 = gre2.bNX();
                    switch (n2) {
                        case 7955: {
                            bok bok2 = this.dyr.remove(n);
                            if (bok2 != null) {
                                this.dyq.D(bok2.asw(), bok2.asz());
                                this.dyq.a(bok2, bok2.asA(), "", -1, 4);
                                this.dyq.im(bok2.asw());
                                break;
                            }
                            break block10;
                        }
                        case 7964: {
                            bok bok3 = this.dyt.remove(n);
                            if (bok3 != null) break;
                        }
                    }
                    break;
                }
                default: {
                    super.receiveMessage(dxq2);
                }
            }
        }
    }
}

