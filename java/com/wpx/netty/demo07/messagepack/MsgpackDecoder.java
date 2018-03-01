package com.wpx.netty.demo07.messagepack;

import java.util.List;

import org.msgpack.MessagePack;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

/**
 * MessagePack������
 * 
 * @author wangpx
 */
public class MsgpackDecoder extends MessageToMessageDecoder<ByteBuf>{

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
			//���������������
			final byte[] array;
			//�ɶ����泤��
			final int length = msg.readableBytes();
			array = new byte[length];
			msg.getBytes(msg.readerIndex(), array, 0, length);
			MessagePack messagePack = new  MessagePack();
			out.add(messagePack.read(array));
	}
	

}