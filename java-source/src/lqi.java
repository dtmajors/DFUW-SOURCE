/*
 * Decompiled with CFR.
 */
public class lqi
extends lqd {
    private static final lqi scM = new lqi();
    @lok(value="You already own this booster.")
    @lol(value="Developer command.")
    public static final lox scN = scM.BC("Owned");
    @lok(value="You do not have enough player points to complete the transaction.")
    @lol(value="Developer command.")
    public static final lox scO = scM.BC("NotEnoughPoints");
    @lok(value="You must unlock all previous locked boosters in the same group to unlock this one.")
    @lol(value="Developer command.")
    public static final lox scP = scM.BC("NotAvailable");
    @lok(value="You have successfully purchaded the booster.")
    @lol(value="Developer command.")
    public static final lox scQ = scM.BC("UnLocked");
    @lok(value="System is not ready.")
    @lol(value="Developer command.")
    public static final lox scR = scM.BC("SystemNotReady");
    @lok(value="The given parameters are invalid.")
    @lol(value="Developer command.")
    public static final lox scS = scM.BC("Invalid");
    @lok(value="System is on cooldown.")
    @lol(value="Developer command.")
    public static final lox scT = scM.BC("OnCoolDown");
    @lok(value="You have already initiated the process.")
    @lol(value="Developer command.")
    public static final lox scU = scM.BC("Proccessing");
    @lok(value="Argument : $(Argument) is  invalid.")
    @lol(value="Developer command.")
    public static final lox scV = scM.a("InvalidArgs", lqi.Bk("Argument"));
    @lok(value="You have sucessfully completed the proccess.")
    @lol(value="Developer command.")
    public static final lox scW = scM.BC("Success");
    @lok(value="Nothing changed.")
    @lol(value="Developer command.")
    public static final lox scX = scM.BC("NoChange");
    @lok(value="You can not perform this action while you are playing as a monster.")
    @lol(value="Developer command.")
    public static final lox scY = scM.BC("Monster");
    @lok(value="You can not perform this action now. Try again.")
    @lol(value="Developer command.")
    public static final lox scZ = scM.BC("InCorrectState");
    @lok(value="You can not change a role while you are in combat mode.")
    @lol(value="Developer command.")
    public static final lox sda = scM.BC("InCombatMode");
    @lok(value="Name : $(Name) Locked : $(Unlocked)")
    @lol(value="Developer command.")
    public static final lox sdb = scM.a("BoosterInfo", lqi.Bk("Name"), lqi.Bj("Unlocked"));
    @lok(value="$(Message)")
    @lol(value="Developer command.")
    public static final lox sdc = scM.a("BoosterMessage", lqi.Bk("Message"));
    @lok(value="Invalid result")
    @lol(value="Developer command.")
    public static final lox sdd = scM.BC("InvalidResult");

    protected lqi(String string) {
        super("Roles." + string);
    }

    private lqi() {
        super("Roles");
    }
}

