import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int km, age,select, oneWay=1, roundTrip=2;
        double perKm=0.10;
        Scanner sc= new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        km=sc.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age=sc.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        select=sc.nextInt();

        double totalPrice=km*perKm;
        
        if(age>0&&km>0&&((select==1)||(select==2))){
            if(age<12){
                totalPrice*=0.5;
            }
            if(age<=24&&age>=12){
                totalPrice*=0.9;
            }
            if(age>=65){
                totalPrice*=0.7;
            }
            if(select==roundTrip){
                totalPrice*=0.8*2;
            }

            System.out.println("Toplam ücret : "+ totalPrice +" TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !" );
        }
        
        sc.close();

    }
}
