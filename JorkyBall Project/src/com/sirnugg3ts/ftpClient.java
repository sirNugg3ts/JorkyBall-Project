/*
© 2020, Diogo Pascoal. All rights reserved.
 */
package com.sirnugg3ts;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class ftpClient {

    public static boolean fileExistsInServer(String filePath) throws IOException {
        System.out.println("trying to connect");
        String serverName = "ftp.diariodeumdoutor.pt";
        int port = 21;
        String user = "jorky@diariodeumdoutor.pt";
        String pwsd = "jorkypombal";

        FTPClient clienteFTP = new FTPClient();

        clienteFTP.connect(serverName, port);
        clienteFTP.login(user, pwsd);
        clienteFTP.enterLocalPassiveMode();

        System.out.println("Im connected");
        clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);
        clienteFTP.changeWorkingDirectory("/img");
        FTPFile[] remoteFiles = clienteFTP.listFiles("1.png");

        if (remoteFiles.length > 0) {
            return true;
        }
        return false;
    }

    public static void fileUpload(int id) throws IOException {
        String serverName = "ftp.diariodeumdoutor.pt";
        int port = 21;
        String user = "jorky@diariodeumdoutor.pt";
        String pwsd = "jorkypombal";

        FTPClient clienteFTP = new FTPClient();

        clienteFTP.connect(serverName, port);
        clienteFTP.login(user, pwsd);
        clienteFTP.enterLocalPassiveMode();
        clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);

        try {
            File foto2Upload = new File("");

            String firstRemoteFile = "xx.png";
            InputStream inputStream = new FileInputStream(foto2Upload);

            System.out.println("Start uploading first file");
            boolean done = clienteFTP.storeFile(firstRemoteFile, inputStream);
            inputStream.close();
            if (done) {
                System.out.println("The first file is uploaded successfully.");
            }

        } catch (IOException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        } finally {
            try {
                if (clienteFTP.isConnected()) {
                    clienteFTP.logout();
                    clienteFTP.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void fileDownload(int id) {
        String serverName = "ftp.diariodeumdoutor.pt";
        int port = 21;
        String user = "jorky@diariodeumdoutor.pt";
        String pwsd = "jorkypombal";

        FTPClient clienteFTP = new FTPClient();

        try {

            clienteFTP.connect(serverName, port);
            clienteFTP.login(user, pwsd);
            System.out.println("Im connected");
            clienteFTP.enterLocalPassiveMode();
            clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);

            // APPROACH #1: using retrieveFile(String, OutputStream)
            String remoteFile1 = "./img/" + id + ".png";

            File downloadFile1 = new File(".\\img\\" + id + ".png");
            downloadFile1.getParentFile().mkdirs();
            OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
            boolean success = clienteFTP.retrieveFile(remoteFile1, outputStream1);
            outputStream1.close();

            if (success) {
                System.out.println("File #1 has been downloaded successfully.");
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (clienteFTP.isConnected()) {
                    clienteFTP.logout();
                    clienteFTP.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
