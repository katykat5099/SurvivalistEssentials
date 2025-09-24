package survivalistessentials;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import survivalistessentials.proxy.CommonProxy;

@Mod(SurvivalistEssentials.MODID)
public class SurvivalistEssentials {

    public static final String MODID = "survivalistessentials";
    public static final Logger LOGGER = LoggerFactory.getLogger(SurvivalistEssentials.MODID);

    public static CommonProxy PROXY;
    public static IEventBus BUS;

    @SuppressWarnings("removal")
    public SurvivalistEssentials() {
        BUS = FMLJavaModLoadingContext.get().getModEventBus();

        PROXY = new CommonProxy();
        BUS.register(PROXY);

        PROXY.start();
    }

}
