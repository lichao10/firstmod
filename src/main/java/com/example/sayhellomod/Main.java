package com.example.sayhellomod;

import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.level.Level;

@Mod("sayhellomod")
@Mod.EventBusSubscriber
public class Main {

    @SubscribeEvent
    public static void playJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        Player player= event.getPlayer();
        Level level=player.level;
        player.sendMessage(new TextComponent("hello "+player.getDisplayName().getString()+" from "+(level.isClientSide()?"Client":"Server")+"."), Util.NIL_UUID);

    }

}
