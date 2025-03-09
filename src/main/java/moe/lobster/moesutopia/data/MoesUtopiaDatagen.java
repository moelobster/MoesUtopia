package moe.lobster.moesutopia.data;

import moe.lobster.moesutopia.MoesUtopia;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MoesUtopia.MOD_ID,bus = EventBusSubscriber.Bus.MOD)
public class MoesUtopiaDatagen {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
//        DataGenerator generator = event.getGenerator();
//        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
//        PackOutput packOutput = generator.getPackOutput();
//        generator.addProvider(event.includeServer(), new ModFeatureProvider(packOutput, lookupProvider));
    }
    public static void init(){

    }
}
