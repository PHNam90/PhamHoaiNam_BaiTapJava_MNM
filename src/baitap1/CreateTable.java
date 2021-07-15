/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author NAM
 */
public class CreateTable {
    private DatabaseHelper helper;

    public CreateTable() {
        helper = new DatabaseHelper();
    }

    public void createTable_LoaiSanPham() {
        String sql = "CREATE TABLE LoaiSanPham("
                + "MaLoaiSP varchar(10) PRIMARY KEY,"
                + "TenLoaiSP varchar(30)"
                + ")";
        helper.doSQL(sql);
    }
    
    public void createTable_SanPham() {
        String sql = "CREATE TABLE SanPham("
                + "MaSP varchar(10) PRIMARY KEY,"
                + "TenSP varchar(30),"
                + "NhaSanXuat varchar(10),"
                + "MaLoaiSP varchar(10),"
                + "FOREIGN KEY (MaLoaiSP) REFERENCES LoaiSanPham(MaLoaiSP)"
                + ")";
        helper.doSQL(sql);
    }
}
