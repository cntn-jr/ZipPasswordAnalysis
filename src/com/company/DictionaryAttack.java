package com.company;

public class DictionaryAttack extends ZipAttack{

    private String[] password_dictionary = {
            "pass", "1234", "done",
            "qwer", "1qaz", "aaaa",
            "bbbb", "ssss", "love",
            "cool", "okey", "good",
    };

    @Override
    protected boolean openZip(ZipFile zipFile) {
        for(String pass: password_dictionary){
            if(zipFile.tryOpen(pass)){
                System.out.println("辞書型攻撃に成功しました");
                return true;
            }
        }
        return false;
    }
}
