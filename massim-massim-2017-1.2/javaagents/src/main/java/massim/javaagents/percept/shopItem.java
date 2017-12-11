/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massim.javaagents.percept;

/**
 *
 * @author Sarah
 */
public class shopItem {
    int Amount;
    String Name;
    int price;

    public shopItem() {
    }

    public shopItem(int Amount, String Name, int price) {
        this.Amount = Amount;
        this.Name = Name;
        this.price = price;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
