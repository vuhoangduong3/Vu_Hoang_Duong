package bai4;

public class NhanVien {
    private String tenNhanVien;
    private Double luongCoBan;
    private Double heSoLuong;
    public static final Double LUONG_MAX = 50000000.0;  

    private static int soLuongNhanVien = 0;
    public NhanVien() {
        this.tenNhanVien = "Chưa xác định";
        this.luongCoBan = 0.0;
        this.heSoLuong = 1.0;
        soLuongNhanVien++;
    }
    
    public NhanVien(String tenNhanVien, Double luongCoBan, Double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++;
    }

   
    public Double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    
    public boolean tangLuong(Double x) {
        Double heSoLuongMoi = this.heSoLuong + x;
        if (luongCoBan * heSoLuongMoi > LUONG_MAX) {
            System.out.println("Không thể tăng lương, vượt quá mức cho phép!");
            return false;
        }
        this.heSoLuong = heSoLuongMoi;
        return true;
    }

   
    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương hiện tại: " + tinhLuong());
    }

    
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong	;
    }
    
    
    public static double tinhTongLuong(NhanVien... nhanViens) {
    	Double tongLuong = 0.0;
    	for (NhanVien nv : nhanViens) {
            tongLuong += nv.getLuongCoBan();
        }
        return tongLuong;
    }
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.inTTin();
      
        NhanVien nv2 = new NhanVien("Nguyen Van A", 5000000.0, 2.0);
        nv2.inTTin();

        if (nv2.tangLuong(0.5)) {
            System.out.println("Tăng lương thành công!");
        } else {
            System.out.println("Tăng lương thất bại!");
        }
        nv2.inTTin();
        System.out.println("So luong nhan vien: " + soLuongNhanVien);
        double tongLuong = tinhTongLuong(nv1, nv2);
        System.out.println("tong luong: " + tongLuong);
    }
}

