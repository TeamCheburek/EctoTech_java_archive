package ecto.content;

import mindustry.type.Item;

public class ECTOItems {
    public static Item bismuth, zinc;
    public static void load() {
        bismuth = new Item("bismuth") {{
            hardness = 1;
            cost = 0.9f;
        }};
        zinc = new Item("zinc") {{
            hardness = 1;
            cost = 0.8f;
        }};
    }
}
