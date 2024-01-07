package ecto.content;

import mindustry.type.Planet;

public class ECTOPlanets {
    public static Planet
    ectorum;

    public static void load(){
        ectorum = new Planet("ectorum"){{

            allowLaunchToNumbered = false;
        }};
    }
}
