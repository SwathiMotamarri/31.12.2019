package service;

import entities.Wallet;
import java.util.Set;

public interface IWalletService {

    void addWallets(Wallet w);

    Wallet findAccountByMobNo(String MobNo);

    Set<Wallet> allWallets();
}