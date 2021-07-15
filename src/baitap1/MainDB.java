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
public class MainDB {
    
    static CreateTable cr = new CreateTable();
    static InsertData in = new InsertData();
    
    public static void createTable() {
        cr.createTable_LoaiSanPham();
        cr.createTable_SanPham();
    }
    
    public static void insertData(){
        in.insertData_LoaiSanPham();
        in.insertData_SanPham();
    }
}
