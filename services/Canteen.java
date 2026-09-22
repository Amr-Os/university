package services;

import java.util.ArrayList;

    public class Canteen {

        int inchargeid;
        ArrayList<String> itemslist = new ArrayList<>();
        ArrayList<String> availablelist = new ArrayList<>();

        public Canteen(int id) {
            inchargeid = id;
        }

        public void additem(String item) {
            itemslist.add(item);
            availablelist.add(item);
        }

        public void ShowItems() {
            if (availablelist.isEmpty()) {
                System.out.println("No items available");
            } else {
                for (String item : availablelist) {
                    System.out.println(item);
                }
            }
        }

        public void Buy(String item) {
            if (availablelist.contains(item)) {
                availablelist.remove(item);
                System.out.println(item + " purchased");
            } else {
                System.out.println("item not available");
            }
        }
    }
