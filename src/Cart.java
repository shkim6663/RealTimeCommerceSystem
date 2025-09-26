import java.util.*;

public class Cart {
    private final Map<Product, Integer> items = new HashMap<>();

    public void addItem(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        System.out.println("[ 장바구니 목록 ]");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();
            System.out.printf("%s | %,d원 | 수량: %d | 소계: %,d원\n",
                    p.getName(), p.getPrice(), qty, p.getPrice() * qty);
        }
    }

    public int calculateTotal() {
        int total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void checkout() {
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            entry.getKey().reduceStock(entry.getValue());
        }
        items.clear();
    }
}
