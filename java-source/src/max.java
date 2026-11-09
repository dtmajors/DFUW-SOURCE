/*
 * Decompiled with CFR.
 */
public class max
extends mai {
    private static final max ufL = new max();
    @lok(value="Guard tower is already boosted.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufM = ufL.BC("AlreadyBoosted");
    @lok(value="Boosting proccess has already started.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufN = ufL.BC("AlreadyBoosting");
    @lok(value="You are not a member in the clan which owns the city.")
    @lol(value="Functionality is not enabled.")
    public static final lox rXm = ufL.BC("NotInClan");
    @lok(value="This city does not belong to any clan.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufO = ufL.BC("CityIsFree");
    @lok(value="Your clan does not own this city.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufP = ufL.BC("NotCityOwners");
    @lok(value="Boosting proccess interrupted.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufQ = ufL.BC("BoostingInterrupted");
    @lok(value="You need $(Quantity) of $(Item.Name$(Quantity.Plurality)) to boost this guard tower.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufR = ufL.a("NotEnoughPowder", max.Bh("Quantity"), max.Bl("Item"));
    @lok(value="This guard tower is disabled.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufS = ufL.BC("IsDisabled");
    @lok(value="Boosting proccess failed.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufT = ufL.BC("ProccessFailed");
    @lok(value="Boosting proccess succeed.")
    @lol(value="Functionality is not enabled.")
    public static final lox ufU = ufL.BC("ProccessSuccessful");

    protected max(String string) {
        super("GuardTower." + string);
    }

    private max() {
        super("GuardTower");
    }
}

