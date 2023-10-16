import java.io.*;
import java.util.Scanner;

public class DosyaIslemleri {
    private File dosya;
    public DosyaIslemleri(String dosyaAdi){
        // dosya adi aslýnda dosyanýn yolu, dosyanýn adý ve dosyanýn uzantýsýný içeriyor.
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
            //dosyaya yazma iþlemlerinde FileWriter ve BufferedWriter kullanmamýz gerekiyor.
            // BufferedWriter sayesinde binary olarak çalýþmak zorunda kalmýyoruz.
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
        //dosya okuma iþlemlerinde yazmada olduðu gibi iki sýnýf var.
        //FileReader ve BufferedReader....
        String metin = "";
        if (!dosya.exists()){
            System.out.println("Dosya bulunamadi!");
            return "";
        }
        try {
            FileReader fileReader = new FileReader(dosya);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Dosyayý satýr satýr okuyoruz.
            String okunanSatir;
            while ((okunanSatir = bufferedReader.readLine()) != null){
                if(metin.isBlank()) metin = okunanSatir;
                else metin += "\n" + okunanSatir;
            }
            /*
            //Dosyayý karakter karakter okumak için
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
        //Scanner ile dosya okumak daha kolaydýr :
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
