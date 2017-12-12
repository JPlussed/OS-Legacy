public final class EntityDef {

	public static EntityDef forID(int i) {
		for (int j = 0; j < 20; j++)
			if (cache[j].interfaceType == (long) i)
				return cache[j];

		anInt56 = (anInt56 + 1) % 20;
		EntityDef entityDef = cache[anInt56] = new EntityDef();
		stream.currentOffset = streamIndices[i];
		entityDef.interfaceType = i;
		entityDef.readValues(stream);
		///if(i == 6593) { // NPC ID 
		//	setTexture(16, 40);
		//	Model.printModelColours(model);
		
		
		  if(i == 4398) {
			  entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Teleport"; //First option
			   entityDef.actions[2] = "Previous"; //second option
			   entityDef.name = "Edgeville Wizard";
			   entityDef.description = "Teleport using the edgeville wizard.".getBytes(); // NPC description
		  }
		  
		  if(i == 6769) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "View"; //First option
			   entityDef.name = "Trivia Rewards";
			   entityDef.description = "Redeem your Trivia points here.".getBytes(); // NPC description
			  }
		  if(i == 3225) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "View"; //First option
			   entityDef.name = "Skilling Supplies";
			   entityDef.description = "Purchase skilling supplies here.".getBytes(); // NPC description
			  }
		  
		  if(i == 5832) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "View"; //First option
			   entityDef.name = "Farming Supplies";
			   entityDef.description = "Purchase farming supplies here.".getBytes(); // NPC description
			  }
		  
		  if(i == 13) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Talk-to"; //First option
			   entityDef.actions[2] = "Quick-note"; //First option
			  }
		  
		  if(i == 526) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Talk-to"; //First option
			   entityDef.actions[2] = "Pickpocket"; //First option
			  }
		  
		  if(i == 637) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Talk-to"; //First option
			   entityDef.actions[2] = "Teleport"; //First option
			  }
			if(i == 2835) {
				entityDef.actions = new String[] { "Talk-to", null, "Pick-up", null, null }; // Actions for the npc
				entityDef.name = "Pet camel";
				entityDef.description = "It appears that this mammal doesn't wash very often.".getBytes();
	            entityDef.anInt91 = 90;
	            entityDef.anInt86 = 90;
			}
		  
		  if(i == 5449) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "View-shop"; //First option
			   entityDef.actions[2] = "Clean-herbs"; //First option
			   entityDef.actions[3] = "Decant"; //First option
			  }
		  
		  if(i == 7121) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Talk-to"; //First option
			  }
		  
		  if(i == 5045) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "View"; //First option
			   entityDef.name = "Herblore Secondaries";
			   entityDef.description = "Purchase herblore secondaries here.".getBytes(); // NPC description
			  }
		  
		  if(i == 317) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Talk-to"; //First option
			   entityDef.name = "Paul the Ironman";
			   entityDef.description = "He likes to do things solo.".getBytes(); // NPC description
			  }
		  if(i == 506) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "View"; //First option
			   entityDef.name = "General Store";
			  }
		  
		  if(i == 4958) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Pickpocket"; //First option
			  }
		  
		  if(i == 3305) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "View"; //First option
			   entityDef.name = "Consumables shop";
			   entityDef.description = "Buy food and potions her.".getBytes(); // NPC description
			  }
		  if(i == 1119) { // NPC ID 
			   entityDef.actions = new String[5]; // Actions for the npc
			   entityDef.actions[0] = "Talk-to"; //First option
			   entityDef.actions[2] = "Pickpocket"; //First option
			  }
		  
			if(i == 7005) {
				entityDef.actions = new String[5]; // Actions for the npc
				entityDef.name = "Fancy Fitments";
				entityDef.actions[0] = "View"; //First option
			}
			
			if(i == 7303) {
				entityDef.actions = new String[5]; // Actions for the npc
				entityDef.name = "Donator Supplies";
				entityDef.actions[0] = "View"; //First option
			}
			
			  if(i == 7121) { // NPC ID 
				   entityDef.actions = new String[5]; // Actions for the npc
				   entityDef.actions[0] = "Talk-to"; //First option
				   entityDef.actions[2] = "Get-jewelry"; //First option
				  }
		  
			if(i == 3653) {
				entityDef.actions = new String[5]; // Actions for the npc
				entityDef.anIntArray94 = new int[10]; //Number of models it uses
				entityDef.anIntArray94[0] = 23174; //Top
				entityDef.anIntArray94[1] = 23173; //Legs
				entityDef.anIntArray94[2] = 10980; //Arms
				entityDef.anIntArray94[3] = 19947; //Boots
				entityDef.anIntArray94[4] = 31891; //Axe
				entityDef.anIntArray94[5] = 230; //Head
				entityDef.anIntArray94[6] = 250; //Head
				entityDef.anIntArray94[7] = 23172; //Hat
				entityDef.anIntArray94[8] = 215; //Hat 1
				entityDef.anIntArray94[9] = 179; //Gloves
				entityDef.actions = new String[5]; // Actions for the npc
				entityDef.actions[0] = "Talk-to"; //First option
				entityDef.anIntArray70 = new int[] { 5272, 5157, 803, 922 }; // Colour you want to change to
				entityDef.anIntArray76 = new int[] { 4626, 8101, 8741, 8860 }; // Original colour
			}
	if(i == 338) {
		entityDef.combatLevel = 0;
		entityDef.walkAnim = -1;
		entityDef.standAnim = -1;
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 28075;
		entityDef.anInt91 = 128;
		entityDef.anInt86 = 128;
		entityDef.aByte68 = 1;
		entityDef.name = "Armadyl godsword";
		}
			
	if(i == 339) {
		entityDef.combatLevel = 0;
		entityDef.walkAnim = -1;
		entityDef.standAnim = -1;
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 26457;
		entityDef.anInt91 = 128;
		entityDef.anInt86 = 128;
		entityDef.aByte68 = 1;
		entityDef.name = "Dragonfire shield";
		}
	
	if(i == 340) {
		entityDef.combatLevel = 0;
		entityDef.walkAnim = -1;
		entityDef.standAnim = -1;
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 2635;
		entityDef.anInt91 = 128;
		entityDef.anInt86 = 128;
		entityDef.aByte68 = 1;
		entityDef.name = "Blue partyhat";
		entityDef.anIntArray70 = new int[] { -21568 }; // Colour you want to change to
		entityDef.anIntArray76 = new int[] { 926 };
		}
	
	if(i == 341) {
		entityDef.combatLevel = 0;
		entityDef.walkAnim = -1;
		entityDef.standAnim = -1;
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 28047;
		entityDef.anInt91 = 128;
		entityDef.anInt86 = 128;
		entityDef.aByte68 = 1;
		entityDef.name = "Bandos tassets";
		}
	
	if(i == 342) {
		entityDef.combatLevel = 0;
		entityDef.walkAnim = -1;
		entityDef.standAnim = -1;
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 19220;
		entityDef.anInt91 = 128;
		entityDef.anInt86 = 128;
		entityDef.aByte68 = 1;
		entityDef.name = "Serpentine helm";
		}
			
		if(i == 1165) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "View"; //first click (Optional)
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 19258; //Fighter torso
			entityDef.anIntArray94[1] = 268; //Rune legs
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 156; //Torso (arms)
			entityDef.anIntArray94[4] = 4954; //rune Boots
			entityDef.anIntArray94[5] = 6031; //Dragon scim
			entityDef.anIntArray94[6] = 21873; //Neit
			entityDef.anIntArray94[7] = 15413; //Rune defender
			entityDef.anIntArray94[8] = 9638; //Fire cape
			entityDef.anIntArray94[9] = 9642; //Fury
			entityDef.anIntArray70 = new int[] { -29403, -28266, -29403, -26860, -27223, 926, 1709, -29403 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 61, 41, 57, 28, 74, -22462, -22450, 61 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Weapons Shop";
			entityDef.description = "Purchase weapons here.".getBytes();
		}
		if(i == 1166) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "View"; //first click (Optional)
			entityDef.anIntArray94 = new int[8]; //Number of models it uses
			entityDef.anIntArray94[0] = 3820; //Dragon chain
			entityDef.anIntArray94[1] = 5024; //Dragon legs
			entityDef.anIntArray94[2] = 156; //Dragon chain arms
			entityDef.anIntArray94[3] = 27638; //Dragon Boots
			entityDef.anIntArray94[4] = 6031; //Dragon scim
			entityDef.anIntArray94[5] = 26632; //Dragon full helm
			entityDef.anIntArray94[6] = 11049; //Spirit shield
			entityDef.anIntArray94[7] = 13307; //Dragon gloves
			entityDef.anIntArray70 = new int[] { 924, 908, 926 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 61, 10394, 8656 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Armour Shop";
			entityDef.description = "Purchase amour here.".getBytes();
		}
		if(i == 1167) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "View"; //first click (Optional)
			entityDef.anIntArray94 = new int[11]; //Number of models it uses
			entityDef.anIntArray94[0] = 314; //Black d'hide body
			entityDef.anIntArray94[1] = 258; //Black d'hide chaps
			entityDef.anIntArray94[2] = 8920; //Snakeskin boots
			entityDef.anIntArray94[3] = 16846; //Rune c'bow
			entityDef.anIntArray94[4] = 220; //Archer helm
			entityDef.anIntArray94[5] = 2929; //Granite shield
			entityDef.anIntArray94[6] = 170;
			entityDef.anIntArray94[7] = 246;
			entityDef.anIntArray94[8] = 176;
			entityDef.anIntArray94[9] = 6848;
			entityDef.anIntArray94[10] = 250;
			entityDef.anIntArray70 = new int[] { 924, 4, 16 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 61, 22416, 22424 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Ranged Shop";
			entityDef.description = "Purchase ranged supplies here.".getBytes();
		}
		if(i == 1168) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "View"; //first click (Optional)
			entityDef.anIntArray94 = new int[11]; //Number of models it uses
			entityDef.anIntArray94[0] = 4952; //Mystic body
			entityDef.anIntArray94[1] = 5028; //Mystic body arms
			entityDef.anIntArray94[2] = 4844; //Mystic bottoms
			entityDef.anIntArray94[3] = 4955; //boots
			entityDef.anIntArray94[4] = 4953; //gloves
			entityDef.anIntArray94[5] = 6232; //Ancient staff
			entityDef.anIntArray94[6] = 5027; //Mystic hat
			entityDef.anIntArray94[7] = 10698; //Mages book
			entityDef.anIntArray94[8] = 323; //Zammy cape
			entityDef.anIntArray94[9] = 6848;
			entityDef.anIntArray94[10] = 250;
			entityDef.anIntArray70 = new int[] { 924, 148, 0, 924, 924, 148, 0, 924, 924, 148, 0, 924, 0, 924, 0, 0, 0, 0, 926, 926 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { -26527, -24618, -25152, -25491, 119, -24618, -25152, -25491, -26527, -24618, -25152, 119, -26073, -26527, -24618, -26073, 926, 7700, 11200, 6032 }; // Original
			entityDef.standAnim = 813; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Magic Shop";
			entityDef.description = "Purchase magic supplies here.".getBytes();
		}
		if(i == 6001) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "View"; //first click (Optional)
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Misc. Shop";
			entityDef.description = "Purchase other supplies here.".getBytes();
		}
		if(i == 509) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "Sell-items"; //first click (Optional)
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "OS-World Trader";
			entityDef.description = "You can sell nearly everything to this npc.".getBytes();
		}
		if(i == 1170) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "View"; //first click (Optional)
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 290 ;//Glory
			entityDef.anIntArray94[1] = 13307; //Gloves
			entityDef.anIntArray94[2] = 218 ;//Iron full helm
			entityDef.anIntArray94[3] = 306 ;//Iron plate
			entityDef.anIntArray94[4] = 164 ;//Iron arms
			entityDef.anIntArray94[5] = 268; //Iron platelegs
			entityDef.anIntArray94[6] = 556 ;//Unholy book
			entityDef.anIntArray94[7] = 9639; //Obby cape
			entityDef.anIntArray94[8] = 5409; //Whip
			entityDef.anIntArray94[9] = 3704; //Climbing boots
			entityDef.anIntArray70 = new int[] { -14425, 127, 127, 21662, 21776, 33, -17506, 61, 33, 24, 33, 24, 33, 937, 11177, 61, 28 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 127, 5916, 4882, 10394, 8656, 61, 926, 24, 61, 41, 61, 41, 57, 5018, 61, 10351, 4626 }; // Original
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Pure Shop";
			entityDef.description = "Purchase pure supplies here.".getBytes();
		}  

	    
		if(i == 687) { //Durial321
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "@whi@Attack"; //First option
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 6669; //Ahrims body
			entityDef.anIntArray94[1] = 6659; //Ahrims skirt
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 170; //Ahrims (arms)
			entityDef.anIntArray94[4] = 3704; //Climbing Boots
			entityDef.anIntArray94[5] = 5409; //whip
			entityDef.anIntArray94[6] = 187; //Phat
			entityDef.anIntArray94[7] = 9347; //Obby shield
			entityDef.anIntArray94[8] = 9638; //Fire cape
			entityDef.anIntArray94[9] = 390; //Head
			entityDef.anIntArray70 = new int[] { 22464, 10512, 10512, 28, 127 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 926, 8741, 14490, 4626, 6798 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Durial321";
			entityDef.combatLevel = 115;//Combat Level
			entityDef.description = "Ur fault".getBytes();
		}
		if(i == 6408) { //Bloodhoun34
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[9]; //Number of models it uses
			entityDef.anIntArray94[0] = 4952; //Mystic body
			entityDef.anIntArray94[1] = 4844; //Mystic skirt
			entityDef.anIntArray94[2] = 179; //gloves
			entityDef.anIntArray94[3] = 5028; //Mystic (arms)
			entityDef.anIntArray94[4] = 4955; // Mystic boots
			entityDef.anIntArray94[5] = 512; //magic short
			entityDef.anIntArray94[6] = 202; //Hat
			entityDef.anIntArray94[7] = 323; //Cape
			entityDef.anIntArray94[8] = 390; //Head
			entityDef.anIntArray70 = new int[] { -22419, 31516, 916, 0, 0, 926, 926 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 10004, 6674, -26722, 926, 7700, 11200, 6032 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Bloodhoun34";
			entityDef.combatLevel = 96;//Combat Level
			entityDef.description = "Bye".getBytes();
		}
		if(i == 6409) { //Elvemage
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "@whi@Attack"; //First option
			entityDef.anIntArray94 = new int[11]; //Number of models it uses
			entityDef.anIntArray94[0] = 170; //Wizzy top
			entityDef.anIntArray94[1] = 4844; //Mystic bottom
			entityDef.anIntArray94[2] = 179; //gloves
			entityDef.anIntArray94[3] = 292; //Wizzy arms
			entityDef.anIntArray94[4] = 4955; //Mystic boots
			entityDef.anIntArray94[5] = 554; //Sara staff
			entityDef.anIntArray94[6] = 202; //Hat
			entityDef.anIntArray94[7] = 26424; //Anti drag shield
			entityDef.anIntArray94[8] = 323; //Cape
			entityDef.anIntArray94[9] = 290; //Glory
			entityDef.anIntArray94[10] = 390; //Head
			entityDef.anIntArray70 = new int[] { 127, 127, -21593, 10714, 127, 41, -26722,  -22419, -14425, 127, 127 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 6798, 926, 7700, 11200, 6032, -26722, 8741, 10004, 127, 5916, 4882 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Elvemage";
			entityDef.combatLevel = 79;//Combat Level
			entityDef.description = "Fear me".getBytes();
		}
		if(i == 6410) { //Mahatma
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[9]; //Number of models it uses
			entityDef.anIntArray94[0] = 170;//Monks top
			entityDef.anIntArray94[1] = 265; //Monk bottoms
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 292; //Monks top (arms)
			entityDef.anIntArray94[4] = 3704; // Climbing boots
			entityDef.anIntArray94[5] = 5409; //whip
			entityDef.anIntArray94[6] = 290; //Glory
			entityDef.anIntArray94[7] = 5593; //Team cape 49
			entityDef.anIntArray94[8] = 390; //Head
			entityDef.anIntArray70 = new int[] { 4769, 274, 1831 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 8741, 7756, 7845 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "I Mahatma I";
			entityDef.combatLevel = 92;//Combat Level
			entityDef.description = "Did I do that?".getBytes();
		}
		if(i == 6411) { //Kids Ranqe
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 8383; //ghostly body
			entityDef.anIntArray94[1] = 8382; //ghostly skirt
			entityDef.anIntArray94[2] = 8379; //gloves
			entityDef.anIntArray94[3] = 3704; // Mystic boots
			entityDef.anIntArray94[4] = 539; //dds
			entityDef.anIntArray94[5] = 202; //Hat
			entityDef.anIntArray94[6] = 556; //book
			entityDef.anIntArray94[7] = 290; //glory
			entityDef.anIntArray94[8] = 323; //Cape
			entityDef.anIntArray94[9] = 390; //Head
			entityDef.anIntArray70 = new int[] { 334, 0, 0, 926, 926, 127, 937, 11177, 61, 28, -14425, 127, 127 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { -26722, 926, 7700, 11200, 6032, 6798, 5018, 61, 1035, 4626, 127, 5916, 4882 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Kids Ranqe";
			entityDef.combatLevel = 95;//Combat Level
			entityDef.description = "Bye".getBytes();
		}
		if(i == 6412) { //Purple 0wnz
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[11]; //Number of models it uses
			entityDef.anIntArray94[0] = 170; //monk top
			entityDef.anIntArray94[1] = 292; //monk arms
			entityDef.anIntArray94[2] = 265; //monk bottoms
			entityDef.anIntArray94[3] = 179; //gloves
			entityDef.anIntArray94[4] = 185; // boots
			entityDef.anIntArray94[5] = 490; //rune scim
			entityDef.anIntArray94[6] = 10533; //Hat
			entityDef.anIntArray94[7] = 517; //wooden shield
			entityDef.anIntArray94[8] = 290; //str ammy
			entityDef.anIntArray94[9] = 323; //Cape
			entityDef.anIntArray94[10] = 390; //Head
			entityDef.anIntArray70 = new int[] { 4769, 4769, -29403, 5784, 960, 127, 127 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 8741, 25238, 61, 61, 127, 5916, 4882 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Purple 0wnz";
			entityDef.combatLevel = 64;//Combat Level
			entityDef.description = "F2P is life.".getBytes();
		}
		if(i == 6413) { //Str3ngthz
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[12]; //Number of models it uses
			entityDef.anIntArray94[0] = 170; //Pink robe top
			entityDef.anIntArray94[1] = 258; //Black dhide chaps
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 292; //Pink top arms
			entityDef.anIntArray94[4] = 3704; // Climbing boots
			entityDef.anIntArray94[5] = 6031; //Dragon scim
			entityDef.anIntArray94[6] = 9642; //Fury
			entityDef.anIntArray94[7] = 9638; //Fire cape
			entityDef.anIntArray94[8] = 5593; //Team cape 49
			entityDef.anIntArray94[9] = 235; //Head
			entityDef.anIntArray94[10] = 247; //Chin
			//entityDef.anIntArray94[11] = 11111; //Bandana
			entityDef.anIntArray94[11] = 556; //Unholy book
			entityDef.anIntArray70 = new int[] { 4, 16, 926, 1709, 937, 11177, 61, 334, 4758 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 22416, 22424, -22462, -22450, 5018, 61, 10351, 8741, 4550 }; // Original colour
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Str3ngthz";
			entityDef.combatLevel = 81;//Combat Level
			entityDef.description = "Nfs".getBytes();
		}
		
		if(i == 5523) { // NPC ID 
			entityDef.actions = new String[5];
			entityDef.actions[0] = "View";
			entityDef.name = "Donator rewards"; // NPC name
			entityDef.description = "He will sell items for donator points.".getBytes(); // NPC description
		}
		
		if(i == 5792) { // NPC ID 
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[0] = "View"; //First option
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 27636; //Bandos chest
			entityDef.anIntArray94[1] = 27625; //Tassets
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 28826; //BCP (arms)
			entityDef.anIntArray94[4] = 29250; //Primordial Boots
			entityDef.anIntArray94[5] = 28446; //Abby tent
			entityDef.anIntArray94[6] = 21873; //Neitiznot helm
			entityDef.anIntArray94[7] = 26423; //Dragonfire shield
			entityDef.anIntArray94[8] = 28480; // Fury (or)
			entityDef.anIntArray94[9] = 29616; //Max cape
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "PvP rewards";
			entityDef.combatLevel = 126;//Combat Level
			entityDef.description = "Trade in your bone bits for rewards here.".getBytes(); // NPC description
		}
		
       		if(i == 527) { // NPC ID
           		entityDef.actions = new String[5];
            		entityDef.actions[0] = "View";
            		entityDef.name = "Voting rewards"; // NPC name
            		entityDef.description = "Get great rewards whilst helping OS-WORLD! ::vote".getBytes(); // NPC description
            		entityDef.anIntArray94 = new int[10]; //Number of models it uses
            		entityDef.anIntArray94[0] = 20158; //Ele shirt
            		entityDef.anIntArray94[1] = 20140;//Ele legs
            		entityDef.anIntArray94[2] = 179;//Gloves
            		entityDef.anIntArray94[3] = 20122;//Ele arms
            		entityDef.anIntArray94[4] = 3704;//Boots
            		entityDef.anIntArray94[5] = 5812;//Rubber chicken
            		entityDef.anIntArray94[6] = 218;//white full helm
            		entityDef.anIntArray94[7] = 10420;// Dragon defender
            		entityDef.anIntArray94[8] = 9642;// Fury
            		entityDef.anIntArray94[9] = 3189;//Legends cape
            		entityDef.anIntArray70 = new int[] { 916, 916, 99 }; // Colour you want to change to
            		entityDef.anIntArray76 = new int[] { 10004, 5532, 61 }; // Original colour
            		entityDef.standAnim = 808;// Npc's Stand Emote
            		entityDef.walkAnim = 819;
        	}
		if(i == 507) { // NPC ID 
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			entityDef.name = "General store"; // NPC name
		}
		if(i == 3341) {

			entityDef.actions = new String[5];
			entityDef.actions[0] = "Heal";
			entityDef.name = "Healer";
		}
		
		if(i == 3014) { // Hanter basic mage 
			entityDef.aByte68 = 1; // Distance it stands from u
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "@whi@Attack"; //First option
			entityDef.actions[2] = "@whi@Follow"; //Second option (Optional)
			entityDef.actions[3] = "@whi@Trade with"; //Third option (Optional)
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 4952; //Mystic body
			entityDef.anIntArray94[1] = 4844;//Mystic legs
			entityDef.anIntArray94[2] = 13307;//Gloves
			entityDef.anIntArray94[3] = 5028;//Mystic top (arms)
			entityDef.anIntArray94[4] = 10683;//Infinity Boots
			entityDef.anIntArray94[5] = 6232;//Ancient staff
			entityDef.anIntArray94[6] = 5027;//Mystic hat
			entityDef.anIntArray94[7] = 3470;//Elemental shield
			entityDef.anIntArray94[8] = 290;// Glory
			entityDef.anIntArray94[9] = 3189;//Legends cape
			entityDef.standAnim = 809;// Npc's Stand Emote
			entityDef.walkAnim = 1146;
			entityDef.name = "I Hanter I";
			entityDef.combatLevel = 126;//Combat Level
			entityDef.description = "God of the Wilderness.".getBytes();
		}

		if(i == 1138) { // Hanter medium mage 
			entityDef.aByte68 = 1; // Distance it stands from u
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "@whi@Attack"; //First option
			entityDef.actions[2] = "@whi@Follow"; //Second option (Optional)
			entityDef.actions[3] = "@whi@Trade with"; //Third option (Optional)
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 10687; //Infinity body
			entityDef.anIntArray94[1] = 10686;//Infinity legs
			entityDef.anIntArray94[2] = 179;//Infinity gloves
			entityDef.anIntArray94[3] = 10681;//Infinity top (arms)
			entityDef.anIntArray94[4] = 10683;//Infinity boots
			entityDef.anIntArray94[5] = 10702;//Master wand
			entityDef.anIntArray94[6] = 10684;//Infinity hat
			entityDef.anIntArray94[7] = 8963;//Malediction ward
			entityDef.anIntArray94[8] = 28480;// Fury (or)
			entityDef.anIntArray94[9] = 3189;//Cape of legends
			entityDef.standAnim = 809;// Npc's Stand Emote
			entityDef.walkAnim = 1146;
			entityDef.name = "I Hanter I";
			entityDef.combatLevel = 126;//Combat Level
			entityDef.description = "God of the Wilderness.".getBytes();
		}

		if(i == 1118) { //Hanter hard mage
			entityDef.aByte68 = 3; // Distance it stands from you
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "@whi@Attack"; //First option
			entityDef.actions[2] = "@whi@Follow"; //Second option (Optional)
			entityDef.actions[3] = "@whi@Trade with"; //Third option (Optional)
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 6669; //Ahrims body
			entityDef.anIntArray94[1] = 6659; //Ahrims skirt
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 170; //Ahrims (arms)
			entityDef.anIntArray94[4] = 29249; //Eternal Boots
			entityDef.anIntArray94[5] = 14402; //Toxic staff of the dead
			entityDef.anIntArray94[6] = 21873; //Neitiznot helm
			entityDef.anIntArray94[7] = 11050; //Arcane spirit shield
			entityDef.anIntArray94[8] = 28480; // Fury (or)
			entityDef.anIntArray94[9] = 29616; //Max cape
			entityDef.anIntArray70 = new int[] { 10512, 10512 }; // Colour you want to change to
			entityDef.anIntArray76 = new int[] { 8741, 14490 }; // Original colour
			entityDef.standAnim = 809; // Npc's Stand Emote
			entityDef.walkAnim = 1146;
			entityDef.name = "Wilderness Boss";
			entityDef.combatLevel = 126;//Combat Level
			entityDef.description = "God of the Wilderness.".getBytes();
		}

		if(i == 514) { //I pot u drop max melee
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "@whi@Attack"; //First option
			entityDef.actions[2] = "@whi@Follow"; //Second option (Optional)
			entityDef.actions[3] = "@whi@Trade with"; //Third option (Optional)
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 27636; //Bandos chest
			entityDef.anIntArray94[1] = 27625; //Tassets
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 28826; //BCP (arms)
			entityDef.anIntArray94[4] = 29250; //Primordial Boots
			entityDef.anIntArray94[5] = 28446; //Abby tent
			entityDef.anIntArray94[6] = 21873; //Neitiznot helm
			entityDef.anIntArray94[7] = 26423; //Dragonfire shield
			entityDef.anIntArray94[8] = 28480; // Fury (or)
			entityDef.anIntArray94[9] = 29616; //Max cape
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "I Pot U Drop";
			entityDef.combatLevel = 126;//Combat Level
			entityDef.description = "wat".getBytes();
		}
		if(i == 518) { //Hanter ranged
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "@whi@Attack"; //First option
			entityDef.actions[2] = "@whi@Follow"; //Second option (Optional)
			entityDef.actions[3] = "@whi@Trade with"; //Third option (Optional)
			entityDef.anIntArray94 = new int[10]; //Number of models it uses
			entityDef.anIntArray94[0] = 6674; //Karil's body
			entityDef.anIntArray94[1] = 6664; //Karil's skirt
			entityDef.anIntArray94[2] = 13307; //Barrows gloves
			entityDef.anIntArray94[3] = 6643; //Karil's body (arms)
			entityDef.anIntArray94[4] = 29249; //Eternal Boots
			entityDef.anIntArray94[5] = 19839; //Arma c'bow
			entityDef.anIntArray94[6] = 21873; //Neitiznot helm
			entityDef.anIntArray94[7] = 26423; //Dragonfire shield
			entityDef.anIntArray94[8] = 28480; // Fury (or)
			entityDef.anIntArray94[9] = 20423; //Avas
			entityDef.standAnim = 808; // Npc's Stand Emote
			entityDef.walkAnim = 819;
			entityDef.name = "Wilderness Boss";
			entityDef.combatLevel = 126;//Combat Level
			entityDef.description = "God of the Wilderness".getBytes();
		}
		if (i == 3257) {
			entityDef.actions = new String[] {"Pickpocket", null, "Trade", null, null};
		}
		if (i == 2580) {
			entityDef.actions = new String[] {"Talk-to", null, "Teleport to Abyss", null, null};
		}
		
	if(i == 1749) {//PURPLE PORTAL.
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 14533;
		entityDef.anIntArray94[1] = 14526;
		//entityDef.anIntArray94[2] = 14522;
		entityDef.name = "Portal";
		entityDef.anIntArray70 = new int[] { -11149, -11033, -10792, -10317, -10333 };
		entityDef.anIntArray76 = new int[] { -22293, -22184, -22320,  -22330, -22343 };
		entityDef.actions = new String[5];
		entityDef.actions[1] = "Attack";
		entityDef.standAnim = 3933;
		entityDef.walkAnim = 3933;
		entityDef.combatLevel = 0;
		entityDef.anInt86 = 128;
		entityDef.anInt91 = 128;
	}
	if(i == 1747) {//PINK PORTAL
		entityDef.anIntArray94 = new int[3];
		entityDef.anIntArray94[0] = 14533;
		entityDef.anIntArray94[1] = 14527;
		entityDef.anIntArray94[2] = 14528;
		entityDef.name = "Portal";
		entityDef.anIntArray70 = new int[] { -11149, -11033, -10792, -10317, -10333 };
		entityDef.anIntArray76 = new int[] { 10355, 10471, 10941,  11200, 11787 };
		entityDef.actions = new String[5];
		entityDef.actions[1] = "Attack";
		entityDef.standAnim = 3933;
		entityDef.walkAnim = 3933;
		entityDef.combatLevel = 0;
		entityDef.anInt86 = 128;
		entityDef.anInt91 = 128;
	}
	if(i == 1750) {//YELLOW PORTAL
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 14533;
		entityDef.anIntArray94[1] = 14522;
		entityDef.name = "Portal";
		entityDef.anIntArray70 = new int[] { -11149, -11033, -10792, -10317, -10333 };
		entityDef.anIntArray76 = new int[] { 10355, 10471, 10941,  11200, 11787 };
		entityDef.actions = new String[5];
		entityDef.actions[1] = "Attack";
		entityDef.standAnim = 3933;
		entityDef.walkAnim = 3933;
		entityDef.combatLevel = 0;
		entityDef.anInt86 = 128;
		entityDef.anInt91 = 128;
	}
	if(i == 1746) {//RED PORTAL?
		entityDef.anIntArray94 = new int[4];
		entityDef.anIntArray94[0] = 14533;
		entityDef.anIntArray94[1] = 14523;
		entityDef.anIntArray94[2] = 14524;
		entityDef.anIntArray94[3] = 14525;
		entityDef.name = "Portal";
		entityDef.anIntArray70 = new int[] { -11149, -11033, -10792, -10317, -10333 };
		entityDef.anIntArray76 = new int[] { -2125, -2249, -2373,  -2490, -2490 };
		entityDef.actions = new String[5];
		entityDef.actions[1] = "Attack";
		entityDef.standAnim = 3933;
		entityDef.walkAnim = 3933;
		entityDef.combatLevel = 0;
		entityDef.anInt86 = 128;
		entityDef.anInt91 = 128;
	}
	
	if(i == 493) {//RED PORTAL?
		entityDef.actions = new String[5];
		entityDef.actions[1] = "Attack";
		entityDef.combatLevel = 0;
	}
	
		if (i == 4435) {
		   EntityDef jad = forID(3127);
		   entityDef.name = "TzRek-Jad";
		   entityDef.anIntArray94 = new int[1];
		   entityDef.anIntArray94[0] = 9319;
		 //  entityDef.description = "This is not going to hurt... but it might tickle.";
		   entityDef.standAnim = 2650;
		   entityDef.walkAnim = 2651;
		   entityDef.anInt58 = jad.anInt58;
		   entityDef.anInt83 = jad.anInt83;
		   entityDef.anInt55 = jad.anInt55;
		   entityDef.anIntArray73 = new int[] { 29320 };
		   entityDef.actions = new String[] { "Talk-to", null, "Pick-up", null, null };
		   entityDef.anInt91 = 20;
		   entityDef.anInt86 = 20;
		}
		
		if (i == 7153) {
			entityDef.name = "Demonic gorilla";
			entityDef.description = "A demonic gorilla".getBytes();
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.combatLevel = 275;
			entityDef.walkAnim = 7233;
			entityDef.standAnim = 7230;
			entityDef.anInt58 = 7233;
			entityDef.anInt83 = 7233;
			entityDef.anInt55 = 7233;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 31241;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 10266;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 28;
			//entityDef.anIntArray70 = new int[] { 916, 916, 99 }; // Colour you want to change to
    		//entityDef.anIntArray76 = new int[] { 10004, 5532, 61 }; // Original colour
			entityDef.anInt91 = 64;
			entityDef.anInt86 = 64;
			entityDef.aByte68 = 2;
			entityDef.anInt75 = 0;
		}
		if (i == 7152) {
			entityDef.name = "Demonic gorilla";
			entityDef.description = "A demonic gorilla".getBytes();
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.combatLevel = 275;
			entityDef.walkAnim = 7233;
			entityDef.standAnim = 7230;
			entityDef.anInt58 = 7233;
			entityDef.anInt83 = 7233;
			entityDef.anInt55 = 7233;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 31241;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 10266;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 28;
			entityDef.anInt91 = 64;
			entityDef.anInt86 = 64;
			entityDef.aByte68 = 2; 
			entityDef.anInt75 = 2;
		}
		if (i == 7151) {
			entityDef.name = "Demonic gorilla";
			entityDef.description = "A demonic gorilla".getBytes();
			entityDef.combatLevel = 275;
			entityDef.walkAnim = 7233;
			entityDef.standAnim = 7230;
			entityDef.anInt58 = 7233;
			entityDef.anInt83 = 7233;
			entityDef.anInt55 = 7233;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 31241;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 10266;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 28;
			entityDef.anInt91 = 64;
			entityDef.anInt86 = 64;
			entityDef.aByte68 = 2;
			entityDef.anInt75 = 1;
		}

		if (i == 5057) {
			entityDef.anInt91 = 130;
			entityDef.anInt86 = 130;
			entityDef.aByte68 = 3;
			entityDef.aBoolean87 = false;
			entityDef.aBoolean84 = false;
		}
		if (i == 6611) {
			EntityDef skeleton = forID(83);
			entityDef.standAnim = skeleton.standAnim;
			entityDef.walkAnim = skeleton.walkAnim;
		}
		if(i == 4771) {
			entityDef.name = "Amik Varze";
			entityDef.actions[2] = "Imbue Rings";
		}
		if(i == 5389) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48000;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant dragon";
			entityDef.combatLevel = 135;
			entityDef.description = "A ghost of a dragon slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 2;
		}
		if(i == 5390) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48001;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant knight";
			entityDef.combatLevel = 126;
			entityDef.description = "A ghost of a knight slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5391) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48002;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant dark beast";
			entityDef.combatLevel = 120;
			entityDef.description = "The essence of a dark beast slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 2;
		}
		if(i == 5392) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48003;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant ork";
			entityDef.combatLevel = 105;
			entityDef.description = "The ghost of an ork slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5393) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48004;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant demon";
			entityDef.combatLevel = 98;
			entityDef.description = "The essence of a demon slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 2;
		}
		if(i == 5394) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48005;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant hellhound";
			entityDef.combatLevel = 90;
			entityDef.description = "The essence of a hellhound slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5395) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48006;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant cyclops";
			entityDef.combatLevel = 82;
			entityDef.description = "The ghost of a cyclops slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5396) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48007;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant werewolf";
			entityDef.combatLevel = 75;
			entityDef.description = "The ghost of a werewolf slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5397) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48008;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant vampire";
			entityDef.combatLevel = 68;
			entityDef.description = "The ghost of a vampire slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5398) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48009;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant hobgoblin";
			entityDef.combatLevel = 60;
			entityDef.description = "The ghost of a hobgoblin slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5399) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48010;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant pyrefiend";
			entityDef.combatLevel = 45;
			entityDef.description = "The ghost of a pyrefiend slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5400) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48011;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant icefiend";
			entityDef.combatLevel = 45;
			entityDef.description = "The ghost of a icefiend slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5401) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[5]; //Number of models it uses
			entityDef.anIntArray94[0] = 48012;
			entityDef.anIntArray94[1] = 48013;
			entityDef.anIntArray94[2] = 48014;
			entityDef.anIntArray94[3] = 48015;
			entityDef.anIntArray94[4] = 48016;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant goblin";
			entityDef.combatLevel = 15;
			entityDef.description = "The ghost of a goblin slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		if(i == 5402) {
			entityDef.actions = new String[5]; // Actions for the npc
			entityDef.actions[1] = "Attack"; //First option
			entityDef.anIntArray94 = new int[1]; //Number of models it uses
			entityDef.anIntArray94[0] = 48017;
			//entityDef.standAnim = 7105;
			entityDef.name = "Revenant imp";
			entityDef.combatLevel = 7;
			entityDef.description = "The essence of an imp slain during the god wars.".getBytes();
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			entityDef.aByte68 = 1;
		}
		switch(i) {
		case 5915:
			entityDef.name = "Respiratory system";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.standAnim = 7105;
			break;
		}
		return entityDef;
	}
	
	private static boolean needsAdjustment(int interfaceType) {
		switch(interfaceType) {
		case 5908:
		case 5909:
		case 5910:
		case 5911:
		case 5912:
		case 5913:
			return true;
		}
		return false;
	}


	public Model method160() {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method160();
		}
		if (anIntArray73 == null)
			return null;
		boolean flag1 = false;
		for (int i = 0; i < anIntArray73.length; i++)
			if (!Model.method463(anIntArray73[i]))
				flag1 = true;

		if (flag1)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray73.length];
		for (int j = 0; j < anIntArray73.length; j++)
			aclass30_sub2_sub4_sub6s[j] = Model.method462(anIntArray73[j]);

		Model model;
		if (aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length,
					aclass30_sub2_sub4_sub6s);
		if (anIntArray76 != null) {
			for (int k = 0; k < anIntArray76.length; k++)
				//model.method476(anIntArray76[k], anIntArray70[k]);
			model.method476(anIntArray76[k], anIntArray70[k], ItemDef.getTexture(-1));

		}
		if(needsAdjustment(interfaceType)) {
			model.method475(0, 50, 0);
		}
		return model;
	}

	public EntityDef method161() {
		int j = -1;
		if (anInt57 != -1) {
			VarBit varBit = VarBit.cache[anInt57];
			int k = varBit.anInt648;
			int l = varBit.anInt649;
			int i1 = varBit.anInt650;
			int j1 = Client.anIntArray1232[i1 - l];
			j = clientInstance.variousSettings[k] >> l & j1;
		} else if (anInt59 != -1)
			j = clientInstance.variousSettings[anInt59];
		if (j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
			return null;
		else
			return forID(childrenIDs[j]);
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(FileOperations.ReadFile(Signlink.findcachedir() + "/npc.dat"));
		Stream stream2 = new Stream(FileOperations.ReadFile(Signlink.findcachedir() + "/npc.idx"));
		int totalNPCs = stream2.readUnsignedWord();
		System.out.println("#110 NPC amount: " + totalNPCs);
		streamIndices = new int[totalNPCs];
		int i = 2;
		for (int j = 0; j < totalNPCs; j++) {
			streamIndices[j] = i;
			i += stream2.readUnsignedWord();
		}

		cache = new EntityDef[20];
		for (int k = 0; k < 20; k++)
			cache[k] = new EntityDef();
		for (int index = 0; index < totalNPCs; index++) {
			EntityDef def = EntityDef.forID(index);
			if (def == null) {
				continue;
			}
			if (def.name == null) {
				continue;
			}
			if (def.name.toLowerCase().contains("portal")) {
				System.out.println(index + " - " + def.name);
			}
		}
	}

	public static void nullLoader() {
		mruNodes = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public Model method164(int j, int k, int ai[]) {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method164(j, k, ai);
		}
		Model model = (Model) mruNodes.insertFromCache(interfaceType);
		if (model == null) {
			boolean flag = false;
			for (int i1 = 0; i1 < anIntArray94.length; i1++)
				if (!Model.method463(anIntArray94[i1]))
					flag = true;

			if (flag)
				return null;
			Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray94.length];
			for (int j1 = 0; j1 < anIntArray94.length; j1++)
				aclass30_sub2_sub4_sub6s[j1] = Model
				.method462(anIntArray94[j1]);

			if (aclass30_sub2_sub4_sub6s.length == 1)
				model = aclass30_sub2_sub4_sub6s[0];
			else
				model = new Model(aclass30_sub2_sub4_sub6s.length,
						aclass30_sub2_sub4_sub6s);
			if (anIntArray76 != null) {
				for (int k1 = 0; k1 < anIntArray76.length; k1++)
				model.method476(anIntArray76[k1], anIntArray70[k1], ItemDef.getTexture(-1));

			}
			if(needsAdjustment(interfaceType)) {
				model.method475(0, 50, 0);
			}
			model.method469();
			model.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
			mruNodes.removeFromCache(model, interfaceType);
		}
		Model model_1 = Model.aModel_1621;
		model_1.method464(model, Class36.method532(k) & Class36.method532(j));
		if (k != -1 && j != -1)
			model_1.method471(ai, j, k);
		else if (k != -1)
			model_1.method470(k);
		if (anInt91 != 128 || anInt86 != 128)
			model_1.method478(anInt91, anInt91, anInt86);
		model_1.method466();
		model_1.anIntArrayArray1658 = null;
		model_1.anIntArrayArray1657 = null;
		if (aByte68 == 1)
			model_1.aBoolean1659 = true;
		return model_1;
	}
	
	public void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1) {
				int j = stream.readUnsignedByte();
				anIntArray94 = new int[j];
				for (int j1 = 0; j1 < j; j1++)
					anIntArray94[j1] = stream.readUnsignedWord();

			} else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readString().getBytes();
			else if (i == 12)
				aByte68 = stream.readSignedByte();
			else if (i == 13)
				standAnim = stream.readUnsignedWord();
			else if (i == 14)
				walkAnim = stream.readUnsignedWord();
			else if (i == 17) {
				walkAnim = stream.readUnsignedWord();
				anInt58 = stream.readUnsignedWord();
				anInt83 = stream.readUnsignedWord();
				anInt55 = stream.readUnsignedWord();
			} else if (i >= 30 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 30] = stream.readString();
				if (actions[i - 30].equalsIgnoreCase("hidden"))
					actions[i - 30] = null;
			} else if (i == 40) {
				int k = stream.readUnsignedByte();
				anIntArray76 = new int[k];
				anIntArray70 = new int[k];
				for (int k1 = 0; k1 < k; k1++) {
					anIntArray76[k1] = stream.readUnsignedWord();
					anIntArray70[k1] = stream.readUnsignedWord();
				}

			} else if (i == 60) {
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for (int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedWord();

			} else if (i == 90)
				stream.readUnsignedWord();
			else if (i == 91)
				stream.readUnsignedWord();
			else if (i == 92)
				stream.readUnsignedWord();
			else if (i == 93)
				aBoolean87 = false;
			else if (i == 95)
				combatLevel = stream.readUnsignedWord();
			else if (i == 97)
				anInt91 = stream.readUnsignedWord();
			else if (i == 98)
				anInt86 = stream.readUnsignedWord();
			else if (i == 99)
				aBoolean93 = true;
			else if (i == 100)
				anInt85 = stream.readSignedByte();
			else if (i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else if (i == 102)
				anInt75 = stream.readUnsignedByte();
			else if (i == 103)
				anInt79 = stream.readUnsignedByte();
			else if (i == 106) {
				anInt57 = stream.readUnsignedWord();
				if (anInt57 == 65535)
					anInt57 = -1;
				anInt59 = stream.readUnsignedWord();
				if (anInt59 == 65535)
					anInt59 = -1;
				int i1 = stream.readUnsignedByte();
				childrenIDs = new int[i1 + 1];
				for (int i2 = 0; i2 <= i1; i2++) {
					childrenIDs[i2] = stream.readUnsignedWord();
					if (childrenIDs[i2] == 65535)
						childrenIDs[i2] = -1;
				}

			} else if (i == 107)
				aBoolean84 = false;
		} while (true);
	}

	public void readValuesold(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1) {
				int j = stream.readUnsignedByte();
				anIntArray94 = new int[j];
				for (int j1 = 0; j1 < j; j1++)
					anIntArray94[j1] = stream.readUnsignedWord();

			} else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readBytes();
			else if (i == 12)
				aByte68 = stream.readSignedByte();
			else if (i == 13)
				standAnim = stream.readUnsignedWord();
			else if (i == 14)
				walkAnim = stream.readUnsignedWord();
			else if (i == 17) {
				walkAnim = stream.readUnsignedWord();
				anInt58 = stream.readUnsignedWord();
				anInt83 = stream.readUnsignedWord();
				anInt55 = stream.readUnsignedWord();
			} else if (i >= 30 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 30] = stream.readString();
				if (actions[i - 30].equalsIgnoreCase("hidden"))
					actions[i - 30] = null;
			} else if (i == 40) {
				int k = stream.readUnsignedByte();
				anIntArray76 = new int[k];
				anIntArray70 = new int[k];
				for (int k1 = 0; k1 < k; k1++) {
					anIntArray76[k1] = stream.readUnsignedWord();
					anIntArray70[k1] = stream.readUnsignedWord();
				}

			} else if (i == 60) {
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for (int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedWord();

			} else if (i == 90)
				stream.readUnsignedWord();
			else if (i == 91)
				stream.readUnsignedWord();
			else if (i == 92)
				stream.readUnsignedWord();
			else if (i == 93)
				aBoolean87 = false;
			else if (i == 95)
				combatLevel = stream.readUnsignedWord();
			else if (i == 97)
				anInt91 = stream.readUnsignedWord();
			else if (i == 98)
				anInt86 = stream.readUnsignedWord();
			else if (i == 99)
				aBoolean93 = true;
			else if (i == 100)
				anInt85 = stream.readSignedByte();
			else if (i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else if (i == 102)
				anInt75 = stream.readUnsignedWord();
			else if (i == 103)
				anInt79 = stream.readUnsignedWord();
			else if (i == 106) {
				anInt57 = stream.readUnsignedWord();
				if (anInt57 == 65535)
					anInt57 = -1;
				anInt59 = stream.readUnsignedWord();
				if (anInt59 == 65535)
					anInt59 = -1;
				int i1 = stream.readUnsignedByte();
				childrenIDs = new int[i1 + 1];
				for (int i2 = 0; i2 <= i1; i2++) {
					childrenIDs[i2] = stream.readUnsignedWord();
					if (childrenIDs[i2] == 65535)
						childrenIDs[i2] = -1;
				}

			} else if (i == 107)
				aBoolean84 = false;
		} while (true);
	}

	public EntityDef() {
		anInt55 = -1;
		anInt57 = -1;
		anInt58 = -1;
		anInt59 = -1;
		combatLevel = -1;
		anInt64 = 1834;
		walkAnim = -1;
		aByte68 = 1;
		anInt75 = -1;
		standAnim = -1;
		interfaceType = -1;
		anInt79 = 32;
		anInt83 = -1;
		aBoolean84 = true;
		anInt86 = 128;
		aBoolean87 = true;
		anInt91 = 128;
		aBoolean93 = false;
	}

	public int anInt55;
	public static int anInt56;
	public int anInt57;
	public int anInt58;
	public int anInt59;
	public static Stream stream;
	public int combatLevel;
	public final int anInt64;
	public String name;
	public String actions[];
	public int walkAnim;
	public byte aByte68;
	public int[] anIntArray70;
	public static int[] streamIndices;
	public int[] anIntArray73;
	public int anInt75;
	public int[] anIntArray76;
	public int standAnim;
	public int interfaceType;
	public int anInt79;
	public static EntityDef[] cache;
	public static Client clientInstance;
	public int anInt83;
	public boolean aBoolean84;
	public int anInt85;
	public int anInt86;
	public boolean aBoolean87;
	public int childrenIDs[];
	public byte description[];
	public int anInt91;
	public int anInt92;
	public boolean aBoolean93;
	public int[] anIntArray94;
	public static MRUNodes mruNodes = new MRUNodes(30);

}
