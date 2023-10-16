public class Lab {
    private DosyaIslemleri dosya;
    public Lab(){
        dosya = new DosyaIslemleri("hafta12.txt");
        String metin = dosya.dosyaOku();
        metin = boslukTemizle(metin);
        System.out.println(metin);
        int kelimeSayisi = kelimeSay(metin);
        System.out.println("Kelime sayisi : "+kelimeSayisi);
        int imlaSayisi = imlaSay(metin);
        System.out.println("Imla sayisi : "+imlaSayisi);
        int farkliKelimeSayisi = farkliKelimeSay(metin);
        System.out.println("Farkli kelime sayisi : "+farkliKelimeSayisi);
        String enCokKullanilan = enCokKullanilanKelime(metin);
        System.out.println("En cok kullanilan kelime : "+enCokKullanilan);
        //dosya.dosyaSil();
        //dosya.dosyaYaz(metin);
    }

    private String enCokKullanilanKelime(String metin) {
        String[] kelimeler = metin.split(" ");
        String enCokKullanilanKelime = "";
        int enCokSayisi = 0;
        imlaKurtul(kelimeler);
        for (int i = 0; i < kelimeler.length-1; i++) {
            int sayac = 0;
            for (int j = i+1; j < kelimeler.length; j++) {
                if(kelimeler[i].equals(kelimeler[j])) sayac++;
            }
            if(enCokSayisi < sayac){
                enCokKullanilanKelime = kelimeler[i];
                enCokSayisi = sayac;
            }
        }
        return enCokKullanilanKelime;
    }

    private void imlaKurtul(String[] kelimeler) {
        for (int i = 0; i < kelimeler.length; i++) {
            String kelime = kelimeler[i];
            if(!((kelime.charAt(kelime.length()-1) >= 'A' && kelime.charAt(kelime.length()-1) <= 'Z') ||
                    (kelime.charAt(kelime.length()-1) >='a' && kelime.charAt(kelime.length()-1) <= 'z')))
            {
                kelimeler[i] = "";
                for (int j = 0; j < kelime.length()-1; j++) {
                    kelimeler[i] += kelime.charAt(j);
                }
            }
        }
    }

    private int farkliKelimeSay(String metin) {
        String[] kelimeler = metin.split(" ");
        String[] farkliKelime = new String[kelimeler.length];
        int farkliKelimeSayisi = 0;
        imlaKurtul(kelimeler);
        for (int i = 0; i < kelimeler.length; i++) {
            boolean kontrol = true;
            for (int j = 0; j < farkliKelimeSayisi; j++) {
                if(kelimeler[i].equals(farkliKelime[j])){
                    kontrol = false;
                    break;
                }
            }
            if (kontrol){
                farkliKelime[farkliKelimeSayisi] = kelimeler[i];
                farkliKelimeSayisi++;
            }
        }
        return farkliKelimeSayisi;
    }

    private int imlaSay(String metin) {
        int imlaSayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            char c = metin.charAt(i);
            if( !((c >= 'A'&& c<='Z') || (c >= 'a' && c <= 'z') || (c >= '0')&&(c <= '9') || c == ' ' ) ){
                imlaSayisi++;
            }
        }
        return imlaSayisi;
    }

    private int kelimeSay(String metin) {
        String[] kelimeler = metin.split(" ");
        return kelimeler.length;
    }

    private String boslukTemizle(String metin) {
        metin = metin.trim();
        String[] kelimeler = metin.split(" ");
        String temizMetin = "";
        for (int i = 0; i < kelimeler.length; i++) {
            if(!kelimeler[i].equals("")){
                temizMetin += kelimeler[i];
                if(i != kelimeler.length-1) temizMetin += " ";
            }
        }
        return temizMetin;
    }
}
