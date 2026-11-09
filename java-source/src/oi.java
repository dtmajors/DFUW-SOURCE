/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;

@mh(qC="pso_mentoring", key="CharacterID")
public class oi
extends na {
    @mg(qA="CharacterID", qB=false)
    public int SN = -1;
    @mg(qA="Registered", qB=true)
    public boolean acV = false;
    @mg(qA="BlackListed", qB=true)
    public boolean acW = false;
    @mg(qA="NumberOfRates", qB=true)
    public int acX = 0;
    @mg(qA="TotalRating", qB=true)
    public float acY = 0.0f;
    @mg(qA="RegisteredTime", qB=false)
    public Timestamp aFz = null;
    @mg(qA="BlackListedTime", qB=true)
    public Timestamp aFA = null;
}

