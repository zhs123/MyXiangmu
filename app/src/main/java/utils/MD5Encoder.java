package utils;

import java.security.MessageDigest;
/**
*1.类的用途
*2.zhanghaisheng
*3.2017/2/14
**/
public class MD5Encoder {
	/**
	 * 使用Md5Encoder加密
	 * 
	 * @param string
	 * @return
	 * @throws Exception
	 */
	public static String encode(String string) throws Exception {
		byte[] hash = MessageDigest.getInstance("MD5").digest(
				string.getBytes("UTF-8"));
		StringBuilder hex = new StringBuilder(hash.length * 2);
		for (byte b : hash) {
			if ((b & 0xFF) < 0x10) {
				hex.append("0");
			}
			hex.append(Integer.toHexString(b & 0xFF));
		}
		return hex.toString();
	}
}
