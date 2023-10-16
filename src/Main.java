
public class Main {
    public static void main(String[] args){
        /*
        Dosyalama iþlemlerinde meydana gelebilecek hatalardan dolayý ayrý metotlarda tutmak idealdir.
        Bugün örneðimizde Dosyalama iþlemleri için özel bir sýnýf oluþturacaðýz.
         */
        /*
        DosyaIslemleri dosyalama = new DosyaIslemleri("hafta12.txt");
        dosyalama.dosyaYaz("Merhaba! Dosya iþlemleri önemlidir.");
        dosyalama.dosyaYaz("Satir deniyoruz.");
        System.out.println(dosyalama.dosyaOkuScanner());
        dosyalama.dosyaSil();
        System.out.println(dosyalama.dosyaOku());
        */
        /*
        Örnek olarak;
        Metin :
        In common usage, climate change describes global warming the ongoing increase in global
average temperatur and its effects on Earth's climate system. Climate change in a broader sense
also includes previous long term changes to Earth's climate. The current rise in global average
temperature is more rapid than previous changes, and is primarily caused by humans burning
fossil fuels. Fossil fuel use, deforestation, and some agricultural and industrial practices increase
greenhouse gases, notably carbon dioxide and methane. Greenhouse gases absorb some of the
heat that the Earth radiates after it warms from sunlight. Larger amounts of these gases trap
more heat in Earth's lower atmosphere, causing global warming.
        metnini içeren hafta12.txt dosyasýndan;
        i.   var olan gereksiz boþluklarýn temizlenmesini yapan
        ii.  kelime sayýsýný bulan
        iii. imla iþareti (. , ? ‘ gibi...) sayýsýný bulan
        iv.  farklý kelime sayýnýsý bulan,
        v.   en cok kullanýlan kelimeye bulan
        bir java alg. yazalým.
         */
        Lab lab = new Lab();
    }
}