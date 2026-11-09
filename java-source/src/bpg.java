/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class bpg
extends bpe {
    public List<Integer> dyZ = lcn.emv();
    public List<Integer> dza = lcn.emv();
    public List<Integer> dzb = lcn.emv();
    public Map<Integer, Integer> dyL = lcn.emw();
    public Map<Integer, Integer> dyM = lcn.emw();
    public List<Integer> dzc = lcn.emv();
    public Map<Integer, Long> dzd = lcn.emw();
    public int dze = 0;
    public List<Integer> dzf = lcn.emv();
    private boolean dzg = false;
    public boolean dzh = false;
    public int dzi = 0;
    public ldv dzj = null;
    public ldv hC = null;
    public String YU;
    public String YV;
    public String add;
    public int YY;
    public ldv ade = null;
    private boolean dzk = false;
    protected boolean bKW = false;
    public int[] dzl = null;
    public int[] dzm = null;

    public void F(ldv ldv2, ldv ldv3) {
        this.dzj = ldv2;
        this.hC = ldv3;
        this.dzg = true;
        if (!this.dzk) {
            eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
            eef2.jM(true);
            this.MessageDelegator.F(eef2);
        }
    }

    public void c(ldv ldv2, ldv ldv3, int[] nArray, List<int[]> list) {
        this.dzj = ldv2;
        this.hC = ldv3;
        gcq[] gcqArray = new gcq[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            gcq gcq2 = new gcq();
            gcq2.iOV = list.get(i);
            gcqArray[i] = gcq2;
        }
        if (!this.dzk) {
            eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
            eef2.jM(true);
            this.MessageDelegator.F(eef2);
        }
        if (nArray.length > 0) {
            if (!this.dzg) {
                gdh gdh2 = (gdh)this.MessageDelegator.h(10242, this.getGUID(), this.dzj);
                gdh2.jM(true);
                gdh2.iOV = nArray;
                this.MessageDelegator.F(gdh2);
            }
        } else {
            this.dzg = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 10241: {
                this.a((gdi)dxq2);
                break;
            }
            case 12812: {
                this.e((eeg)dxq2);
                break;
            }
            case 11034: {
                gre gre2 = (gre)dxq2;
                lfn.b(5, "SFQuestVerifyDataHarvest", "receiveMessage() FAILED in some of the dataharvest. MessageType: " + gre2.bWR() + " ErrorType: " + gre2.bNX());
                this.bKW = true;
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gdi gdi2) {
        this.dyM.clear();
        this.dyL.clear();
        this.dza.clear();
        this.dzb.clear();
        this.dzf.clear();
        this.dzd.clear();
        this.dze = gdi2.jeD;
        int[] nArray = gdi2.iOV;
        int[] nArray2 = gdi2.jeB;
        int[] nArray3 = gdi2.jeA;
        long[] lArray = gdi2.jeC;
        if (nArray == null) {
            this.dzg = true;
            return;
        }
        assert (nArray2 != null);
        assert (nArray3 != null);
        block10: for (int i = 0; i < nArray3.length; ++i) {
            int n = nArray3[i];
            switch (n) {
                case 3: {
                    this.dza.add(nArray[i]);
                    continue block10;
                }
                case 4: {
                    this.dzb.add(nArray[i]);
                    continue block10;
                }
                case 0: {
                    this.dyL.put(nArray[i], nArray2[i]);
                    continue block10;
                }
                case 1: {
                    this.dyM.put(nArray[i], nArray2[i]);
                    continue block10;
                }
                case 5: {
                    this.dzf.add(nArray[i]);
                    continue block10;
                }
                case 2: {
                    this.dzc.add(nArray[i]);
                    continue block10;
                }
                case 6: {
                    this.dyZ.add(nArray[i]);
                    continue block10;
                }
                case 7: {
                    this.dzd.put(nArray[i], lArray[i]);
                }
            }
        }
        this.dzg = true;
    }

    private void e(eeg eeg2) {
        this.YU = eeg2.iP();
        this.YV = eeg2.iR();
        this.add = eeg2.iV();
        this.YY = eeg2.js();
        this.ade = eeg2.iG();
        this.dzk = true;
    }

    @Override
    public boolean atk() {
        return this.bKW;
    }

    @Override
    public boolean atl() {
        return this.dzk && this.dzg;
    }

    @Override
    public int atm() {
        return 0;
    }
}

