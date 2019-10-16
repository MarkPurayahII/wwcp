package wwcp.entities.freight;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.models.freight.OFF52Beetles;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityOFF52Beetle extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new ItemTransport(new EntityOFF52Beetle((World)null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityOFF52Beetle(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityOFF52Beetle(World world) {
        super(world);
    }

    public float[][] bogieModelOffsets() {
        return null;}

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.5F, -1.5F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.1f,-0.05F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freight/OFF52/OFF52_1.png",
                "OFF 52 with 4 Beetles",
                "Fictional skin promoting WWCP as a transport Company");
    }

    public boolean isReinforced() {
        return false;
    }

    public int[] getTankCapacity() {
        return null;
    }

    public String[] getTankFilters(int tankID) {
        return null;
    }

    public int getRFCapacity() {
        return 0;
    }

    public void manageFuel() {
    }

    public float weightKg() {
        return 1814.3F;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return "OFF 52 with beetles";
    }

    public String transportcountry() {
        return "Europe";
    }

    public String transportYear() {
        return "1950-now";
    }

    public float transportTopSpeed() {
        return 0.0F;
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isFictional() {
        return false;
    }

    public float transportTractiveEffort() {
        return 0.0F;
    }

    public float transportMetricHorsePower() {
        return 0.0F;
    }

    public String[] additionalItemText() {
        return null;
    }

    public float getMaxFuel() {
        return 0.0F;
    }

    public int getInventoryRows() {
        return 3;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{4.6f, 2.2f, 1.5F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new OFF52Beetles()};
    }

    public Item getItem() {
        return thisItem;
    }


}