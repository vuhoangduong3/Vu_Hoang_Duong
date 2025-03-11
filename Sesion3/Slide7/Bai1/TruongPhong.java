package Bai1;

public class TruongPhong extends NhanVien {
	private Double phuCap;
	private Double soNamDuongChuc;
	
	public TruongPhong(String tenNhanVien, Double heSoLuong, Double soNamDuongChuc,Double phuCap ) {
		super(tenNhanVien, heSoLuong);
		this.soNamDuongChuc = soNamDuongChuc;
        this.phuCap = phuCap;
	}
	
	public Double tinhluong() {
		return LUONG_CO_BAN * heSoLuong * phuCap;
	}
	
	 @Override
	    public void inTTin() {     
	        super.inTTin();
	        System.out.println("Số năm đương chức: " + soNamDuongChuc);
	        System.out.println(" phụ cấp?: " + phuCap);
	    }
}
