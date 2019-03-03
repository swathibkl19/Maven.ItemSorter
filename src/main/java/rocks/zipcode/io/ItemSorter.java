package rocks.zipcode.io;

import java.util.*;

import static java.util.Objects.compare;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {


    List<Item> itemList = new ArrayList<Item>();

    public ItemSorter(Item[] items) {

        this.itemList =Arrays.asList(items);

    }

    public Item[] sort(Comparator<Item> comparator) {
        Collections.sort(itemList ,comparator);
        Item[] resultList = new Item[itemList.size()];
         resultList = itemList.toArray(resultList);

         return resultList;

    }
}
