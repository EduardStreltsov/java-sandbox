package com.windows10assetsmover;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Windows10AssetsMover {
    
    public static void main(String[] args) {
        
        File dir = new File("C:\\Users\\Eduard Streltsov\\AppData\\Local\\Packages\\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\\LocalState\\Assets");
        
        if (! dir.isDirectory()) {
            return;
        }
        
        int n = 0;
        for (final File file : dir.listFiles()) {
            try {
                Files.copy(file.toPath(), Paths.get("D:\\Pictures\\Desktop\\" + file.getName() + ".jpg"), new StandardCopyOption[]{StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES});
            } catch (Exception e) {
                e.printStackTrace();
            }
            n++;
        }
        System.out.println("" + n + " files successfully copied");
    
        openTargetFolder();
    
    }
    
    private static void openTargetFolder() {
        try {
            Desktop.getDesktop().open(new File("D:\\Pictures\\Desktop"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
