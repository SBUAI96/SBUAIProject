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
public class subItem {
    private String subItemName;
            private int subItemAmount;

            public subItem(String subItemName, int subItemAmount) {
                this.subItemName = subItemName;
                this.subItemAmount = subItemAmount;
            }

            public subItem() {
            }

            public String getSubItemName() {
                return subItemName;
            }

            public int getSubItemAmount() {
                return subItemAmount;
            }

            public void setSubItemName(String subItemName) {
                this.subItemName = subItemName;
            }

            public void setSubItemAmount(int subItemAmount) {
                this.subItemAmount = subItemAmount;
            }
}
