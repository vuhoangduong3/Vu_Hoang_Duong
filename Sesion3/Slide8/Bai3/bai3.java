package Bai3;
abstract class matHang{

    private String maHang;
    private String tenHang;
    private String nhaSanXuat;
    private double donGia;
    public matHang(){
        maHang = "MH01";
        tenHang = "Hang 1";
        nhaSanXuat = "NSX 1";
        donGia = 1000;
    }
    public void inTTin(){
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Nha san xuat: " + nhaSanXuat);
        System.out.println("Don gia: " + donGia);
    }
}
class hangDienMay extends matHang{

    private int thoiGianBaoHanh;
    private double dienAp;
    private double congSuat;
    public hangDienMay(){
        thoiGianBaoHanh = 12;
        dienAp = 220;
        congSuat = 1000;
    }
    public void inTTin(){
        super.inTTin();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
        System.out.println("Dien ap: " + dienAp);
        System.out.println("Cong suat: " + congSuat);
    }
}
class hangSanhSu extends matHang{
    private String loaiNguyenLieu;
    public hangSanhSu(){
        loaiNguyenLieu = "Go";
    }
    public void inTTin(){
        super.inTTin();
        System.out.println("Loai nguyen lieu: " + loaiNguyenLieu);
    }
} 

    
class hangThucPham extends matHang{
    private String hanSuDung;
    private String ngaySanXuat;
    public hangThucPham(){
        hanSuDung = "12/12/2021";
        ngaySanXuat = "12/12/2020";
    }
    public void inTTin(){
        super.inTTin();
        System.out.println("Han su dung: " + hanSuDung);
        System.out.println("Ngay san xuat: " + ngaySanXuat);
    }
}


public class bai3{
    public static void main(String[] args) {
        hangDienMay hdm = new hangDienMay();
        hdm.inTTin();
        hangSanhSu hss = new hangSanhSu();
        hss.inTTin();
        hangThucPham htp = new hangThucPham();
        htp.inTTin();
    }
}