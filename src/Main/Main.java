package Main;

import NhanSu.BaoVe;
import NhanSu.LaoCong;
import NhanSu.NhanVien;


import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Le Bao Tai
 * +---------------------------------+
 * |        Quản lý nhân viên        |
 * +---------------------------------+
 * |    1. Admin                     |
 * |    2.Thoát               |
 * +---------------------------------+
 * <p>
 * +---------------------------------+
 * |              Admin              |
 * +---------------------------------+
 * |    1. Them                      |
 * |    2. Xoa                       |
 * |    3. Sua                       |
 * |    4. Tim Kiem                  |
 * |    5. Hien danh sach thong tin  |
 * |    6. Thoat                     |
 * +---------------------------------+
 * <p>
 * +---------------------------------+
 * |            Khach hang           |
 * +---------------------------------+
 * |    1. Mua                       |
 * |    2. Tiem Kiem                 |
 * +---------------------------------+
 */

public class Main {
    private static int endCuaHangMini;

    public static void main(String[] args) throws IOException {
        //input dau vao


        inputDauVaoNhanSu("src/Database/inputBaoVe.txt", "BaoVe");
        inputDauVaoNhanSu("src/Database/inputLaoCong.txt", "LaoCong");
        inputDauVaoNhanSu("src/Database/inputNhanVien.txt", "NhanVien");

        // xuat thong tin cua cua hang mini
        do {
            cuaHangMini();
            switch (luaChon()) {
                // xuat thong tin lua chon cua admin
                case 1 -> {
                    if (login()) {
                        QuanLy quanLy = new QuanLy();
                        quanLy.admin();
                    } else {
                        System.out.println("Sai mật khẩu hoặc tài khoản!");
                    }
                }

                // thoat
                case 2 -> {
                    endCuaHangMini = 1;
                }
                default -> {
                    System.out.println("Không có lựa chọn này!");
                }
            }
        } while (endCuaHangMini == 0);
    }

    private static void cuaHangMini() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|       Quản Lý Nhân Viên         |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Quản lý                   |");
        System.out.println("|    2. Thoát                     |");
        System.out.println("+---------------------------------+");
    }

    public static void endCuaHang(int end) {
        endCuaHangMini = end;
    }

    private static int luaChon() {
        System.out.print("Nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }

    private static boolean login() {
        String tk = "admin";
        String mk = "admin";
        Scanner login = new Scanner(System.in);
        System.out.print("Nhập tài khoản: ");
        String checkTK = login.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String checkMK = login.nextLine();
        return Objects.equals(checkTK, "admin") && Objects.equals(checkMK, "admin");
    }



    private static void inputDauVaoNhanSu(String URL, String nhanSu) throws IOException {
        if (Objects.equals(nhanSu, "BaoVe")) {
            BaoVe baoVe = new BaoVe();
            baoVe.inputFile(URL);
        }
        if (Objects.equals(nhanSu, "LaoCong")) {
            LaoCong laoCong = new LaoCong();
            laoCong.inputFile(URL);
        }
        if (Objects.equals(nhanSu, "NhanVien")) {
            NhanVien nhanVien = new NhanVien();
            nhanVien.inputFile(URL);
        }
    }
}