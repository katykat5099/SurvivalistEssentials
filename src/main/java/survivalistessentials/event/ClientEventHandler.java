package survivalistessentials.event;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import survivalistessentials.SurvivalistEssentials;
import survivalistessentials.config.ConfigHandler;
import survivalistessentials.data.integration.ModIntegration;

@Mod.EventBusSubscriber(modid = SurvivalistEssentials.MODID)
@OnlyIn(Dist.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void clientPlayerLogin(ClientPlayerNetworkEvent event) {
        if (event.getPlayer() != null
                && ModList.get().isLoaded(ModIntegration.TCON_MODID) && ConfigHandler.Client.informTConCompat()) {
            Component message = new TranslatableComponent("message.survivalistessentials.tcon_compat")
                .withStyle(ChatFormatting.DARK_GREEN);
            Component warning = new TranslatableComponent("message.survivalistessentials.tcon_compat.warning")
                .withStyle(ChatFormatting.DARK_RED);

            event.getPlayer().sendMessage(message, Util.NIL_UUID);
            event.getPlayer().sendMessage(warning, Util.NIL_UUID);
            ConfigHandler.Client.disableTConCompatMessage();
        }
    }

}
