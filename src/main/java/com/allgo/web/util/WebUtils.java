package com.allgo.web.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.allgo.web.packet.opt10081;

public class WebUtils {
	public static Object clientTest(String code) {
		
		opt10081 output = new opt10081();
		try (Socket client = new Socket()) {
			InetSocketAddress ipep = new InetSocketAddress("10.211.55.3", 9999);
			client.connect(ipep);
			try (OutputStream sender = client.getOutputStream(); InputStream receiver = client.getInputStream();) {
				//for (int i = 0; i < 1; i++) {
					String msg = code;
					byte[] data = msg.getBytes();
					ByteBuffer b = ByteBuffer.allocate(4);
					b.order(ByteOrder.LITTLE_ENDIAN);
					b.putInt(data.length);
					sender.write(b.array(), 0, 4);
					sender.write(data);
					data = new byte[4];
					receiver.read(data, 0, 4);
					ByteBuffer c = ByteBuffer.wrap(data);
					c.order(ByteOrder.LITTLE_ENDIAN);
					int length = c.getInt();
					System.out.println(length);
					data = new byte[length];
					receiver.read(data, 0, length);
					output = output.convert(data);
					msg = new String(data, "UTF-8");
					System.out.println(output.toString());
				//}
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return output;
	}
}
