/*
 * Decompiled with CFR.
 */
public class mbu
extends lzh {
    private static final mbu uoa = new mbu();
    @lok(value="Feat $(FeatName) unlocked. $(TrackerLink)")
    @lpl(value="Displayed when the player unlocks a feat.")
    public static final lox uob = uoa.a("Unlocked", mbu.Bk("FeatName"), mbu.Bk("TrackerLink"));
    @lok(value="Feat $(FeatName) progress $(CurrentProgress)/$(TotalProgress). $(TrackerLink)")
    @lpl(value="Displayed when the player unlocks a feat.")
    public static final lox tja = uoa.a("Progress", mbu.Bk("FeatName"), mbu.Bh("CurrentProgress"), mbu.Bh("TotalProgress"), mbu.Bk("TrackerLink"));
    @lok(value="Feat $(FeatName) completed.")
    @lpl(value="Displayed when the player completes a feat.")
    public static final lox tiK = uoa.a("Completed", mbu.Bk("FeatName"));
    @lok(value="The feat $(FeatName) cannot be added to the Tracker now. Please remove one or more items from the Tracker and retry.")
    @lpl(value="Displayed when the tracker is full and cannot accept more items.")
    public static final lox uoc = uoa.a("TrackerFull", mbu.Bk("FeatName"));
    @lok(value="The starting feat $(FeatName) cannot be removed from the Tracker.")
    @lpl(value="Displayed when the the user attempts to remove a starting feat which is placed automatically on the tracker.")
    public static final lox uod = uoa.a("StartingFeatCannotBeRemoved", mbu.Bk("FeatName"));
    @lok(value="The feat $(FeatName) cannot be removed from the Tracker because it is no longer in the Tracker.")
    @lpl(value="Displayed when the the user attempts to remove a feat which is not on the tracker.")
    public static final lox uoe = uoa.a("FeatCannotBeRemoved", mbu.Bk("FeatName"));

    protected mbu(String string) {
        super("Feats." + string);
    }

    private mbu() {
        super("Feats");
    }
}

