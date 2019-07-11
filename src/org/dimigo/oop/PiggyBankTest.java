package org.dimigo.oop;

import static org.dimigo.oop.PiggyBank.printBalance;
import static org.dimigo.oop.PiggyBank.putMoney;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember Fam0 = new FamilyMember("아빠");
        FamilyMember Fam1 = new FamilyMember("엄마");
        FamilyMember Fam2 = new FamilyMember("나");
        FamilyMember Fam3 = new FamilyMember("남동생");
        putMoney(Fam0,10000);
        putMoney(Fam1,5000);
        putMoney(Fam2,2000);
        putMoney(Fam3,1000);
        printBalance();
        putMoney(Fam2,1000);
        printBalance();
    }
}
