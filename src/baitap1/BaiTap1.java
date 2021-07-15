/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author NAM
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    static DatabaseController controller = new DatabaseController();
    
    public static void main(String[] args) {
        try {
            MainDB.createTable();
            MainDB.insertData();
           
            hienThiSP(controller.hienThiSanPham());
            
            LoaiSanPham loaiSP = nhapLoaiSP();
            SanPham sp = nhapSP();

            controller.themLoaiSanPham(loaiSP);
            controller.themSanPham(sp, loaiSP);
//            
            System.out.print("\t-- Hien Thi --");
            
            hienThiSP(controller.hienThiSanPham());
            
        } catch (Exception e) {
        }

    }

    public static LoaiSanPham nhapLoaiSP() {
        System.out.println("- Loai san pham -");
        System.out.print("\tNhap ma loai san pham: ");
        String maLoaiSP = sc.nextLine();
        System.out.print("\tNhap ten loai san pham: ");
        String tenLoaiSP = sc.nextLine();
        return new LoaiSanPham(maLoaiSP, tenLoaiSP);
    }

    public static SanPham nhapSP() {
        System.out.println("- San pham -");
        System.out.print("\tNhap ma san pham: ");
        String maSP = sc.nextLine();
        System.out.print("\tNhap ten san pham: ");
        String tenSP = sc.nextLine();
        System.out.print("\tNhap nha san xuat: ");
        String nhaSX = sc.nextLine();
        return new SanPham(maSP, tenSP, nhaSX);
    }
    
    public static void hienThiSP(ResultSet result) {
        try {
            ResultSet res = result;
            System.out.println("\n- San pham -");
            System.out.printf("%10s %15s %15s\n","MaSP","TenSP","TenLoaiSP");
            while(result.next()){
                String maSP = result.getString("MaSP");
                String tenSP = result.getString("TenSP");
                String nhaSX = result.getString("TenLoaiSP");
                System.out.printf("%10s %15s %15s\n",maSP,tenSP,nhaSX);
            }
            res.close();
        } catch (Exception e) {
            
        }
    }
}
