# w3-SpringBoot_Part_A

## 🚀 3주차 미션

---

### 📌 미션 요구사항

#### [1W2D]

바우처 관리 Command-line Application을 만들어본다.

- CommandLineApplication 클래스를 작성한다.
- AnnotationConfigApplicationContext 를 이용해서 IoC 컨테이너를 생성하고 서비스, 레 포지토리를 빈으로 등록한다.
- 프로그램이 시작하면 다음과 같이 지원가능한 명령어를 알려준다.

```
=== Voucher Program ===
Type exit to exit the program.
Type create to create a new voucher.
Type list to list all vouchers.
```

- create / list 커맨드를 지원한다.
    - create 커맨드를 통해 바우처를 생성할수 있습니다. (FixedAmountVoucher, PercentDiscountVoucher)
    - list 커맨드를 통해 만들어진 바우처를 조회할 수 있습니다.


#### [1W3D]
- 컴포넌트 스캔을 통해 빈이 등록되게 해보세요.

- 메모리 관리가 아닌 파일로 관리가 되는 Repository를 한번 만들어보세요.
    - 기존 메모리 레포지토리는 지우지 말아주세요.

#### [1W4D]

- customer_blacklist.csv 파일을 만들고 스프링 애플리케이션에서 해당 파일을 읽을 수 있고 블랙 리스트도 조회 할 수 있습니다. (추가할 필요는 없어요. 블랙리스트는 파일로만 관리된다고 가정할게요)
- 바우처를 메모리에서 관리하는 레포지토리는 개발 프로파일에서만 동작하게 해보세요.

### 📝 기능 목록

#### [1W2D]

- 컨테이너를 생성하고 서비스, 레포지토리를 빈으로 등록한다.
- 지원 가능한 명령어 안내를 출력한다.
- exit를 입력받아 프로그램을 종료한다.
- create를 입력받아 바우처를 생성한다.
    - Fixed, Percent 중 어떤 바우처인지 선택하고 할인 금액 또는 할인율을 입력받아 생성한다.
- list를 입력받아 현재 바우처를 출력한다.
- 지원 가능한 명령어가 아닐 경우 에러 메세지를 출력한다.

#### [1W3D]

- 컴포넌트 스캔으로 빈을 등록한다.
- 바우처를 입력받아 파일에 저장한다.
- 파일을 조회하여 바우처 리스트를 출력한다.
- 아이디가 중복되는지 확인한다.

#### [1W4D]

- 메모리 레포지토리를 dev 환경에서만 실행되도록 변경한다.
- 블랙리스트를 만들어 프로그램이 시작되면 파일을 읽어와 명단에 추가한다.

### ⚙ 개발 환경

```
java 16, 
maven 3.8.2
springboot 2.5.3
```

### ▶ 실행 방법

```shell
KdtApplication 클래스의 main 메소드 실행

또는

해당 프로젝트 경로에서
1. mvn package
2. cd target
3. java -jar kdt-spring-demo-0.0.1-SNAPSHOT.jar 
```

### 📄 실행 결과

**명령어 안내**

```
=== Voucher Program ===
Type exit to exit the program.
Type create to create a new voucher.
Type list to list all vouchers.
```

**create**

```
=== Voucher Program ===
Type exit to exit the program.
Type create to create a new voucher.
Type list to list all vouchers.

create

생성하고 싶은 바우처를 선택하고 할인양 또는 할인율을 입력해주세요. (쉼표 ',' 를 사용하여 구분해주세요)
1. Fixed Amount Voucher
2. PercentDiscount Voucher
ex) 입력 예시 1, 1000 또는 2, 20

1, 100
17:34:16.965 [main] INFO  o.prgrms.kdt.voucher.VoucherService - FixedAmountVoucher {voucherId = 68eab124-0203-4648-82cf-067d4111ce50, amount = 100} 바우처가 생성되었습니다.
성공적으로 등록되었습니다.
다음 명령을 입력해주세요.

create

생성하고 싶은 바우처를 선택하고 할인양 또는 할인율을 입력해주세요. (쉼표 ',' 를 사용하여 구분해주세요)
1. Fixed Amount Voucher
2. PercentDiscount Voucher
ex) 입력 예시 1, 1000 또는 2, 20

2, 10

17:34:24.846 [main] INFO  o.prgrms.kdt.voucher.VoucherService - PercentDiscountVoucher {voucherId = 0970a3ff-bbc1-4a15-bc35-0e0423f475c3, percent = 10} 바우처가 생성되었습니다.
성공적으로 등록되었습니다.
다음 명령을 입력해주세요.
```

**list**

```
FixedAmountVoucher {voucherId = 68eab124-0203-4648-82cf-067d4111ce50, amount = 100}
PercentDiscountVoucher {voucherId = 0970a3ff-bbc1-4a15-bc35-0e0423f475c3, percent = 10}
다음 명령을 입력해주세요.
```

**exit**

```
프로그램을 종료합니다.
```