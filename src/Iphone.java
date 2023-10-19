public class Iphone implements MusicPlayer, InternetBrowser, Phone {
    /**
     * @author lucascbarone
     */
    private String serialNumber;
    private String model;
    private String color;
    private String storage;
    private String screenSize;
    private String connectivity;
    private String battery;

    public Iphone(String serialNumber, String model, String color, String storage, String screenSize, String connectivity, String battery) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.screenSize = screenSize;
        this.connectivity = connectivity;
        this.battery = battery;
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone("OSX745FJ", "15 PRO", "Black", "1TB", "6.7\"", "5G", "3650mAh");
        iphone.turnOn();
        iphone.call();
        iphone.answerPhoneCall();
        iphone.voiceMail();
        iphone.playMusic();
        iphone.pauseMusic();
        iphone.selectMusic();
        iphone.connectInternet();
        iphone.navigateToUrl("https://github.com/lucascbarone");
        iphone.showPage();
        iphone.addNewTab();
        iphone.refreshPage();
        iphone.turnOff();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public String getBattery() {
        return battery;
    }

    public String checkStorageSpace() {return "128GB"; }
    
    //InternetBrowser Methods
    @Override
    public void connectInternet() {
        System.out.println("Connecting to internet...");
    }

    @Override
    public void navigateToUrl(String url) {
        System.out.println("Navigating to " + url);
    }

    @Override
    public void showPage() {
        System.out.println("Showing web page...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Opening new browser tab...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing web page...");
    }

    @Override
    public void closePage() {
        System.out.println("Closing web page...");
    }

    //MusicPlayer Methods
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music...");
    }

    @Override
    public void fastForward() {
        System.out.println("Fast-forwarding music...");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding music...");
    }

    //Phone Methods
    @Override
    public void turnOn() {
        System.out.println("Turning phone on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning phone off...");
    }

    @Override
    public void call() {
        System.out.println("Calling someone...");
    }

    @Override
    public void answerPhoneCall() {
        System.out.println("Answering phone call...");
    }

    @Override
    public void rejectPhoneCall() {
        System.out.println("Rejecting phone call...");
    }

    @Override
    public void voiceMail() {
        System.out.println("Checking voice mail...");
    }

    @Override
    public String sendMessage() {
        return "Sending message...";
    }

    @Override
    public String receiveMessage() {
        return "Receiving message...";
    }

}
