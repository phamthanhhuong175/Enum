package phamthanhhuong.com.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diemTB;
	private XepLoai Loai;
	
	public SinhVien(int ma, String ten, double diemTB) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diemTB = diemTB;
		this.Loai=getLoai();
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public XepLoai getLoai() {
		if(this.diemTB>=8)
			Loai=XepLoai.Gioi;
		else if(this.diemTB>=6.5)
			Loai=XepLoai.Kha;
		else if(this.diemTB>=5)
			Loai=XepLoai.TrungBinh;
		else
			Loai=XepLoai.Yeu;
		return Loai;
	}
	public String toString() {
		return this.ma+"\t"
				+this.ten+"\t"
				+this.diemTB+"\t => "
				+this.Loai.description();
	}
}
