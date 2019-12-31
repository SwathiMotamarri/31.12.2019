package entities;

import exceptions.ZeroBalanceException;

//import exceptions.ZeroBalanceException;

public class Wallet{

    public Wallet() {
        this("","",0);
    }

    public Wallet(String MobNo, String name,double balance) {
        this.MobNo = MobNo;
        this.name = name;
    }

    private String MobNo;

    public String getMobNo() {
        return MobNo;
    }

    public void setMobNo(String MobNo) {
        this.MobNo = MobNo;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance;

    public  double getBalance(){
        return balance;
    }

    public void setbalance(double balance) {
		this.balance = balance;
	}

   @Override
    public String toString() {
        String display=MobNo+" "+name +" "+balance;
        return display;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==this){
            return true;
        }
       if(obj ==null|| !(obj instanceof Wallet)){
            return false;
        }
       Wallet e=(Wallet)obj;
        return e.MobNo==this.MobNo;

    }

    @Override
    public int hashCode() {
    return MobNo.hashCode();
    }
}


