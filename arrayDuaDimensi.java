
public class arrayDuaDimensi {
    public static void main(String[] args) {
        String[][] DuaAngka;
        DuaAngka = new String[3][3];
        // baris 1
        DuaAngka[0][0] = "1";
        DuaAngka[0][1] = "2";
        DuaAngka[0][2] = "4";
        // baris 2
        DuaAngka[1][0] = "8";
        DuaAngka[1][1] = "10";
        DuaAngka[1][2] = "12";
        // baris 3
        DuaAngka[2][0] = "14";
        DuaAngka[2][1] = "16";
        DuaAngka[2][2] = "18";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(DuaAngka[i][j] + " ");
            }
            System.out.println();
        }
    }
}
