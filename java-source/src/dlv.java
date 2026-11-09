/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class dlv
extends dlu {
    final Map<String, gor> gHb = lcn.emw();
    final Map<Integer, dxq> gHc = lcn.emw();
    final Map<String, Timestamp> gHd = lcn.emw();
    final List<String> gHe = lcn.emv();
    private int aqs;
    static final long gHf = TimeUnit.MILLISECONDS.convert(1L, TimeUnit.MINUTES);

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        for (Map.Entry<String, Timestamp> entry : this.gHd.entrySet()) {
            String string;
            if (entry.getValue().getTime() >= this.MessageDelegator.bzy().getTimeInMillis() || this.gHe.contains(string = entry.getKey())) continue;
            this.gHe.add(string);
            this.iO(string);
        }
    }

    private void iO(String string) {
        gor gor2 = (gor)this.MessageDelegator.h(33537, this.GUID, lcr.hac);
        gor2.gGR = string;
        gor2.jok = false;
        gor2.aqs = this.aqs;
        gor2.hsP = true;
        this.gHc.put(this.aqs++, gor2);
        this.MessageDelegator.F(gor2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 33537: {
                this.c((gor)dxq2);
                break;
            }
            case 33538: {
                this.c((gos)dxq2);
                break;
            }
            case 27911: {
                this.a((fei)dxq2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fei fei2) {
        ldv ldv2 = fei2.Rk();
        if (ldv2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleGenericObjectSpawnPointGUIDResponseMessage: spawnpoint '" + fei2.Jg() + "' GUID NULL");
            gor gor2 = this.gHb.remove(fei2.Jg());
            assert (gor2 != null);
            this.a(gor2, false, null);
            return;
        }
        gor gor3 = this.gHb.get(fei2.Jg());
        assert (gor3 != null);
        gor gor4 = (gor)gor3.clone();
        gor4.on(ldv2);
        gor4.f(this.GUID);
        gor4.hsP = true;
        gor4.sk(this.aqs);
        this.gHc.put(this.aqs++, gor4);
        this.MessageDelegator.F(gor4);
    }

    private void c(gos gos2) {
        gor gor2 = (gor)this.gHc.remove(gos2.aVk());
        assert (gor2 != null);
        gor gor3 = this.gHb.remove(gor2.gGR);
        assert (gor3 != null);
        if (gos2.jer) {
            if (gor2.jok) {
                assert (!this.gHd.containsKey(gor2.gGR));
                if (this.gHd.containsKey(gor2.gGR)) {
                    lfn.b(5, this.getClass().getSimpleName(), "***handleSpawnpointResponseMessage: there is already active spawnpoint '" + gor2.gGR + "'");
                    this.a(gor3, false, null);
                }
                Timestamp timestamp = null;
                if (gor2.jol == null || gor2.jol.isEmpty()) {
                    timestamp = new Timestamp(this.MessageDelegator.bzy().getTimeInMillis() + gHf);
                } else {
                    try {
                        timestamp = Timestamp.valueOf(gor2.jol);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        lfn.b(5, this.getClass().getSimpleName(), "handleSpawnpointResponseMessage: endtime timestamp is not valid, msg: " + illegalArgumentException.getMessage() + " stack: " + illegalArgumentException.getStackTrace());
                        this.a(gor3, false, null);
                    }
                }
                this.gHd.put(gor2.gGR, timestamp);
                this.a(gor3, true, timestamp == null ? null : timestamp.toString());
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "***handleSpawnpointResponseMessage: spawnpoint '" + gor2.gGR + "' could not stop");
                assert (this.gHd.containsKey(gor2.gGR));
                this.gHd.remove(gor2.gGR);
                assert (this.gHe.contains(gor2.gGR));
                this.gHe.remove(gor2.gGR);
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "***handleSpawnpointResponseMessage: received failure from spawnpoint '" + gor2.gGR + "'");
            this.a(gor3, false, null);
        }
    }

    private void a(gor gor2, boolean bl, String string) {
        gos gos2 = (gos)this.MessageDelegator.h(33538, this.GUID, gor2.aO());
        gos2.sk(gor2.aVk());
        gos2.gGR = gor2.gGR;
        gos2.jer = bl;
        gos2.jol = string;
        this.MessageDelegator.F(gos2);
    }

    private void c(gor gor2) {
        if (this.gHd.containsKey(gor2.gGR)) {
            this.a(gor2, false, null);
            return;
        }
        if (this.gHb.containsKey(gor2.gGR)) {
            this.a(gor2, false, null);
            return;
        }
        this.gHb.put(gor2.gGR, gor2);
        feh feh2 = (feh)this.MessageDelegator.h(27910, this.GUID, lcr.hac);
        feh2.kY(true);
        feh2.kD(gor2.gGR);
        feh2.sk(this.aqs);
        feh2.hsP = true;
        this.MessageDelegator.F(feh2);
        this.gHc.put(this.aqs++, feh2);
    }

    private void c(gre gre2) {
        if (gre2.jqc == 27912) {
            feh feh2 = (feh)this.gHc.remove(gre2.jqd);
            lfn.b(5, this.getClass().getSimpleName(), "error getting GUID for spawnpoint '" + feh2.Jg() + "'");
            gor gor2 = this.gHb.remove(feh2.Jg());
            assert (gor2 != null);
            this.a(gor2, false, null);
        } else if (gre2.jqc == 33537) {
            gor gor3 = (gor)this.gHc.remove(gre2.bWS());
            lfn.b(5, this.getClass().getSimpleName(), "error requesting summoning ritual fro spawnpoint '" + gor3.gGR + "'");
            gor gor4 = this.gHb.remove(gor3.gGR);
            assert (gor4 != null);
            this.a(gor4, false, null);
        }
    }
}

