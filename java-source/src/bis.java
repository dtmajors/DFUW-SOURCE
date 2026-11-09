/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  gg
 *  lcr
 */
import java.util.ArrayList;
import java.util.TreeMap;

public class bis
extends bgk {
    public static final String dmO = "unspawn_all";
    private static final String dmP = "doit";
    private boolean dmQ = true;
    private int dmR = 0;
    private int dmS = 0;
    private int dmT = 0;
    private int dmU = 0;
    private int dmV = 0;
    private int dmW = 0;
    private int dmX = 0;
    private int dmY = 0;
    private int dmZ = 0;
    private int dna = 0;
    private int dnb = 0;
    private int dnc = 0;
    private int dnd = 0;
    private int dne = 0;
    private int dnf = 0;
    private int dng = 0;
    private int dnh = 0;

    @Override
    public void initialize() {
        amf amf2;
        super.initialize();
        String string = (String)this.dlm.get("word");
        if (string == null) {
            this.fw("Required parameter word is missing");
            return;
        }
        if (!string.equals(dmP)) {
            this.fw("Wrong word");
            return;
        }
        string = (String)this.dlm.get("save");
        if (string != null && string.equals("false")) {
            this.dmQ = false;
        }
        if ((amf2 = ((dta)this.MessageDelegator).bzt().d(lcr.hac)) == null || !(amf2 instanceof gg)) {
            this.fw("Could not find SFGamelogicDistributor");
            return;
        }
        gg gg2 = (gg)amf2;
        gr[] grArray = gg2.hS();
        if (grArray == null) {
            this.fw("Could not get node info array");
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (gr object : grArray) {
            if (object == null || object.eO == null || !object.eO.equals("GameLogic")) continue;
            arrayList.add(object.di);
        }
        this.dmR = arrayList.size();
        for (Integer n : arrayList) {
            ldv ldv2 = lcr.ak((ldv)lcr.qBe, (int)n);
            gst gst2 = (gst)this.MessageDelegator.h(11093, this.getGUID(), ldv2);
            this.MessageDelegator.E(gst2);
            ldv ldv3 = lcr.ak((ldv)lcr.qBi, (int)n);
            gst2 = (gst)this.MessageDelegator.h(11093, this.getGUID(), ldv3);
            this.MessageDelegator.E(gst2);
            ldv ldv4 = lcr.ak((ldv)lcr.qBn, (int)n);
            gst2 = (gst)this.MessageDelegator.h(11093, this.getGUID(), ldv4);
            this.MessageDelegator.E(gst2);
            ldv ldv5 = lcr.ak((ldv)lcr.qBl, (int)n);
            gst2 = (gst)this.MessageDelegator.h(11093, this.getGUID(), ldv5);
            this.MessageDelegator.E(gst2);
        }
        TreeMap treeMap = lcn.emG();
        treeMap.put("message", "Started unspawn on " + this.dmR + " gamelogic nodes");
        this.t(treeMap);
    }

    private void a(gsu gsu2) {
        if (gsu2.aO().equals(lcr.ak((ldv)lcr.qBe, (int)gsu2.aO().ib()))) {
            ++this.dmT;
            this.dmZ += gsu2.jrh;
            this.dnb += gsu2.jri;
            this.dna += gsu2.bZt;
        } else if (gsu2.aO().equals(lcr.ak((ldv)lcr.qBi, (int)gsu2.aO().ib()))) {
            ++this.dmS;
            this.dmW += gsu2.jrh;
            this.dmY += gsu2.jri;
            this.dmX += gsu2.bZt;
        } else if (gsu2.aO().equals(lcr.ak((ldv)lcr.qBn, (int)gsu2.aO().ib()))) {
            ++this.dmU;
            this.dnc += gsu2.jrh;
            this.dne += gsu2.jri;
            this.dnd += gsu2.bZt;
        } else if (gsu2.aO().equals(lcr.ak((ldv)lcr.qBl, (int)gsu2.aO().ib()))) {
            ++this.dmV;
            this.dnf += gsu2.jrh;
            this.dnh += gsu2.jri;
            this.dng += gsu2.bZt;
        } else {
            lfn.b(5, "SFExternalCommandHandlerUnspawnAll", "handleSystemUnspawnAllResponseMessage(): Unrecognized sender GUID " + gsu2.aO());
        }
        if (this.dmT == this.dmR && this.dmS == this.dmR && this.dmU == this.dmR && this.dmV == this.dmR) {
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("BoatsUnspawned", "" + this.dmZ);
            treeMap.put("BoatsNoOwner", "" + this.dnb);
            treeMap.put("BoatsFailed", "" + this.dna);
            treeMap.put("TanksUnspawned", "" + this.dmW);
            treeMap.put("TanksNoOwner", "" + this.dmY);
            treeMap.put("TanksFailed", "" + this.dmX);
            treeMap.put("MountsUnspawned", "" + this.dnc);
            treeMap.put("MountsNoOwner", "" + this.dne);
            treeMap.put("MountsFailed", "" + this.dnd);
            treeMap.put("SiegeEnginesUnspawned", "" + this.dnf);
            treeMap.put("SiegeEnginesNoOwner", "" + this.dnh);
            treeMap.put("SiegeEnginesFailed", "" + this.dng);
            this.t(treeMap);
            if (this.dmQ) {
                fzp fzp2 = (fzp)this.MessageDelegator.h(7172, this.getGUID(), lcr.qAV);
                fzp2.jbR = true;
                this.MessageDelegator.E(fzp2);
            } else {
                this.aoV();
            }
        }
    }

    private void a(fzq fzq2) {
        TreeMap<String, String> treeMap = lcn.emG();
        if (fzq2.eo) {
            treeMap.put("Result", "Saving completed");
            this.s(treeMap);
        } else if (fzq2.aMH == null) {
            this.fw("Saving failed - no reason specified");
        } else if (fzq2.aMH.equals("Save already in progress")) {
            treeMap.put("Result", "Saving failed - already running");
            this.s(treeMap);
        } else {
            this.fw("Saving failed - " + fzq2.aMH);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11094: {
                this.a((gsu)dxq2);
                break;
            }
            case 7173: {
                this.a((fzq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

