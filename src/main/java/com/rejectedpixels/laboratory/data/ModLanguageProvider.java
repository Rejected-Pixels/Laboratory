package com.rejectedpixels.laboratory.data;

import com.rejectedpixels.laboratory.Laboratory;
import com.rejectedpixels.laboratory.common.registries.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, Laboratory.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ItemRegistry.GEM.get(), "Gem");
    }
}
