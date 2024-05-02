import java.util.Scanner;

public class InheritMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("PROGRAM HITUNG PEMBAYARAN");
        System.out.println("============================");
        System.out.println("Masukkan nama: ");
        String nama = scn.nextLine();
        System.out.println("Masukkan Alamat: ");
        String address = scn.nextLine();
        System.out.println("Masukkan nim: ");
        String nim = scn.nextLine();

        Student student = new Student(nama, address, nim);
        System.out.println("Masukkan spp: ");
        int spp = scn.nextInt();
        student.setSpp(spp);
        System.out.println("Masukkan SKS: ");
        int sks = scn.nextInt();
        student.setSks(sks);
        System.out.println("Masukkan Modul: ");
        int modul = scn.nextInt();
        student.setModul(modul);

        int total = student.hitungPembayaran(spp, sks, modul);

        System.out.println("Total Tagihan Pembayaran: " + total);
        Person person = new Person(nama, address);
        person.setHobi("Main Bola");
        person.hobi();
        scn.close();
    }
}
