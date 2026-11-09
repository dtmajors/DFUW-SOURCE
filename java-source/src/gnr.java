/*
 * Decompiled with CFR.
 */
public class gnr {
    public gnq Ks(int n) {
        gnq gnq2 = null;
        switch (n) {
            case 9985: {
                gnq2 = new gnx();
                break;
            }
            case 9986: {
                gnq2 = new gnv();
                break;
            }
            case 9987: {
                gnq2 = new gnw();
                break;
            }
            case 9988: {
                gnq2 = new gnt();
                break;
            }
            case 9989: {
                gnq2 = new gnu();
                break;
            }
            case 9990: {
                gnq2 = new gns();
                break;
            }
            default: {
                lfn.b(5, "SFStorageMessageFactory", "createStorageMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return gnq2;
    }
}

