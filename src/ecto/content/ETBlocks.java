package ecto.content;

import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.storage.*;

import static mindustry.content.Items.*;
import static mindustry.type.ItemStack.with;

import static ecto.content.ETItems.*;

public class ETBlocks {
    public static Block

            //environment
            malachite,

            //cores
            coreIon;

            //conveyors

            //liquid

            //power

    public static void load() {
        malachite = new Floor("malachite"){{
            variants = 4;
        }};

        coreIon = new CoreBlock("core-ion"){{
            health = 3000;
            size = 3;
            itemCapacity = 3000;
            unitCapModifier = 8;
            alwaysUnlocked = true;
            isFirstTier = true;
            researchCostMultiplier = 0.07f;
            thrusterLength = 30/4f;
            requirements(Category.effect, with(bismuth, 1200, graphite, 2000, silicon, 2000));
        }};
    }
}