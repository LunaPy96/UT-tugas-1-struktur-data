
public class arraySatuDimensi {
    public static void main(String[] args) {
        int[] DelapanAngka;
        DelapanAngka = new int[8];
        DelapanAngka[0] = 10;
        DelapanAngka[1] = 12;
        DelapanAngka[2] = 18;
        DelapanAngka[3] = 23;
        DelapanAngka[4] = 33;
        DelapanAngka[5] = 58;
        DelapanAngka[6] = 67;
        DelapanAngka[7] = 82;
        System.out.println("Menampilkan urutan angka ke-2 yaitu:");
        System.out.println(DelapanAngka[1]);
        for (int i = 0; i < 8; i++) {
            System.out.println("Menampilkan seluruh urutan array yaitu:");
            System.out.println(DelapanAngka[i]);
        }
    }
}
