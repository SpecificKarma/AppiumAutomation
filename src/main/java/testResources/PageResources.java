package testResources;

import io.appium.java_client.android.AndroidDriver;
import views.*;

public class PageResources {

    public Data data;
    public Alerts alerts;
    public TabBar tabBar;
    public AddPhotosAndVideos addPhotosAndVideos;
    public FindMusic findMusic;
    public ShareVideo shareVideo;
    public EditVideo editVideo;

    public PageResources(AndroidDriver driver) {
        data = new Data(driver);
        tabBar = new TabBar(driver);
        alerts = new Alerts(driver);
        addPhotosAndVideos = new AddPhotosAndVideos(driver);
        findMusic = new FindMusic(driver);
        shareVideo = new ShareVideo(driver);
        editVideo = new EditVideo(driver);
    }
}
