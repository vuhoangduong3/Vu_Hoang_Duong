package Bai2;

public class GiamDoc extends NhanVien implements QuanLy {
	private Double phuCap;
	public Double loiNhuanCongTy;
	
	public GiamDoc(String tenNhanVien, Double heSoLuong, Double loiNhuanCongTy,Double phuCap) {
		super(tenNhanVien,heSoLuong);
		this.loiNhuanCongTy = loiNhuanCongTy;
		this.phuCap = phuCap;
	}
	
	public Double tinhLuong() {
		return LUONG_CO_BAN * heSoLuong + phuCap + tinhHoaHong();
	}
	
	public Double tinhHoaHong() {
		return loiNhuanCongTy * 5 / 100;
	}
}
