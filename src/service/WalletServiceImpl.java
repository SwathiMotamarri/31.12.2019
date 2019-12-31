package service;

import dao.IWalletDao;
import entities.Wallet;
import exceptions.IncorrectAccountException;
import java.util.Set;

public class WalletServiceImpl implements IWalletService
{

    private IWalletDao dao;

    public WalletServiceImpl(IWalletDao dao) {
        this.dao = dao;
    }

    @Override
    public void addWallets(Wallet w) {
        dao.addWallets(w);
    }

    @Override
    public Wallet findAccountByMobNo(String MobileNo)
    {
        if ((MobileNo.equals(null))||(MobileNo.length()!=10)) {
            throw new IncorrectAccountException("Account is incorrect");
        }
       Wallet w = dao.findAccountByMobNo(MobileNo);
        return w;
    }

    @Override
    public Set<Wallet> allWallets() {
        Set<Wallet> wallets = dao.allWallets();
        return wallets;
    }
}
