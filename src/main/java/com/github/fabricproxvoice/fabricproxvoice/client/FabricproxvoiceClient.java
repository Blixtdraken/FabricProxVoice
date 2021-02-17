package com.github.fabricproxvoice.fabricproxvoice.client;

import com.github.fabricproxvoice.fabricproxvoice.client.GUI.TalkIcon;
import com.github.fabricproxvoice.fabricproxvoice.client.KeyListeners.KeyRegister;
import com.github.fabricproxvoice.fabricproxvoice.client.KeyListeners.PTTKey;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;

@Environment(EnvType.CLIENT)
public class FabricproxvoiceClient implements ClientModInitializer {

    public static String keyCategory = "category.fabricproxvoice.voicechat";
    public static TalkIcon talkIcon = new TalkIcon(MinecraftClient.getInstance());
    public static MinecraftClient client;
    @Override
    public void onInitializeClient() {
        client = MinecraftClient.getInstance();
        KeyRegister.registerKeys(); //Register all keys inside KeyRegister class


    }

}
