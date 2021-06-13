package Level_1;

/*
Определяем адрес сети
*/

public class lvl_1_task_3 {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] add = new byte[4];
        for (int i = 0; i < 4; i ++){
            add[i] = (byte) (ip[i] & mask[i]);
        }
        return add;
    }

    public static void print(byte[] bytes) {
        for (byte b: bytes) {
            System.out.format("%08d ", Integer.parseInt(Integer.toBinaryString(b & 255)));
        }
    }
}
