import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public final class ItemDef {

	public static void nullLoader() {
		mruNodes2 = null;
		mruNodes1 = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}
	
	public static int getTexture(int id) {
		switch (id) {
		case 12773:
		case 12371:
			return 40;

		case 12774:
			return 24;
		}
		return -1;
	}

	public boolean method192(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		return flag;
	}

	@SuppressWarnings("unused")
	private static void writeOut() {
		BufferedWriter writer = null;
		for (int i = 0; i < totalItems; i++) {
			ItemDef item = ItemDef.forID(i);
			try {
				writer = new BufferedWriter(new FileWriter("sql.txt", true));
				if (item == null)
					continue;
				if (item.name == null || item.description == null)
					continue;
				writer.write("(" + i + ",'" + item.name.replace("'", "")
						+ "','" + item.description.replace("'", "") + "'),");
				writer.newLine();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void displayItemDisplayVals(ItemDef def) {
		System.out.println("modelID: "+def.modelID);
		System.out.println("modelZoom: "+def.modelZoom);
		System.out.println("modelRotationY: "+def.modelRotationY);
		System.out.println("modelRotationX: "+def.modelRotationX);
		System.out.println("modelOffset1: "+def.modelOffset1);
		System.out.println("modelOffset2: "+def.modelOffset2);

	}
	public static void unpackConfig(StreamLoader archive) {
		stream = new Stream(FileOperations.ReadFile(Signlink.findcachedir() + "/obj.dat"));
		Stream stream = new Stream(FileOperations.ReadFile(Signlink.findcachedir() + "/obj.idx"));
		totalItems = stream.readUnsignedWord() + 21;
		streamIndices = new int[totalItems + 50000];
		System.out.println("Items Loaded: "+totalItems);
		int i = 2;
		for (int j = 0; j < totalItems - 21; j++) {
			streamIndices[j] = i;
			i += stream.readUnsignedWord();
		}

		cache = new ItemDef[10];
		for (int k = 0; k < 10; k++)
			cache[k] = new ItemDef();

	}

	public Model method194(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return null;
		Model model = Model.method462(k);
		if (l != -1) {
			Model model_1 = Model.method462(l);
			Model aclass30_sub2_sub4_sub6s[] = { model, model_1 };
			model = new Model(2, aclass30_sub2_sub4_sub6s);
		}
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < modifiedModelColors.length; i1++)
				model.method476(modifiedModelColors[i1], originalModelColors[i1], getTexture(id));

		}
		return model;
	}
	
	public static void applyTexture(Model model, int id) {
		switch (id) {
		case 12773://Volcanic Whip
			model.setTexture(31);
			break;
		case 12774:// Frozen Whip
			model.setTexture(1);
		break;
		case 11992://Lava Scale
			model.setTexture(47155, 31);
			break;	
		case 12371://Lava Mask
			model.setTexture(38119, 31);
			break;	
		case 12769://Frozen Mix
			model.setTexture(15);
			break;
		case 12771://Volcanic Mix
			model.setTexture(31);
			break;	
		}
	}

	public boolean method195(int j) {
		int k = anInt165;
		int l = anInt188;
		int i1 = anInt185;
		if (j == 1) {
			k = anInt200;
			l = anInt164;
			i1 = anInt162;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		if (i1 != -1 && !Model.method463(i1))
			flag = false;
		return flag;
	}
	
	public Model method196(int i) {
		int j = anInt165;
		int k = anInt188;
		int l = anInt185;
		if (i == 1) {
			j = anInt200;
			k = anInt164;
			l = anInt162;
		}
		if (j == -1)
			return null;
		Model model = Model.method462(j);
		if (k != -1)
			if (l != -1) {
				Model model_1 = Model.method462(k);
				Model model_3 = Model.method462(l);
				Model aclass30_sub2_sub4_sub6_1s[] = { model, model_1, model_3 };
				model = new Model(3, aclass30_sub2_sub4_sub6_1s);
			} else {
				Model model_2 = Model.method462(k);
				Model aclass30_sub2_sub4_sub6s[] = { model, model_2 };
				model = new Model(2, aclass30_sub2_sub4_sub6s);
			}
		if (i == 0 && maleEquipOffset != 0)
			model.method475(0, maleEquipOffset, 0);
		if (i == 1 && femaleEquipOffset != 0)
			model.method475(0, femaleEquipOffset, 0);
		applyTexture(model, id);
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < modifiedModelColors.length; i1++)
				model.method476(modifiedModelColors[i1], originalModelColors[i1], getTexture(id));

		}
		return model;
	}

	private void setDefaults() {
		modelID = 0;
		name = null;
		description = null;
		modifiedModelColors = null;
		originalModelColors = null;
		modelZoom = 2000;
		modelRotationY = 0;
		modelRotationX = 0;
		anInt204 = 0;
		modelOffset1 = 0;
		modelOffset2 = 0;
		stackable = false;
		value = 1;
		membersObject = false;
		groundActions = null;
		itemActions = null;
		anInt165 = -1;
		anInt188 = -1;
		maleEquipOffset = 0;
		anInt200 = -1;
		anInt164 = -1;
		femaleEquipOffset = 0;
		anInt185 = -1;
		anInt162 = -1;
		anInt175 = -1;
		anInt166 = -1;
		anInt197 = -1;
		anInt173 = -1;
		stackIDs = null;
		stackAmounts = null;
		certID = -1;
		certTemplateID = -1;
		anInt167 = 128;
		anInt192 = 128;
		anInt191 = 128;
		brightness = 0;
		anInt184 = 0;
		team = 0;
	}

	public static int[] getResults(String name, int range, boolean limited) {
		int[] items = new int[range];
		int position = 0;
		if (limited) {
			RSInterface bank = RSInterface.interfaceCache[5382];
			for (int i = 0; i < bank.inv.length; i++) {
				if (bank.inv[i] <= 0) {
					continue;
				}
				ItemDef itemDef = forID(bank.inv[i] - 1);
				if (position >= range) {
					break;
				}
				if (itemDef == null) {
					continue;
				}
				if (itemDef.stackable) {
					if (itemDef.description != null) {
						if (itemDef.description.startsWith("Swap this note")) {
							continue;
						}
					}
				}
				String itemName = itemDef.name;
				if (itemName == null) {
					continue;
				}
				if (itemName.toLowerCase().contains(name.toLowerCase())) {
					if (Arrays.binarySearch(items, bank.inv[i] - 1) >= 0) {
						continue;
					}
					items[position] = bank.inv[i] - 1;
					position++;
				}
			}
		} else {
			for (int i = 0; i < 14485; i++) {
				ItemDef itemDef = forID(i);
				if (position >= range) {
					break;
				}
				if (itemDef == null) {
					continue;
				}
				if (itemDef.stackable) {
					if (itemDef.description != null) {
						if (itemDef.description.startsWith("Swap this note")) {
							continue;
						}
					}
				}
				String itemName = itemDef.name;
				if (itemName == null) {
					continue;
				}
				if (itemName.toLowerCase().contains(name.toLowerCase())) {
					if (Arrays.binarySearch(items, itemDef.id) >= 0) {
						continue;
					}
					items[position] = itemDef.id;
					position++;
				}
			}
		}
		return items;
	}
	
	public static void applyTexturing(Model model, int id) {
		switch (id) {
		case 11992:
			System.out.println("Lava Scale-------------------------");
			//model.setTexture(47155, 40);
			Model.printModelColours(model);
			System.out.println("Lava Scale-------------------------");
			break;
		case 12769:
			System.out.println("Frozen Mix-------------------------");
			model.setTexture(41);
			Model.printModelColours(model);
			System.out.println("Frozen Mix-------------------------");
			break;
		case 12771:
			System.out.println("Volcanic Mix-------------------------");
			model.setTexture(40);
			Model.printModelColours(model);
			System.out.println("Volcanic Mix-------------------------");
			break;
		case 12773:
			System.out.println("Volcanic whip-------------------------");
			model.setTexture(16, 40);
			Model.printModelColours(model);
			System.out.println("Volcanic whip-------------------------");
			break;
		case 12774:
			model.setTexture(16, 42);
			Model.printModelColours(model);
			break;
		case 12371:
			System.out.println("Lava mask-------------------------");
			model.setTexture(38119, 40);
			Model.printModelColours(model);
			System.out.println("Lava mask-------------------------");
			break;
		}
	}

	public static ItemDef forID(int i) {
		for (int j = 0; j < 10; j++)
			if (cache[j].id == i && i != 2405) {
				return cache[j];
			}

		cacheIndex = (cacheIndex + 1) % 10;
		ItemDef itemDef = cache[cacheIndex];
		stream.currentOffset = streamIndices[i];
		itemDef.id = i;
		itemDef.setDefaults();
		itemDef.readValues(stream);
		/* Customs added here? */
		if (itemDef.certTemplateID != -1)
			itemDef.toNote();
		if (i == 13188) {
			itemDef.name = "Dragon claws";
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", null, null,"Drop" };
			}
		if (i == 12877 || i == 12873 || i == 12875 || i == 12879 || i == 12881 || i == 12883) {
			itemDef.itemActions = new String[5];
			itemDef.itemActions[2] = "Open";
		}
		if (i == 13173) {
			itemDef.itemActions = new String[5];
			itemDef.itemActions[2] = "Open";
			itemDef.name = "Partyhat package";
			itemDef.description = "Open this for a random partyhat.";
		}
		if (i == 13175) {
			itemDef.itemActions = new String[5];
			itemDef.itemActions[2] = "Open";
			itemDef.name = "H'ween package";
			itemDef.description = "Open this for a random h'ween mask.";
		}
		 if (i == 13307 || i == 13308 || i == 13309 || i == 13310 || i == 13311 || i == 13312 || i == 13313 || i == 13314 || i == 13315 || i == 13316) {
			   itemDef.name = "@whi@Bone bits";
			   itemDef.originalModelColors = new int[] { 127 };
			   itemDef.modifiedModelColors = new int[] { 8128 };
			   itemDef.description = "Small cylindrical fragments of bone.";
			   }
		 
		/* if (i == 995 || i == 996 || i == 997 || i == 998 || i == 999 || i == 1000 || i == 1001 || i == 1002 || i == 1003 || i == 1004) {
			   itemDef.name = "@gre@Coins";
			   itemDef.originalModelColors = new int[] { 24483 };
			   itemDef.modifiedModelColors = new int[] { 8128 };
			   itemDef.description = "Small, slimy pieces of something unpleasant.";
			   }*/
		 
		 if (i == 11238 || i == 11240 || i == 11242 || i == 11244 || i == 11246 || i == 11248 || i == 11250 || i == 11252 || i == 11254 || i == 11256) {
				itemDef.itemActions = new String[] { "Loot", null, null, null, "Drop" };
			   }
		 
			if (i == 4566) {
				itemDef.itemActions[2] = "Whack";
			}

		if (i == 8901) {
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.itemActions[2] = "Assemble";
		}
		if (i == 2839) {
			itemDef.name ="Slayer helmet recipe";
			itemDef.description = "Read this scroll to learn the slayer helmet recipe.";
		
		}
		if (i == 13024 || i == 13026 || i == 13012 || i == 13000 || i == 12984 || i == 12972) {// iron-rune armour sets
			itemDef.itemActions = new String[5];
			itemDef.itemActions[2] = "Open";
			}
			if (i == 12865 || i == 12867 || i == 12869 || i ==12871  || i == 12863 || i == 13066) {// green-black dhide sets, dwarf cannon set, super combat potion set
				itemDef.itemActions = new String[5];
				itemDef.itemActions[2] = "Open";
			}
		if (i == 13658) {
			itemDef.name = "Slayer card";
			itemDef.description = "A card used to give the previous Slayer task.";
			itemDef.itemActions[0] = "Give-task";
		}
		if (i == 757) {
			itemDef.name = "Task book";
			itemDef.description = "A curious looking book.";
			itemDef.itemActions[0] = "Extend-task";
		}
		switch (i) {
		
		case 17858:
			itemDef.name = "Pet mystery box";
			itemDef.modelZoom = 1180;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.originalModelColors = new int[] { 8128 };
			itemDef.modifiedModelColors = new int[] { 0 };
			//itemDef.description = "Open this pack and get 400k coins.";
			itemDef.modelID = 2426;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			break;
		
		case 27:
			itemDef.name = "Skilling zone pass";
			itemDef.description = "This pass is used to teleport you to the skilling zone.";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Teleport";
		
			break;
		
		case 7447:
       case 7448:
           itemDef.name = "Brutal blade";
          break; 
        case 14674:
        case 14675:
            itemDef.name = "Training whip";
            itemDef.modelZoom = 840;
            itemDef.modelRotationY = 280;
            itemDef.modelOffset1 = -2;
            itemDef.modelOffset2 = 56;
            itemDef.groundActions = new String[] { null, null, "Take", null, null };
            itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
            itemDef.originalModelColors = new int[] { 100 };
            itemDef.modifiedModelColors = new int[] { 528 };
            itemDef.modelID = 5412;
            itemDef.anInt165 = 5409;
            itemDef.anInt200 = 5409;
            break;
		
		case 13640:
		case 13641:
			itemDef.name = "Farmer's boro trousers";	
			itemDef.anInt165 = 31026;
			itemDef.anInt200 = 31031;
			break;
		case 13642:
		case 13643:
			itemDef.name = "Farmer's jacket";
			itemDef.anInt165 = 31029;
			itemDef.anInt188 = 31028;
			itemDef.anInt200 = 31034;
			itemDef.anInt164 = 31033;
			break;
		case 13644:
		case 13645:
			itemDef.name = "Farmer's boots";	
			itemDef.anInt165 = 31030;
			itemDef.anInt200 = 31035;
			break;
		case 13646:
		case 13647:
			itemDef.name = "Farmer's strawhat";	
			itemDef.anInt165 = 31027;
			itemDef.anInt200 = 31032;
			break;
		case 2690:
			itemDef.name = "$10 scroll";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Claim-points";
			break;
		case 2691:
			itemDef.name = "$20 scroll";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Claim-points";
			break;

		case 2692:
			itemDef.name = "$30 scroll";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Claim-points";
			break;
			
			case 2697:
				itemDef.name = "Contributor ticket";
				itemDef.description = "Read this scroll to be rewarded with Contributor status.";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Claim-rank";
				itemDef.modelZoom = 830;
				itemDef.modelRotationY = 320;
				itemDef.modelRotationX = 132;
				itemDef.modelOffset1 = 6;
				itemDef.modelOffset2 = -2;
				itemDef.modelID = 64446;
				break;

			case 2698:
				itemDef.name = "Sponsor ticket";
				itemDef.description = "Read this scroll to be rewarded with Sponsor status.";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Claim-rank";
				itemDef.modelZoom = 830;
				itemDef.modelRotationY = 320;
				itemDef.modelRotationX = 132;
				itemDef.modelOffset1 = 6;
				itemDef.modelOffset2 = -2;
				itemDef.modelID = 64445;
				break;

			case 2699:
				itemDef.name = "Supporter ticket";
				itemDef.description = "Read this scroll to be rewarded with Supporter status.";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Claim-rank";
				itemDef.modelZoom = 830;
				itemDef.modelRotationY = 320;
				itemDef.modelRotationX = 132;
				itemDef.modelOffset1 = 6;
				itemDef.modelOffset2 = -2;
				itemDef.modelID = 64444;
				break;
			case 14200:
				itemDef.name = "Strange herb";
				//itemDef.originalModelColors = new int[] { 7114, 6057 };
				//itemDef.modifiedModelColors = new int[] { 7062, 5541 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
                itemDef.modelZoom = 700;
                itemDef.modelRotationY = 376;
                itemDef.modelRotationX = 1588;
                itemDef.modelOffset1 = 4;
                itemDef.modelOffset2 = 0;
                itemDef.originalModelColors = new int[] { 7114, 6057 };
                itemDef.modifiedModelColors = new int[] { 22418, 22428 };
                itemDef.modelID = 2364;
				break;

		case 13302:
			itemDef.name = "Strange fish (Fishing)";
			itemDef.modelZoom = 1340;
			itemDef.modelRotationY = 464;
			itemDef.modelRotationX = 1920;
			itemDef.modelOffset2 = 3;
			itemDef.originalModelColors = new int[] { 7114, 6057 };
			itemDef.modifiedModelColors = new int[] { 61, 103 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 2355;
			break;

            case 14202:
                itemDef.name = "Strange potion";
                itemDef.modelZoom = 550;
                itemDef.modelRotationY = 84;
                itemDef.modelRotationX = 1996;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -1;
                itemDef.modifiedModelColors = new int[] { 61 };
                itemDef.originalModelColors = new int[] { 7114 };
                itemDef.groundActions = new String[] { null, null, "Take", null, null };
                itemDef.itemActions = new String[] { null, null, null, "Empty", "Drop" };
                itemDef.modelID = 2697;
                break;

                case 14204:
            itemDef.name = "Strange bar";
            itemDef.modelZoom = 820;
            itemDef.modelRotationY = 196;
            itemDef.modelRotationX = 1180;
            itemDef.modelOffset1 = 1;
            itemDef.modelOffset2 = -8;
            itemDef.modifiedModelColors = new int[] { 7062 };
            itemDef.originalModelColors = new int[] { 7114 };
            itemDef.groundActions = new String[] { null, null, "Take", null, null };
            itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
            itemDef.modelID = 2408;
            break;

            case 14206:
                itemDef.name = "Strange bow (u)";
                itemDef.modelZoom = 1820;
                itemDef.modelRotationY = 460;
                itemDef.modelRotationX = 1004;
                itemDef.modelOffset1 = 2;
                itemDef.modelOffset2 = 15;
                itemDef.originalModelColors = new int[] { 7114 };
                itemDef.modifiedModelColors = new int[] { 6674 };
                itemDef.groundActions = new String[] { null, null, "Take", null, null };
                itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
                itemDef.modelID = 2401;
                break;

            case 14208:
                itemDef.name = "Strange fish (Cooking)";
                itemDef.modelZoom = 1340;
                itemDef.modelRotationY = 464;
                itemDef.modelRotationX = 1920;
                itemDef.modelOffset2 = 3;
                itemDef.originalModelColors = new int[] { 7114, 6057 };
                itemDef.modifiedModelColors = new int[] { 61, 103 };
                itemDef.groundActions = new String[] { null, null, "Take", null, null };
                itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
                itemDef.modelID = 2355;
                break;

            case 14210:
                itemDef.name = "Strange gem";
                itemDef.modelZoom = 780;
                itemDef.modelRotationY = 368;
                itemDef.modelRotationX = 220;
                itemDef.modelOffset1 = -5;
                itemDef.modelOffset2 = 7;
                itemDef.originalModelColors = new int[] { 7114 };
                itemDef.modifiedModelColors = new int[] { 61 };
                itemDef.groundActions = new String[] { null, null, "Take", null, null };
                itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
                itemDef.modelID = 2528;
                break;

			case 14010:
				itemDef.name = "Pet camel";
				itemDef.modelID = 2939;
				itemDef.modelZoom = 3500;
				itemDef.modelRotationX = 280;
				itemDef.modelOffset1 = 7;
				itemDef.modelOffset2 = 6;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				break;

			case 2700:
				itemDef.name = "VIP ticket";
				itemDef.description = "Read this scroll to be rewarded with the VIP status.";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Claim-rank";
				itemDef.modelZoom = 830;
				itemDef.modelRotationY = 320;
				itemDef.modelRotationX = 132;
				itemDef.modelOffset1 = 6;
				itemDef.modelOffset2 = -2;
				itemDef.modelID = 64448;
				break;
				
			
			
			case 15098:
				itemDef.name = "Dice (up to 100)";
				itemDef.modelZoom = 1104;
				itemDef.modelRotationY = 215;
				itemDef.modelRotationX = 94;
				itemDef.modelOffset1 = 9;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Roll";
				itemDef.modelID = 47852;
				itemDef.brightness = 15;
				//itemDef.contrast = 25;
				break;
			case 2701:
				itemDef.name = "Gambler rank ticket";
				itemDef.description = "Read this scroll to be rewarded with the Gambler rank.";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Claim-rank";
				itemDef.modelZoom = 830;
				itemDef.modelRotationY = 320;
				itemDef.modelRotationX = 132;
				itemDef.modelOffset1 = 6;
				itemDef.modelOffset2 = -2;
				itemDef.modelID = 64447;
				break;

		case 2996:
			itemDef.name = "PVP ticket";
			itemDef.description = "This item is obtained by killing players.";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Claim-points";
		break;
		
		case 4067:
			itemDef.name = "Donator ticket";
			itemDef.description = "This item is obtained by donating through the online store.";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Claim-points";
		break;
		
		case 5020:
			itemDef.name = "Boss ticket";
			itemDef.description = "I can trade this ticket for items.";
			break;

		case 13400:
			itemDef.name = "Divine spirit shield";
			itemDef.modelZoom = 1616;
			itemDef.modelRotationY = 396;
			itemDef.modelRotationX = 1150;
			itemDef.modelOffset1 = 4;
			itemDef.modelOffset2 = 13;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
			itemDef.modelID = 40921;
			itemDef.anInt165 = 40939;
			itemDef.anInt200 = 40939;
			break;
			
		case 2762:
			itemDef.name = "Frost orb";
			itemDef.description = "An icy looking orb.";
			itemDef.modelZoom = 790;
			itemDef.modelRotationY = 316;
			itemDef.modelRotationX = 96;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 3;
			itemDef.originalModelColors = new int[] { -31808 };
			itemDef.modifiedModelColors = new int[] { 43117 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 2428;
			break;
			
		case 2764:
			itemDef.name = "Dark orb";
			itemDef.description = "An ominous looking orb.";
			itemDef.modelZoom = 790;
			itemDef.modelRotationY = 316;
			itemDef.modelRotationX = 96;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 3;
			itemDef.originalModelColors = new int[] { 16 };
			itemDef.modifiedModelColors = new int[] { 43117 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 2428;
			break;
			
		case 2766:
			itemDef.name = "Golden scythe";
			itemDef.modelZoom = 1930;
			itemDef.modelRotationY = 336;
			itemDef.modelRotationX = 20;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 17;
			itemDef.originalModelColors = new int[] { 7114 };
			itemDef.modifiedModelColors = new int[] { 61 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
			itemDef.modelID = 2511;
			itemDef.anInt165 = 507;
			itemDef.anInt200 = 507;
			break;
			
		case 1389:
			itemDef.name = "Dark staff";
			itemDef.description = "An ominous looking staff.";
			break;
			
		case 11709:
			itemDef.name = "Frost staff";
			itemDef.description = "An ominous looking staff.";
			break;

		case 3524:
			itemDef.name = "PvP package";
			itemDef.modelZoom = 1180;
			itemDef.modelRotationX = 160;
			itemDef.modelRotationY = 172;
			itemDef.modelOffset2 = -14;
			itemDef.originalModelColors = new int[] { -22239, 926 };
			itemDef.modifiedModelColors = new int[] { 22410, 2999 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.modelID = 2426;
			itemDef.description = "Open this for a random item from the PVP rewards shop.";
			break;
			
	/*	case 13302:
			itemDef.name = "Strange fish";
			itemDef.modelZoom = 1340;
			itemDef.modelRotationY = 464;
			itemDef.modelRotationX = 1920;
			itemDef.modelOffset2 = 3;
			itemDef.originalModelColors = new int[] { 7114, 6057 };
			itemDef.modifiedModelColors = new int[] { 61, 103 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 2355;
			break;*/
			
		case 13303:
			itemDef.name = "Strange ore";
			itemDef.modelZoom = 1400;
			itemDef.modelRotationY = 368;
			itemDef.modelRotationX = 1576;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 15;
			itemDef.originalModelColors = new int[] { 7114, 6057 };
			itemDef.modifiedModelColors = new int[] { 7062, 5541 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 2748;
			break;
			
		case 3630:
			itemDef.name = "Ring of distraction";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -29403 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 2677;
			break;
			
		case 3442:
			itemDef.name = "Strange logs";
			itemDef.originalModelColors = new int[] {  7114, 7097, 6057 };
			itemDef.modifiedModelColors = new int[] { 5665, 5784, 5559 };
			break;
			
		case 10210:
			itemDef.name = "150,000 coins";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.originalModelColors = new int[] { 8128 };
			itemDef.modifiedModelColors = new int[] { 0 };
			itemDef.modelID = 55000;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			itemDef.description = "Open this pack and get 150k coins.";
			break;

		case 10211:
			itemDef.name = "250,000 coins";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.originalModelColors = new int[] { 8128 };
			itemDef.modifiedModelColors = new int[] { 0 };
			itemDef.modelID = 55000;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			itemDef.description = "Open this pack and get 250k coins.";
			break;

		case 10212:
			itemDef.name = "400,000 coins";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.originalModelColors = new int[] { 8128 };
			itemDef.modifiedModelColors = new int[] { 0 };
			itemDef.description = "Open this pack and get 400k coins.";
			itemDef.modelID = 55000;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			break;

		case 10213:
			itemDef.name = "650,000 coins";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.originalModelColors = new int[] { 8128 };
			itemDef.modifiedModelColors = new int[] { 0 };
			itemDef.description = "Open this pack and get 650k coins.";
			itemDef.modelID = 55000;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			break;

		case 10214:
			itemDef.name = "850,000 coins";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.originalModelColors = new int[] { 8128 };
			itemDef.modifiedModelColors = new int[] { 0 };
			itemDef.description = "Open this pack and get 850k coins.";
			itemDef.modelID = 55000;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			break;

		case 10215:
			itemDef.name = "1,000,000 coins";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.originalModelColors = new int[] { 8128 };
			itemDef.modifiedModelColors = new int[] { 0 };
			itemDef.description = "Open this pack and get 1m coins.";
			itemDef.modelID = 55000;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			break;
			
		case 12100:
			itemDef.name = "Farming pack (Trivia)";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.modelID = 55001;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			itemDef.description = "This pack contains 100 random herbs or herb seeds.";
			break;
			
		case 12101:
			itemDef.name = "Resource pack (Trivia)";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.modelID = 55003;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			itemDef.description = "This pack contains 100 random ores, logs or fish.";
			break;
			
		case 12102:
			itemDef.name = "Bone pack (Trivia)";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.modelID = 55004;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			itemDef.description = "This pack contains 100 random bones.";
			break;
			
		case 12103:
			itemDef.name = "Potion pack (Trivia)";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.modelID = 55005;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			itemDef.description = "This pack contains 100 random potions.";
			break;
			
		case 12104:
			itemDef.name = "Food pack (Trivia)";
			itemDef.modelZoom = 1762;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.modelID = 55006;
			itemDef.modelRotationX = 0;
			itemDef.modelRotationY = 0;
			itemDef.description = "This pack contains 100 random pieces of cooked food.";
			break;

case 3566:
	itemDef.name = "2,500 Bone bits";
	itemDef.modelZoom = 1762;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	itemDef.modelID = 55000;
	itemDef.modelRotationX = 0;
	itemDef.modelRotationY = 0;
	itemDef.description = "Open this pack and get 2.5k Bone bits.";
	break;

case 3567:
	itemDef.name = "5,000 Bone bits";
	itemDef.modelZoom = 1762;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	itemDef.modelID = 55000;
	itemDef.modelRotationX = 0;
	itemDef.modelRotationY = 0;
	itemDef.description = "Open this pack and get 5k Bone bits.";
	break;

case 3568:
	itemDef.name = "10,000 Bone bits";
	itemDef.modelZoom = 1762;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	itemDef.description = "Open this pack and get 10k Bone bits.";
	itemDef.modelID = 55000;
	itemDef.modelRotationX = 0;
	itemDef.modelRotationY = 0;
	break;

case 3569:
	itemDef.name = "25,000 Bone bits";
	itemDef.modelZoom = 1762;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	itemDef.description = "Open this pack and get 25k Bone bits.";
	itemDef.modelID = 55000;
	itemDef.modelRotationX = 0;
	itemDef.modelRotationY = 0;
	break;
	
case 784:
	itemDef.name = "Voting reward";
	itemDef.originalModelColors = new int[] { -25664, -21568, 8128 };
	itemDef.modifiedModelColors = new int[] { 5018, 61, 11177 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Claim", null, null, null, "Drop" };
	break;

case 3570:
	itemDef.name = "50,000 Bone bits";
	itemDef.modelZoom = 1762;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	itemDef.description = "Open this pack and get 50k Bone bits.";
	itemDef.modelID = 55000;
	itemDef.modelRotationX = 0;
	itemDef.modelRotationY = 0;
	break;

case 3571:
	itemDef.name = "100,000 Bone bits";
	itemDef.modelZoom = 1762;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	itemDef.description = "Open this pack and get 100k Bone bits.";
	itemDef.modelID = 55000;
	itemDef.modelRotationX = 0;
	itemDef.modelRotationY = 0;
	break;
case 13858:
itemDef.name = "Zuriel's robe top";
itemDef.modelID = 42591;
itemDef.modelZoom = 1373;
itemDef.modelRotationY = 373;
itemDef.modelRotationX = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = -7;
itemDef.anInt165 = 42627;
itemDef.anInt200 = 42642;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13859:
itemDef.name = "Zuriel's robe top";
itemDef.modelID = 0;
itemDef.modelZoom = 2000;
itemDef.modelRotationY = 0;
itemDef.modelRotationX = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 0;
itemDef.anInt165 = -1;
itemDef.anInt200 = -1;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, null, null, null, "Destroy" };
break;
case 13860:
itemDef.name = "Zuriel's robe top (deg)";
itemDef.modelID = 42591;
itemDef.modelZoom = 1373;
itemDef.modelRotationY = 373;
itemDef.modelRotationX = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = -7;
itemDef.anInt165 = 42627;
itemDef.anInt200 = 42642;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13861:
itemDef.name = "Zuriel's robe bottom";
itemDef.modelID = 42588;
itemDef.modelZoom = 1697;
itemDef.modelRotationY = 512;
itemDef.modelRotationX = 0;
itemDef.modelOffset1 = 2;
itemDef.modelOffset2 = -9;
itemDef.anInt165 = 42634;
itemDef.anInt200 = 42645;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13863:
itemDef.name = "Zuriel's robe bottom (deg)";
itemDef.modelID = 42588;
itemDef.modelZoom = 1697;
itemDef.modelRotationY = 512;
itemDef.modelRotationX = 0;
itemDef.modelOffset1 = 2;
itemDef.modelOffset2 = -9;
itemDef.anInt165 = 42634;
itemDef.anInt200 = 42645;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13864:
itemDef.name = "Zuriel's hood";
itemDef.modelID = 42604;
itemDef.modelZoom = 720;
itemDef.modelRotationY = 28;
itemDef.modelRotationX = 0;
itemDef.modelOffset1 = 1;
itemDef.modelOffset2 = 1;
itemDef.anInt165 = 42638;
itemDef.anInt200 = 42653;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13866:
itemDef.name = "Zuriel's hood (deg)";
itemDef.modelID = 42604;
itemDef.modelZoom = 720;
itemDef.modelRotationY = 28;
itemDef.modelRotationX = 0;
itemDef.modelOffset1 = 1;
itemDef.modelOffset2 = 1;
itemDef.anInt165 = 42638;
itemDef.anInt200 = 42653;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13867:
itemDef.name = "Zuriel's staff";
itemDef.modelID = 42595;
itemDef.modelZoom = 2000;
itemDef.modelRotationY = 366;
itemDef.modelRotationX = 3;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 0;
itemDef.anInt165 = 42617;
itemDef.anInt200 = 42617;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13869:
itemDef.name = "Zuriel's staff (deg)";
itemDef.modelID = 42595;
itemDef.modelZoom = 2000;
itemDef.modelRotationY = 366;
itemDef.modelRotationX = 3;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 0;
itemDef.anInt165 = 42617;
itemDef.anInt200 = 42617;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13870:
itemDef.name = "Morrigan's leather body";
itemDef.modelID = 42578;
itemDef.modelZoom = 1440;
itemDef.modelRotationY = 545;
itemDef.modelRotationX = 2;
itemDef.modelOffset1 = -2;
itemDef.modelOffset2 = 5;
itemDef.anInt165 = 42626;
itemDef.anInt200 = 42643;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13872:
itemDef.name = "Morrigan's leather body (deg)";
itemDef.modelID = 42578;
itemDef.modelZoom = 1440;
itemDef.modelRotationY = 545;
itemDef.modelRotationX = 2;
itemDef.modelOffset1 = -2;
itemDef.modelOffset2 = 5;
itemDef.anInt165 = 42626;
itemDef.anInt200 = 42643;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13873:
itemDef.name = "Morrigan's leather chaps";
itemDef.modelID = 42603;
itemDef.modelZoom = 1753;
itemDef.modelRotationY = 482;
itemDef.modelRotationX = 1;
itemDef.modelOffset1 = -3;
itemDef.modelOffset2 = 11;
itemDef.anInt165 = 42631;
itemDef.anInt200 = 42646;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13875:
itemDef.name = "Morrigan's leather chaps (deg)";
itemDef.modelID = 42603;
itemDef.modelZoom = 1753;
itemDef.modelRotationY = 482;
itemDef.modelRotationX = 1;
itemDef.modelOffset1 = -3;
itemDef.modelOffset2 = 11;
itemDef.anInt165 = 42631;
itemDef.anInt200 = 42646;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13876:
itemDef.name = "Morrigan's coif";
itemDef.modelID = 42583;
itemDef.modelZoom = 592;
itemDef.modelRotationY = 537;
itemDef.modelRotationX = 5;
itemDef.modelOffset1 = -3;
itemDef.modelOffset2 = 6;
itemDef.anInt165 = 42636;
itemDef.anInt200 = 42652;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13878:
itemDef.name = "Morrigan's coif (deg)";
itemDef.modelID = 42583;
itemDef.modelZoom = 592;
itemDef.modelRotationY = 537;
itemDef.modelRotationX = 5;
itemDef.modelOffset1 = -3;
itemDef.modelOffset2 = 6;
itemDef.anInt165 = 42636;
itemDef.anInt200 = 42652;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13879:
itemDef.name = "Morrigan's javelin";
itemDef.modelID = 42592;
itemDef.modelZoom = 1872;
itemDef.modelRotationY = 282;
itemDef.modelRotationX = 2009;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 0;
itemDef.anInt165 = 42613;
itemDef.anInt200 = 42613;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13883:
itemDef.name = "Morrigan's throwing axe";
itemDef.modelID = 42582;
itemDef.modelZoom = 976;
itemDef.modelRotationY = 672;
itemDef.modelRotationX = 2024;
itemDef.modelOffset1 = -5;
itemDef.modelOffset2 = 4;
itemDef.anInt165 = 42611;
itemDef.anInt200 = 42611;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13884:
itemDef.name = "Statius's platebody";
itemDef.modelID = 42602;
itemDef.modelZoom = 1312;
itemDef.modelRotationY = 272;
itemDef.modelRotationX = 2047;
itemDef.modelOffset1 = -2;
itemDef.modelOffset2 = 39;
itemDef.anInt165 = 42625;
itemDef.anInt200 = 42641;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13886:
itemDef.name = "Statius's platebody (deg)";
itemDef.modelID = 42602;
itemDef.modelZoom = 1312;
itemDef.modelRotationY = 272;
itemDef.modelRotationX = 2047;
itemDef.modelOffset1 = -2;
itemDef.modelOffset2 = 39;
itemDef.anInt165 = 42625;
itemDef.anInt200 = 42641;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13887:
itemDef.name = "Vesta's chainbody";
itemDef.modelID = 42593;
itemDef.modelZoom = 1440;
itemDef.modelRotationY = 545;
itemDef.modelRotationX = 2;
itemDef.modelOffset1 = 4;
itemDef.modelOffset2 = 5;
itemDef.anInt165 = 42624;
itemDef.anInt200 = 42644;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13889:
itemDef.name = "Vesta's chainbody (deg)";
itemDef.modelID = 42593;
itemDef.modelZoom = 1440;
itemDef.modelRotationY = 545;
itemDef.modelRotationX = 2;
itemDef.modelOffset1 = 4;
itemDef.modelOffset2 = 5;
itemDef.anInt165 = 42624;
itemDef.anInt200 = 42644;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13890:
itemDef.name = "Statius's platelegs";
itemDef.modelID = 42590;
itemDef.modelZoom = 1625;
itemDef.modelRotationY = 355;
itemDef.modelRotationX = 2046;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = -11;
itemDef.anInt165 = 42632;
itemDef.anInt200 = 42647;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13892:
itemDef.name = "Statius's platelegs (deg)";
itemDef.modelID = 42590;
itemDef.modelZoom = 1625;
itemDef.modelRotationY = 355;
itemDef.modelRotationX = 2046;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = -11;
itemDef.anInt165 = 42632;
itemDef.anInt200 = 42647;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13893:
itemDef.name = "Vesta's plateskirt";
itemDef.modelID = 42581;
itemDef.modelZoom = 1753;
itemDef.modelRotationY = 562;
itemDef.modelRotationX = 1;
itemDef.modelOffset1 = -3;
itemDef.modelOffset2 = 11;
itemDef.anInt165 = 42633;
itemDef.anInt200 = 42649;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13895:
itemDef.name = "Vesta's plateskirt (deg)";
itemDef.modelID = 42581;
itemDef.modelZoom = 1753;
itemDef.modelRotationY = 562;
itemDef.modelRotationX = 1;
itemDef.modelOffset1 = -3;
itemDef.modelOffset2 = 11;
itemDef.anInt165 = 42633;
itemDef.anInt200 = 42649;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13896:
itemDef.name = "Statius's full helm";
itemDef.modelID = 42596;
itemDef.modelZoom = 789;
itemDef.modelRotationY = 96;
itemDef.modelRotationX = 2039;
itemDef.modelOffset1 = 2;
itemDef.modelOffset2 = -7;
itemDef.anInt165 = 42639;
itemDef.anInt200 = 42655;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13898:
itemDef.name = "Statius' full helm (deg)";
itemDef.modelID = 42596;
itemDef.modelZoom = 789;
itemDef.modelRotationY = 96;
itemDef.modelRotationX = 2039;
itemDef.modelOffset1 = 2;
itemDef.modelOffset2 = -7;
itemDef.anInt165 = 42639;
itemDef.anInt200 = 42655;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
break;
case 13899:
itemDef.name = "Vesta's longsword";
itemDef.modelID = 42597;
itemDef.modelZoom = 1744;
itemDef.modelRotationY = 738;
itemDef.modelRotationX = 1985;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 0;
itemDef.anInt165 = 42615;
itemDef.anInt200 = 42615;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13901:
itemDef.name = "Vesta's longsword (deg)";
itemDef.modelID = 42597;
itemDef.modelZoom = 1744;
itemDef.modelRotationY = 738;
itemDef.modelRotationX = 1985;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 0;
itemDef.anInt165 = 42615;
itemDef.anInt200 = 42615;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13902:
itemDef.name = "Statius's warhammer";
itemDef.modelID = 42577;
itemDef.modelZoom = 1360;
itemDef.modelRotationY = 507;
itemDef.modelRotationX = 27;
itemDef.modelOffset1 = 7;
itemDef.modelOffset2 = 6;
itemDef.anInt165 = 42623;
itemDef.anInt200 = 42623;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13904:
itemDef.name = "Statius' warhammer (deg)";
itemDef.modelID = 42577;
itemDef.modelZoom = 1360;
itemDef.modelRotationY = 507;
itemDef.modelRotationX = 27;
itemDef.modelOffset1 = 7;
itemDef.modelOffset2 = 6;
itemDef.anInt165 = 42623;
itemDef.anInt200 = 42623;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13905:
itemDef.name = "Vesta's spear";
itemDef.modelID = 42599;
itemDef.modelZoom = 2022;
itemDef.modelRotationY = 480;
itemDef.modelRotationX = 15;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 5;
itemDef.anInt165 = 42614;
itemDef.anInt200 = 42614;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
case 13907:
itemDef.name = "Vesta's spear (deg)";
itemDef.modelID = 42599;
itemDef.modelZoom = 2022;
itemDef.modelRotationY = 480;
itemDef.modelRotationX = 15;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 5;
itemDef.anInt165 = 42614;
itemDef.anInt200 = 42614;
itemDef.groundActions = new String[] { null, null, "Take", null, null };
itemDef.itemActions = new String[] { null, "Wield", null, null, "Destroy" };
break;
		}
		return itemDef;
	}

	private void toNote() {
		ItemDef itemDef = forID(certTemplateID);
		modelID = itemDef.modelID;
		modelZoom = itemDef.modelZoom;
		modelRotationY = itemDef.modelRotationY;
		modelRotationX = itemDef.modelRotationX;

		anInt204 = itemDef.anInt204;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		modifiedModelColors = itemDef.modifiedModelColors;
		originalModelColors = itemDef.originalModelColors;
		ItemDef itemDef_1 = forID(certID);
		name = itemDef_1.name;
		membersObject = itemDef_1.membersObject;
		value = itemDef_1.value;
		String s = "a";
		char c = itemDef_1.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			s = "an";
		stackable = true;
	}
	
	public static Sprite getSprite(int id, int size, int color, int zoom) {
		ItemDef item = forID(id);
		if(item.stackIDs == null) {
			size = -1;
		}
		if(size > 1) {
			int i1 = -1;
			for(int j1 = 0; j1 < 10; j1++) {
				if(size >= item.stackAmounts[j1] && item.stackAmounts[j1] != 0) {
					i1 = item.stackIDs[j1];
				}
			}
			if(i1 != -1) {
				item = forID(i1);
			}
		}
		Model model = item.method201(1);
		if(model == null)
			return null;
		Sprite image = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.lineOffsets;
		int ai1[] = DrawingArea.pixels;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, image.myPixels);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Rasterizer.method364();
		int itemZoom = item.modelZoom * zoom - 500;
		int l3 = Rasterizer.anIntArray1470[item.modelRotationY] * itemZoom >> 16;
		int i4 = Rasterizer.anIntArray1471[item.modelRotationY] * itemZoom >> 16;
		model.method482(item.modelRotationX, item.anInt204, item.modelRotationY, item.modelOffset1, l3 + model.modelHeight / 2 + item.modelOffset2, i4 + item.modelOffset2);
		if(color == 0) {
			for(int index = 31; index >= 0; index--) {
				for(int index2 = 31; index2 >= 0; index2--)
					if(image.myPixels[index + index2 * 32] == 0 && index > 0 && index2 > 0 && image.myPixels[(index - 1) + (index2 - 1) * 32] > 0)
						image.myPixels[index + index2 * 32] = 0x302020;
			}
		}
		DrawingArea.initDrawingArea(j2, i2, ai1);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.lineOffsets = ai;
		Rasterizer.aBoolean1464 = true;
		if (item.stackable) {
			image.maxWidth = 33;
		} else {
			image.maxWidth = 32;
		}
		image.maxHeight = size;
		return image;
	}

	public static Sprite getSprite(int i, int j, int k) {
		if (k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if (sprite != null && sprite.maxHeight != j
					&& sprite.maxHeight != -1) {

				sprite.unlink();
				sprite = null;
			}
			if (sprite != null)
				return sprite;
		}
		ItemDef itemDef = forID(i);
		if (itemDef.stackIDs == null)
			j = -1;
		if (j > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++)
				if (j >= itemDef.stackAmounts[j1]
						&& itemDef.stackAmounts[j1] != 0)
					i1 = itemDef.stackIDs[j1];

			if (i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.method201(1);
		if (model == null)
			return null;
		Sprite sprite = null;
		if (itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if (sprite == null)
				return null;
		}
		Sprite enabledSprite = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.lineOffsets;
		int ai1[] = DrawingArea.pixels;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, enabledSprite.myPixels);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Rasterizer.method364();
		int k3 = itemDef.modelZoom;
		if (k == -1)
			k3 = (int) ((double) k3 * 1.5D);
		if (k > 0)
			k3 = (int) ((double) k3 * 1.04D);
		int l3 = Rasterizer.anIntArray1470[itemDef.modelRotationY] * k3 >> 16;
		int i4 = Rasterizer.anIntArray1471[itemDef.modelRotationY] * k3 >> 16;
		model.method482(itemDef.modelRotationX, itemDef.anInt204,
				itemDef.modelRotationY, itemDef.modelOffset1, l3
						+ model.modelHeight / 2 + itemDef.modelOffset2, i4
						+ itemDef.modelOffset2);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--)
				if (enabledSprite.myPixels[i5 + j4 * 32] == 0)
					if (i5 > 0
							&& enabledSprite.myPixels[(i5 - 1) + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 > 0
							&& enabledSprite.myPixels[i5 + (j4 - 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (i5 < 31
							&& enabledSprite.myPixels[i5 + 1 + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 < 31
							&& enabledSprite.myPixels[i5 + (j4 + 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;

		}

		if (k > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--)
					if (enabledSprite.myPixels[j5 + k4 * 32] == 0)
						if (j5 > 0
								&& enabledSprite.myPixels[(j5 - 1) + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 > 0
								&& enabledSprite.myPixels[j5 + (k4 - 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (j5 < 31
								&& enabledSprite.myPixels[j5 + 1 + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 < 31
								&& enabledSprite.myPixels[j5 + (k4 + 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;

			}

		} else if (k == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--)
					if (enabledSprite.myPixels[k5 + l4 * 32] == 0
							&& k5 > 0
							&& l4 > 0
							&& enabledSprite.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						enabledSprite.myPixels[k5 + l4 * 32] = 0x302020;

			}

		}
		if (itemDef.certTemplateID != -1) {
			int l5 = sprite.maxWidth;
			int j6 = sprite.maxHeight;
			sprite.maxWidth = 32;
			sprite.maxHeight = 32;
			sprite.drawSprite(0, 0);
			sprite.maxWidth = l5;
			sprite.maxHeight = j6;
		}
		if (k == 0)
			mruNodes1.removeFromCache(enabledSprite, i);
		DrawingArea.initDrawingArea(j2, i2, ai1);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.lineOffsets = ai;
		Rasterizer.aBoolean1464 = true;
		if (itemDef.stackable)
			enabledSprite.maxWidth = 33;
		else
			enabledSprite.maxWidth = 32;
		enabledSprite.maxHeight = j;
		return enabledSprite;
	}

	public Model method201(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];

			if (j != -1)
				return forID(j).method201(1);
		}
		Model model = (Model) mruNodes2.insertFromCache(id);
		if (model != null)
			return model;
		model = Model.method462(modelID);
		if (model == null)
			return null;
		applyTexture(model, id);
		if (anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (modifiedModelColors != null) {
			for (int l = 0; l < modifiedModelColors.length; l++)
				model.method476(modifiedModelColors[l], originalModelColors[l], getTexture(id));

		}
		model.method479(64 + brightness, 768 + anInt184, -50, -10, -50, true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, id);
		return model;
	}

	public int modelCustomColor = 0;
	public int modelCustomColor2 = 0;
	public int modelCustomColor3 = 0;
	public int modelCustomColor4 = 0;
	public int modelSetColor = 0;
	
	public Model method202(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];

			if (j != -1)
				return forID(j).method202(1);
		}
		Model model = Model.method462(modelID);
		if (model == null)
			return null;
		if (modifiedModelColors != null) {
			for (int l = 0; l < modifiedModelColors.length; l++)
				model.method476(modifiedModelColors[l], originalModelColors[l], getTexture(id));

		}
		return model;
	}

	private void readValues(Stream stream) {
		  do {
		   int i = stream.readUnsignedByte();
		   if (i == 0)
		    return;
		   if (i == 1)
		    modelID = stream.readUnsignedWord();
		   else if (i == 2)
		    name = stream.readString();
		   else if (i == 3)
		    description = stream.readString();
		   else if (i == 4)
		    modelZoom = stream.readUnsignedWord();
		   else if (i == 5)
		    modelRotationY = stream.readUnsignedWord();
		   else if (i == 6)
		    modelRotationX = stream.readUnsignedWord();
		   else if (i == 7) {
		    modelOffset1 = stream.readUnsignedWord();
		    if (modelOffset1 > 32767)
		     modelOffset1 -= 0x10000;
		   } else if (i == 8) {
		    modelOffset2 = stream.readUnsignedWord();
		    if (modelOffset2 > 32767)
		     modelOffset2 -= 0x10000;
		   } else if (i == 10)
		    stream.readUnsignedWord();
		   else if (i == 11)
		    stackable = true;
		   else if (i == 12)
		    value = stream.readDWord();
		   else if (i == 16)
		    membersObject = true;
		   else if (i == 23) {
		    anInt165 = stream.readUnsignedWord();
		    maleEquipOffset = stream.readSignedByte();
		   } else if (i == 24)
		    anInt188 = stream.readUnsignedWord();
		   else if (i == 25) {
		    anInt200 = stream.readUnsignedWord();
		    femaleEquipOffset= stream.readSignedByte();
		   } else if (i == 26)
		    anInt164 = stream.readUnsignedWord();
		   else if (i >= 30 && i < 35) {
		    if (groundActions == null)
		     groundActions = new String[5];
		    groundActions[i - 30] = stream.readString();
		   } else if (i >= 35 && i < 40) {
		    if (itemActions == null)
		     itemActions = new String[5];
		    itemActions[i - 35] = stream.readString();
		   } else if (i == 40) {
		    int j = stream.readUnsignedByte();
		    originalModelColors = new int[j];
		    modifiedModelColors = new int[j];
		    for (int k = 0; k < j; k++) {
		     originalModelColors[k] = stream.readUnsignedWord();
		     modifiedModelColors[k] = stream.readUnsignedWord();
		    }
		   } else if (i == 78)
		    anInt185 = stream.readUnsignedWord();
		   else if (i == 79)
		    anInt162 = stream.readUnsignedWord();
		   else if (i == 90)
		    anInt175 = stream.readUnsignedWord();
		   else if (i == 91)
		    anInt197 = stream.readUnsignedWord();
		   else if (i == 92)
		    anInt166 = stream.readUnsignedWord();
		   else if (i == 93)
		    anInt173 = stream.readUnsignedWord();
		   else if (i == 95)
		    anInt204 = stream.readUnsignedWord();
		   else if (i == 97)
		    certID = stream.readUnsignedWord();
		   else if (i == 98)
		    certTemplateID = stream.readUnsignedWord();
		   else if (i >= 100 && i < 110) {
		    if (stackIDs == null) {
		     stackIDs = new int[10];
		     stackAmounts = new int[10];
		    }
		    stackIDs[i - 100] = stream.readUnsignedWord();
		    stackAmounts[i - 100] = stream.readUnsignedWord();
		   } else if (i == 110)
		    anInt167 = stream.readUnsignedWord();
		   else if (i == 111)
		    anInt192 = stream.readUnsignedWord();
		   else if (i == 112)
		    anInt191 = stream.readUnsignedWord();
		   else if (i == 113)
		  	brightness = stream.readSignedByte();
		   else if (i == 114)
		    anInt184 = stream.readSignedByte() * 5;
		   else if (i == 115)
		    team = stream.readUnsignedByte();
		  } while (true);
		 }

	
	public Model getModelForAmount(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];
			if (j != -1)
				return forID(j).method201(1);
		}
		Model model = (Model) mruNodes2.insertFromCache(id);
		if (model != null)
			return model;
		model = Model.method462(modelID);
		if (model == null)
			return null;
		if (anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (modifiedModelColors != null) {
			for (int l = 0; l < modifiedModelColors.length; l++)
				model.method476(modifiedModelColors[1], originalModelColors[1], getTexture(id));
		}
		model.method479(64 + brightness, 768 + anInt184, -50, -10, -50, true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, id);
		return model;
	}
	
	private ItemDef() {
		id = -1;
	}

	private byte femaleEquipOffset;
	public int value;// anInt155
	public int[] modifiedModelColors;// newModelColor
	public int id;// anInt157
	static MRUNodes mruNodes1 = new MRUNodes(100);
	public static MRUNodes mruNodes2 = new MRUNodes(50);
	public int[] originalModelColors;
	public boolean membersObject;// aBoolean161
	private int anInt162;
	private int certTemplateID;
	public int anInt164;// femArmModel
	public int anInt165;// maleWieldModel
	private int anInt166;
	private int anInt167;
	public String groundActions[];
	public int modelOffset1;
	public String name;// itemName
	public static ItemDef[] cache;
	private int anInt173;
	public int modelID;// dropModel
	public int anInt175;
	public boolean stackable;// itemStackable
	public String description;// itemExamine
	public int certID;
	private static int cacheIndex;
	public int modelZoom;
	public static boolean isMembers = true;
	private static Stream stream;
	private int anInt184;
	private int anInt185;
	public int anInt188;// maleArmModel
	public String itemActions[];// itemMenuOption
	public int modelRotationY;// modelRotateUp
	private int anInt191;
	private int anInt192;
	public int[] stackIDs;// modelStack
	public int modelOffset2;//
	private static int[] streamIndices;
	private int brightness;
	public int anInt197;
	public int modelRotationX;// modelRotateRight
	public int anInt200;// femWieldModel
	public int[] stackAmounts;// itemAmount
	public int team;
	public static int totalItems;
	public int anInt204;// modelPositionUp
	private byte maleEquipOffset;

}
