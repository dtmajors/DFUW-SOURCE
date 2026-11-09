/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 *  lcr
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.SortedMap;
import spenefett.hid.gui.serialization.dto.SFConfirmationDTO;
import spenefett.hid.gui.serialization.dto.SFConfirmationListDTO;

public class iem
extends hzk
implements bto,
hsn,
hwa,
jml {
    private static final String TC = "SFConfirmationsWindow";
    private static final int lOa = 5;
    private final Map<Integer, a> lOb = lcn.emw();
    private final SortedMap<Integer, bdt> lOc = lcn.emD();
    private int YF = Integer.MAX_VALUE;

    public iem() {
        super("ConfirmationWindow", "ConfirmationsWindow.swf");
        this.a(hya.lmp, true);
        this.OQ(jnz.nGC);
        this.a(hyb.lmC);
    }

    public void initialize() {
        super.initialize();
        hso.cxK().cxR().dMa().a(jmq.nAZ, this);
        hso.cxK().cxR().dMa().a(jmq.nBa, this);
        hso.cxK().cxP().cyZ().a((hwa)this);
        hso.cxK().a(this);
    }

    public void cleanUp() {
        if (hso.cxK() != null) {
            if (hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
                hso.cxK().cxP().cyZ().b((hwa)this);
            }
            hso.cxK().b(this);
            if (hso.cxK().cxR() != null && hso.cxK().cxR().dMa() != null) {
                hso.cxK().cxR().dMa().j(jmq.nAZ);
                hso.cxK().cxR().dMa().j(jmq.nBa);
            }
        }
        super.cleanUp();
    }

    public void cBa() {
        super.cBa();
        this.cQb();
    }

    @Override
    public void b(esq esq2) {
        Map<ldv, bdt> map = lcn.emw();
        bdt[] bdtArray = esq2.iBu;
        for (bdt bdt2 : bdtArray) {
            map.put(bdt2.ev, bdt2);
        }
        LinkedList linkedList = lcn.emA();
        for (Map.Entry<Integer, bdt> entry : this.lOc.entrySet()) {
            if (map.containsKey(entry.getValue().ev)) continue;
            linkedList.add(entry.getKey());
        }
        if (!linkedList.isEmpty()) {
            Iterator<Map.Entry<Integer, bdt>> iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                Integer n = (Integer)((Object)iterator.next());
                this.lOc.remove(n);
                this.lOb.remove(n);
            }
        }
        for (ldv ldv2 : map.keySet()) {
            boolean bl = false;
            for (bdt bdt2 : this.lOc.values()) {
                if (!bdt2.ev.equals(ldv2)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            bdt bdt3 = (bdt)map.get(ldv2);
            this.lOc.put(this.YF, bdt3);
            a a2 = new a(this, this.YF, this.MessageDelegator.arc().rgz, (float)bdt3.bsD);
            this.lOb.put(this.YF, a2);
            --this.YF;
        }
        this.cQb();
    }

    private void a(bdu bdu2) {
        if (bdu2 == null) {
            return;
        }
        switch (bdu2) {
            case dbF: 
            case dbQ: 
            case dbR: 
            case dbL: 
            case dbM: {
                this.a(hxz.lma);
                break;
            }
            case dbG: 
            case dbH: 
            case dbI: 
            case dbJ: 
            case dbK: 
            case dbN: 
            case dbO: 
            case dbP: {
                this.a(hxz.lmb);
                break;
            }
        }
    }

    private void cQb() {
        int n = 0;
        SFConfirmationListDTO sFConfirmationListDTO = new SFConfirmationListDTO();
        sFConfirmationListDTO.list = lcn.abH(this.lOc.size());
        if (!this.lOc.isEmpty()) {
            if (this.lOc.size() > 5) {
                sFConfirmationListDTO.pendingRequestsMessage = this.cQd();
            }
            for (Map.Entry<Integer, bdt> entry : this.lOc.entrySet()) {
                if (n >= 5) break;
                ++n;
                bds bds2 = bds.dbB;
                bdu bdu2 = bdu.getValueByOrdinal(entry.getValue().ed);
                boolean bl = false;
                switch (bdu2) {
                    case dbR: 
                    case dbL: 
                    case dbM: 
                    case dbI: 
                    case dbJ: 
                    case dbK: 
                    case dbN: 
                    case dbP: {
                        break;
                    }
                    case dbF: 
                    case dbQ: 
                    case dbG: 
                    case dbH: 
                    case dbO: {
                        bl = true;
                    }
                }
                this.a(bdu2);
                SFConfirmationDTO sFConfirmationDTO = new SFConfirmationDTO();
                sFConfirmationDTO.important = bds2 != bds.dbB;
                sFConfirmationDTO.notificationID = String.valueOf(entry.getKey());
                sFConfirmationDTO.notificationText = entry.getValue().dbE.exA();
                sFConfirmationDTO.progress = 0.0;
                sFConfirmationDTO.showIgnoreButton = bl;
                sFConfirmationListDTO.list.add(sFConfirmationDTO);
            }
        }
        this.a("setConfirmations", new Object[]{sFConfirmationListDTO});
        if (sFConfirmationListDTO.list.size() == 0) {
            this.setVisible(false);
        } else if (!this.isVisible()) {
            this.setVisible(true);
        }
        hzo hzo2 = (hzo)iem.cxO();
        hzo2.updateLayout();
    }

    @llk
    private void acceptRequest(String string) {
        this.buttonPressed(bdp.a.dbt.ordinal(), string);
    }

    @llk
    private void declineRequest(String string) {
        this.buttonPressed(bdp.a.dbu.ordinal(), string);
    }

    @llk
    private void ignoreRequest(String string) {
        this.buttonPressed(bdp.a.dbv.ordinal(), string);
    }

    @llk
    public void buttonPressed(int n, String string) {
        Integer n2 = Integer.valueOf(string);
        bdt bdt2 = (bdt)this.lOc.get(n2);
        if (bdt2 == null) {
            return;
        }
        bdp.a a2 = bdp.a.getValueByOrdinal(n);
        switch (a2) {
            default: 
        }
        esw esw2 = (esw)this.MessageDelegator.h(18181, this.getGUID(), lcr.aTZ);
        esw2.iBx = new bdw(bdt2.ev, n);
        this.MessageDelegator.E(esw2);
    }

    @Override
    public void doTick(ldz ldz2) {
        for (a a2 : this.lOb.values()) {
            float f = 0.0f;
            f = a2.doT != 0.0f ? 100.0f - 100.0f * (float)((double)a2.doT - ldz2.rgz) / (float)((double)a2.doT - a2.oV) : 0.0f;
            this.a("setProgress", new Object[]{String.valueOf(a2.lOe), Float.valueOf(f)});
        }
    }

    public int cQc() {
        return this.lOc.size() > 5 ? 5 : this.lOc.size();
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public void oo() {
    }

    @Override
    public boolean op() {
        return true;
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    @Override
    public void a(jmq jmq2) {
        if (this.lOc.isEmpty()) {
            return;
        }
        if (hso.cxK().bAn().aFG != 1 && hso.cxK().bAn().aFG != 3) {
            return;
        }
        bdp.a a2 = jmq2 == jmq.nAZ ? bdp.a.dbt : bdp.a.dbu;
        int n = this.lOc.firstKey();
        this.buttonPressed(a2.ordinal(), String.valueOf(n));
    }

    protected void cEk() {
        super.cEk();
        this.a("updateLabel", new Object[]{this.cQd()});
    }

    private String cQd() {
        String string = "";
        if (this.lOc.size() - 5 > 0) {
            string = lwq.tgl.bD(this.lOc.size() - 5).exA();
        }
        return string;
    }

    public SortedMap<Integer, bdt> cQe() {
        return this.lOc;
    }
}

