/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class fw {
    private final int Tw;
    private final ix SW;
    private dxr MessageDelegator;
    private Map<ldv, agf> Tx = lcn.emw();
    private List<uk> Ty = lcn.abH(5);
    private int Tz = 0;
    private List<esf> TA = lcn.abH(5);

    public fw(ix ix2) {
        this.SW = ix2;
        this.Tw = 50;
    }

    public final void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    public final void bx(int n) {
        if (!this.TA.isEmpty()) {
            Iterator<esf> iterator = this.TA.iterator();
            while (iterator.hasNext()) {
                esf esf2 = iterator.next();
                aht aht2 = this.SW.bd(esf2.iBk);
                if (aht2 == null) continue;
                iterator.remove();
                this.a(esf2);
            }
        }
        if (this.Tz <= n) {
            this.by(n);
            this.Tz += this.Tw;
        }
    }

    public final void a(esc esc2) {
        switch (esc2.bEz()) {
            case 20993: {
                this.a((esa)esc2);
                break;
            }
            case 20995: {
                this.a((ese)esc2);
                break;
            }
            case 20996: {
                this.a((esf)esc2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void by(int n) {
        if (this.Tx.isEmpty()) {
            return;
        }
        for (agf agf2 : this.Tx.values()) {
            aih aih2;
            int n2;
            int n3;
            List<aih> list;
            uk[] ukArray;
            agf2.b(n, this.Ty);
            if (this.Ty.isEmpty()) {
                if (agf2.AG()) {
                    agf2.K(this.Ty);
                    ukArray = new uk[this.Ty.size()];
                    this.Ty.toArray(ukArray);
                    this.Ty.clear();
                    list = agf2.AF();
                    n3 = list.size();
                    for (n2 = 0; n2 < n3; ++n2) {
                        aih2 = list.get(n2);
                        if (aih2.bnl) continue;
                        this.a(aih2.Rs, agf2.AE(), ukArray);
                        aih2.bnl = true;
                    }
                }
            } else {
                ukArray = new uk[this.Ty.size()];
                this.Ty.toArray(ukArray);
                this.Ty.clear();
                list = agf2.AF();
                n3 = list.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    aih2 = list.get(n2);
                    if (aih2.bnl) {
                        this.a(aih2.Rs, agf2.AE(), ukArray);
                        continue;
                    }
                    agf2.K(this.Ty);
                    uk[] ukArray2 = new uk[this.Ty.size()];
                    this.Ty.toArray(ukArray2);
                    this.Ty.clear();
                    this.a(aih2.Rs, agf2.AE(), ukArray2);
                    aih2.bnl = true;
                }
            }
            agf2.aJ(false);
        }
    }

    private void a(esa esa2) {
        ahu.a a2 = esa2.bLi();
        if (a2 == null) {
            return;
        }
        switch (a2) {
            case blK: {
                if (esa2.Ui == null) {
                    lfn.b(5, "SFCompositeStateObjectManager", "handleCompositeCreateRequest(CRI) MeshObjectGUID is null.");
                    return;
                }
                if (esa2.Zf == null) {
                    lfn.b(5, "SFCompositeStateObjectManager", "handleCompositeCreateRequest(CRI) TitleCollectionGUID is null.");
                    return;
                }
                aht aht2 = this.SW.bd(esa2.Ui);
                if (aht2 == null) {
                    lfn.b(5, "SFCompositeStateObjectManager", "handleCompositeCreateRequest(CRI) MeshStateObject " + esa2.Ui + " was not found.");
                    return;
                }
                aht aht3 = this.SW.bd(esa2.Zf);
                if (aht3 == null) {
                    lfn.b(5, "SFCompositeStateObjectManager", "handleCompositeCreateRequest(CRI) TitleCollectionStateObject " + esa2.Zf + " was not found.");
                    return;
                }
                agf agf2 = new agf(a2);
                agf2.eO(esa2.aVk());
                agf2.setGUID(this.MessageDelegator.bzv());
                agf2.aK(true);
                agf2.c(aht2, 5);
                agf2.c(aht3, 1);
                agf2.c(aht3, 2);
                agf2.c(aht3, 3);
                agf2.c(aht3, 4);
                if (esa2.iBg != null) {
                    int n = esa2.iBg.length;
                    for (int i = 0; i < n; ++i) {
                        agf2.cC(esa2.iBg[i]);
                    }
                }
                this.Tx.put(agf2.getGUID(), agf2);
                this.a(esa2.aO(), esa2.aVk(), agf2.getGUID());
                break;
            }
            case blL: {
                if (esa2.Ui == null) {
                    return;
                }
                if (esa2.afF == null) {
                    return;
                }
                if (esa2.Zf == null) {
                    return;
                }
                aht aht4 = this.SW.bd(esa2.Ui);
                if (aht4 == null) {
                    return;
                }
                aia aia2 = (aia)this.SW.bd(esa2.afF);
                if (aia2 == null) {
                    return;
                }
                aht aht5 = this.SW.bd(esa2.Zf);
                if (aht5 == null) {
                    return;
                }
                agf agf3 = new agf(a2);
                agf3.eO(esa2.aVk());
                agf3.setGUID(this.MessageDelegator.bzv());
                agf3.aK(false);
                agf3.a(aia2, 352);
                agf3.c(aht4, 5);
                agf3.c(aht5, 1);
                agf3.c(aht5, 2);
                agf3.c(aht5, 3);
                agf3.c(aht5, 4);
                if (esa2.iBg != null) {
                    int n = esa2.iBg.length;
                    for (int i = 0; i < n; ++i) {
                        agf3.cC(esa2.iBg[i]);
                    }
                }
                this.Tx.put(agf3.getGUID(), agf3);
                this.a(esa2.aO(), esa2.aVk(), agf3.getGUID());
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(ese ese2) {
        if (ese2.eiG == null) {
            return;
        }
        agf agf2 = this.Tx.remove(ese2.eiG);
        if (agf2 == null) {
            return;
        }
        if (agf2.AH()) {
            List<aih> list = agf2.AF();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                aih aih2 = list.get(i);
                if (!aih2.bnl || !agf2.AH()) continue;
                this.aj(aih2.Rs);
            }
        }
    }

    private void a(esf esf2) {
        if (esf2.eiG == null) {
            return;
        }
        agf agf2 = this.Tx.get(esf2.eiG);
        if (agf2 == null) {
            return;
        }
        switch (esf2.ija) {
            case 1: {
                if (esf2.iBk == null) {
                    return;
                }
                aht aht2 = this.SW.bd(esf2.iBk);
                if (aht2 == null) {
                    this.TA.add(esf2);
                    return;
                }
                agf2.k(aht2);
                break;
            }
            case 2: {
                if (esf2.iBg == null) {
                    return;
                }
                int n = esf2.iBg.length;
                for (int i = 0; i < n; ++i) {
                    agf2.cC(esf2.iBg[i]);
                }
                break;
            }
            case 4: {
                if (esf2.iBg == null) {
                    return;
                }
                int n = esf2.iBg.length;
                for (int i = 0; i < n; ++i) {
                    agf2.cD(esf2.iBg[i]);
                    if (!agf2.AH()) continue;
                    this.aj(esf2.iBg[i]);
                }
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(ldv ldv2, int n, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        esb esb2 = (esb)this.MessageDelegator.h(20994, this.SW.getGUID(), ldv2);
        esb2.aqs = n;
        esb2.eiG = ldv3;
        this.MessageDelegator.F(esb2);
    }

    private void aj(ldv ldv2) {
        assert (ldv2 != null);
        gqa gqa2 = (gqa)this.MessageDelegator.h(11065, this.SW.getGUID(), ldv2);
        gqa2.hsP = true;
        this.MessageDelegator.F(gqa2);
    }

    private void a(ldv ldv2, int n, uk[] ukArray) {
        assert (ldv2 != null);
        assert (ukArray != null);
        assert (ukArray.length > 0);
        gqb gqb2 = (gqb)this.MessageDelegator.h(11009, this.SW.getGUID(), ldv2);
        gqb2.hsP = true;
        gqb2.bhL = n;
        gqb2.joY = ukArray;
        this.MessageDelegator.F(gqb2);
    }
}

