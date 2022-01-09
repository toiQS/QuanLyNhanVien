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
        System.out.println("|   1. Nhân Viên                  |");
        System.out.println("|   2. Trở về                     |");
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
                           case 4->{
                               endthem = 1;
                           }
                           default -> {
                               System.out.println("Không có lựa chọn này!!!");
                           }
                       }
                   }while (endthem == 0);
               }
               case 2->{
                    int endxoa= 0;
                    do {
                        xoa();
                        switch (luaChon()){
                            case 1->{
                                System.out.println("-------Xóa nhân viên-------");
                                NhanSu nhanvien = new NhanVien();
                                nhanvien.del();
                            }
                            case 2->{
                                System.out.println("-------Xóa Lao Công------");
                                NhanSu laocong = new LaoCong();
                                laocong.del();
                            }
                            case 3 ->{
                                System.out.println("------Xóa Bảo Vệ-----");
                                NhanSu baove = new BaoVe();
                                baove.del();
                            }
                            case 4->{
                                endxoa = 1;
                            }
                            default -> {
                                System.out.println("Không có lựa chọn này!!!");
                            }
                        }
                    }while (endxoa == 0);
               }
               case 3->{
                   int endSua = 0;
                   do {
                       sua();
                       switch (luaChon()){
                           case 1->{
                               System.out.println("-------Sửa nhân viên-------");
                               NhanSu nhanvien = new NhanVien();
                               nhanvien.SuaThongTin();
                           }
                           case 2->{
                               System.out.println("-------Sửa Lao Công------");
                               NhanSu laocong = new LaoCong();
                               laocong.SuaThongTin();
                           }
                           case 3 ->{
                               System.out.println("------Sửa Bảo Vệ-----");
                               NhanSu baove = new BaoVe();
                               baove.SuaThongTin();
                           }
                           case 4->{
                               endSua = 1;
                           }
                           default -> {
                               System.out.println("Không có lựa chọn này!!!");
                           }
                       }
                   }while (endSua ==0);
               }
               case 4->{
                   int endTimKiem = 0;
                   do {
                       timKiem();
                       switch (luaChon()){
                           case 1->{
                               System.out.println("-------Sửa nhân viên-------");
                               NhanSu nhanvien = new NhanVien();
                               nhanvien.TimKiem();
                           }
                           case 2->{
                               System.out.println("-------Sửa Lao Công------");
                               NhanSu laocong = new LaoCong();
                               laocong.TimKiem();
                           }
                           case 3 ->{
                               System.out.println("------Sửa Bảo Vệ-----");
                               NhanSu baove = new BaoVe();
                               baove.TimKiem();
                           }
                           case 4->{
                               endTimKiem = 1;
                           }
                           default -> {
                               System.out.println("Không có lựa chọn này!!!");
                           }
                       }
                   }while (endTimKiem == 0);
               }
               case 5->{
                   int endThongTin = 0;
                   do{
                       thongTin();
                       switch (luaChon()){
                           case 1->{
                               danhSach();
                               switch (luaChon()){
                                   case 1 ->{
                                       NhanSu.xuatNhanVien();
                                       NhanSu.xuatLaoCong();
                                       NhanSu.xuatBaoVe();
                                   }
                                   case 2->{

                                   }
                                   default -> {
                                       System.out.println("Không có lựa chọn này!!!!");
                                   }
                               }
                           }
                           case 2->{
                               danhSach();
                               switch (luaChon()){
                                    case 1->{
                                        NhanSu.outputFile("src/Database/outputNhanVien.txt");
                                    }
                                    case 2 ->{

                                    }
                                   default -> {
                                        System.out.println("Không có lựa chọn này!!!");
                                   }
                               }
                           }
                       }
                   }while (endThongTin == 0);
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