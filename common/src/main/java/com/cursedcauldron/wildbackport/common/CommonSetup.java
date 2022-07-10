package com.cursedcauldron.wildbackport.common;

import com.cursedcauldron.wildbackport.common.entities.Allay;
import com.cursedcauldron.wildbackport.common.entities.Frog;
import com.cursedcauldron.wildbackport.common.entities.Tadpole;
import com.cursedcauldron.wildbackport.common.entities.Warden;
import com.cursedcauldron.wildbackport.common.events.StructureEvent;
import com.cursedcauldron.wildbackport.common.registry.entity.WBEntities;
import com.cursedcauldron.wildbackport.core.api.MobRegistry;

public class CommonSetup {
    /**
     * Runs features at initializing
     */
    public static void onCommon() {
        // Entity Attributes
        MobRegistry.registerAttributes(WBEntities.ALLAY, Allay::createAttributes);
        MobRegistry.registerAttributes(WBEntities.FROG, Frog::createAttributes);
        MobRegistry.registerAttributes(WBEntities.TADPOLE, Tadpole::createAttributes);
        MobRegistry.registerAttributes(WBEntities.WARDEN, Warden::createAttributes);
        StructureEvent.bootstrap();
    }

    /**
     * Runs features post bootstrap
     */
    public static void onPostClient() {
        StructureEvent.bootstrap();
    }
}