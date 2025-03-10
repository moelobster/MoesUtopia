package moe.lobster.moesutopia.init;

import com.tterrag.registrate.util.entry.BlockEntry;
import moe.lobster.moesutopia.block.GovernmentTableBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import static moe.lobster.moesutopia.MoesUtopia.REGISTRATE;

public class ModBlocks {
    public static final BlockEntry<GovernmentTableBlock> GOVERNMENT_TABLE = REGISTRATE
        .block("government_table", GovernmentTableBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(5.0F, 1200.0F)
        )
        .initialProperties(()-> Blocks.CRAFTING_TABLE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_AXE)
        .register();

    public static void register() {
    }
}
