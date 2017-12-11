/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massim.javaagents.percept;

import massim.javaagents.percept.subItem;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Sarah
 */
public class item {
            private String name;
            private int volume;
            private List<String> tools = new Vector<>();
            private List<subItem> subItems = new Vector<>();
            
            public item(String name, int volume, List<String> tools, List<subItem> subItems)
            {
                this.name = name;
                this.volume = volume;
                this.tools = tools;
                this.subItems = subItems;
            }
          
            public item() {
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setVolume(int volume) {
                this.volume = volume;
            }

            public void setTools(List<String> tools) {
                this.tools = tools;
            }

            public void setSubItems(List<subItem> subItems) {
                this.subItems = subItems;
            }

            public String getName() {
                return name;
            }

            public int getVolume() {
                return volume;
            }

            public List<String> getTools() {
                return tools;
            }

            public List<subItem> getSubItems() {
                return subItems;
            }
}
