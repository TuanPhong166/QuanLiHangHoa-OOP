package thicuoiki;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, IOException    {
        
        int choose;
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
        
        danhSachHangHoa.duLieuCoSan();

        do{
            System.out.println("      MENU      ");
            System.out.println("------------------");
            System.out.println("1.Enter information");
            System.out.println("2.Print the list");
            System.out.println("3.Find goods ");
            System.out.println("4.Delete row");
            System.out.println("5.Sua hang hoa");
            System.out.println("6.Statistical");
            System.out.println("7.Sorting goods");
            System.out.println("8.Read file");
            System.out.println("9.Save file");
            System.out.println("10.Theo don gia");
            System.out.println("0.Exit");
            System.out.println("Please choose:");
            
            choose = danhSachHangHoa.input.nextInt();
            switch(choose){
                
                case 1: 
                try {
                    danhSachHangHoa.input();
                    
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Enter error please try again");
                }
               
               break;
                case 2:
                System.out.println(); danhSachHangHoa.printList();
                break;
                case 3 : 
                danhSachHangHoa.search();
                break;
                case 4: 
                danhSachHangHoa.delete();
                break;
                case 5:
                danhSachHangHoa.input.nextLine();
                System.out.println("Enter the code to correct:");
                String maHang1 = danhSachHangHoa.input.nextLine();
                danhSachHangHoa.suThongTin(maHang1);
                System.out.println("Menu sua thong tin:");
                try {
                    danhSachHangHoa.input();
                } catch (Exception e) {
                    //TODO: handle exception
                }
                
                break;
                
                 
                case 6: danhSachHangHoa.statistical();break;
                case 7 : danhSachHangHoa.arrangeGoods();break;
                case 8 : danhSachHangHoa.docFile(); break;
                case 9 : danhSachHangHoa.ghiFile();break;
                case 0:  System.out.println("Goodbye");break;
                
                default: System.out.println("Error please re-enter!!!");break;
            }
        }while(choose != 0);
    
       
      
       
        
      
       
    }

        
    
}

