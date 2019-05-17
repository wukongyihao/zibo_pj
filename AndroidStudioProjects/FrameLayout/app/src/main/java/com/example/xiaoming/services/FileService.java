package com.example.xiaoming.services;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileService {
    private Context context;

    public FileService(Context context) {
        this.context = context;
    }
    public FileService() {

    }

    public void save(String filename, String content) throws Exception {
        FileOutputStream outStream = context.openFileOutput(filename, Context.MODE_PRIVATE);
        outStream.write(content.getBytes());
        outStream.close();
    }

    public String read(String filename) throws Exception {
        FileInputStream inStream = context.openFileInput(filename);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = inStream.read(buffer);
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();

        return new String(data);
    }

}
