package com.company;

public class FileNameAttack extends ZipAttack{
    @Override
    protected boolean openZip(ZipFile zipFile) {
        //ファイル名とパスワード同じZipファイルに攻撃
        String filename = zipFile.getFilename();
        //拡張子.zipを取り除く
        filename = filename.replace(".zip", "");
        if(zipFile.tryOpen(filename)){
            System.out.println("ファイル名とパスワードが同じでした");
            return true;
        }
        return false;
    }
}
