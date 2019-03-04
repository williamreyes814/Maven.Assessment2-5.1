package rocks.zipcode.assessment2.collections.inventory;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.Inventory;

import java.util.Arrays;

public class AddItemToInventroyTest {

    @Test
    public void test0() {
        test("fdkal");
    }

    @Test
    public void test1() {
        test("fda", "wer", "hgfhd", "fdasfd");
    }

    @Test
    public void test2() {
        test("kytsgdf", "kytsgdf", "kytsgdf", "fda", "khsgd");
    }

    @Test
    public void test3() {
        test("kytsgdf", "fea", "l;uyiy", "ofdsi");
    }

    private void test(String... itemsToAddToInventory) {
        Inventory inventory = new Inventory();
        for(String item : itemsToAddToInventory) {
            int preAddQuantity = inventory.getItemQuantity(item);
            int postAddQuantity = preAddQuantity + 1;
            int expected = postAddQuantity;
            inventory.addItemToInventory(item);
            int actual = inventory.getItemQuantity(item);

            Assert.assertEquals(expected, actual);
        }
    }
}
