import java.io.*;
import java.util.Scanner;

public class DosyaIslemleri {
    private File dosya;
    public DosyaIslemleri(String dosyaAdi){
        // dosya adi asl�nda dosyan�n yolu, dosyan�n ad� ve dosyan�n uzant�s�n� i�eriyor.
        this.dosya = new File(dosyaAdi);
        if(!dosya.exists()){
            try {
                dosya.createNewFile();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Bu isimde bir dosya bulunmaktadir.");
        }
    }
    public void dosyaSil(){
        //dosya varsa siliyor.
        if (dosya.exists()) {
            dosya.delete();
            System.out.println("Dosya silindi.");
        }
        else System.out.println("Dosya Yok!");
    }
    public void dosyaYaz(String metin){
        try {
            //dosyaya yazma i�lemlerinde FileWriter ve BufferedWriter kullanmam�z gerekiyor.
            // BufferedWriter sayesinde binary olarak �al��mak zorunda kalm�yoruz.
            FileWriter fileWriter = new FileWriter(dosya,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if(dosya.length() == 0){
                bufferedWriter.write(metin);
            }
            else {
                bufferedWriter.append("\n" + metin);
            }
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Bir hata meydana geldi.");
            System.out.println(e.getMessage());
        }
    }

    public String dosyaOku(){
        //dosya okuma i�lemlerinde yazmada oldu�u gibi iki s�n�f var.
        //FileReader ve BufferedReader....
        String metin = "";
        if (!dosya.exists()){
            System.out.println("Dosya bulunamadi!");
            return "";
        }
        try {
            FileReader fileReader = new FileReader(dosya);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Dosyay� sat�r sat�r okuyoruz.
            String okunanSatir;
            while ((okunanSatir = bufferedReader.readLine()) != null){
                if(metin.isBlank()) metin = okunanSatir;
                else metin += "\n" + okunanSatir;
            }
            /*
            //Dosyay� karakter karakter okumak i�in
            int karakter;
            while ((karakter = bufferedReader.read()) >= 0){
                metin += (char)karakter;
            }
            */
            bufferedReader.close();
            fileReader.close();
        }
        catch (Exception e){
            System.out.println("Bir hata meydana geldi.");
            System.out.println(e.getMessage());
        }
        return metin;
    }
    public String dosyaOkuScanner(){
        //Scanner ile dosya okumak daha kolayd�r :
        String metin = "";
        if (!dosya.exists()){
            System.out.println("Dosya bulunamadi!");
            return "";
        }
        try {
            Scanner sc= new Scanner(dosya);
            while(sc.hasNextLine()){
                metin += sc.nextLine();
                if (sc.hasNextLine()) metin += "\n";
            }
            sc.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return metin;
    }

}
