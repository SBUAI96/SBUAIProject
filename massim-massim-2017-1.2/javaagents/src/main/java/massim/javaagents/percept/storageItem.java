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
public class storageItem {
    
            private String name;
            private int delivered;
            private int stored;

            public storageItem() {
            }

            public storageItem(String name, int delivered, int stored) {
                this.name = name;
                this.delivered = delivered;
                this.stored = stored;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getDelivered() {
                return delivered;
            }

            public void setDelivered(int delivered) {
                this.delivered = delivered;
            }

            public int getStored() {
                return stored;
            }

            public void setStored(int stored) {
                this.stored = stored;
            }

        
}
