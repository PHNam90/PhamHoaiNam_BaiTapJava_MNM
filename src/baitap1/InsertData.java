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
public class InsertData {
    private DatabaseHelper helper;

    public InsertData() {
        helper = new DatabaseHelper();
    }

    public void insertData_LoaiSanPham() {
        String query = "insert into LoaiSanPham values\n"
                + "('001','Đồ ăn'),"
                + "('002','Đồ uống'),"
                + "('003','Gia vị')";
                
        helper.doSQL(query);
    }
    
    public void insertData_SanPham() {
        String query = "insert into SanPham values\n"
                + "('001','Mì tôm Hảo Hảo','AceCook',(SELECT MaLoaiSP From LoaiSanPham Where MaLoaiSP='1')),"
                + "('002','Cháo sườn Gấu đỏ','Gấu đỏ',(SELECT MaLoaiSP From LoaiSanPham Where MaLoaiSP='1')),"
                + "('003','Trà sữa','GONGCHA',(SELECT MaLoaiSP From LoaiSanPham Where MaLoaiSP='2')),"
                + "('004','Ngũ vị hương','5FoodStyle',(SELECT MaLoaiSP From LoaiSanPham Where MaLoaiSP='3')),"
                + "('005','Cafe đá','StarBuck',(SELECT MaLoaiSP From LoaiSanPham Where MaLoaiSP='2'))";
                
        helper.doSQL(query);
    }
}
