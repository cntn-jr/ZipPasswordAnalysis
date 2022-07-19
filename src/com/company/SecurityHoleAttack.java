package com.company;

public class SecurityHoleAttack extends ZipAttack{
    @Override
    protected boolean openZip(ZipFile zipFile) {
        //バージョンが３未満のZipファイルに攻撃
        if (zipFile.attackBackdoor()){
            System.out.println("セキュリティホールに対する攻撃に成功しました");
            return true;
        }
        return false;
    }
}
