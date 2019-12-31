package dao;

import entities.Wallet;

import java.util.Set;

public interface IWalletDao 
{    void addWallets(Wallet w);

    Wallet findAccountByMobNo(String MobNo);

    Set<Wallet> allWallets();
}
