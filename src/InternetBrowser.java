public interface InternetBrowser {
    void connectInternet();
    void navigateToUrl(String url);
    void showPage();
    void addNewTab();
    void refreshPage();
    void closePage();
}