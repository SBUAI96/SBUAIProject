/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massim.javaagents.percept;

import java.util.HashMap;
import massim.javaagents.percept.shopItem;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author Sarah
 */
public class shop {
    //shop lat="48.85888" lon="2.40388" name="shop2" restock="2"
    private double shopLat;
    private double shopLon;
    private String shopName;
    private int shopRestock;
    private List<shopItem> shopItems = new Vector<>();
    public Map<String, shopItem> ShopItemsMap = new HashMap<>();

    public shop(double shopLat, double shopLon, String shopName, int shopRestock, List<shopItem> shopItems) {
        this.shopLat = shopLat;
        this.shopLon = shopLon;
        this.shopName = shopName;
        this.shopRestock = shopRestock;
        this.shopItems = shopItems;
        addShopItemToMap();
    }

    public Map<String, shopItem> getShopItemsMap() {
        return ShopItemsMap;
    }

    public void setShopItemsMap(Map<String, shopItem> ShopItemsMap) {
        this.ShopItemsMap = ShopItemsMap;
    }

    public double getShopLat() {
        return shopLat;
    }

    public void setShopLat(double shopLat) {
        this.shopLat = shopLat;
    }

    public double getShopLon() {
        return shopLon;
    }

    public void setShopLon(double shopLon) {
        this.shopLon = shopLon;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopRestock() {
        return shopRestock;
    }

    public void setShopRestock(int shopRestock) {
        this.shopRestock = shopRestock;
    }

    public List<shopItem> getShopItems() {
        return shopItems;
    }

    public void setShopItems(List<shopItem> shopItems) {
        this.shopItems = shopItems;
    }
    public void addShopItemToMap ()
    {
        for(int i=0; i<shopItems.size() ; i++)
        {
            ShopItemsMap.putIfAbsent(shopItems.get(i).getName(), shopItems.get(i));
        }
    }
    
}
