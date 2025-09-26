public enum Product {
    // 전자제품
    GALAXY_Z_FOLD_7("Galaxy Z FOLD 7", 2_200_000, "삼성전자 갤럭시 Z폴드 7", 50),
    IPHONE_17_PRO("iPhone 17 PRO", 2_350_000, "Apple의 최신 스마트폰", 30),
    MACBOOK_PRO("MacBook Pro", 2_400_000, "M4 칩셋이 탑재된 노트북", 20),
    AIRPODS_PRO("AirPods Pro 3", 350_000, "노이즈 캔슬링 무선 이어폰", 100),
    Dyson_VACUUM("Dyson 청소기", 1_000_000,"다이슨 무선 청소기",20),

    // 의류
    NIKE_TSHIRT("나이키 티셔츠", 45_000, "편안한 스포츠웨어", 80),
    ADIDAS_SNEAKERS("아디다스 스니커즈", 95_000, "인기 있는 운동화", 40),
    STUSSY_HODDIE("스투시 후드티", 59_000, "힙한 후드티", 60),
    COUR_JEANS("쿠어 청바지",225_000,"댄디한 쿠어 청바지",20),

    // 식품
    SHIN_RAMEN("신라면 5개입", 4_800, "매운 라면", 200),
    STARBUCKS_COFFEE("스타벅스 원두", 15_000, "아라비카 원두 200g", 120),
    TTEOKBOKKI("떡볶이", 7_500, "매운 떡볶이", 300),
    KIMCHI("김치 1KG", 12_500,"매운 김치", 100);

    private final String name;
    private final int price;
    private final String description;
    private int stock;

    Product(String name, int price, String description, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public boolean reduceStock(int amount) {
        if (stock >= amount) {
            stock -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " | " + price + "원 | " + description + " | 재고: " + stock + "개";
    }
}
