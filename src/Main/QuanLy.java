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
        System.out.println("|   1. Xoá Gia Dụng               |");
        System.out.println("|   2. Xoá Nước                   |");
        System.out.println("|   3. Xoá Tươi Sống              |");
        System.out.println("|   4. Xoá Khác                   |");
        System.out.println("|   5. Xoá Nhân Sự                |");
        System.out.println("|   6. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void sua() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Sửa                  |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Sửa Gia Dụng               |");
        System.out.println("|   2. Sửa Nước                   |");
        System.out.println("|   3. Sửa Tươi Sống              |");
        System.out.println("|   4. Sửa Khác                   |");
        System.out.println("|   5. Sửa Nhân Sự                |");
        System.out.println("|   6. Trở về                     |");
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
        System.out.println("|   1. Tìm kiếm Gia Dụng          |");
        System.out.println("|   2. Tìm kiếm Nước              |");
        System.out.println("|   3. Tìm kiếm Tươi Sống         |");
        System.out.println("|   4. Tìm kiếm Khác              |");
        System.out.println("|   5. Tìm kiếm Nhân Sự           |");
        System.out.println("|   6. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    public void admin() throws IOException {
       
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
        System.out.println("|            Them                 |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Thêm Gia Dụng              |");
        System.out.println("|   2. Thêm Nước                  |");
        System.out.println("|   3. Thêm Tươi Sống             |");
        System.out.println("|   4. Thêm Khác                  |");
        System.out.println("|   5. Thêm Nhân Sự               |");
        System.out.println("|   6. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private int luaChon() {
        System.out.print("Nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}