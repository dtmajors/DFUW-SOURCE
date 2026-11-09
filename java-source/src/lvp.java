/*
 * Decompiled with CFR.
 */
public class lvp
extends lvn {
    private static final lvp sYa = new lvp();
    @lok(value="POOLS")
    @lpl(value="Displayed as the title to the pools section in the character window.")
    public static final lox sYb = sYa.BC("PoolsTitle");
    @lok(value="ROLES")
    @lpl(value="Displayed as the title to the roles section in the character window.")
    public static final lox sYc = sYa.BC("RolesTitle");
    @lok(value="SCHOOLS")
    @lpl(value="Displayed as the title to the schools section in the character window.")
    public static final lox sYd = sYa.BC("SchoolsTitle");
    @lok(value="BOOSTERS")
    @lpl(value="Displayed as the title to the boosters section in the character window. A booster is something that the player can buy in the game that will boost his/her basic attributes.")
    public static final lox sYe = sYa.BC("BoostersTitle");
    @lok(value="PURCHASE BOOSTERS")
    @lpl(value="Displayed as the title to the purchase boosters section in the character window.")
    public static final lox sYf = sYa.BC("PurchaseBoostersTitle");
    @lok(value="UPGRADE COST:<font color=\"$(Color)\">$(Cost)</font>")
    @lpl(value="Displayed in the character gui window. The cost to upgrade a booster.")
    public static final lox sYg = sYa.a("UpgradeCost", lvp.Bh("Cost"), lvp.Bk("Color"));
    @lok(value="YOU HAVE <font color=\"$(Color)\">$(PlayerPoints)</font> PLAYER POINTS")
    @lpl(value="Displayed in the character gui window. Displays the number of player points that the player has.")
    public static final lox sYh = sYa.a("PlayerPoints", lvp.Bh("PlayerPoints"), lvp.Bk("Color"));
    @lok(value="Activate Changes")
    @lpl(value="Displayed in the character gui window. Use in the button that needs to be pressed in order to activate the changes the player has made.")
    public static final lox sYi = sYa.BC("ActivateChanges");
    @lok(value="You can change these settings again in ")
    @lpl(value="Displayed in the character gui window. A notification message that indicates how much time needs to pass before the user can make changes to his character.")
    public static final lox sYj = sYa.BC("CanNotChange2");
    @lok(value="ACTIVATE ONE ATTRIBUTE TO BOOST")
    @lpl(value="Displayed in the character gui window. It prompts the player to select the attribute that should be boosted.")
    public static final lox sYk = sYa.BC("ActivateToBoost");
    @lok(value="ACTIVATE ATTRIBUTE*")
    @lpl(value="Displayed in the character gui window. Label for the booster activate attribute column.")
    public static final lox sYl = sYa.BC("ColumnActivateAttribute");
    @lok(value="UPGRADE*")
    @lpl(value="Displayed in the character gui window. Label for the booster upgrade column.")
    public static final lox sYm = sYa.BC("ColumnUpgrade");
    @lok(value="COST")
    @lpl(value="Displayed in the character gui window. Label for the booster cost column.")
    public static final lox sYn = sYa.BC("ColumnCost");
    @lok(value="$(Points)")
    @lpl(value="Total player points of the targeted player.")
    public static final lox sYo = sYa.a("TotalPlayerPoints", lvp.Bk("Points"));
    @lok(value="THE STRONG")
    @lpl(value="Title of strength booster category.")
    public static final lox sYp = sYa.BC("StrengthBoosterCategory");
    @lok(value="THE AGILE")
    @lpl(value="Title of dexterity booster category.")
    public static final lox sYq = sYa.BC("DexterityBoosterCategory");
    @lok(value="THE SMART")
    @lpl(value="Title of intelligence booster category.")
    public static final lox sYr = sYa.BC("IntelligenceBoosterCategory");
    @lok(value="THE WISE")
    @lpl(value="Title of wisdom booster category.")
    public static final lox sYs = sYa.BC("WisdomBoosterCategory");
    @lok(value="You must wait until you can change again your role.")
    @lpl(value="This message appears to the player when the role system is on cooldown.")
    public static final lox sYt = sYa.BC("OnCooldown");
    @lok(value="You must stand still to change your role.")
    @lpl(value="This message appears to the player when he interrupts the role changing process.")
    public static final lox scZ = sYa.BC("InCorrectState");
    @lok(value="You can not change your role while you are playing as a monster.")
    @lpl(value="This message appears to the player when the role changing process can not continue because player is playing as a monster")
    public static final lox sYu = sYa.BC("PlayingAsMonster");
    @lok(value="Nothing changed.")
    @lpl(value="This message appears to the player when there was no changes.")
    public static final lox scX = sYa.BC("NoChange");
    @lok(value="You can not change your role while you are in combat mode.")
    @lpl(value="This message appears to the player when the role changing process can not continue because player is in combat mode.")
    public static final lox sda = sYa.BC("InCombatMode");
    @lok(value="You have successfully changed your role.")
    @lpl(value="This message appears to the player when the role changing process was successfull.")
    public static final lox scW = sYa.BC("Success");
    @lok(value="There is a pending request.")
    @lpl(value="This message appears to the player when he tries to start a role changing proccess while another one is still active.")
    public static final lox scU = sYa.BC("Proccessing");
    @lok(value="Provided arguments are invalid.")
    @lpl(value="This message appears to the player when the changing role request has invalid arguments. Should not happen.")
    public static final lox scV = sYa.BC("InvalidArgs");

    protected lvp(String string) {
        super("Character." + string);
    }

    private lvp() {
        super("Character");
    }
}

