package Main;


import NhanSu.BaoVe;
import NhanSu.LaoCong;
import NhanSu.NhanSu;
import NhanSu.NhanVien;


import java.io.IOException;
import java.util.Scanner;

public class QuanLy {

    private static void xoa() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Xoá                  |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Thêm Nhân Viên             |");
        System.out.println("|   2. Thêm Lao Công              |");
        System.out.println("|   3. Thêm Bảo Vệ                |");
        System.out.println("|   4. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void sua() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Sửa                  |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Thêm Nhân Viên             |");
        System.out.println("|   2. Thêm Lao Công              |");
        System.out.println("|   3. Thêm Bảo Vệ                |");
        System.out.println("|   4. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void nhanSu() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Nhân sự              |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Bảo Vệ                     |");
        System.out.println("|   2. Lao Công                   |");
        System.out.println("|   3. Nhân Viên                  |");
        System.out.println("|   4. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void thongTin() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|         Xuất Thông Tin          |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Xuất ra màn hình           |");
        System.out.println("|   2. Xuất ra file               |");
        System.out.println("|   3. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void danhSach() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|         Danh Sách               |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Hàng Hoá                   |");
        System.out.println("|   2. Nhân Viên                  |");
        System.out.println("|   3. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void timKiem() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Tìm Kiếm             |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Thêm Nhân Viên             |");
        System.out.println("|   2. Thêm Lao Công              |");
        System.out.println("|   3. Thêm Bảo Vệ                |");
        System.out.println("|   4. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    public void admin() throws IOException {
       int endadmin = 0;
       do{
           menu();
           switch (luaChon()){
               case 1 ->{
                   int endthem = 0;
                   do{
                       them();
                       switch (luaChon()){
                           case 1->{
                               System.out.println("-------Thêm nhân viên-------");
                               NhanSu nhanvien = new NhanVien();
                               nhanvien.add();
                           }
                           case 2->{
                               System.out.println("-------Thêm Lao Công------");
                               NhanSu laocong = new LaoCong();
                               laocong.add();
                           }
                           case 3 ->{
                               System.out.println("------Thêm Bảo Vệ-----");
                               NhanSu baove = new BaoVe();
                               baove.add();
                           }
                       }
                   }while (endthem == 0);
               }
               case 2->{
                    int endXoa
               }
           }
       }while (endadmin == 0);
    }

    public void menu() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Quản lý              |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Thêm                      |");
        System.out.println("|    2. Xoá                       |");
        System.out.println("|    3. Sửa                       |");
        System.out.println("|    4. Tìm Kiếm                  |");
        System.out.println("|    5. Hiện Danh Sách Thông Tin  |");
        System.out.println("|    6. Thoát                     |");
        System.out.println("+---------------------------------+");
    }

    private void them() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Thêm                 |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Thêm Nhân Viên             |");
        System.out.println("|   2. Thêm Lao Công              |");
        System.out.println("|   3. Thêm Bảo Vệ                |");
        System.out.println("|   4. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private int luaChon() {
        System.out.print("Nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}