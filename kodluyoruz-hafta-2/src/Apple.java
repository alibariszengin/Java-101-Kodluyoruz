public class Apple extends Phone implements VideoCall,ScreenShare {

    public Apple(String model, String imei, String version, int bellek, int ekranBoyut) {

        super(model, imei, version, bellek, ekranBoyut);
        AppleKeyBoard key = new AppleKeyBoard();
        setKey(key);
    }


    @Override
    public void makeCall() {
        System.out.println("Apple:Arama yapiliyor...");
    }

    @Override
    public void sendSms() {
        System.out.println("Apple:Sms gonderiliyor...");
    }

    @Override
    public void shareScreen() {
        System.out.println("Apple:Ekran paylasimli...");
    }

    @Override
    public void videoCall() {
        System.out.println("Apple:Goruntulu aramali...");
    }
}
