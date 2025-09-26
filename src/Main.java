
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //고객 정보
        Customer customer = new Customer("김세현","shkim6663@naver.com","VVIP", "동탄");

        // 전자제품 카테고리
        Category electronics = new Category("전자제품",
                Arrays.asList(Product.GALAXY_Z_FOLD_7, Product.IPHONE_17_PRO, Product.MACBOOK_PRO, Product.AIRPODS_PRO,Product.Dyson_VACUUM));

        // 의류 카테고리
        Category clothes = new Category("의류",
                Arrays.asList(Product.NIKE_TSHIRT, Product.ADIDAS_SNEAKERS, Product.STUSSY_HODDIE,Product.COUR_JEANS));

        // 식품 카테고리
        Category food = new Category("식품",
                Arrays.asList(Product.SHIN_RAMEN, Product.STARBUCKS_COFFEE, Product.TTEOKBOKKI, Product.KIMCHI));

        CommerceSystem system = new CommerceSystem(customer,Arrays.asList(electronics, clothes, food));
        system.start();
    }
}




