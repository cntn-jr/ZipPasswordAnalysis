package com.company;

public class ZipFile {
    private String filename;
    private String password;
    private int version;

    public ZipFile(String filename, String password, int version){
        this.filename = filename;
        this.password = password;
        this.version = version;
    }

    public String getFilename() {
        return filename;
    }

    public int getVersion() {
        return version;
    }

    public boolean tryOpen(String try_pass){
        if(password.equals(try_pass))
            return true;
        return false;
    }

    public boolean attackBackdoor(){
        if(version < 3)
            return true;
        return false;
    }
}
