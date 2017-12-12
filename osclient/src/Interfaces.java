
public class Interfaces extends RSInterface {

	public static void loadInterfaces() {
		prayerTab(defaultTextDrawingAreas);
		Ironman(defaultTextDrawingAreas);
		runepouch(defaultTextDrawingAreas);
		barrowText(defaultTextDrawingAreas);
		ModeInfo(defaultTextDrawingAreas);
        CasualMode(defaultTextDrawingAreas);
        NormalMode(defaultTextDrawingAreas);
        HardenedMode(defaultTextDrawingAreas);
        IronMode(defaultTextDrawingAreas);
        UltimateIronMode(defaultTextDrawingAreas);
		
		Pestpanel(defaultTextDrawingAreas);
		Pestpanel2(defaultTextDrawingAreas);
		addPestControlRewardWidget(defaultTextDrawingAreas);
		helpComponent(defaultTextDrawingAreas);
		helpDatabaseComponent(defaultTextDrawingAreas);
		spawnInterface(defaultTextDrawingAreas);
		addAntibotWidget(defaultTextDrawingAreas);
		MainTeleInterface(defaultTextDrawingAreas);
		//playerProfiler(defaultTextDrawingAreas);
		Drops(defaultTextDrawingAreas);
		SkillTeleport(defaultTextDrawingAreas);
		AgilityTeleport(defaultTextDrawingAreas);
		FishingTeleport(defaultTextDrawingAreas);
		WoodcuttingTeleport(defaultTextDrawingAreas);
		MiningTeleport(defaultTextDrawingAreas);
		FarmingTeleport(defaultTextDrawingAreas);
		HunterTeleport(defaultTextDrawingAreas);
		ThievingTeleport(defaultTextDrawingAreas);
		SmithingTeleport(defaultTextDrawingAreas);
		RunecraftingTeleport(defaultTextDrawingAreas);
		MobDrops(defaultTextDrawingAreas);
		BossDrops(defaultTextDrawingAreas);
		Spinning(defaultTextDrawingAreas);
		emoteTab(defaultTextDrawingAreas);
		//questTab(defaultTextDrawingAreas);
	}
	
	
	public static void ModeInfo(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(57150);
		addSprite(57151, 13, "Interfaces/Iron/IMAGE");
		addText(57155, "Select a mode to view \\n"
                + "more information:", tda, 1, 0xFFFFFF, true, true);
		addConfigButton(57156, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Casual", 1, 5, 700);
		addConfigButton(57157, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Normal", 2, 5, 700);
		addConfigButton(57158, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Hardened", 3, 5, 700);
        addConfigButton(57159, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Ironman", 4, 5, 700);
        addConfigButton(57160, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Ultimate Ironman", 5, 5, 700);
		addText(57165, "Account Setup", tda, 2, 0xff9933, true, true);
        addText(57166, "Casual", tda, 2, 0xff9933, false, true);
        addText(57167, "Normal", tda, 2, 0xff9933, false, true);
        addText(57168, "Hardened", tda, 2, 0xff9933, false, true);
        addText(57169, "Ironman", tda, 2, 0xff9933, false, true);
        addText(57170, "Ultimate Ironman", tda, 2, 0xff9933, false, true);
		rsinterface.totalChildren(13);
		rsinterface.child(0, 57151, 5, 5); //background
		rsinterface.child(1, 57155, 100, 50);
		rsinterface.child(2, 57156, 25, 90);
		rsinterface.child(3, 57157, 25, 120);
		rsinterface.child(4, 57158, 25, 150);
        rsinterface.child(5, 57159, 25, 200);
        rsinterface.child(6, 57160, 25, 230);
		rsinterface.child(7, 57165, 105, 15); //title
        rsinterface.child(8, 57166, 45, 90);
        rsinterface.child(9, 57167, 45, 120);
        rsinterface.child(10, 57168, 45, 150);
        rsinterface.child(11, 57169, 45, 200);
        rsinterface.child(12, 57170, 45, 230);
	}

    public static void CasualMode(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(57250);
        addSprite(57251, 12, "Interfaces/Iron/IMAGE");
        addText(57255, "Casual mode is suited to players \\n"
                + "who like getting straight into the \\n"
                + "action. \\n"
                + "\\n"
                + "You will receive slightly decreased \\n"
                + "drop rates to compensate.", tda, 2, 0xFFFFFF, true, true);
        addSprite(57264, 9, "Interfaces/Iron/IMAGE");
        addText(57265, "Game Mode Selection", tda, 2, 0xff9933, true, true);
        addText(57266, "Casual Mode", tda, 2, 0xFFFFFF, true, true);
        addText(57267, "270x OSRS Combat XP Rate", tda, 1, 0xFFFFFF, false, true);
        addSprite(57268, 14, "Interfaces/Iron/IMAGE");
        addText(57269, "Decreased Drop Rates", tda, 1, 0xFFFFFF, false, true);
        addHoverButton(57370, "Interfaces/Iron/IMAGE", 5, 23, 23, "Confirm Mode", -1, 57370, 1);
        addHoveredButton(57371, "Interfaces/Iron/IMAGE", 6, 23, 23, 57372);
        addText(57273, "Confirm mode", tda, 2, 0xff9933, true, true);

        setChildren(12, tab);
        setBounds(57251, 210, 5, 0, tab);
        setBounds(57255, 355, 160, 1, tab);
        setBounds(57264, 230, 80, 2, tab);
        setBounds(57265, 350, 15, 3, tab);
        setBounds(57266, 350, 55, 4, tab);
        setBounds(57267, 260, 85, 5, tab);
        setBounds(57150, 0, 0, 6, tab);
        setBounds(57268, 230, 110, 7, tab);
        setBounds(57269, 260, 118, 8, tab);
        setBounds(57370, 340, 275, 9, tab);
        setBounds(57371, 340, 275, 10, tab);
        setBounds(57273, 350, 298, 11, tab);
    }

    public static void NormalMode(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(57350);
        addSprite(57351, 12, "Interfaces/Iron/IMAGE");
        addText(57355, "Normal mode is suited to players \\n"
                + "who prefer a slightly slower XP rate\\n"
                + "compared with casual mode.\\n"
                + "\\n"
                + "In return players will receive regular \\n"
                + "OS World drop rates.", tda, 2, 0xFFFFFF, true, true);
        addSprite(57364, 9, "Interfaces/Iron/IMAGE");
        addText(57365, "Game Mode Selection", tda, 2, 0xff9933, true, true);
        addText(57366, "Normal Mode", tda, 2, 0xFFFFFF, true, true);
        addText(57367, "135x OSRS Combat XP Rate", tda, 1, 0xFFFFFF, false, true);
        addSprite(57368, 14, "Interfaces/Iron/IMAGE");
        addText(57369, "Normal Drop Rates", tda, 1, 0xFFFFFF, false, true);
        addHoverButton(57470, "Interfaces/Iron/IMAGE", 5, 23, 23, "Confirm Mode", -1, 57470, 1);
        addHoveredButton(57471, "Interfaces/Iron/IMAGE", 6, 23, 23, 57472);
        addText(57373, "Confirm mode", tda, 2, 0xff9933, true, true);

        setChildren(12, tab);
        setBounds(57351, 210, 5, 0, tab);
        setBounds(57355, 355, 170, 1, tab);
        setBounds(57364, 230, 80, 2, tab);
        setBounds(57365, 350, 15, 3, tab);
        setBounds(57366, 350, 55, 4, tab);
        setBounds(57367, 260, 85, 5, tab);
        setBounds(57150, 0, 0, 6, tab);
        setBounds(57368, 230, 110, 7, tab);
        setBounds(57369, 260, 118, 8, tab);
        setBounds(57470, 340, 275, 9, tab);
        setBounds(57471, 340, 275, 10, tab);
        setBounds(57373, 350, 298, 11, tab);
    }

    public static void HardenedMode(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(57450);
        addSprite(57451, 12, "Interfaces/Iron/IMAGE");
        addText(57455, "Hardened mode is not for the\\n"
                + "faint hearted! With slow combat XP\\n"
                + "rates, it's suited to players who like \\n"
                + "grinding for their stats. \\n"
                + "\\n"
                + "This mode comes with a unique\\n"
                + "weapon.", tda, 2, 0xFFFFFF, true, true);
        addSprite(57464, 9, "Interfaces/Iron/IMAGE");
        addText(57465, "Game Mode Selection", tda, 2, 0xff9933, true, true);
        addText(57466, "Hardened Mode", tda, 2, 0xFFFFFF, true, true);
        addText(57467, "33x OSRS Combat XP Rate", tda, 1, 0xFFFFFF, false, true);
        addSprite(57468, 14, "Interfaces/Iron/IMAGE");
        addText(57469, "Increased Drop Rates", tda, 1, 0xFFFFFF, false, true);
        addHoverButton(57570, "Interfaces/Iron/IMAGE", 5, 23, 23, "Confirm Mode", -1, 57570, 1);
        addHoveredButton(57571, "Interfaces/Iron/IMAGE", 6, 23, 23, 57572);
        addText(57473, "Confirm mode", tda, 2, 0xff9933, true, true);
        addSprite(57474, 15, "Interfaces/Iron/IMAGE");
        addText(57475, "Signature Weapon", tda, 1, 0xFFFFFF, false, true);

        setChildren(14, tab);
        setBounds(57451, 210, 5, 0, tab);
        setBounds(57455, 355, 173, 1, tab);
        setBounds(57464, 230, 80, 2, tab);
        setBounds(57465, 350, 15, 3, tab);
        setBounds(57466, 350, 55, 4, tab);
        setBounds(57467, 260, 85, 5, tab);
        setBounds(57150, 0, 0, 6, tab);
        setBounds(57468, 230, 110, 7, tab);
        setBounds(57469, 260, 118, 8, tab);
        setBounds(57570, 340, 275, 9, tab);
        setBounds(57571, 340, 275, 10, tab);
        setBounds(57473, 350, 298, 11, tab);
        setBounds(57474, 230, 145, 12, tab);
        setBounds(57475, 260, 150, 13, tab);
    }

    public static void IronMode(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(57550);
        addSprite(57551, 12, "Interfaces/Iron/IMAGE");
        addText(57555, "Ironman mode is suited for players\\n"
                + "that like to do things solo.\\n"
                + "\\n"
                + "Trading and access to certain\\n"
                + "activities is disabled, making \\n"
                + "this mode a challenge!", tda, 2, 0xFFFFFF, true, true);
        addSprite(57564, 9, "Interfaces/Iron/IMAGE");
        addText(57565, "Game Mode Selection", tda, 2, 0xff9933, true, true);
        addText(57566, "Ironman Mode", tda, 2, 0xFFFFFF, true, true);
        addText(57567, "150x OSRS Combat XP Rate", tda, 1, 0xFFFFFF, false, true);
        addSprite(57568, 18, "Interfaces/Iron/IMAGE");
        addText(57569, "No Trading!", tda, 1, 0xFFFFFF, false, true);
        addHoverButton(57670, "Interfaces/Iron/IMAGE", 5, 23, 23, "Confirm Mode", -1, 57670, 1);
        addHoveredButton(57671, "Interfaces/Iron/IMAGE", 6, 23, 23, 57672);
        addText(57573, "Confirm mode", tda, 2, 0xff9933, true, true);
        addSprite(57574, 16, "Interfaces/Iron/IMAGE");

        setChildren(13, tab);
        setBounds(57551, 210, 5, 0, tab);
        setBounds(57555, 355, 158, 1, tab);
        setBounds(57564, 230, 80, 2, tab);
        setBounds(57565, 350, 15, 3, tab);
        setBounds(57566, 355, 55, 4, tab);
        setBounds(57567, 260, 85, 5, tab);
        setBounds(57150, 0, 0, 6, tab);
        setBounds(57568, 233, 113, 7, tab);
        setBounds(57569, 260, 118, 8, tab);
        setBounds(57670, 340, 275, 9, tab);
        setBounds(57671, 340, 275, 10, tab);
        setBounds(57573, 350, 298, 11, tab);
        setBounds(57574, 295, 55, 12, tab);
    }

    public static void UltimateIronMode(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(57650);
        addSprite(57651, 12, "Interfaces/Iron/IMAGE");
        addText(57655, "This mode is the ultimate challenge! \\n"
                + "Not only is trading disabled, but\\n"
                + "banking is too.\\n"
                + "\\n"
                + "Do you have what it takes to\\n"
                + "take on OS-World's toughest mode?", tda, 2, 0xFFFFFF, true, true);
        addSprite(57664, 9, "Interfaces/Iron/IMAGE");
        addText(57665, "Game Mode Selection", tda, 2, 0xff9933, true, true);
        addText(57666, "Ultimate Ironman Mode", tda, 2, 0xFFFFFF, true, true);
        addText(57667, "150x OSRS Combat XP Rate", tda, 1, 0xFFFFFF, false, true);
        addSprite(57668, 18, "Interfaces/Iron/IMAGE");
        addText(57669, "No Trading!", tda, 1, 0xFFFFFF, false, true);
        addHoverButton(57770, "Interfaces/Iron/IMAGE", 5, 23, 23, "Confirm Mode", -1, 57770, 1);
        addHoveredButton(57771, "Interfaces/Iron/IMAGE", 6, 23, 23, 57772);
        addText(57673, "Confirm mode", tda, 2, 0xff9933, true, true);
        addSprite(57674, 17, "Interfaces/Iron/IMAGE");
        addSprite(57768, 18, "Interfaces/Iron/IMAGE");
        addText(57769, "No Banking!", tda, 1, 0xFFFFFF, false, true);

        setChildren(15, tab);
        setBounds(57651, 210, 5, 0, tab);
        setBounds(57655, 355, 185, 1, tab);
        setBounds(57664, 230, 80, 2, tab);
        setBounds(57665, 350, 15, 3, tab);
        setBounds(57666, 360, 55, 4, tab);
        setBounds(57667, 260, 85, 5, tab);
        setBounds(57150, 0, 0, 6, tab);
        setBounds(57668, 233, 113, 7, tab);
        setBounds(57669, 260, 118, 8, tab);
        setBounds(57770, 340, 275, 9, tab);
        setBounds(57771, 340, 275, 10, tab);
        setBounds(57673, 350, 298, 11, tab);
        setBounds(57674, 270, 55, 12, tab);
        setBounds(57768, 233, 148, 13, tab);
        setBounds(57769, 260, 150, 14, tab);
    }

	
	  public static void emoteTab(TextDrawingArea[] tda) {
	        RSInterface tab = addTabInterface(17700);
	        RSInterface scroll = addTabInterface(17701);
	        tab.totalChildren(1);
	        tab.child(0, 17701, 0, 1);  
		//addButton(168, 0, "Interfaces/Emotes/Emote", "Yes", 41, 47);
		//addButton(169, 1, "Interfaces/Emotes/Emote", "No", 41, 47);
		//addButton(164, 2, "Interfaces/Emotes/Emote", "Bow", 41, 47);
		//addButton(165, 3, "Interfaces/Emotes/Emote", "Angry", 41, 47);
		//addButton(162, 4, "Interfaces/Emotes/Emote", "Think", 41, 47);
		//addButton(163, 5, "Interfaces/Emotes/Emote", "Wave", 41, 47);
		//addButton(13370, 6, "Interfaces/Emotes/Emote", "Shrug", 41, 47);
		//addButton(171, 7, "Interfaces/Emotes/Emote", "Cheer", 41, 47);
		//addButton(167, 8, "Interfaces/Emotes/Emote", "Beckon", 41, 47);
		//addButton(170, 9, "Interfaces/Emotes/Emote", "Laugh", 41, 47);
		//addButton(13366, 10, "Interfaces/Emotes/Emote", "Jump for Joy", 41, 47);
		//addButton(13368, 11, "Interfaces/Emotes/Emote", "Yawn", 41, 47);
		//addButton(166, 12, "Interfaces/Emotes/Emote", "Dance", 41, 47);
		//addButton(13363, 13, "Interfaces/Emotes/Emote", "Jig", 41, 47);
		//addButton(13364, 14, "Interfaces/Emotes/Emote", "Spin", 41, 47);
		//addButton(13365, 15, "Interfaces/Emotes/Emote", "Headbang", 41, 47);
		//addButton(161, 16, "Interfaces/Emotes/Emote", "Cry", 41, 47);
		//addButton(11100, 17, "Interfaces/Emotes/Emote", "Blow kiss", 41, 47);
		//addButton(13362, 18, "Interfaces/Emotes/Emote", "Panic", 41, 47);
		//addButton(13367, 19, "Interfaces/Emotes/Emote", "Raspberry", 41, 47);
		//addButton(172, 20, "Interfaces/Emotes/Emote", "Clap", 41, 47);
		//addButton(13369, 21, "Interfaces/Emotes/Emote", "Salute", 41, 47);
		//addButton(13383, 22, "Interfaces/Emotes/Emote", "Goblin Bow", 41, 47);
		//addButton(13384, 23, "Interfaces/Emotes/Emote", "Goblin Salute", 41, 47);
		//addButton(667, 24, "Interfaces/Emotes/Emote", "Glass Box", 41, 47);
		//addButton(6503, 25, "Interfaces/Emotes/Emote", "Climb Rope", 41, 47);
		//addButton(6506, 26, "Interfaces/Emotes/Emote", "Lean On Air", 41, 47);
		//addButton(666, 27, "Interfaces/Emotes/Emote", "Glass Wall", 41, 47);
		//addButton(18700, 8, "Interfaces/Emotes/Emote", "Idea", 41, 47);
		//addButton(18701, 9, "Interfaces/Emotes/Emote", "Stamp", 41, 47);
		//addButton(18702, 10, "Interfaces/Emotes/Emote", "Flap", 41, 47);
		//addButton(18703, 11, "Interfaces/Emotes/Emote", "Slap Head", 41, 47);
		addHoverButton(18700, "Interfaces/Extra/IMAGE", 50, 48, 48, "Idea", -1, 18701, 1);
		addHoverButton(18702, "Interfaces/Extra/IMAGE", 51, 48, 48, "Stamp", -1, 18703, 1);
		addHoverButton(18704, "Interfaces/Extra/IMAGE", 52, 48, 48, "Flap", -1, 18705, 1);
		addHoverButton(18706, "Interfaces/Extra/IMAGE", 53, 48, 48, "Slap Head", -1, 18707, 1);
		addHoverButton(18808, "Interfaces/Extra/IMAGE", 54, 48, 48, "Sit Up", -1, 18809, 1);
		addHoverButton(18810, "Interfaces/Extra/IMAGE", 55, 48, 48, "Push Up", -1, 18811, 1);
		addHoverButton(18812, "Interfaces/Extra/IMAGE", 56, 48, 48, "Star Jump", -1, 18813, 1);
		addHoverButton(18814, "Interfaces/Extra/IMAGE", 57, 48, 48, "Jog", -1, 18815, 1);
		addHoverButton(18716, "Interfaces/Extra/IMAGE", 58, 48, 48, "Zombie Walk", -1, 18717, 1);
		addHoverButton(18718, "Interfaces/Extra/IMAGE", 59, 48, 48, "Zombie Dance", -1, 18719, 1);
		addHoverButton(18720, "Interfaces/Extra/IMAGE", 60, 48, 48, "Scared", -1, 18721, 1);
		addHoverButton(18722, "Interfaces/Extra/IMAGE", 61, 48, 48, "Rabbit Hop", -1, 18723, 1);
		addHoverButton(18724, "Interfaces/Extra/IMAGE", 62, 48, 48, "Zombie Hand", -1, 18725, 1);
		addHoverButton(18726, "Interfaces/Extra/IMAGE", 63, 48, 48, "Hypermobile Drinker", -1, 18727, 1);
		addHoverButton(18728, "Interfaces/Extra/IMAGE", 64, 48, 48, "Air Guitar", -1, 18729, 1);
		addHoverButton(18730, "Interfaces/Extra/IMAGE", 65, 48, 48, "Uri Transform", -1, 18731, 1);
		addHoverButton(18732, "Interfaces/Extra/IMAGE", 66, 48, 48, "Skill Cape", -1, 18733, 1);
		scroll.totalChildren(45);
		scroll.child(0, 168, 10, 7);
		scroll.child(1, 169, 54, 7);
		scroll.child(2, 164, 98, 14);
		scroll.child(3, 167, 137, 7);
		scroll.child(4, 162, 9, 56);
		scroll.child(5, 163, 48, 56);
	scroll.child(6, 13370, 95, 56);
		scroll.child(7, 171, 137, 56);
		scroll.child(8, 165, 7, 105);
		scroll.child(9, 170, 51, 105);
		scroll.child(10, 13366, 95, 104);
		scroll.child(11, 13368, 139, 105);
		scroll.child(12, 166, 6, 154);
		scroll.child(13, 13363, 50, 154);
		scroll.child(14, 13364, 90, 154);
		scroll.child(15, 13365, 135, 154);
		scroll.child(16, 161, 8, 204);
		scroll.child(17, 11100, 51, 203);
		scroll.child(18, 13362, 99, 204);
		scroll.child(19, 13367, 137, 203);
		scroll.child(20, 172, 10, 253);
		scroll.child(21, 13369, 53, 253);
		scroll.child(22, 13383, 88, 258);
		scroll.child(23, 13384, 138, 252);
		scroll.child(24, 667, 6, 303);
		scroll.child(25, 6503, 49, 302);
		scroll.child(26, 6506, 93, 302);
		scroll.child(27, 666, 137, 302);
		scroll.child(28, 18700, 6, 352);
		scroll.child(29, 18702, 49, 352);
		scroll.child(30, 18704, 87, 352);
		scroll.child(31, 18706, 137, 352);
		scroll.child(32, 18716, 10, 402);
		scroll.child(33, 18718, 49, 402);
		scroll.child(34, 18720, 92, 402);
		scroll.child(35, 18722, 137, 402);
		scroll.child(36, 18808, 1, 457);
		scroll.child(37, 18810, 49, 457);
		scroll.child(38, 18812, 97, 450);
		scroll.child(39, 18814, 137, 452);
		scroll.child(40, 18724, 6, 500);
		scroll.child(41, 18726, 55, 500);
		scroll.child(42, 18732, 87, 502);
		scroll.child(43, 18728, 129, 502);
		scroll.child(44, 18730, 9, 552);
		scroll.width = 173;
		scroll.height = 260;
		scroll.scrollMax = 600;
	}
	
	
	
	
	public static void Spinning(TextDrawingArea[] tda) {
	RSInterface rsinterface = addInterface(59265);
	addSprite(44445, 1, "Interfaces/Misc/IMAGE");
	addHoverButton(44446, "Interfaces/Iron/IMAGE", 7, 21, 21, "Close", -1, 44447, 1);
	addHoveredButton(44447, "Interfaces/Iron/IMAGE", 8, 21, 21, 44448);
	addHoverButton(44449, "Interfaces/Iron/IMAGE", 70, 80, 80, "Spin Wool", -1, 44450, 1);
	addHoveredButton(44450, "Interfaces/Iron/IMAGE", 80, 80, 80, 44451);
	addHoverButton(44452, "Interfaces/Iron/IMAGE", 70, 80, 80, "Spin Flax", -1, 44453, 1);
	addHoveredButton(44453, "Interfaces/Iron/IMAGE", 80, 80, 80, 44454);
	addHoverButton(44455, "Interfaces/Iron/IMAGE", 70, 80, 80, "Spin Sinew", -1, 44456, 1);
	addHoveredButton(44456, "Interfaces/Iron/IMAGE", 80, 80, 80, 44457);
	addHoverButton(44458, "Interfaces/Iron/IMAGE", 70, 80, 80, "Spin Roots", -1, 44459, 1);
	addHoveredButton(44459, "Interfaces/Iron/IMAGE", 80, 80, 80, 44460);
	addHoverButton(44461, "Interfaces/Iron/IMAGE", 70, 80, 80, "Spin Magic Roots", -1, 44462, 1);
	addHoveredButton(44462, "Interfaces/Iron/IMAGE", 80, 80, 80, 44463);
	addHoverButton(44464, "Interfaces/Iron/IMAGE", 70, 80, 80, "Spin Yak Hair", -1, 44465, 1);
	addHoveredButton(44465, "Interfaces/Iron/IMAGE", 80, 80, 80, 44466);
	addText(44467, "@gre@Ball of Wool", tda, 1, 0xff9933, true, true);
	addText(44468, "@gre@Bow String", tda, 1, 0xff9933, true, true);
	addText(44469, "@gre@Magic Amulet String", tda, 1, 0xff9933, true, true);
	addText(44470, "@gre@C'Bow String", tda, 1, 0xff9933, true, true);
	addText(44472, "@gre@C'Bow String", tda, 1, 0xff9933, true, true);
	addText(44473, "@gre@Rope", tda, 1, 0xff9933, true, true);
	rsinterface.totalChildren(21);
	rsinterface.child(0, 44445, 9, 5);
	rsinterface.child(1, 44446, 442, 11);
	rsinterface.child(2, 44447, 442, 11);
	rsinterface.child(3, 44449, 70, 50); //wool
	rsinterface.child(4, 44450, 70, 50); //wool
	rsinterface.child(5, 44452, 200, 50); //flax
	rsinterface.child(6, 44453, 200, 50); //flax
	rsinterface.child(7, 44455, 325, 50); //sinew
	rsinterface.child(8, 44456, 325, 50); //sinew
	rsinterface.child(9, 44458, 70, 170); //roots
	rsinterface.child(10, 44459, 70, 170); //roots
	rsinterface.child(11, 44461, 200, 170); //magic roots
	rsinterface.child(12, 44462, 200, 170); //magic roots
	rsinterface.child(13, 44464, 325, 170); //yak hair
	rsinterface.child(14, 44465, 325, 170); //yak hair
	rsinterface.child(15, 44467, 110, 115); //Text
	rsinterface.child(16, 44468, 240, 115); //Text
	rsinterface.child(17, 44469, 360, 115); //Text
	rsinterface.child(18, 44470, 110, 235); //Text
	rsinterface.child(19, 44472, 240, 235); //Text
	rsinterface.child(20, 44473, 360, 235); //Text
}
	public static void Drops(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(55555);
		addSprite(55556, 4, "Interfaces/Killcount/IMAGE");
		addHoverButton(55557, "Interfaces/Killcount/IMAGE", 1337, 23, 23, "Close", -1, 55558, 1);
		addHoveredButton(55558, "Interfaces/Killcount/IMAGE", 3, 23, 23, 55559);
		addText(55590, "Drops", tda, 2, 0xFFFFFF, true, true);
		rsinterface.totalChildren(5);
		rsinterface.child(0, 55556, 1, 15);
		rsinterface.child(1, 55557, 449, 38);
		rsinterface.child(2, 55558, 449, 38);
		rsinterface.child(3, 55560, 165, 70);
		rsinterface.child(4, 55590, 265, 100);
		RSInterface scrollInterface = addTabInterface(55560);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 280;//280
		scrollInterface.height = 230;
		scrollInterface.scrollMax = 1200;
		int x = 7, y = 11;
		int amountOfLines = 90;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(55561 + i, "", "", tda, 1, 0x46320A, false, true, 168);
			scrollInterface.child(i, 55561 + i, x, y);//#9F703A //nice one 0x9D8851
			y += 22;
		}
	}
	public static void Ironman(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(27150);
		addSprite(27151, 1, "Interfaces/Iron/IMAGE");
		addHoverButton(27152, "Interfaces/Iron/IMAGE", 7, 21, 21, "Close", -1, 27153, 1);
		addHoveredButton(27153, "Interfaces/Iron/IMAGE", 8, 21, 21, 27154);
		addText(27155, "Starter", tda, 2, 0xFFFFFF, true, true);
		addConfigButton(27156, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Ironman", 1, 5, 700);
		addConfigButton(27157, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Ultimate Ironman", 2, 5, 700);
		addConfigButton(27158, 27150, 2, 4, "Interfaces/Iron/IMAGE", 15, 15, "Select Normal Account", 3, 5, 700);
		addHoverButton(27159, "Interfaces/Iron/IMAGE", 5, 23, 23, "Confirm Mode", -1, 27160, 1);
		addHoveredButton(27160, "Interfaces/Iron/IMAGE", 6, 23, 23, 27161);
		addText(27162, "Confirm mode", tda, 1, 0xff9933, true, true);
		addSprite(27163, 10, "Interfaces/Iron/IMAGE");
		addText(27164, "OS-World Account Setup", tda, 2, 0xff9933, true, true);
		addText(27165, "Choose account mode", tda, 2, 0xFFFFFF, true, true);
		rsinterface.totalChildren(13);
		rsinterface.child(0, 27151, 10, 15);
		rsinterface.child(1, 27152, 463, 22);
		rsinterface.child(2, 27153, 463, 22);
		rsinterface.child(3, 27155, 290, 197);
		rsinterface.child(4, 27156, 25, 90);
		rsinterface.child(5, 27157, 25, 140);
		rsinterface.child(6, 27158, 25, 172);
		rsinterface.child(7, 27159, 45, 230);
		rsinterface.child(8, 27160, 45, 230);
		rsinterface.child(9, 27162, 57, 255);
		rsinterface.child(10, 27163, 110, 214);
		rsinterface.child(11, 27164, 265, 24);
		rsinterface.child(12, 27165, 230, 54);
	}
	
	public static void BossDrops(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(47200);
		addSprite(47201, 1, "Interfaces/Killcount/IMAGE");
		addHoverButton(47202, "Interfaces/Killcount/IMAGE", 1337, 23, 23, "Close", -1, 47203, 1);
		addHoveredButton(47203, "Interfaces/Killcount/IMAGE", 3, 23, 23, 47204);
		rsinterface.totalChildren(4);
		rsinterface.child(0, 47201, 1, 15);
		rsinterface.child(1, 47202, 449, 38);
		rsinterface.child(2, 47203, 449, 38);
		rsinterface.child(3, 47205, 165, 70);
		RSInterface scrollInterface = addTabInterface(47205);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 280;
		scrollInterface.height = 230;
		scrollInterface.scrollMax = 1200;
		int x = 7, y = 11;
		int amountOfLines = 90;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(47206 + i, "", "", tda, 1, 0x46320A, false, true, 168);
			scrollInterface.child(i, 47206 + i, x, y);//#9F703A //nice one 0x9D8851
			y += 22;
		}
	}
	
	public static void MobDrops(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(37200);
		addSprite(37201, 2, "Interfaces/Killcount/IMAGE");
		addHoverButton(37202, "Interfaces/Killcount/IMAGE", 1337, 23, 23, "Close", -1, 37203, 1);
		addHoveredButton(37203, "Interfaces/Killcount/IMAGE", 3, 23, 23, 37204);
		rsinterface.totalChildren(4);
		rsinterface.child(0, 37201, 1, 15);
		rsinterface.child(1, 37202, 449, 38);
		rsinterface.child(2, 37203, 449, 38);
		rsinterface.child(3, 37205, 165, 70);
		RSInterface scrollInterface = addTabInterface(37205);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 280;
		scrollInterface.height = 230;
		scrollInterface.scrollMax = 1200;
		int x = 7, y = 11;
		int amountOfLines = 90;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(37206 + i, "", "", tda, 1, 0x46320A, false, true, 168);
			scrollInterface.child(i, 37206 + i, x, y);
			y += 22;
		}
	}
	public static void MainTeleInterface(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(33550);
		addSprite(33330, 501, "Interfaces/Skill tele/IMAGE");
		addHoverButton(33331, "Interfaces/Skill tele/IMAGE", 1337, 23, 23, "Close", -1, 33332, 1);
		addHoveredButton(33332, "Interfaces/Skill tele/IMAGE", 500, 23, 23, 33333);
		rsinterface.totalChildren(4);
		rsinterface.child(0, 33330, 1, 15);
		rsinterface.child(1, 33331, 451, 37);
		rsinterface.child(2, 33332, 451, 37);
		rsinterface.child(3, 33336, 165, 70);
		RSInterface scrollInterface = addTabInterface(33336);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 280;
		scrollInterface.height = 230;//230
		scrollInterface.scrollMax = 1500;//1200
		int x = 7, y = 11;
		int amountOfLines = 150;//90
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			//addHoverText(33337 + i, "", "Select teleport", tda, 2, 0x46320A, true, true, 168);
			addHoverText(33337 + i, "", "Select teleport", tda, 1, 0x46320A, true, true, 168);
			scrollInterface.child(i, 33337 + i, x, y);//0x46320A //orginal0x615E3F
			y += 22;
		}
	}

	/*public static void playerProfiler(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(51800);
		addSprite(51801, 269, "Interfaces/Profile/IMAGE");
		addChar(51802);
		addText(51803, "Player Profile", tda, 2, 0xff9933, true, true);
		addHoverButton(51804, "Interfaces/Profile/IMAGE", 24, 15, 15, "Close", -1, 51805, 1);
		addHoveredButton(51805, "Interfaces/Profile/IMAGE", 25, 15, 15, 51806);
		addText(51807, "</col>Username:", tda, 1, 0xff9933, true, true);
		addText(51808, "</col>Rank:", tda, 1, 0xff9933, true, true);
		addText(51809, "</col>Combat level:", tda, 1, 0xff9933, true, true);
		addText(51810, "</col>Owain's Profile", tda, 1, 0xff9933, true, true);
		rsinterface.totalChildren(10);
		rsinterface.child(0, 51801, 9, 5);
		rsinterface.child(1, 51802, 45, 205);
		rsinterface.child(2, 51803, 265, 10);
		rsinterface.child(3, 51804, 481, 11);
		rsinterface.child(4, 51805, 481, 11);
		rsinterface.child(5, 51807, 252, 43);
		rsinterface.child(6, 51808, 238, 58);
		rsinterface.child(7, 51809, 275, 73);
		rsinterface.child(8, 51810, 120, 47);
		rsinterface.child(9, 51820, 225, 103);
		RSInterface scrollInterface = addTabInterface(51820);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 204;
		scrollInterface.scrollMax = 340;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(51821 + i, "", "", tda, 1, 0xff9933, false, true, 168);
			scrollInterface.child(i, 51821 + i, x, y);
			y += 22;
		}
	}*/
	public static void SkillTeleport(TextDrawingArea[] tda) {
		RSInterface Interface = addInterface(29000); //Interface ID
		//Background
		addSprite(29001, 8, "Interfaces/Skill tele/IMAGE");
		addText(29032, "Skill Teleportation", tda, 3, 0xff981f, true, true);
		addText(29033, "Click a skill icon to see more options", tda, 3, 0xff981f, false, true);
		
		addHoverButton(29002, "Interfaces/Skill tele/IMAGE", 1, 41, 41, "Fishing Training", -1, 29003, 1);
		addHoveredButton(29003, "Interfaces/Skill tele/IMAGE", 15, 41, 41, 29004);
		addHoverButton(29005, "Interfaces/Skill tele/IMAGE", 2, 41, 41, "Agility Training", -1, 29006, 1);
		addHoveredButton(29006, "Interfaces/Skill tele/IMAGE", 16, 41, 41, 29007);
		addHoverButton(29008, "Interfaces/Skill tele/IMAGE", 3, 41, 41, "Woodcutting Training", -1, 29009, 1);
		addHoveredButton(29009, "Interfaces/Skill tele/IMAGE", 17, 41, 41, 29010);
		addHoverButton(29011, "Interfaces/Skill tele/IMAGE", 4, 41, 41, "Mining Training", -1, 29012, 1);
		addHoveredButton(29012, "Interfaces/Skill tele/IMAGE", 18, 41, 41, 29013);
		addHoverButton(29014, "Interfaces/Skill tele/IMAGE", 5, 41, 41, "Farming Training", -1, 29015, 1);
		addHoveredButton(29015, "Interfaces/Skill tele/IMAGE", 19, 41, 41, 29016);
		addHoverButton(29017, "Interfaces/Skill tele/IMAGE", 6, 41, 41, "Hunter Training", -1, 29018, 1);
		addHoveredButton(29018, "Interfaces/Skill tele/IMAGE", 20, 41, 41, 29019);
		addHoverButton(29020, "Interfaces/Skill tele/IMAGE", 88, 41, 41, "Thieving Training", -1, 29021, 1);
		addHoveredButton(29021, "Interfaces/Skill tele/IMAGE", 22, 41, 41, 29022);
		addHoverButton(29023, "Interfaces/Skill tele/IMAGE", 89, 41, 41, "Smithing Training", -1, 29024, 1);
		addHoveredButton(29024, "Interfaces/Skill tele/IMAGE", 23, 41, 41, 29025);
		addHoverButton(29026, "Interfaces/Skill tele/IMAGE", 90, 41, 41, "Runecrafting Training", -1, 29027, 1);
		addHoveredButton(29027, "Interfaces/Skill tele/IMAGE", 24, 41, 41, 29028);
		addHoverButton(29029, "Interfaces/Skill tele/IMAGE", 9, 15, 15, "Close", -1, 29030, 1);
		addHoveredButton(29030, "Interfaces/Skill tele/IMAGE", 10, 15, 15, 29031);
		
		setChildren(23, Interface);
		setBounds(29001, 4, 6, 0, Interface); 
		setBounds(29002, 35, 39, 1, Interface);
		setBounds(29003, 35, 39, 2, Interface);
		setBounds(29005, 85, 39, 3, Interface);
		setBounds(29006, 85, 39, 4, Interface);
		setBounds(29008, 135, 39, 5, Interface);
		setBounds(29009, 135, 39, 6, Interface);
		setBounds(29011, 185, 39, 7, Interface);
		setBounds(29012, 185, 39, 8, Interface);
		setBounds(29014, 235, 39, 9, Interface);
		setBounds(29015, 235, 39, 10, Interface);
		setBounds(29017, 285, 39, 11, Interface);
		setBounds(29018, 285, 39, 12, Interface);
		setBounds(29020, 335, 39, 13, Interface);
		setBounds(29021, 335, 39, 14, Interface);
		setBounds(29023, 385, 39, 15, Interface);
		setBounds(29024, 385, 39, 16, Interface);
		setBounds(29026, 435, 39, 17, Interface);
		setBounds(29027, 435, 39, 18, Interface);
		setBounds(29029, 485, 11, 19, Interface);
		setBounds(29030, 485, 11, 20, Interface);
		setBounds(29032, 270, 10, 21, Interface);
		setBounds(29033, 150, 82, 22, Interface);
	}
	
	public static void AgilityTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(20616); //tab ID
		//Background
		addSprite(20617, 99, "Interfaces/Skill tele/IMAGE");
		addText(20618, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(20619, "Training spots", tda, 3, 0xff981f, false, true);
		addText(20624, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(20625, 0, "Interfaces/Skill tele/IMAGE");
		addHoverButton(20626, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Agility", -1, 20627, 1);
		addHoveredButton(20627, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 20628);
		addText(20629, "Agility", tda, 3, 0xff981f, false, true);
		addHoverText(20660, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(20665, "Interfaces/Skill tele/IMAGE", 26, 41, 41, "Agility Training", -1, 20666, 1);
		addHoveredButton(20666, "Interfaces/Skill tele/IMAGE", 74, 41, 41, 20667);
		//addText(20668, "Rooftop courses", tda, 2, 0xA5435C, false, true);
		
		setChildren(13, tab);
		setBounds(20617, 4, 120, 0, tab); //main interface
		setBounds(20618, 15, 123, 1, tab); //"Agility"
		setBounds(20619, 160, 123, 2, tab); //description
		setBounds(20624, 12, 267, 3, tab); //text
		setBounds(20625, 8, 147, 4, tab); //mark of grace image
		setBounds(20626, 8, 147, 5, tab); //Background button
		setBounds(20627, 8, 147, 6, tab); //Background button
		setBounds(20629, 40, 149, 7, tab); //text
		setBounds(20660, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(20665, 85, 45, 10, tab); //agility selected
		setBounds(20666, 85, 45, 11, tab); //agility selected hover
		setBounds(20670, 235, 145, 12, tab); //scroll
		//setBounds(20668, 160, 155, 13, tab); //text
		
		RSInterface scrollInterface = addTabInterface(20670);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(20671 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 20671 + i, x, y);
			y += 22;
		}
	}
	
	public static void FishingTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(44420); //tab ID
		//Background
		addSprite(30617, 99, "Interfaces/Skill tele/IMAGE");
		addText(30618, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(30619, "Training spots", tda, 3, 0xff981f, false, true);
		addText(30624, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(30625, 100, "Interfaces/Skill tele/IMAGE");
		addHoverButton(30626, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Fishing", -1, 30627, 1);
		addHoveredButton(30627, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 30628);
		addText(30629, "Fishing", tda, 3, 0xff981f, false, true);
		addHoverText(30660, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(30665, "Interfaces/Skill tele/IMAGE", 25, 41, 41, "Fishing Training", -1, 30666, 1);
		addHoveredButton(30666, "Interfaces/Skill tele/IMAGE", 75, 41, 41, 30667);
		
		setChildren(13, tab);
		setBounds(30617, 4, 120, 0, tab); //main interface
		setBounds(30618, 15, 123, 1, tab); //"Fishing"
		setBounds(30619, 160, 123, 2, tab); //description
		setBounds(30624, 12, 267, 3, tab); //text
		setBounds(30625, 8, 147, 4, tab); //mark of grace image
		setBounds(30626, 8, 147, 5, tab); //Background button
		setBounds(30627, 8, 147, 6, tab); //Background button
		setBounds(30629, 42, 149, 7, tab); //text
		setBounds(30660, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(30665, 35, 45, 10, tab); //agility selected
		setBounds(30666, 35, 45, 11, tab); //agility selected hover
		setBounds(30670, 235, 145, 12, tab); //scroll
		//setBounds(30668, 160, 155, 13, tab); //text
		
		RSInterface scrollInterface = addTabInterface(30670);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(30671 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 30671 + i, x, y);
			y += 22;
		}
		
	}
	
	public static void WoodcuttingTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(22720); //tab ID
		//Background
		addSprite(40617, 99, "Interfaces/Skill tele/IMAGE");
		addText(40618, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(40619, "Training spots", tda, 3, 0xff981f, false, true);
		addText(40624, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(40625, 101, "Interfaces/Skill tele/IMAGE");
		addHoverButton(40626, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Woodcutting", -1, 40627, 1);
		addHoveredButton(40627, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 40628);
		addText(40629, "Woodcutting", tda, 3, 0xff981f, false, true);
		addHoverText(40660, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(40665, "Interfaces/Skill tele/IMAGE", 27, 41, 41, "Woodcutting Training", -1, 40666, 1);
		addHoveredButton(40666, "Interfaces/Skill tele/IMAGE", 102, 41, 41, 40667);
		
		setChildren(13, tab);
		setBounds(40617, 4, 120, 0, tab); //main interface
		setBounds(40618, 15, 123, 1, tab); //"Fishing"
		setBounds(40619, 160, 123, 2, tab); //description
		setBounds(40624, 12, 267, 3, tab); //text
		setBounds(40625, 8, 147, 4, tab); //mark of grace image
		setBounds(40626, 8, 147, 5, tab); //Background button
		setBounds(40627, 8, 147, 6, tab); //Background button
		setBounds(40629, 45, 149, 7, tab); //text
		setBounds(40660, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(40665, 135, 45, 10, tab); //agility selected
		setBounds(40666, 135, 45, 11, tab); //agility selected hover
		setBounds(40670, 235, 145, 12, tab); //scroll
		
		RSInterface scrollInterface = addTabInterface(40670);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(40671 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 40671 + i, x, y);
			y += 22;
		}
	}
	
	public static void MiningTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(22820); //tab ID
		//Background
		addSprite(50617, 99, "Interfaces/Skill tele/IMAGE");
		addText(50618, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(50619, "Training spots", tda, 3, 0xff981f, false, true);
		addText(50624, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(50625, 104, "Interfaces/Skill tele/IMAGE");
		addHoverButton(50626, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Mining", -1, 50627, 1);
		addHoveredButton(50627, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 50628);
		addText(50629, "Mining", tda, 3, 0xff981f, false, true);
		addHoverText(50660, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(50665, "Interfaces/Skill tele/IMAGE", 28, 41, 41, "Mining Training", -1, 50666, 1);
		addHoveredButton(50666, "Interfaces/Skill tele/IMAGE", 103, 41, 41, 50667);
		
		setChildren(13, tab);
		setBounds(50617, 4, 120, 0, tab); //main interface
		setBounds(50618, 15, 123, 1, tab); //"Fishing"
		setBounds(50619, 160, 123, 2, tab); //description
		setBounds(50624, 12, 267, 3, tab); //text
		setBounds(50625, 8, 147, 4, tab); //mark of grace image
		setBounds(50626, 8, 147, 5, tab); //Background button
		setBounds(50627, 8, 147, 6, tab); //Background button
		setBounds(50629, 45, 149, 7, tab); //text
		setBounds(50660, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(50665, 185, 45, 10, tab); //agility selected
		setBounds(50666, 185, 45, 11, tab); //agility selected hover
		setBounds(50670, 235, 145, 12, tab); //scroll
		
		RSInterface scrollInterface = addTabInterface(50670);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(50671 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 50671 + i, x, y);
			y += 22;
		}
	}
	
	public static void FarmingTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(22920); //tab ID
		//Background
		addSprite(60617, 99, "Interfaces/Skill tele/IMAGE");
		addText(60618, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(60619, "Training spots", tda, 3, 0xff981f, false, true);
		addText(60624, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(60625, 115, "Interfaces/Skill tele/IMAGE");
		addHoverButton(60626, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Farming", -1, 60627, 1);
		addHoveredButton(60627, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 60628);
		addText(60629, "Farming", tda, 3, 0xff981f, false, true);
		addHoverText(60660, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(60665, "Interfaces/Skill tele/IMAGE", 29, 41, 41, "Farming Training", -1, 60666, 1);
		addHoveredButton(60666, "Interfaces/Skill tele/IMAGE", 110, 41, 41, 60667);
		
		setChildren(13, tab);
		setBounds(60617, 4, 120, 0, tab); //main interface
		setBounds(60618, 15, 123, 1, tab); //"Fishing"
		setBounds(60619, 160, 123, 2, tab); //description
		setBounds(60624, 12, 267, 3, tab); //text
		setBounds(60625, 8, 147, 4, tab); //mark of grace image
		setBounds(60626, 8, 147, 5, tab); //Background button
		setBounds(60627, 8, 147, 6, tab); //Background button
		setBounds(60629, 45, 149, 7, tab); //text
		setBounds(60660, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(60665, 235, 45, 10, tab); //agility selected
		setBounds(60666, 235, 45, 11, tab); //agility selected hover
		setBounds(60670, 235, 145, 12, tab); //scroll
		
		RSInterface scrollInterface = addTabInterface(60670);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(60671 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 60671 + i, x, y);
			y += 22;
		}
	}
	
	public static void HunterTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(23020); //tab ID
		//Background
		addSprite(70617, 99, "Interfaces/Skill tele/IMAGE");
		addText(70618, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(70619, "Training spots", tda, 3, 0xff981f, false, true);
		addText(70624, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(70625, 116, "Interfaces/Skill tele/IMAGE");
		addHoverButton(70626, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Hunter", -1, 70627, 1);
		addHoveredButton(70627, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 70628);
		addText(70629, "Hunter", tda, 3, 0xff981f, false, true);
		addHoverText(70660, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(70665, "Interfaces/Skill tele/IMAGE", 30, 41, 41, "Hunter Training", -1, 70666, 1);
		addHoveredButton(70666, "Interfaces/Skill tele/IMAGE", 111, 41, 41, 70667);
		
		setChildren(13, tab);
		setBounds(70617, 4, 120, 0, tab); //main interface
		setBounds(70618, 15, 123, 1, tab); //"Fishing"
		setBounds(70619, 160, 123, 2, tab); //description
		setBounds(70624, 12, 267, 3, tab); //text
		setBounds(70625, 8, 147, 4, tab); //mark of grace image
		setBounds(70626, 8, 147, 5, tab); //Background button
		setBounds(70627, 8, 147, 6, tab); //Background button
		setBounds(70629, 45, 149, 7, tab); //text
		setBounds(70660, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(70665, 285, 45, 10, tab); //agility selected
		setBounds(70666, 285, 45, 11, tab); //agility selected hover
		setBounds(11110, 235, 145, 12, tab); //scroll
		
		RSInterface scrollInterface = addTabInterface(11110);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(11111 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 11111 + i, x, y);
			y += 22;
		}
	}
	
	public static void ThievingTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(54020); //tab ID
		//Background
		addSprite(57575, 99, "Interfaces/Skill tele/IMAGE");
		addText(60000, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(60001, "Training spots", tda, 3, 0xff981f, false, true);
		addText(60002, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(60003, 119, "Interfaces/Skill tele/IMAGE");
		addHoverButton(60004, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Thieving", -1, 60005, 1);
		addHoveredButton(60005, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 60006);
		addText(60007, "Thieving", tda, 3, 0xff981f, false, true);
		addHoverText(60008, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(60009, "Interfaces/Skill tele/IMAGE", 31, 41, 41, "Thieving Training", -1, 60010, 1);
		addHoveredButton(60010, "Interfaces/Skill tele/IMAGE", 112, 41, 41, 60011);
		
		setChildren(13, tab);
		setBounds(57575, 4, 120, 0, tab); //main interface
		setBounds(60000, 15, 123, 1, tab); //"Fishing"
		setBounds(60001, 160, 123, 2, tab); //description
		setBounds(60002, 12, 267, 3, tab); //text
		setBounds(60003, 8, 147, 4, tab); //mark of grace image
		setBounds(60004, 8, 147, 5, tab); //Background button
		setBounds(60005, 8, 147, 6, tab); //Background button
		setBounds(60007, 45, 149, 7, tab); //text
		setBounds(60008, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(60009, 335, 45, 10, tab); //agility selected
		setBounds(60010, 335, 45, 11, tab); //agility selected hover
		setBounds(52278, 235, 145, 12, tab); //scroll
		
		RSInterface scrollInterface = addTabInterface(52278);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(52279 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 52279 + i, x, y);
			y += 22;
		}
	}
	public static void SmithingTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(25020); //tab ID
		//Background
		addSprite(40000, 99, "Interfaces/Skill tele/IMAGE");
		addText(40001, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(40002, "Training spots", tda, 3, 0xff981f, false, true);
		addText(40003, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(40004, 117, "Interfaces/Skill tele/IMAGE");
		addHoverButton(40005, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Smithing", -1, 40006, 1);
		addHoveredButton(40006, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 40007);
		addText(40009, "Smithing", tda, 3, 0xff981f, false, true);
		addHoverText(40010, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(40011, "Interfaces/Skill tele/IMAGE", 32, 41, 41, "Smithing Training", -1, 40012, 1);
		addHoveredButton(40012, "Interfaces/Skill tele/IMAGE", 113, 41, 41, 40013);
		
		setChildren(13, tab);
		setBounds(40000, 4, 120, 0, tab); //main interface
		setBounds(40001, 15, 123, 1, tab); //"Fishing"
		setBounds(40002, 160, 123, 2, tab); //description
		setBounds(40003, 12, 267, 3, tab); //text
		setBounds(40004, 8, 147, 4, tab); //mark of grace image
		setBounds(40005, 8, 147, 5, tab); //Background button
		setBounds(40006, 8, 147, 6, tab); //Background button
		setBounds(40009, 45, 149, 7, tab); //text
		setBounds(40010, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(40011, 385, 45, 10, tab); //agility selected
		setBounds(40012, 385, 45, 11, tab); //agility selected hover
		setBounds(40015, 235, 145, 12, tab); //scroll
		
		RSInterface scrollInterface = addTabInterface(40015);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(40016 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 40016 + i, x, y);
			y += 22;
		}
	}
	
	public static void RunecraftingTeleport(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(26020); //tab ID
		//Background
		addSprite(50000, 99, "Interfaces/Skill tele/IMAGE");
		addText(50001, "Skill selected", tda, 3, 0xff981f, false, true);
		addText(50002, "Training spots", tda, 3, 0xff981f, false, true);
		addText(50003, "Click on a training spot to be teleported to your chosen destination.", tda, 1, 0xff981f, false, true);
		addSprite(50004, 118, "Interfaces/Skill tele/IMAGE");
		addHoverButton(50005, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, "Runecrafting", -1, 50006, 1);
		addHoveredButton(50006, "Interfaces/Skill tele/IMAGE", 1337, 142, 30, 50007);
		addText(50009, "Runecrafting", tda, 3, 0xff981f, false, true);
		addHoverText(50010, "Back", "Back to the skills list", tda, 1, 0xfdf8ff, false, false, 168);
		addHoverButton(50011, "Interfaces/Skill tele/IMAGE", 33, 41, 41, "Runecrafting Training", -1, 50012, 1);
		addHoveredButton(50012, "Interfaces/Skill tele/IMAGE", 114, 41, 41, 50013);
		
		setChildren(13, tab);
		setBounds(50000, 4, 120, 0, tab); //main interface
		setBounds(50001, 15, 123, 1, tab); //"Fishing"
		setBounds(50002, 160, 123, 2, tab); //description
		setBounds(50003, 12, 267, 3, tab); //text
		setBounds(50004, 8, 147, 4, tab); //mark of grace image
		setBounds(50005, 8, 147, 5, tab); //Background button
		setBounds(50006, 8, 147, 6, tab); //Background button
		setBounds(50009, 45, 149, 7, tab); //text
		setBounds(50010, 470, 125, 8, tab); //Hover text
		setBounds(29000, 0, 6, 9, tab ); //main skill tele interface
		setBounds(50011, 435, 45, 10, tab); //agility selected
		setBounds(50012, 435, 45, 11, tab); //agility selected hover
		setBounds(50015, 235, 145, 12, tab); //scroll
		
		RSInterface scrollInterface = addTabInterface(50015);
		scrollInterface.scrollPosition = 0;
		scrollInterface.contentType = 0;
		scrollInterface.width = 250;
		scrollInterface.height = 116;
		scrollInterface.scrollMax = 200;
		int x = 7, y = 11;
		int amountOfLines = 50;
		scrollInterface.totalChildren(amountOfLines);
		for (int i = 0; i < amountOfLines; i++) {
			addHoverText(50016 + i, "", "Select spot", tda, 1, 0xff9933, true, true, 168);
			scrollInterface.child(i, 50016 + i, x, y);
			y += 22;
		}
	}
	public static void addAntibotWidget(TextDrawingArea[] tda) {
		RSInterface widget = addInterface(33300);
		addSprite(33301, 0, "Interfaces/AntiBot/IMAGE");
		addText(33302, "Click the 'Abyssal Whip'", tda, 2, 0xFF981F, true, true);
		addText(33303, "1:00", tda, 0, 0xFF981F, true, true);
		addText(33304,
				"If you click the wrong item or the time depletes to 0,\\nYou will be teleported to a new location.",
				tda, 0, 0xFF981F, true, true);
		setChildren(7, widget);
		setBounds(33301, 115, 96, 0, widget);
		setBounds(33302, 253, 105, 1, widget);
		setBounds(33303, 375, 105, 2, widget);
		setBounds(33304, 255, 190, 3, widget);
		setBounds(33310, 180, 140, 4, widget);
		setBounds(33313, 240, 140, 5, widget);
		setBounds(33316, 300, 140, 6, widget);

		for (int i = 0; i < 9; i += 3) {
			RSInterface option = addInterface(33310 + i);
			addToItemGroup(33311 + i, 1, 1, 0, 0, false, "", "", "");
			interfaceCache[33311 + i].inv = new int[] { 4152 };
			interfaceCache[33311 + i].invStackSizes = new int[] { 1 };
			addButton(33312 + i, 1, "Interfaces/AntiBot/IMAGE", "Select");
			setChildren(2, option);
			setBounds(33311 + i, 0, 0, 0, option);
			setBounds(33312 + i, 0, 0, 1, option);
		}
	}

	public static void addTransparentSprite(int id, int spriteId, String spriteName, int opacity) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.aByte254 = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId, spriteName);
		tab.width = 512;
		tab.height = 334;
		tab.opacity = (byte) opacity;
		tab.drawsTransparent = true;
	}

	public static void helpComponent(TextDrawingArea[] tda) {
		RSInterface widget = addInterface(59525);
		// addSprite(59526, 1, "Interfaces/HelpInterface/IMAGE");
		addTransparentSprite(59526, 1, "Interfaces/HelpInterface/IMAGE", 150);
		addInputField(59527, 200, 0xFF981F, "What do you need help with? (200 characters max)", 430, 28, false, false,
				"[A-Za-z0-9 .,]");
		addText(59528, "Request Help", tda, 2, 0xFF981F, true, true);
		addText(59529,
				"You are only allowed to request help when you need it. Situations such as being stuck,\\n"
						+ "threatened by another player, problems with a donation, or experiencing a bug are all\\n"
						+ "viable uses of the help system. Improper use of this system may lead to punishment.",
				tda, 0, 0xFF981F, false, true);
		addHoverButton(59530, "Interfaces/HelpInterface/IMAGE", 2, 16, 16, "Close", -1, 59531, 3);
		addHoveredButton(59531, "Interfaces/HelpInterface/IMAGE", 3, 16, 16, 59532);
		setChildren(6, widget);
		setBounds(59526, 33, 106, 0, widget);
		setBounds(59527, 40, 192, 1, widget);
		setBounds(59528, 256, 113, 2, widget);
		setBounds(59529, 40, 135, 3, widget);
		setBounds(59530, 456, 112, 4, widget);
		setBounds(59531, 456, 112, 5, widget);
	}

	public static void helpDatabaseComponent(TextDrawingArea[] tda) {
		RSInterface widget = addInterface(59550);
		// addSprite(59551, 8, "Interfaces/HelpInterface/IMAGE");
		addTransparentSprite(59551, 8, "Interfaces/HelpInterface/IMAGE", 150);
		addHoverButton(59552, "Interfaces/HelpInterface/IMAGE", 2, 16, 16, "Close", -1, 59553, 3);
		addHoveredButton(59553, "Interfaces/HelpInterface/IMAGE", 3, 16, 16, 59554);
		addText(59555, "Help Database", tda, 2, 0xFF981F, true, true);
		addText(59556, "Username/Date", tda, 1, 0xFF981F, false, true);
		addText(59557, "Line2", tda, 1, 0xFF981F, true, true);
		addText(59558, "Line3", tda, 1, 0xFF981F, true, true);
		addText(59559, "Line4", tda, 1, 0xFF981F, true, true);
		addText(59560, "Line5", tda, 1, 0xFF981F, true, true);
		setChildren(10, widget);
		setBounds(59551, 0, 2, 0, widget);
		setBounds(59552, 375, 8, 1, widget);
		setBounds(59553, 375, 8, 2, widget);
		setBounds(59570, 120, 30, 3, widget);
		setBounds(59555, 256, 8, 4, widget);
		setBounds(59556, 20, 225, 5, widget);
		setBounds(59557, 256, 245, 6, widget);
		setBounds(59558, 256, 265, 7, widget);
		setBounds(59559, 256, 285, 8, widget);
		setBounds(59560, 256, 305, 9, widget);
		RSInterface scroll = addInterface(59570);
		scroll.scrollMax = 400;
		scroll.width = 255;
		scroll.height = 170;
		setChildren(20, scroll);

		int y = 0;
		int index = 0;
		for (int i = 0; i < 100; i += 5) {
			RSInterface subwidget = addInterface(59571 + i);
			addSprite(59572 + i, 11, "Interfaces/HelpInterface/IMAGE");
			addText(59573 + i, "Username / Date : Time", tda, 1, 0xFF981F, false, true);
			addButton(59574 + i, 10, "Interfaces/HelpInterface/IMAGE", 13, 10, "View Request", 1);
			addButton(59575 + i, 9, "Interfaces/HelpInterface/IMAGE", 16, 15, "Remove Request", 1);
			setChildren(4, subwidget);
			y = index * 20;
			setBounds(59572 + i, 0, 0, 0, subwidget);
			setBounds(59573 + i, 4, 3, 1, subwidget);
			setBounds(59574 + i, 210, 5, 2, subwidget);
			setBounds(59575 + i, 230, 3, 3, subwidget);
			setBounds(59571 + i, 0, y, index, scroll);
			index++;
		}
	}

	public static void PrayerPotion(TextDrawingArea[] tda) {
		RSInterface widget = addInterface(59550);
		addTransparentSprite(59551, 8, "Interfaces/HelpInterface/IMAGE", 150);
	}

	public static void spawnInterface(TextDrawingArea[] tda) {
		RSInterface rs = addTabInterface(28100);
		addSprite(28103, 0, "spawn/BAG");
		addTransparentSprite(28103, 0, "spawn/BAG", 150);
		addHoverButton(28101, "spawn/button", 0, 81, 32, "Food", 201, 28102, 5);
		addHoveredButton(28102, "spawn/button", 1, 81, 32, 2001);
		// addButton(28103, 0, "spawn/food", "Spawn food", 28104, 1, 32, 32);
		addTooltip(28104, "Spawn food");
		addText(28106, "Food", tda, 1, 0xE68A00, true, true);

		/* NEW ROW */
		addHoverButton(28137, "spawn/button", 0, 81, 32, "Potions", 201, 28138, 5);
		addHoveredButton(28138, "spawn/button", 1, 81, 32, 2001);
		// addButton(28103, 0, "spawn/food", "Spawn food", 28104, 1, 32, 32);
		addTooltip(28140, "Spawn potions");
		addText(28139, "Potions", tda, 1, 0xE68A00, true, true);

		addHoverButton(28141, "spawn/button", 0, 81, 32, "Veng Runes", 201, 28142, 5);
		addHoveredButton(28142, "spawn/button", 1, 81, 32, 2001);
		// addButton(28103, 0, "spawn/food", "Spawn food", 28104, 1, 32, 32);
		addTooltip(28144, "Spawn Vengeance Runes");
		addText(28143, "Veng", tda, 1, 0xE68A00, true, true);

		addHoverButton(28145, "spawn/button", 0, 81, 32, "Pure Hybrid", 201, 28146, 5);
		addHoveredButton(28146, "spawn/button", 1, 81, 32, 2001);
		// addButton(28103, 0, "spawn/food", "Spawn food", 28104, 1, 32, 32);
		addTooltip(28147, "Spawn Pure Hybrid");
		addText(28148, "Pure Brid", tda, 1, 0xE68A00, true, true);

		addHoverButton(28149, "spawn/button", 0, 81, 32, "Tank Brid", 201, 28150, 5);
		addHoveredButton(28150, "spawn/button", 1, 81, 32, 2001);
		// addButton(28103, 0, "spawn/food", "Spawn food", 28104, 1, 32, 32);
		addTooltip(28151, "Spawn Main Brid");
		addText(28152, "Main Brid", tda, 1, 0xE68A00, true, true);

		addHoverButton(28153, "spawn/button", 0, 81, 32, "Tank Brid Set", 201, 28154, 5);
		addHoveredButton(28154, "spawn/button", 1, 81, 32, 2001);
		// addButton(28103, 0, "spawn/food", "Spawn food", 28104, 1, 32, 32);
		addTooltip(28155, "Spawn Tank Set");
		addText(28156, "Tank Brid", tda, 1, 0xE68A00, true, true);

		addHoverButton(28157, "spawn/button", 0, 81, 32, "Zerker Brid", 201, 28158, 5);
		addHoveredButton(28158, "spawn/button", 1, 81, 32, 2001);
		// addButton(28103, 0, "spawn/food", "Spawn food", 28104, 1, 32, 32);
		addTooltip(28159, "Spawn Zerker Brid");
		addText(28160, "Zerker Brid", tda, 1, 0xE68A00, true, true);
		/* END OF NEW */

		addHoverButton(28108, "spawn/button", 0, 81, 32, "Barrage Runes", 201, 28109, 5);
		addHoveredButton(28109, "spawn/button", 1, 81, 32, 2001);
		addTooltip(28110, "Spawn Barrage");
		addText(28112, "Barrage", tda, 1, 0xE68A00, true, true);

		addHoverButton(28114, "spawn/button", 0, 81, 32, "Pure", 201, 28115, 5);
		addHoveredButton(28115, "spawn/button", 1, 81, 32, 2001);
		addTooltip(28116, "Spawn Pure");
		addText(28118, "Pure", tda, 1, 0xE68A00, true, true);

		addHoverButton(28120, "spawn/button", 0, 81, 32, "Main set", 201, 28121, 5);
		addHoveredButton(28121, "spawn/button", 1, 81, 32, 2001);
		addTooltip(28122, "Spawn Main");
		addText(28124, "Main", tda, 1, 0xE68A00, true, true);

		addHoverButton(28126, "spawn/button", 0, 81, 32, "Tank set", 201, 28127, 5);
		addHoveredButton(28127, "spawn/button", 1, 81, 32, 2001);
		addTooltip(28128, "Spawn Tank Set");
		addText(28130, "Tank", tda, 1, 0xE68A00, true, true);

		addHoverButton(28132, "spawn/button", 0, 81, 32, "Zerker set", 201, 28133, 5);
		addHoveredButton(28133, "spawn/button", 1, 81, 32, 2001);
		addTooltip(28134, "Spawn Zerker");
		addText(28136, "Zerker", tda, 1, 0xE68A00, true, true);
		addText(28131, "OS-WORLD Quick Spawn", tda, 1, 0xE68A00, true, true);

		setChildren(49, rs);

		rs.child(0, 28103, 3, 1);
		rs.child(1, 28101, 10, 26);
		rs.child(2, 28102, 10, 26);
		rs.child(3, 28106, 49, 34);
		rs.child(4, 28104, 6, 16);

		rs.child(5, 28108, 10, 63);
		rs.child(6, 28109, 10, 63);
		rs.child(7, 28112, 49, 71);
		rs.child(8, 28110, 6, 56);

		rs.child(9, 28114, 10, 100);
		rs.child(10, 28115, 10, 100);
		rs.child(11, 28118, 49, 108);
		rs.child(12, 28116, 6, 96);

		rs.child(13, 28120, 10, 137);
		rs.child(14, 28121, 10, 137);
		rs.child(15, 28124, 50, 145);
		rs.child(16, 28122, 6, 136);

		rs.child(17, 28126, 10, 174);
		rs.child(18, 28127, 10, 174);
		rs.child(19, 28130, 50, 181);
		rs.child(20, 28128, 6, 176);

		rs.child(21, 28132, 10, 211);
		rs.child(22, 28133, 10, 211);
		rs.child(23, 28136, 49, 211 + 7);
		rs.child(24, 28134, 49, 212);
		rs.child(25, 28131, 98, 3);

		/* NEW ROW */
		rs.child(26, 28137, 102, 26);
		rs.child(27, 28138, 102, 26);
		rs.child(28, 28139, 143, 34);
		rs.child(29, 28140, 6, 16);

		rs.child(30, 28141, 102, 63);
		rs.child(31, 28142, 102, 63);
		rs.child(32, 28143, 143, 71);
		rs.child(33, 28144, 6, 56);

		rs.child(34, 28145, 102, 100);
		rs.child(35, 28146, 102, 100);
		rs.child(36, 28148, 143, 108);
		rs.child(37, 28147, 6, 96);

		rs.child(38, 28149, 102, 137);
		rs.child(39, 28150, 102, 137);
		rs.child(40, 28152, 144, 145);
		rs.child(41, 28151, 6, 136);

		rs.child(41, 28153, 102, 174);
		rs.child(42, 28154, 102, 174);
		rs.child(43, 28156, 144, 181);
		rs.child(44, 28155, 6, 176);

		rs.child(45, 28157, 102, 211);
		rs.child(46, 28158, 102, 211);
		rs.child(47, 28160, 143, 211 + 7);
		rs.child(48, 28159, 49, 212);

	}
	public static void Pestpanel(TextDrawingArea[] tda) {
		RSInterface RSinterface = addTab(21119);
		addText(21120, "Next Departure:", 0xCCCBCB, false, true, 52, tda, 1);
		addText(21121, "Players Ready:", 0x5BD230, false, true, 52, tda, 1);
		addText(21122, "(Need 5 to 25 players)", 0xDED36A, false, true, 52, tda, 1);
		addText(21123, "Pest Points:", 0x99FFFF, false, true, 52, tda, 1);
		int last = 4;
		RSinterface.children = new int[last];
		RSinterface.childX = new int[last];
		RSinterface.childY = new int[last];
		setBounds(21120, 15, 12, 0, RSinterface);
		setBounds(21121, 15, 30, 1, RSinterface);
		setBounds(21122, 15, 48, 2, RSinterface);
		setBounds(21123, 15, 66, 3, RSinterface);

		RSInterface rsi = interfaceCache[6114] = new RSInterface();
		rsi.type = 4;
		rsi.width = 390;
		rsi.centerText = true;
	}

	public static void Pestpanel2(TextDrawingArea[] tda) {
		RSInterface RSinterface = addInterface(21100);
		addSprite(21101, 0, "Interfaces/Pest Control/PEST1");
		addSprite(21102, 1, "Interfaces/Pest Control/PEST1");
		addSprite(21103, 2, "Interfaces/Pest Control/PEST1");
		addSprite(21104, 3, "Interfaces/Pest Control/PEST1");
		addSprite(21105, 4, "Interfaces/Pest Control/PEST1");
		addSprite(21106, 5, "Interfaces/Pest Control/PEST1");
		addText(21107, "", 0xCC00CC, false, true, 52, tda, 1);
		addText(21108, "", 0x0000FF, false, true, 52, tda, 1);
		addText(21109, "", 0xFFFF44, false, true, 52, tda, 1);
		addText(21110, "", 0xCC0000, false, true, 52, tda, 1);
		addText(21111, "", 0x99FF33, false, true, 52, tda, 1);// w purp
		addText(21112, "", 0x99FF33, false, true, 52, tda, 1);// e blue
		addText(21113, "", 0x99FF33, false, true, 52, tda, 1);// se yel
		addText(21114, "", 0x99FF33, false, true, 52, tda, 1);// sw red
		addText(21115, "200", 0x99FF33, false, true, 52, tda, 1);// attacks
		addText(21116, "", 0x99FF33, false, true, 52, tda, 1);// knights hp
		addText(21117, "Time Remaining:", 0xFFFFFF, false, true, 52, tda, 0);
		addText(21118, "", 0xFFFFFF, false, true, 52, tda, 0);
		int last = 18;
		RSinterface.children = new int[last];
		RSinterface.childX = new int[last];
		RSinterface.childY = new int[last];
		setBounds(21101, 361, 26, 0, RSinterface);
		setBounds(21102, 396, 26, 1, RSinterface);
		setBounds(21103, 436, 26, 2, RSinterface);
		setBounds(21104, 474, 26, 3, RSinterface);
		setBounds(21105, 3, 21, 4, RSinterface);
		setBounds(21106, 3, 50, 5, RSinterface);
		setBounds(21107, 371, 60, 6, RSinterface);
		setBounds(21108, 409, 60, 7, RSinterface);
		setBounds(21109, 443, 60, 8, RSinterface);
		setBounds(21110, 479, 60, 9, RSinterface);
		setBounds(21111, 362, 10, 10, RSinterface);
		setBounds(21112, 398, 10, 11, RSinterface);
		setBounds(21113, 436, 10, 12, RSinterface);
		setBounds(21114, 475, 10, 13, RSinterface);
		setBounds(21115, 32, 32, 14, RSinterface);
		setBounds(21116, 32, 62, 15, RSinterface);
		setBounds(21117, 8, 88, 16, RSinterface);
		setBounds(21118, 87, 88, 17, RSinterface);
	}

	public static void barrowText(TextDrawingArea[] tda) {
		RSInterface tab = addScreenInterface(16128);
		addText(16129, "Barrows Brothers", tda, 2, 0xff981f, true, true);
		addText(16130, "Dharoks", tda, 1, 0x86B404, true, true);
		addText(16131, "Veracs", tda, 1, 0x86B404, true, true);
		addText(16132, "Ahrims", tda, 1, 0x86B404, true, true);
		addText(16133, "Torags", tda, 1, 0x86B404, true, true);
		addText(16134, "Guthans", tda, 1, 0x86B404, true, true);
		addText(16135, "Karils", tda, 1, 0x86B404, true, true);
		addText(16136, "Killcount:", tda, 2, 0xff981f, true, true);
		addText(16137, "#", tda, 1, 0x86B404, true, true);
		tab.totalChildren(7);
		tab.child(0, 16129, 452, 220);
		tab.child(1, 16130, 460, 240);
		tab.child(2, 16131, 460, 255);
		tab.child(3, 16132, 460, 270);
		tab.child(4, 16133, 460, 285);
		tab.child(5, 16134, 460, 300);
		tab.child(6, 16135, 460, 315);
		//tab.child(7, 16136, 460, 330);//30,318
		//tab.child(8, 16137, 460, 345);//68
	}

	public static void runepouch(TextDrawingArea[] tda) {
		RSInterface tab = addInterface(41700);
		addSprite(41701, 0, "runepouch/sprite");
		addSprite(41705, 0, "runepouch/rune");
		addSprite(41706, 1, "runepouch/rune");
		addText(41702, "Rune pouch", tda, 2, 0xFFA500, true, true);
		addText(41703, "Pouch", tda, 2, 0xFFA500, true, true);
		addText(41704, "Inventory", tda, 2, 0xFFA500, true, true);
		addHoverButton(41707, "runepouch/close", 0, 21, 21, "Close window", 0, 41708, 1);
		addHoveredButton(41708, "runepouch/close", 1, 21, 21, 41709);
		RSInterface add = addInterface(41710);
		addToItemGroup(add, 3, 1, 26, 1, false, null, null, null);
		add = addInterface(41711);
		addToItemGroup(add, 7, 4, 16, 4, false, null, null, null);
		tab.totalChildren(10);
		tab.child(0, 41701, 0, 0);
		tab.child(1, 41702, 253, 29);
		tab.child(2, 41703, 253, 62);
		tab.child(3, 41704, 253, 137);
		tab.child(4, 41705, 105, 57);
		tab.child(5, 41706, 342, 57);
		tab.child(6, 41707, 406, 26);
		tab.child(7, 41708, 406, 26);
		tab.child(8, 41710, 186, 86);
		tab.child(9, 41711, 98, 154);
	}

	public static void prayerTab(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(5608);
        RSInterface currentPray = interfaceCache[687];
        addSprite(5651, 0, "Prayer/PRAYER");
        currentPray.textColor = 0xFF981F;
        currentPray.textShadow = true;
        currentPray.message = "%1/%2";
 
        int[] ID1 = { 18016, 18017, 18018, 18019, 18020, 18021, 18022, 18023, 18024, 18025, 18026, 18027, 18028, 18029,
                18030, 18031, 18032, 18033, 18034, 18035, 18036, 18037, 18038, 18039, 18040, 18041, 18042, 18043, 18044};
        int[] X = { 8, 44, 80, 114, 150, 8, 44, 80, 116, 152, 8, 42, 78, 116, 152, 8, 44, 80, 116, 150, 6, 44, 80, 116,
                150, 6, 44, 80, 114};
        int[] Y = { 6, 6, 6, 4, 4, 42, 42, 42, 42, 42, 79, 76, 76, 78, 78, 114, 114, 114, 114, 112, 148, 150, 150, 150,
                148, 184, 184, 184, 184};
 
        int[] hoverIDs = { 18050, 18052, 18054, 18056, 18058, 18060, 18062, 18064, 18066, 18068, 18070, 18072, 18074,
                18076, 18078, 18080, 18082, 18084, 18086, 18088, 18090, 18092, 18094, 18096, 18098, 18100, 18102, 18104, 18106};
        int[] hoverX = { 12, 8, 20, 12, 24, 2, 2, 6, 6, 50, 6, 6, 10, 6, 6, 5, 5, 5, 5, 5, 18, 28, 28, 50, 1, 1, 12, 16, 12};
        int[] hoverY = { 42, 42, 42, 42, 42, 80, 80, 80, 80, 80, 118, 118, 118, 118, 118, 150, 150, 150, 150, 150, 105,
                80, 65, 65, 80, 110, 110, 105, 115};
        String[] hoverStrings = { "Level 01\nThick Skin\nIncreases your Defence by 5%",
                "Level 04\nBurst of Strength\nIncreases your Strength by 5%",
                "Level 07\nCharity of Thought\nIncreases your Attack by 5%",
                "Level 08\nSharp Eye\nIncreases your Ranged by 5%", "Level 09\nMystic Will\nIncreases your Magic by 5%",
                "Level 10\nRock Skin\nIncreases your Defence by 10%",
                "Level 13\nSuperhuman Strength\nIncreases your Strength by 10%",
                "Level 16\nImproved Reflexes\nIncreases your Attack by 10%",
                "Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints and Prayer",
                "Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat",
                "Level 25\nProtect Item\nKeep one extra item if you die",
                "Level 26\nHawk Eye\nIncreases your Ranged by 10%",
                "Level 27\nMystic Lore\nIncreases your Magic by 10%",
                "Level 28\nSteel Skin\nIncreases your Defence by 15%",
                "Level 31\nUltimate Strength\nIncreases your Strength by 15%",
                "Level 34\nIncredible Reflexes\nIncreases your Attack by 15%",
                "Level 37\nProtect from Magic\nProtection from magical attacks",
                "Level 40\nProtect from Missiles\nProtection from ranged attacks",
                "Level 43\nProtect from Melee\nProtection from close attacks",
                "Level 44\nEagle Eye\nIncreases your Ranged by 15%",
                "Level 45\nMystic Might\nIncreases your Magic by 15%",
                "Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die",
                "Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%",
                "Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponents Prayer",
                "Level 55\nPreserve\nBoosted stats last 20% longer",
                "Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18% and Attack by\n15%",
                "Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23% and Attack by\n20%",
                "Level 74\nRigour\nIncreases your Defence by 25%,\nRanged Strength by 23%\nand Ranged by 20%",
                "Level 77\nAugury\nIncreases your Defence by 25%,\nand Magic by 25%"};
       
        int ID2[] = { 5609, 5610, 5611, 5612, 5613, 5614, 5615, 5616, 5617, 5618, 5619, 5620, 5621, 5622, 5623, 683,
                684, 685, 5632, 5633, 5634, 5635, 5636, 5637, 5638, 5639, 5640, 5641, 5642, 5643, 5644, 686, 5645, 5649,
                5647, 5648, 18000, 18001, 18002, 18003, 18004, 18005, 18006, 18007, 18008, 18009, 18010, 18011, 18012,
                18013, 18014, 18015, 18120, 18121, 18122, 18123, 18124, 18125, 18126};
       
        int X2[] = { 6, 42,
                78, 6,
                42, 78,
                114, 150,
                6, 114,
                150, 6,
                42, 78,
                114, 42,
                78, 114,
                8, 44,
                80, 8,
                44, 80,
                116, 152,
                8, 116,
                152, 8,
                44, 80,
                116, 44,
                80, 116,
                114, 117,
                150, 153,
                42, 45,
                78, 81,
                150, 153,
                6, 9,
                150, 153,
                6, 13,
                42, 44,
                78, 81,
                114, 116};
       
        int Y2[] = { 4, 4,
                4, 40,
                40, 40,
                40, 40,
                76, 76,
                76, 112,
                112, 112,
                112, 148,
                148, 148,
                6, 6,
                6, 42,
                42, 42,
                42, 42,
                79, 78,
                78, 114,
                114, 114,
                114, 150,
                150, 150,
                4, 8,
                4, 7,
                76, 80,
                76, 79,
                112, 116,
                148, 151,
                148, 150,
                184, 187,
                184, 195,
                184, 187,
                184, 187};
 
        String[] oldPrayerNames = { "Thick Skin", "Burst of Strength", "Charity of Thought", "Rock Skin",
                "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Steel Skin",
                "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Missiles",
                "Protect from Melee", "Retribution", "Redemption", "Smite" };
        String[] newPrayerNames = {"Sharp Eye", "Mystic Will", "Hawk Eye", "Mystic Lore", "Eagle Eye", "Mystic Might", "Preserve", "Chivalry", "Piety", "Rigour", "Augury"};
        addPrayer(18000, 0, 601, 7, 0, "Sharp Eye");
        addPrayer(18002, 0, 602, 8, 1, "Mystic Will");
        addPrayer(18004, 0, 603, 25, 2, "Hawk Eye");
        addPrayer(18006, 0, 604, 26, 3, "Mystic Lore");
        addPrayer(18008, 0, 605, 43, 4, "Eagle Eye");
        addPrayer(18010, 0, 606, 44, 5, "Mystic Might");
        addPrayer(18012, 0, 607, 54, 6, "Preserve");
        addPrayer(18014, 0, 608, 59, 7, "Chivalry");
        addPrayer(18120, 0, 609, 69, 8, "Piety");
        addPrayer(18122, 0, 610, 73, 9, "Rigour");
        addPrayer(18124, 0, 611, 76, 10, "Augury");
 
        for (int i = 0; i < 18; i++) {
            addOldPrayer(ID2[i], oldPrayerNames[i]);
        }
 
        for (int i = 0; i < 29; i++) {
            addPrayerHover(ID1[i], hoverIDs[i], i, hoverStrings[i]);
        }
       
        for (int i = 0; i < 8; i++) {
            addOldPrayer(18000+(2*i), newPrayerNames[i]);
        }
 
        for (int i = 0; i < 3; i++) {
            addOldPrayer(18120+(2*i), newPrayerNames[8+i]);
        }
 
        tab.totalChildren(116); // 58
        tab.child(52, 5651, 70, 242);
        for (int ii = 0; ii < 58; ii++) {
            tab.child(ii, ID2[ii], X2[ii], Y2[ii]);
        }
 
        int frame = 58;
        int frame2 = 0;
        for (int i : ID1) {
            tab.child(frame, i, X[frame2], Y[frame2]);
            frame++;
            frame2++;
        }
 
        int frame3 = 0;
        for (int i : hoverIDs) {
            tab.child(frame, i, hoverX[frame3], hoverY[frame3]);
            frame++;
            frame3++;
        }
    }

}
