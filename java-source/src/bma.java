/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class bma
extends bke {
    private fdy duW = null;
    private ldv duX = null;

    public bma() {
        this.dsy = bkd.a.dru;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFChangeVisualFeatureFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9241) {
            lfn.b(5, "SFChangeVisualFeatureFO", "doFunction() Invalid message received: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.duW = (fdy)fdo2;
        this.duX = this.hG(this.duW.aZG);
        if (this.duX == null) {
            lfn.b(5, "SFChangeVisualFeatureFO", "doFunction() SourceObjectInventoryGUID is null.");
            this.Vc();
            return;
        }
        switch (this.duW.ilu) {
            case 1: 
            case 2: {
                int n2 = this.duW.ResourceType;
                cad cad2 = this.le(n2);
                if (cad2 == null) {
                    lfn.b(5, "SFChangeVisualFeatureFO", "doFunction() Could not create featureitem for resource '" + ResourceTree.getName(n2) + "'");
                    this.Vc();
                    return;
                }
                this.a(this.duX, this.duW.ilu, cad2);
                break;
            }
            case 3: 
            case 4: {
                if (this.duW.dMT == null) {
                    lfn.b(5, "SFChangeVisualFeatureFO", "doFunction() Color is null.");
                    this.Vc();
                    return;
                }
                this.a(this.duX, this.duW.ilu, this.duW.dMT);
                break;
            }
            default: {
                lfn.b(5, "SFChangeVisualFeatureFO", "doFunction() Invalid operationtype provided: " + this.duW.ilu);
                this.Vc();
                return;
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private cad le(int n) {
        if (n <= 0) {
            lfn.b(5, "SFChangeVisualFeatureFO", "createFeatureItem() ResourceType is invalid.");
            return null;
        }
        lgw lgw2 = (lgw)ResourceTree.acv(n);
        if (lgw2 == null) {
            lfn.b(5, "SFChangeVisualFeatureFO", "createFeatureItem() No resourcelistitem found for resourcetype " + n);
            return null;
        }
        if (!ResourceTree.k(n, cug.fkO, false)) {
            lfn.b(5, "SFChangeVisualFeatureFO", "createFeatureItem() ResourceType '" + lgw2.getName() + "' is not a 'Visual Feature'");
            return null;
        }
        if (lgw2.auO() == cak.c.efE) {
            lfn.b(5, "SFChangeVisualFeatureFO", "createFeatureItem() Resource '" + lgw2.getName() + "' has invalid layertype.");
            return null;
        }
        cad cad2 = new cad();
        cad2.ResourceType = n;
        cad2.bpW = lgw2.auO();
        return cad2;
    }

    private void a(fmo fmo2) {
        if (!fmo2.eo) {
            // empty if block
        }
        this.Vc();
    }

    private void a(ldv ldv2, int n, lcq lcq2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (lcq2 != null);
        fll fll2 = (fll)this.MessageDelegator.h(7975, this.GUID, ldv2);
        fll2.ilu = n;
        fll2.dMT = lcq2;
        this.MessageDelegator.F(fll2);
    }

    private void a(ldv ldv2, int n, cad cad2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (cad2 != null);
        fll fll2 = (fll)this.MessageDelegator.h(7975, this.GUID, ldv2);
        fll2.ilu = n;
        fll2.eeB = cad2;
        this.MessageDelegator.F(fll2);
    }
}

