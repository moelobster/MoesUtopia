package moe.lobster.moesutopia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import moe.lobster.moesutopia.data.MoesUtopiaDatagen;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(MoesUtopia.MOD_ID)
public class MoesUtopia {
    public static final String MOD_ID = "moesutopia";
    public static final String MOD_NAME = "MoesUtopia";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final Gson GSON =
        new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    public static final Registrate REGISTRATE = Registrate.create(MOD_ID);
    public MoesUtopia(IEventBus modEventBus){

        MoesUtopiaDatagen.init();
        LOGGER.info("I↓ must↑ be→ the↓ reason↑ why→");
    }

    public static @NotNull ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
