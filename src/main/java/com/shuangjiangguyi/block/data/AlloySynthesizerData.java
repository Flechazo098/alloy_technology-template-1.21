package com.shuangjiangguyi.block.data;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.util.math.BlockPos;

public record AlloySynthesizerData(BlockPos pos) implements BlockPosPayload {
    public static final PacketCodec<RegistryByteBuf, AlloySynthesizerData> CODEC=
            PacketCodec.tuple(BlockPos.PACKET_CODEC, AlloySynthesizerData::pos, AlloySynthesizerData::new);
}
