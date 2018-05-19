package cityofskytcd.chineseworkshop.block;

import java.util.Random;

import cityofskytcd.chineseworkshop.item.CWItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockCWBlackClay extends BlockCW
{

    public BlockCWBlackClay(String id, Material materialIn, float hardness)
    {
        super(id, materialIn, hardness);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return CWItems.MATERIAL;
    }

    public int quantityDropped(Random random)
    {
        return 4;
    }

}
