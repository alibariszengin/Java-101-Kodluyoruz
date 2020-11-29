public abstract class Phone implements Sms,Call{

    String model;
    String imei;
    String version;
    int bellek;
    int ekranBoyut;



    KeyBoard key;
    public KeyBoard getKey() {
        return key;
    }

    public void setKey(KeyBoard key) {
        this.key = key;
    }
    public Phone(String model, String imei, String version, int bellek, int ekranBoyut) {
        this.model = model;
        this.imei = imei;
        this.version = version;
        this.bellek = bellek;
        this.ekranBoyut = ekranBoyut;

    }


    void phoneInfo(){
        System.out.println("Model: "+model+"\n" +
                "Imei number: "+imei+"\n" +
                "Version number: "+version+"\n" +
                "Capacity of memory: "+bellek+"\n" +
                "Screen size: "+ekranBoyut+"\n" +
                "Keyboard : "+key.keyType()+"\n");
        this.makeCall();
        this.sendSms();
    }


}
