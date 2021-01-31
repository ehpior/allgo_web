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
		// ������ �����Ѵ�.
		try (Socket client = new Socket()) {
			// ���Ͽ� �����ϱ� ���� ���� ������ �����Ѵ�.
			InetSocketAddress ipep = new InetSocketAddress("127.0.0.1", 9999);
			// ���� ����!
			client.connect(ipep);
			// ������ ������ �Ϸ�Ǹ� inputstream�� outputstream�� �޴´�.
			try (OutputStream sender = client.getOutputStream(); InputStream receiver = client.getInputStream();) {
				// �޽����� for ���� ���� 10�� �޽����� �����Ѵ�.
				//for (int i = 0; i < 1; i++) {
					// ������ �޽����� �ۼ��Ѵ�.
					String msg = code;
					// string�� byte�迭 �������� ��ȯ�Ѵ�.
					byte[] data = msg.getBytes();
					// ByteBuffer�� ���� ������ ���̸� byte�������� ��ȯ�Ѵ�.
					ByteBuffer b = ByteBuffer.allocate(4);
					// byte������ little ������̴�.
					b.order(ByteOrder.LITTLE_ENDIAN);
					b.putInt(data.length);
					// ������ ���� ����
					sender.write(b.array(), 0, 4);
					// ������ ����
					sender.write(data);
					data = new byte[4];
					// ������ ���̸� �޴´�.
					receiver.read(data, 0, 4);
					// ByteBuffer�� ���� little ����� �������� ������ ���̸� ���Ѵ�.
					ByteBuffer c = ByteBuffer.wrap(data);
					c.order(ByteOrder.LITTLE_ENDIAN);
					int length = c.getInt();
					System.out.println(length);
					// �����͸� ���� ���۸� �����Ѵ�.
					data = new byte[length];
					// �����͸� �޴´�.
					receiver.read(data, 0, length);
					output = output.convert(data);
					// byte������ �����͸� string�������� ��ȯ�Ѵ�.
					msg = new String(data, "UTF-8");
					// �ֿܼ� ����Ѵ�.
					System.out.println(output.toString());
				//}
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return output;
	}
}
