# 🛒 Real-Time Commerce System

Java로 구현한 **실시간 커머스 플랫폼** 과제 프로젝트입니다.  
상품 관리, 카테고리, 고객 관리, 장바구니 및 주문 기능까지 포함하고 있으며, 객체 지향 설계 원칙과 캡슐화를 적용했습니다.

---

실행영상
[프로젝트 동작 영상 보기](https://youtu.be/TOd9grGQOQQ)


## 🚀 구현 단계

### ✅ Lv1. 상품 관리 시스템
- `Product` 클래스 생성 (상품명, 가격, 설명, 재고수량)
- 상품 리스트 출력
- 상품 선택 → 상세 정보 확인

### ✅ Lv2. CommerceSystem 클래스
- 메인 로직을 `CommerceSystem` 으로 이동
- `start()` 메서드를 통해 전체 실행 관리

### ✅ Lv3. 카테고리 & 고객 관리
- `Category` 클래스: 상품들을 카테고리 단위로 관리
- `Customer` 클래스: 고객명, 이메일, 등급 관리
- 프로그램 시작 시 고객 정보 출력

### ✅ Lv4. 캡슐화
- 모든 클래스의 필드를 `private`으로 선언
- Getter / Setter 메서드 제공

### ✅ Lv5. 장바구니 및 주문 기능
- `CartItem` 클래스 추가
- 장바구니 담기, 재고 확인, 총 금액 출력
- 주문 완료 시 장바구니 초기화 & 재고 차감
- 예외 처리 (잘못된 입력 / 재고 부족)

---

## 🗂 프로젝트 구조

RealTimeCommerceSystem/
├── Main.java
├── CommerceSystem.java
├── Category.java
├── Product.java
├── Customer.java
├── CartItem.java
├── README.md
└── .gitignore


---

## 💻 실행 방법


# 프로젝트 빌드 및 실행

실행 예시:

어서오세요, 김세현 고객님 (VVIP)
주소:동탄
📧 이메일: shkim6663@naver.com

[ 실시간 커머스 플랫폼 메인 ]
1. 전자제품
2. 의류
3. 식품
9. 장바구니 보기
0. 종료 | 프로그램 종료
번호 입력: 1
[ 전자제품 카테고리 ]
1. Galaxy Z FOLD 7 | 2200000원 | 삼성전자 갤럭시 Z폴드 7 | 재고: 50개
2. iPhone 17 PRO | 2350000원 | Apple의 최신 스마트폰 | 재고: 30개
3. MacBook Pro | 2400000원 | M4 칩셋이 탑재된 노트북 | 재고: 20개
4. AirPods Pro 3 | 350000원 | 노이즈 캔슬링 무선 이어폰 | 재고: 100개
5. Dyson 청소기 | 1000000원 | 다이슨 무선 청소기 | 재고: 20개
0. 뒤로가기
번호 입력: 1
선택한 상품: Galaxy Z FOLD 7 | 2200000원 | 삼성전자 갤럭시 Z폴드 7 | 재고: 50개
장바구니에 담으시겠습니까? (1.예 / 2.아니오): 1
수량 입력: 20
✅ 장바구니에 추가되었습니다.

⚙️ 개발 환경
Java 17 

IntelliJ IDEA


