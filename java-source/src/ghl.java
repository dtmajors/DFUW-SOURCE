/*
 * Decompiled with CFR.
 */
public class ghl {
    public ghk Jx(int n) {
        ghk ghk2 = null;
        switch (n) {
            case 513: {
                ghk2 = new ghi();
                break;
            }
            case 514: {
                ghk2 = new ghj();
                break;
            }
            case 515: {
                ghk2 = new ghr();
                break;
            }
            case 516: {
                ghk2 = new ghs();
                break;
            }
            case 517: {
                ghk2 = new ght();
                break;
            }
            case 518: {
                ghk2 = new gho();
                break;
            }
            case 519: {
                ghk2 = new ghp();
                break;
            }
            case 520: {
                ghk2 = new ghq();
                break;
            }
            case 522: {
                ghk2 = new ghn();
                break;
            }
            case 521: {
                ghk2 = new ghm();
                break;
            }
            default: {
                lfn.b(5, "SFSensorMessageFactory", "createSensorMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return ghk2;
    }
}

