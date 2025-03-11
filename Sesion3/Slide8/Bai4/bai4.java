package Bai3;
abstract class Nhanvien{
    private String tenNhanVien;
    static final double LUONG_MAX = 5000000;
    public abstract double tinhLuong();
    public void inTTin(){
        System.out.println("Ten nhan vien: " + tenNhanVien);
    }
}
class NhanvienCoHuu extends Nhanvien{
    private double luongcoban;
    private double hesoluong;
    public double getluongcoban(){
        return luongcoban;
    }
    public double gethesoluong(){
        return hesoluong;
    }
    public double tinhLuong(){
        if (luongcoban * hesoluong > Nhanvien.LUONG_MAX){
            return Nhanvien.LUONG_MAX;
        }
        return luongcoban * hesoluong;
    }
    public void tangHeSoLuong(double t){
        hesoluong += t;
    }
    public void inTTin(){
        super.inTTin();
        System.out.println("Luong co ban: " + luongcoban);
        System.out.println("He so luong: " + hesoluong);
    }
}
class NhanVienHopDong extends Nhanvien{
    private double luongHopDong;
    public double tinhLuong(){
        return luongHopDong;
    }
    public NhanVienHopDong(double l){
        luongHopDong = l;
    }
    public void inTTin(){
        super.inTTin();
        System.out.println("Luong hop dong: " + luongHopDong);
    }
}
class TruongPhong extends NhanvienCoHuu{
    double phuCap;
    double soNamDuongChuc;
    public double tinhLuong(){
        return super.tinhLuong() + phuCap;
    }
    public void inTTin(){
        super.inTTin();
        System.out.println("Phu cap: " + phuCap);
        System.out.println("So nam duong chuc: " + soNamDuongChuc);
    }
}
public class bai4 {
    
}