import java.util.*;

public class CommerceSystem {
    private List<Category> categories;
    private List<CartItem> cart;  // ✅ 장바구니
    private Scanner scanner;
    private Customer customer;

    // Customer도 인자로 받도록 수정
    public CommerceSystem(Customer customer, List<Category> categories) {
        this.customer = customer;
        this.categories = categories;
        this.cart = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("어서오세요, " + customer.getName() + " 고객님 (" + customer.getGrade() + ")");
        System.out.println("주소:"+customer.getAddress());
        System.out.println("📧 이메일: " + customer.getEmail());

        while (true) {
            System.out.println("\n[ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i < categories.size(); i++) {
                System.out.println((i + 1) + ". " + categories.get(i).getName());
            }
            System.out.println("9. 장바구니 보기");
            System.out.println("0. 종료 | 프로그램 종료");

            System.out.print("번호 입력: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            } else if (choice == 9) {
                showCart();
            } else if (choice > 0 && choice <= categories.size()) {
                showCategory(categories.get(choice - 1));
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void showCategory(Category category) {
        while (true) {
            category.printProducts();
            System.out.print("번호 입력: ");
            int choice = scanner.nextInt();

            if (choice == 0) break;

            if (choice > 0 && choice <= category.getProducts().size()) {
                Product selected = category.getProducts().get(choice - 1);
                System.out.println("선택한 상품: " + selected);

                System.out.print("장바구니에 담으시겠습니까? (1.예 / 2.아니오): ");
                int add = scanner.nextInt();

                if (add == 1) {
                    System.out.print("수량 입력: ");
                    int quantity = scanner.nextInt();

                    if (selected.getStock() < quantity) {
                        System.out.println("⚠️ 재고 부족! 현재 재고: " + selected.getStock());
                    } else {
                        cart.add(new CartItem(selected, quantity));
                        System.out.println("✅ 장바구니에 추가되었습니다.");
                    }
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void showCart() {
        if (cart.isEmpty()) {
            System.out.println("🛒 장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("\n[ 장바구니 ]");
        int total = 0;
        for (int i = 0; i < cart.size(); i++) {
            CartItem item = cart.get(i);
            System.out.println((i + 1) + ". " + item);
            total += item.getTotalPrice();
        }
        System.out.println("총 금액: " + total + "원");

        System.out.print("주문하시겠습니까? (1.예 / 2.아니오): ");
        int order = scanner.nextInt();

        if (order == 1) {
            processOrder();
        }
    }

    private void processOrder() {
        for (CartItem item : cart) {
            item.getProduct().reduceStock(item.getQuantity());
        }
        cart.clear();
        System.out.println("✅ 주문이 완료되었습니다. 장바구니가 초기화되었습니다.");
    }
}
