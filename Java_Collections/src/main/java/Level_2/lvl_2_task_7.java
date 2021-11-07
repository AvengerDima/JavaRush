package Level_2;

/*
Целостность информации
*/

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;

public class lvl_2_task_7 {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {
        MessageDigest mdAlgorithm = MessageDigest.getInstance("MD5");
        mdAlgorithm.update(byteArrayOutputStream.toByteArray());

        byte[] digest = mdAlgorithm.digest();
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < digest.length; i++) {
            String x = Integer.toHexString(0xFF & digest[i]);
            if (x.length() < 2) x = "0" + x;
            hexString.append(x);
        }
        return hexString.toString().equals(md5);
    }
}
