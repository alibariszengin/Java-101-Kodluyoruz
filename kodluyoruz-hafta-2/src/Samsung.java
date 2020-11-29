public class Samsung extends Phone implements FileShare,Mp3 {
    public Samsung(String model, String imei, String version, int bellek, int ekranBoyut) {
        super(model, imei, version, bellek, ekranBoyut);
        SamsungKeyBoard key = new SamsungKeyBoard();
        setKey(key);
    }

    @Override
    public void makeCall() {
        System.out.println("Samsung:Arama yapiliyor...");
    }

    @Override
    public void sendSms() {
        System.out.println("Samsung:Sms gonderiliyor...");
    }

    @Override
    public void shareFile() {
        System.out.println("Samsung:Ekran paylasimli...");
    }

    @Override
    public void listenMp3() {
        System.out.println("Samsung:Mp3 dinleme ozellikli");
    }
}
