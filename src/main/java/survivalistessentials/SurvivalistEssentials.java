package survivalistessentials;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
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

    public SurvivalistEssentials() {
        PROXY = FMLEnvironment.dist == Dist.CLIENT ? new ClientProxy() : new CommonProxy();
        PROXY.start();
    }

}
