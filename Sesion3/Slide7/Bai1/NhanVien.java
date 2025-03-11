package Bai1;


public class NhanVien {
    protected String tenNhanVien;
    protected Double heSoLuong;
    public static final Double LUONG_CO_BAN = 750000.0;
    public static final Double LUONG_MAX = 20000000.0;  

    public NhanVien(String tenNhanVien,  Double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

   
    public Double tinhLuong() {
        return LUONG_CO_BAN * heSoLuong;
    }

    
    public boolean tangLuong(Double x) {
        Double heSoLuongMoi = this.heSoLuong + x;
        if (LUONG_CO_BAN * heSoLuongMoi > LUONG_MAX) {
            System.out.println("Không thể tăng lương, vượt quá mức cho phép!");
            return false;
        }
        this.heSoLuong = heSoLuongMoi;
        return true;
    }

   
    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + LUONG_CO_BAN);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương hiện tại: " + tinhLuong());
    }

    
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong	;
    }
    
 
}


