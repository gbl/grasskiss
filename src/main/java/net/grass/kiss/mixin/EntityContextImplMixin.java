package net.grass.kiss.mixin;

import net.grass.kiss.util.EntityContextDuck;
import net.minecraft.block.EntityShapeContext;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityShapeContext.class)
@SuppressWarnings("unused")
public class EntityContextImplMixin implements EntityContextDuck {
    @Shadow
    @Final
    private Item heldItem;

    @Unique
    @Override
    public Item grasskiss$getItem() {
        return this.heldItem;
    }

}
