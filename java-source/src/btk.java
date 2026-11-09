/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public abstract class btk
extends amf {
    protected dxr MessageDelegator = null;
    protected List<ldv> ObserverObjects;
    protected boolean Active = true;

    public btk() {
        this.ObjectType = 28;
    }

    @Override
    public void initialize() {
        if (this.Initialized) {
            return;
        }
        this.Initialized = true;
    }

    public dxr getMessageDelegator() {
        return this.MessageDelegator;
    }

    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    public void addObserverObject(ldv ldv2) {
        if (this.ObserverObjects == null) {
            this.ObserverObjects = lcn.abH(2);
        }
        this.ObserverObjects.add(ldv2);
    }

    public void removeObserverObject(ldv ldv2) {
        if (this.ObserverObjects != null) {
            this.ObserverObjects.remove(ldv2);
        }
    }

    public void addRelation(dul dul2) {
        if (dul2.Bq().equals(this.GUID) && !dul2.Br().equals(this.GUID)) {
            if (this.ObserverObjects == null) {
                this.ObserverObjects = lcn.abH(2);
            }
            this.ObserverObjects.add(dul2.Br());
        }
    }

    public void removeRelation(dul dul2) {
        if (dul2.Bq().equals(this.GUID) && !dul2.Br().equals(this.GUID) && this.ObserverObjects != null) {
            this.ObserverObjects.remove(dul2.Br());
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1027: {
                this.handleObjectRemoveMessage((fub)dxq2);
                break;
            }
            case 11025: {
                this.handleSystemPingMessage((grm)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            case 28929: {
                this.handlePerformanceAnalysisQueryObjectRequestMessage((fyd)dxq2);
                break;
            }
            case 11114: {
                this.handleSystemStateQueryRequestMessage((gsf)dxq2);
                break;
            }
            case 11116: {
                break;
            }
            case 1050: {
                ftl ftl2 = (ftl)this.MessageDelegator.h(1051, this.GUID, dxq2.aO());
                this.MessageDelegator.b(dxq2, ftl2);
                ftl2.jO(false);
                this.MessageDelegator.F(ftl2);
                break;
            }
        }
    }

    protected void handleSystemStateQueryRequestMessage(gsf gsf2) {
        gsg gsg2 = (gsg)this.MessageDelegator.h(11115, this.getGUID(), gsf2.aO());
        this.MessageDelegator.b(gsf2, gsg2);
        if ((gsf2.ed & 1) > 0) {
            gsg2.jqF = this.MessageDelegator.bzx().bzs();
        }
        if ((gsf2.ed & 2) > 0) {
            Map<String, lei> map = lcn.emw();
            for (Object object : this.MessageDelegator.bzx().bzr()) {
                lei lei2 = (lei)map.get(object.getClass().getName());
                if (lei2 != null) {
                    lei2.setValue(lei2.intValue() + 1);
                    continue;
                }
                lei2 = new lei(1);
                map.put(object.getClass().getName(), lei2);
            }
            if (!map.isEmpty()) {
                Object object;
                String[] stringArray = new String[map.size()];
                object = new int[map.size()];
                int n = 0;
                for (Map.Entry entry : map.entrySet()) {
                    stringArray[n] = (String)entry.getKey();
                    object[n] = ((lei)entry.getValue()).intValue();
                    ++n;
                }
                gsg2.jqG = stringArray;
                gsg2.jqH = (int[])object;
            }
        }
        this.MessageDelegator.F(gsg2);
    }

    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
    }

    private void handleSystemPingMessage(grm grm2) {
        grp grp2 = (grp)this.MessageDelegator.h(11026, this.GUID, grm2.aO());
        grp2.aw(this.MessageDelegator.arc());
        grp2.ax(grm2.bWW());
        this.MessageDelegator.F(grp2);
    }

    private void handlePerformanceAnalysisQueryObjectRequestMessage(fyd fyd2) {
        fye fye2 = (fye)this.MessageDelegator.h(28930, this.GUID, fyd2.aO());
        this.MessageDelegator.b(fyd2, fye2);
        fye2.l(this);
        this.MessageDelegator.F(fye2);
    }

    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            default: 
        }
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.getResult() != 0) {
            // empty if block
        }
    }

    public void receiveAIResponse(ba ba2) {
        if (ba2.ew != 0) {
            // empty if block
        }
    }

    public void receiveResourceResponse(ktf ktf2) {
        ksv ksv2;
        if (ktf2.egN() != 1 || (ksv2 = (ksv)ktf2).getResult() != 0) {
            // empty if block
        }
    }

    public void receiveRenderResponse(kgz kgz2) {
    }

    public void receiveInputResponse(jrq jrq2) {
    }

    public void receiveWindowResponse(miw miw2) {
    }

    @Override
    public void reset() {
        super.reset();
        this.MessageDelegator = null;
        this.setDefaultState();
    }

    protected void setDefaultState() {
    }

    protected void selfDestruct() {
        this.MessageDelegator.hd(this.GUID);
    }

    protected final String getObjectClassName() {
        String string = this.getClass().getName();
        string = string.substring(string.lastIndexOf(46) + 1, string.length());
        return string;
    }

    public String toString() {
        return "{ [" + this.ObjectDescriptionFilename + "] ," + this.GUID + ", Type[" + this.ObjectType + ", " + amh.bxE[this.ObjectType] + "]" + "}";
    }

    public final boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl2) {
        this.Active = bl2;
    }

    public List<ldv> getObserverObjects() {
        if (this.ObserverObjects == null) {
            this.ObserverObjects = lcn.abH(2);
        }
        return this.ObserverObjects;
    }

    protected void copyValues(btk btk2) {
        super.copyValues(btk2);
        btk2.setActive(this.Active);
    }

    protected void handleObjectRemoveMessage(fub fub2) {
        this.MessageDelegator.hd(this.GUID);
    }

    public void addTo(dxr dxr2) {
        this.setGUID(dxr2.bzv());
        dxr2.a(this);
    }
}

