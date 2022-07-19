package com.company;

public class RoundRobinAttack extends ZipAttack{
    String[] chars = {
            "a", "b", "c", "d", "e",
            "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y",
            "z", "0", "1", "2", "3",
            "4", "5", "6", "7", "8",
            "9"
    };

    @Override
    protected boolean openZip(ZipFile zipFile) {
        String pass = "";
        //総当たり攻撃
        for(String one : chars){
            for(String two: chars){
                for (String three: chars){
                    for (String four: chars){
                        pass = "";
                        pass = one + two + three + four;
                        if (zipFile.tryOpen(pass)){
                            System.out.println("総当り攻撃に成功しました");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
