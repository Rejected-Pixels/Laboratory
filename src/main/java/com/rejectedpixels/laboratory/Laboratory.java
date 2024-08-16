package com.rejectedpixels.laboratory;

import com.rejectedpixels.laboratory.common.registries.ItemRegistry;
import com.rejectedpixels.laboratory.data.ModItemModelProvider;
import com.rejectedpixels.laboratory.data.ModLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(Laboratory.MOD_ID)
public class Laboratory {
    public static final String MOD_ID = "laboratory";

    public Laboratory(IEventBus modEventBus) {
        ItemRegistry.register(modEventBus);

        modEventBus.register(this);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ModLanguageProvider(packOutput, "en_us"));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
    }
}
