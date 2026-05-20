package UIPackage;

import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class UiIcons {
    private UiIcons() {
    }

    public static void set(JLabel label, String fileName) {
        URL resource = UiIcons.class.getResource("/UIPackage/" + fileName);
        if (resource != null) {
            label.setIcon(new ImageIcon(resource));
            return;
        }

        File localFile = new File("src/main/java/UIPackage/" + fileName);
        if (localFile.exists()) {
            label.setIcon(new ImageIcon(localFile.getAbsolutePath()));
        }
    }
}
