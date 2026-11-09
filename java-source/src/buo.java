/*
 * Decompiled with CFR.
 */
public class buo {
    public ldv GUID = null;
    public ldv Rr = null;
    public String FirstName = null;
    public String LastName = null;
    public String add = null;
    public String bnj = null;
    public String bnk = null;

    public void a(uk[] ukArray) {
        assert (ukArray != null);
        int n = ukArray.length;
        for (int i = 0; i < n; ++i) {
            if (ukArray[i] == null) {
                lfn.b(5, "SFTitleCollection", "handlePropertyUpdates() PropertyUpdate " + i + " is null for object " + this.GUID);
                continue;
            }
            this.a(ukArray[i]);
        }
    }

    private void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                this.FirstName = ((uo)uk2).Value;
                break;
            }
            case 2: {
                this.LastName = ((uo)uk2).Value;
                break;
            }
            case 3: {
                this.add = ((uo)uk2).Value;
                break;
            }
            case 4: {
                this.bnj = ((uo)uk2).Value;
                break;
            }
            case 5: {
                this.bnk = ((uo)uk2).Value;
                break;
            }
            default: {
                lfn.b(5, "SFTitleCollection", "handlePropertyUpdate() Invalid propertyID provided: " + uk2.Uo);
                assert (false);
                return;
            }
        }
    }
}

