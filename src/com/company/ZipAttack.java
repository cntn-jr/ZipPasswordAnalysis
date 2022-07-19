package com.company;

public abstract class ZipAttack {
    private  ZipAttack next;
    public ZipAttack setNext(ZipAttack next){
        this.next = next;
        return next;
    }

    public final void attack(ZipFile zipfile){
        if (openZip(zipfile)){
            System.out.println("対象のZipファイルの展開に成功しました");
        }else{
            next.attack(zipfile);
        }
    }

    protected abstract boolean openZip(ZipFile zipFile);
}
