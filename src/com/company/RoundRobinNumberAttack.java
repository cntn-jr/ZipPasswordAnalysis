package com.company;

public class RoundRobinNumberAttack extends ZipAttack{

    @Override
    protected boolean openZip(ZipFile zipFile) {
        //数字で総当たり攻撃
        for (int pass_num = 0; pass_num < 10000; pass_num++){
            if(zipFile.tryOpen(numToPassword(pass_num))) {
                System.out.println("数字での総当り攻撃に成功しました");
                return true;
            }
        }
        return false;
    }

    private String numToPassword(int pass_num){
        //0を付け足して、４文字のパスワードに変換する
        String pass = "";
        if(pass_num < 10)
            pass = "000" + pass_num;
        else if(pass_num < 100)
            pass = "00" + pass_num;
        else if(pass_num < 1000)
            pass = "0" + pass_num;
        else
            pass = String.valueOf(pass_num);
        return pass;
    }
}
