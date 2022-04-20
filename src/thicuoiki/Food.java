package thicuoiki;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Food extends HangHoa {
    private Date ngaySX;
    private Date ngayHetHan;
    
    public  Food(String maHang, String tenHang, double donGia, int soLuongTonKho, Date ngaySX,
    Date ngayHetHan) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);
        
    }
        public Food() {

    }
    public Date getNgaySX() {
        return ngaySX;
    }
   
   
    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }
    public Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
           
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return "Hang thuc pham "+ super.toString() + ", ngayHetHan=" + ngayHetHan + ", ngaySX="
        +ngaySX + " thue: " + tinhTien() + "]" ;
    }
    public boolean tinhHSD(){
        boolean ngayHetHan = false;
        if(this.ngayHetHan.before(ngaySX)){
            ngayHetHan = false;
        }else{
            ngayHetHan = true;
        }
        return ngayHetHan;
    }

    
  
    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stub
        HangHoa hangHoa = new Food();
        Food hangThucPham = (Food) hangHoa;
        if(this.getSoLuongTonKho() > 0 && this.tinhHSD() == false ){
            System.out.println("Goods sell slowly!!!");
        }else{
            System.out.println("Hot selling goods!!!");
        }
    }
    @Override
    public double tinhTien() {
        // TODO Auto-generated method stub
        double tien = 0;
        tien = this.getDonGia() * 0.05;
        return tien;
        
    }

   
    



    
    
}
