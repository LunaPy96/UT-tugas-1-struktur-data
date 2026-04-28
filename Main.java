import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Deklarasi Linked List dengan nama UrutanListAngka
        LinkedList<Integer> UrutanListAngka = new LinkedList<>();

        // 2. Menambahkan elemen (15, 28, 33, 47, 59)
        UrutanListAngka.add(15);
        UrutanListAngka.add(28);
        UrutanListAngka.add(33);
        UrutanListAngka.add(47);
        UrutanListAngka.add(59);

        // Menampilkan isi list
        System.out.println("Isi UrutanListAngka: " + UrutanListAngka);
    }
}
