package com.github.fabricproxvoice.fabricproxvoice.client.KeyListeners;

import com.github.fabricproxvoice.fabricproxvoice.client.FabricproxvoiceClient;
import com.github.fabricproxvoice.fabricproxvoice.client.GUI.TalkIcon;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;
import org.lwjgl.glfw.GLFW;

public class PTTKey {

    private static KeyBinding keyBind;

    public static void registerPTTKey(){
        keyBind = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.fabricproxvoice.ptt",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_G,
                FabricproxvoiceClient.keyCategory
        ));


        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(keyBind.wasPressed()){
                if(client.player != null)
                client.player.sendMessage(new LiteralText("Pressed G"), false);



                //If PTT is on -> //Open Microphone -> //Show Microphone icon


            }
        });

    }
}
