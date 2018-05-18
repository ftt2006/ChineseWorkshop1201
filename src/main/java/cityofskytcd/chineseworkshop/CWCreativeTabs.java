/**
 * This file is part of Chinese Workshop
 * (https://github.com/574448121/ChineseWorkshop)
 * 
 * Chinese Workshop is an Open-Source project under MIT License
 * (https://opensource.org/licenses/MIT)
 */

package cityofskytcd.chineseworkshop;

import cityofskytcd.chineseworkshop.block.CWBlocks;
import cityofskytcd.chineseworkshop.item.CWItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CWCreativeTabs
{

    public static final CreativeTabs BUILDING_BLOCKS = new CreativeTabs(CW.MODID + ".building_blocks")
    {
        @Override
        public Item getTabIconItem()
        {
            return CWItems.LOGO;
        }
    };

    public static final CreativeTabs DECORATIONS = new CreativeTabs(CW.MODID + ".decorations")
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(CWBlocks.BRACKET_SET);
        }
    };

    public static final CreativeTabs ITEMS = new CreativeTabs(CW.MODID + ".items")
    {
        @Override
        public Item getTabIconItem()
        {
            return CWItems.BLACK_BRICK;
        }
    };
}
