/*
 * Decompiled with CFR.
 */
public class klq {
    public khd YX(int n) {
        klp klp2 = null;
        switch (n) {
            case 2561: {
                klp2 = new kls();
                break;
            }
            case 2562: {
                klp2 = new klt();
                break;
            }
            case 2563: {
                klp2 = new klr();
                break;
            }
            case 2564: {
                klp2 = new klo();
                break;
            }
            default: {
                lfn.b(5, "SFParticleRequestFactory", "createParticleRequest() Invalid requesttype provided: " + n);
                assert (false);
                break;
            }
        }
        return klp2;
    }
}

