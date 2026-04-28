import java.sql.Array;
import java.util.Arrays;

public class Basket {
    static void main() {

        String[] productsPetr = {"курица", "бананы", "творог"};
        String[] productsKolya = {"курица", "бананы", "творог"};
        String[] productsTerentiyi = {"пиво", "пельмени", "ласка_магия_черного"};


        //сравнение по количеству
        System.out.println("Количество продуктов у Пети и Коли совпадает? " + (productsPetr.length == productsKolya.length ? "Да" : "Нет"));
        System.out.println("Количество продуктов у Пети и Терентия совпадает? " + (productsPetr.length == productsTerentiyi.length ? "Да" : "Нет"));

        //сравнение по составу
        System.out.println("Ассортимнт корзин Пети и Коли совпадает? " + (Arrays.equals(productsPetr, productsKolya) ? "Да" : "Нет"));
        System.out.println("Ассортимнт корзин Пети и Терентия совпадает? " + (Arrays.equals(productsPetr, productsTerentiyi) ? "Да" : "Нет"));

        //объединяем в 1 массив
        String[] allProduct = new String[9];
        System.arraycopy(productsPetr, 0, allProduct, 0, 3);
        System.arraycopy(productsKolya, 0, allProduct, 3, 3);
        System.arraycopy(productsTerentiyi, 0, allProduct, 6, 3);

        // выводим получившийся массив
        System.out.println(Arrays.deepToString(allProduct));

        String minProductsName = allProduct[0];
        String maxProductsName = allProduct[0];
        int averageLength = 0;

        for (int i = 0; i < 9; i++) {
            if (minProductsName.length() > allProduct[i].length()) {
                minProductsName = allProduct[i];
            }
            if (maxProductsName.length() < allProduct[i].length()) {
                maxProductsName = allProduct[i];
            }
            averageLength = averageLength + allProduct[i].length();

        }

        System.out.println("Самое короткое название продукта: " + minProductsName);
        System.out.println("Самое длинное название продукта: " + maxProductsName);
        System.out.println("Средняя длинна в название продукта: " + averageLength / allProduct.length);

    }

}
