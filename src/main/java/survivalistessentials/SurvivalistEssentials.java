package survivalistessentials;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import survivalistessentials.proxy.ClientProxy;
import survivalistessentials.proxy.CommonProxy;

@Mod(SurvivalistEssentials.MODID)
public class SurvivalistEssentials {

    public static final String MODID = "survivalistessentials";
    public static final Logger LOGGER = LogManager.getFormatterLogger(SurvivalistEssentials.MODID);

    public static CommonProxy PROXY;
    public static IEventBus BUS;

    public SurvivalistEssentials() {
        BUS = FMLJavaModLoadingContext.get().getModEventBus();

        if (FMLEnvironment.dist.isClient()) {
            BUS.register(new ClientProxy());
        }
        else {
            BUS.register(new CommonProxy());
        }

        PROXY.start();
    }

}
