
public class Main {
    public static void main(String[] args){
        /*
        Dosyalama i�lemlerinde meydana gelebilecek hatalardan dolay� ayr� metotlarda tutmak idealdir.
        Bug�n �rne�imizde Dosyalama i�lemleri i�in �zel bir s�n�f olu�turaca��z.
         */
        /*
        DosyaIslemleri dosyalama = new DosyaIslemleri("hafta12.txt");
        dosyalama.dosyaYaz("Merhaba! Dosya i�lemleri �nemlidir.");
        dosyalama.dosyaYaz("Satir deniyoruz.");
        System.out.println(dosyalama.dosyaOkuScanner());
        dosyalama.dosyaSil();
        System.out.println(dosyalama.dosyaOku());
        */
        /*
        �rnek olarak;
        Metin :
        In common usage, climate change describes global warming the ongoing increase in global
average temperatur and its effects on Earth's climate system. Climate change in a broader sense
also includes previous long term changes to Earth's climate. The current rise in global average
temperature is more rapid than previous changes, and is primarily caused by humans burning
fossil fuels. Fossil fuel use, deforestation, and some agricultural and industrial practices increase
greenhouse gases, notably carbon dioxide and methane. Greenhouse gases absorb some of the
heat that the Earth radiates after it warms from sunlight. Larger amounts of these gases trap
more heat in Earth's lower atmosphere, causing global warming.
        metnini i�eren hafta12.txt dosyas�ndan;
        i.   var olan gereksiz bo�luklar�n temizlenmesini yapan
        ii.  kelime say�s�n� bulan
        iii. imla i�areti (. , ? � gibi...) say�s�n� bulan
        iv.  farkl� kelime say�n�s� bulan,
        v.   en cok kullan�lan kelimeye bulan
        bir java alg. yazal�m.
         */
        Lab lab = new Lab();
    }
}