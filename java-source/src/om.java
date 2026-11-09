/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;

@mh(qC="pso_quests", key="CharacterID", qD="QuestName")
public class om
extends na {
    @mg(qA="CharacterID", qB=false)
    public int SN;
    @mg(qA="QuestState", qB=false)
    public String aGa;
    public int ayK;
    @mg(qA="QuestName", qB=false)
    public String aGb;
    @mg(qA="CurrentSubQuestIndex", qB=false)
    public int aGc;
    @mg(qA="VendorName", qB=false)
    public String ayB;
    @mf(qA="Targets", qB=true)
    public on[] aGd;
    @mg(qA="StateUpdatedTime", qB=false)
    public Timestamp aGe = null;
    @mg(qA="RemainingTime", qB=true)
    public long azi;
}

