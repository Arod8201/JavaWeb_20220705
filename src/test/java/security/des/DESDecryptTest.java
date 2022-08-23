package security.des;

public class DESDecryptTest {

	public static void main(String[] args) throws Exception {
		// 解密的資料
		// 密文:
		// 40A36187B1935452FBC5FA504FA51120327D00904EFD71115CB97D0D5691417014BB57F511ECA37D0DD379117EAFB728

		// 設定密鑰的路徑與名稱
		String key_path = "C:/Users/MB-207/eclipse-workspace/JavaWeb_20220705/key/user.key";

		// 建立 DESEncryptService
		DESEncryptService des = new DESEncryptService(key_path);

		// 待解密的 hex
		String hex = "40A36187B1935452FBC5FA504FA51120327D00904EFD71115CB97D0D5691417014BB57F511ECA37D0DD379117EAFB728";
		//String hex = "-FFE652AA6B122F995E764ACE79805CC51A625FF18BBFA22";

		// 將 hex 轉成 byte[]
		byte[] byteArray = des.hexToByteArray(hex);
		// 解密
		byte[] deMsg = des.decryptor(byteArray);
		// 將解密後的 byte[] 轉 String
		String output = new String(deMsg);
		System.out.println("解密: " + output);
	}

}
