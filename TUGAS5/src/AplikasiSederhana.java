import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikasiSederhana {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<ContactManage> al = new ArrayList<>();
        al.add(new ContactManage("Rizky","081283292376"));
        al.add(new ContactManage("April ","081239358485"));

        System.out.println(al);
        var kondisi = true;
        while (kondisi) {
            System.out.println("KONTAK MANAGEMENT");
            System.out.println("~~~~~~~~~~~~~~~~~~");
            for (int i = 0 ; i < al.size() ; i++) {

                System.out.println((i+1)+"."+"Nama : "+al.get(i).getName()+", No.Hp "+al.get(i).getPhone());

            }
            System.out.println("Ketik 1 untuk menambahkan kontak");
            System.out.println("Ketik 2 untuk hapus kontak");
            System.out.println("Ketik 3 untuk keluar");
            var pilihan = sc.nextLine();

            if (pilihan.equals("1")) {
                System.out.println("Nama");
                var nama = sc.nextLine();
                System.out.println("No hp");
                var phone = sc.nextLine();
                al.add(new ContactManage(nama,phone));
            }else if (pilihan.equals("2")) {
                System.out.println("masukan angka untuk menghapus kontak");
                var input = sc.nextInt();
                al.remove(input-1);
            }

            else if (pilihan.equals("3")) {
                kondisi = false;
            }


        }
    }


}

class ContactManage{
    private String name;
    private String phone;

    public ContactManage(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
