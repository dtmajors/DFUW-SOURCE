/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bjd
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("CharacterName");
        String string2 = (String)this.dlm.get("CharacterID");
        if (string == null && string2 == null) {
            this.fw("Missing CharacterName and CharacterID in params");
            return;
        }
        int n = 0;
        if (string2 != null) {
            try {
                n = Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (n != 0) {
            ldv ldv2 = lcr.abW((int)n);
            gsa gsa2 = (gsa)this.MessageDelegator.h(11087, this.getGUID(), ldv2);
            this.getMessageDelegator().F(gsa2);
        } else {
            fux fux2 = (fux)this.MessageDelegator.h(5639, this.getGUID(), lcr.hac);
            fux2.bc = string;
            this.getMessageDelegator().F(fux2);
        }
    }

    private void a(fux fux2) {
        if (fux2.Ri == null) {
            this.fw("Could not get PSOGUID from charactername");
            return;
        }
        gsa gsa2 = (gsa)this.MessageDelegator.h(11087, this.getGUID(), fux2.Ri);
        this.getMessageDelegator().F(gsa2);
    }

    private void a(gsb gsb2) {
        if (gsb2.Position == null || gsb2.azF == null) {
            this.fw("Could not get spawnposition");
            return;
        }
        Map<String, String> map = lcn.emw();
        map.put("SpawnPosition", gsb2.Position.toString());
        map.put("BindStoneID", gsb2.azF);
        map.put("WillSpawnAtBindStone", Boolean.toString(!gsb2.azG));
        this.t(map);
        this.aoU();
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        this.fw("Got SFSystemMessageSendingErrorMessage Failing.");
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5639: {
                this.a((fux)dxq2);
                break;
            }
            case 11088: {
                this.a((gsb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

