/*
 * Decompiled with CFR.
 */
public class mci
extends lzh {
    private static final mci uuP = new mci();
    @lok(value="Take heed, your $(Resource.NameSingular) is about to wander back into the summoning ether. Despawn it before you lose it")
    @lpl(value="Displayed when player's mount is going to lose the ownership.")
    public static final lox uuQ = uuP.a("DegenerationStarted", mci.Bl("Resource"));
    @lok(value="Take heed, your $(Resource.NameSingular) is about to lose ownership and will be freely available for everyone.")
    @lpl(value="Displayed when player's mount is going to lose the ownership.")
    public static final lox uuR = uuP.a("OwnershipWillExpire", mci.Bl("Resource"));

    protected mci(String string) {
        super("OwnableObjects." + string);
    }

    private mci() {
        super("OwnableObjects");
    }
}

