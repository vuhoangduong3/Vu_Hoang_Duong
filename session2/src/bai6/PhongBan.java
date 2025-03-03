package bai6;

public class PhongBan  {

	private String tenPhongBan; private byte soNhanVien;
	public static final byte SO_NV_MAX = 100;
	private NhanVien[] dsnv;
	
	public PhongBan(String tenPB){
		
		dsnv = new NhanVien[SO_NV_MAX];
		tenPhongBan = tenPB; soNhanVien = 0;
	}
		
	public boolean themNhanVien(NhanVien nv){
		if (soNhanVien < SO_NV_MAX) {
		
		dsnv[soNhanVien] = nv;
		soNhanVien++;
		return true;
		}
		else return false;
	}
	public NhanVien xoaNhanVien(){
		if (soNhanVien > 0) {
		
			NhanVien tmp = dsnv[soNhanVien-1];
			dsnv[soNhanVien-1] = null; soNhanVien--;
			return tmp;
		} 
		else return null;}
	public double tongLuong(){
		double tong = 0.0;
		for (int i=0;i<soNhanVien;i++)
		
		tong += dsnv[i].tinhLuong();
		
		return tong;
	
	}
	public void inTTin(){
	
		System.out.println("Ten phong: "+tenPhongBan);
		System.out.println("So NV: "+soNhanVien);
		System.out.println("Thong tin cac NV");
		for (int i=0;i<soNhanVien;i++)
		dsnv[i].inTTin();
		
	}
	
	public static void main(String[] args) {
	        PhongBan pb = new PhongBan("X");

	        
	        pb.themNhanVien(new NhanVien("Nguyen Van A", 1000000.0,1.0));
	        pb.themNhanVien(new NhanVien("Tran Thi B", 1200000.0,1.0));

	        
	        pb.inTTin();

	        
	        System.out.println("Xoa nhan vien: " + pb.xoaNhanVien().tinhLuong());

	        
	        pb.inTTin();

	        
	        System.out.println("Tong luong: " + pb.tongLuong());
	   }
}

