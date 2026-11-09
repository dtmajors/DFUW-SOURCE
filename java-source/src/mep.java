/*
 * Decompiled with CFR.
 */
public final class mep
extends lpa {
    private static final mep Col = new mep();
    @lok(value="Warrior")
    @lpl(value="Display name for the role Warrior")
    public static final lox Com = Col.BC("warrior_Name");
    @lok(value="The Warrior role is that of the heavy-armored combatant. Wading into battle protected by the strongest armors, and wielding the mightiest of weapons, warriors will be in the front line, shrugging off huge amounts of damage to pummel their foes head on (or on head as it were). Warriors depend mainly on stamina to fuel their devastating attacks.")
    @lpl(value="Description of the role Warrior")
    public static final lox Con = Col.BC("warrior_Description");
    @lok(value="Skirmisher")
    @lpl(value="Display name for the role Skirmisher")
    public static final lox Coo = Col.BC("skirmisher_Name");
    @lok(value="The Skirmisher fights with brains rather than brawn. His prowess comes from cunning attacks, lethal strategy and stealthy ambushes. Skirmisher's wear medium armors to best utilize the protection coupled with the agility they allow in battle. Stamina is the main source of a Skirmisher's skills and attacks.")
    @lpl(value="Description of the role Skirmisher")
    public static final lox Cop = Col.BC("skirmisher_Description");
    @lok(value="Elementalist")
    @lpl(value="Display name for the role Elementalist")
    public static final lox Coq = Col.BC("elementalist_Name");
    @lok(value="Few mortals command the mental discipline and intelligence needed to harness the arcane energies that shape the world around them. This is the role of an Elementalist. Able to invoke devastating magical energies drawn from the elements themselves, they make for formidable foes and powerful allies. An Elementalist fuels his magic by tapping into his mana reserves and he can only wear the lightest armors to weave the spells he casts.")
    @lpl(value="Description of the role Elementalist")
    public static final lox Cor = Col.BC("elementalist_Description");
    @lok(value="Primalist")
    @lpl(value="Display name for the role Primalist")
    public static final lox Cos = Col.BC("primalist_Name");
    @lok(value="Primalists have tapped into the forces that fuel and govern all life and death.  Harnessing ancient wisdom and occult magics the Primalist wades into battle with the power to affect the very life-force of their foes or allies.  Mana fuels all their spells and skills, though he can only wear the lightest armors in order to facilitate the intricate primal energies he wields.")
    @lpl(value="Description of the role Primalist")
    public static final lox Cot = Col.BC("primalist_Description");
    @lok(value="Commoner")
    @lpl(value="Display name for the role Commoner")
    public static final lox Cou = Col.BC("commoner_Name");
    @lok(value="None")
    @lpl(value="Description of the role Commoner")
    public static final lox Cov = Col.BC("commoner_Description");

    public mep() {
        super("Roles");
    }

    public mep(String string) {
        super("Roles." + string);
    }
}

