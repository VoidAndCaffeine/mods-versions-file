import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * stringout
 */

/*
 
        sOut[1][0] = ""; 
        sOut[1][1] = ".jar";
        sOut[1][2] = "1";
        sOut[1][3] = ""; 


 */

public class stringout {
    private static String[][] sOut = new String[29][4];
    private static String filename = "mods.versions";

    public static void stringOut() throws IOException{
        sOut[0][0] = "dummy file"; 
        sOut[0][1] = "mods.versions";
        sOut[0][2] = "11002";
        sOut[0][3] = "https://github.com/VoidAndCaffeine/mods-versions-file/raw/main/mods.versions"; 

        sOut[1][0] = "Quilted Fabric api"; 
        sOut[1][1] = "qfapi.jar";
        sOut[1][2] = "1";
        sOut[1][3] = "https://cdn.modrinth.com/data/qvIfYCYJ/versions/di82eiyL/qfapi-7.0.3_qsl-6.0.3_fapi-0.83.1_mc-1.20.1.jar"; 

        sOut[2][0] = "Entity Culling"; 
        sOut[2][1] = "entityCulling.jar";
        sOut[2][2] = "1";
        sOut[2][3] = "https://github.com/tr7zw/EntityCulling/releases/download/1.6.2-1.20/entityculling-fabric-1.6.2-mc1.20.jar"; 
 
        sOut[3][0] = "Ferrite Core"; 
        sOut[3][1] = "ferriteCore.jar";
        sOut[3][2] = "1";
        sOut[3][3] = "https://cdn.modrinth.com/data/uXXizFIs/versions/FCnCG6PS/ferritecore-6.0.0-fabric.jar"; 
 
        sOut[4][0] = "Immediately Fast"; 
        sOut[4][1] = "immediatelyFast.jar";
        sOut[4][2] = "1";
        sOut[4][3] = "https://cdn.modrinth.com/data/5ZwdcRci/versions/4IDo27OL/ImmediatelyFast-1.1.15%2B1.20.1.jar"; 
 
        sOut[5][0] = "Krypton"; 
        sOut[5][1] = "krypton.jar";
        sOut[5][2] = "1";
        sOut[5][3] = "https://cdn.modrinth.com/data/fQEb0iXm/versions/jiDwS0W1/krypton-0.2.3.jar"; 
 
        sOut[6][0] = "Lazy DFU"; 
        sOut[6][1] = "lazyDFU.jar";
        sOut[6][2] = "1";
        sOut[6][3] = "https://cdn.modrinth.com/data/hvFnDODi/versions/0.1.3/lazydfu-0.1.3.jar"; 
         
        sOut[7][0] = "Lithium"; 
        sOut[7][1] = "lithium.jar";
        sOut[7][2] = "1";
        sOut[7][3] = "https://cdn.modrinth.com/data/gvQqBUqZ/versions/ZSNsJrPI/lithium-fabric-mc1.20.1-0.11.2.jar"; 
 
        sOut[8][0] = "Fast Animations"; 
        sOut[8][1] = "fastAnim.jar";
        sOut[8][2] = "1";
        sOut[8][3] = "https://cdn.modrinth.com/data/yHf7SALy/versions/5lHXCowj/lunade-fastanim-1.6-1.20.jar"; 
         
        sOut[9][0] = "Memory Leak Fix"; 
        sOut[9][1] = "memLeakFix.jar";
        sOut[9][2] = "1";
        sOut[9][3] = "https://cdn.modrinth.com/data/NRjRiSSD/versions/kLyFtyv2/memoryleakfix-fabric-1.17%2B-1.1.1.jar"; 
 
        sOut[10][0] = "Midnightlib"; 
        sOut[10][1] = "midnightlib.jar";
        sOut[10][2] = "1";
        sOut[10][3] = "https://cdn.modrinth.com/data/codAaoxh/versions/YXz8kIQl/midnightlib-fabric-1.4.1.1.jar"; 
 
        sOut[11][0] = "Modern Fix"; 
        sOut[11][1] = "modernFix.jar";
        sOut[11][2] = "1";
        sOut[11][3] = "https://cdn.modrinth.com/data/nmDcB62a/versions/QVSzLhRT/modernfix-fabric-5.1.1%2Bmc1.20.1.jar"; 
 
        sOut[12][0] = "Mod Menu"; 
        sOut[12][1] = "modMenu.jar";
        sOut[12][2] = "1";
        sOut[12][3] = "https://cdn.modrinth.com/data/mOgUt4GM/versions/zv46i3PW/modmenu-7.1.0.jar"; 
 
        sOut[13][0] = "Not Enough Animations"; 
        sOut[13][1] = "notEnoughAnimations.jar";
        sOut[13][2] = "1";
        sOut[13][3] = "https://cdn.modrinth.com/data/MPCX6s5C/versions/6auoqhMp/notenoughanimations-fabric-1.6.4-mc1.20.jar"; 
 
        sOut[14][0] = "Ok Zoomer"; 
        sOut[14][1] = "okZoomer.jar";
        sOut[14][2] = "1";
        sOut[14][3] = "https://github.com/EnnuiL/OkZoomer/releases/download/5.0.0-beta.12%2B1.20/ok_zoomer-5.0.0-beta.12+1.20.jar"; 
 
        sOut[15][0] = "Reese's Sodium Options"; 
        sOut[15][1] = "reesesSodiumOptions.jar";
        sOut[15][2] = "1";
        sOut[15][3] = "https://cdn.modrinth.com/data/Bh37bMuy/versions/SgSIhHQO/reeses_sodium_options-1.5.1%2Bmc1.20-build.74.jar"; 
 
        sOut[16][0] = "Replay Mod"; 
        sOut[16][1] = "replayMod.jar";
        sOut[16][2] = "1";
        sOut[16][3] = "https://www.replaymod.com/download/download_new.php?version=1.20.1-2.6.13"; 
 
        sOut[17][0] = "Shulker Box Tooltip"; 
        sOut[17][1] = "shulkerBoxTooltip.jar";
        sOut[17][2] = "1";
        sOut[17][3] = "https://cdn.modrinth.com/data/2M01OLQq/versions/gVxjsEiQ/shulkerboxtooltip-fabric-4.0.4%2B1.20.1.jar"; 
 
        sOut[18][0] = "Sodium extra"; 
        sOut[18][1] = "sodiumExtra.jar";
        sOut[18][2] = "1";
        sOut[18][3] = "https://cdn.modrinth.com/data/PtjYWJkn/versions/kTxAMqAj/sodium-extra-0.4.20%2Bmc1.20-build.103.jar"; 
 
        sOut[19][0] = "Sodium"; 
        sOut[19][1] = "sodium.jar";
        sOut[19][2] = "0";
        sOut[19][3] = "https://cdn.modrinth.com/data/AANobbMI/versions/vgceLbdH/sodium-fabric-mc1.20-0.4.10%2Bbuild.27.jar"; 
 
        sOut[20][0] = "Starlight"; 
        sOut[20][1] = "starlight.jar";
        sOut[20][2] = "1";
        sOut[20][3] = "https://cdn.modrinth.com/data/H8CaAYZC/versions/XGIsoVGT/starlight-1.1.2%2Bfabric.dbc156f.jar"; 
  
        sOut[21][0] = "SuperMartijn642's Core Lib"; 
        sOut[21][1] = "SMjCoreLib.jar";
        sOut[21][2] = "1";
        sOut[21][3] = "https://cdn.modrinth.com/data/rOUBggPv/versions/vAha0sB8/supermartijn642corelib-1.1.9-fabric-mc1.20.jar"; 

        sOut[22][0] = "SuperMartijn642's Config Lib"; 
        sOut[22][1] = "SMjConfigLib.jar";
        sOut[22][2] = "1";
        sOut[22][3] = "https://cdn.modrinth.com/data/LN9BxssP/versions/AnZ97CRs/supermartijn642configlib-1.1.6-fabric-mc1.20.jar"; 
 
        sOut[23][0] = "Simple Voice Chat"; 
        sOut[23][1] = "voiceChat.jar";
        sOut[23][2] = "1";
        sOut[23][3] = "https://cdn.modrinth.com/data/9eGKb6K1/versions/rcd2eEe9/voicechat-fabric-1.20.1-2.4.13.jar"; 
 
        sOut[24][0] = "Chatheads"; 
        sOut[24][1] = "chatheads.jar";
        sOut[24][2] = "1";
        sOut[24][3] = "https://www.curseforge.com/api/v1/mods/407206/files/4590669/download"; 
 
        sOut[25][0] = "Cloth Config"; 
        sOut[25][1] = "clothConfig.jar";
        sOut[25][2] = "1";
        sOut[25][3] = "https://cdn.modrinth.com/data/9s6osm5g/versions/y0kQixP8/cloth-config-11.0.99-fabric.jar"; 
 
        sOut[26][0] = "Collective"; 
        sOut[26][1] = "collective.jar";
        sOut[26][2] = "1";
        sOut[26][3] = "https://cdn.modrinth.com/data/e0M1UDsY/versions/EbteiHrL/collective-1.20.1-6.62.jar"; 
 
        sOut[27][0] = "Iris"; 
        sOut[27][1] = "irisMod.jar";
        sOut[27][2] = "1";
        sOut[27][3] = "https://cdn.modrinth.com/data/YL57xq9U/versions/URWeWMAt/iris-mc1.20-1.6.4.jar"; 
 
        sOut[1][0] = "No Chat Reports"; 
        sOut[1][1] = "noChatReports.jar";
        sOut[1][2] = "1";
        sOut[1][3] = "https://cdn.modrinth.com/data/qQyHxfxd/versions/ksEG6N5E/NoChatReports-FORGE-1.20.1-v2.2.2.jar"; 

      saveStringFile();
    }

    public static void saveStringFile() throws IOException {
        FileOutputStream fs = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fs);
        out.writeObject(sOut);
        out.close();
    }

    public static void main(String[] args) {
        try {
            stringOut();
        } catch (Exception e) {
            System.out.println("there was an exception");
        }
    }
}