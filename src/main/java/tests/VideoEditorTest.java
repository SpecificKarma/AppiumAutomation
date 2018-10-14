package tests;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class VideoEditorTest extends BaseTest {

    @Test(priority = 1)
    void scenario1() throws IOException, InterruptedException {
//      pushing Test data
        appDriver.pushFile("/mnt/sdcard/Pictures/_B_15.mp4", new File("src/main/resources/testMedia/_B_15.mp4"));
        appDriver.pushFile("/mnt/sdcard/Pictures/_A_JPG.jpg", new File("src/main/resources/testMedia/_A_JPG.jpg"));
        view.data.printTestCaseName("Verify that user can create a 15secs Lomotif using photos and videos taken from phone");
//      - tap Start to create new project
        view.tabBar.getPlusButton().click();
        view.alerts.ridAlerts();
//      - in the albums screen, select 1 photo and 1 video
        view.addPhotosAndVideos.getAlbumsTab().click();
        view.addPhotosAndVideos.getPictureDirectory().click();
        view.addPhotosAndVideos.getTestPicture().click();
        view.addPhotosAndVideos.getVideoCheckBox().click();
//      - tap next (top right)
        view.addPhotosAndVideos.getNextIcon().click();
//      - tap on a song
        view.findMusic.getFirstItemMusicList().click();
//      - tap on a next
        view.findMusic.getNextIcon().click();
//      - tap export (top right)

        Thread.sleep(5000);

        view.editVideo.getExportButton().click();
//      - select YES to confirm
        view.alerts.ridAlerts();
        view.shareVideo.getCloseButton().click();
//
    }

}
