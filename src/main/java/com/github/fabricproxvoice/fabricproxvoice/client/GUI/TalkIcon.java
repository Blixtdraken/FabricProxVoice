package com.github.fabricproxvoice.fabricproxvoice.client.GUI;

import com.github.fabricproxvoice.fabricproxvoice.client.FabricproxvoiceClient;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;

import java.awt.*;

public class TalkIcon extends DrawableHelper {
    public boolean shouldIconShow = false;
    public TalkIcon(MinecraftClient client) {



        HudRenderCallback.EVENT.register((matrices, d) ->{
            if(shouldIconShow) {//Only render if shouldShowIcon = true

                //Setting up texture
                Identifier textureID = new Identifier("fabricproxvoice", "gui/ptt_key.png");
                client.getTextureManager().bindTexture(textureID);

                //Scale down icon
                matrices.push();
                matrices.scale(0.2F, 0.2F, 0.2F);
                this.drawTexture(matrices, 30,  30, 0, 0, 256, 256);
                matrices.pop();

            }


        });



    }
}
