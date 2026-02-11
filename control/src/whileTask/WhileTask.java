//package whileTask;
//
//import java.util.Scanner;
//
//public class WhileTask {
//   public static void main(String[] args) {
//	   
//	   Scanner sc = new Scanner(System.in);
//	   
//	   String message = "※※※※※※※※※※※※※※※※※※※※※※※※※※※\n"
//	            + "어서오세요~ 카페입니다!༼ つ ◕_◕ ༽つ\n"
//	            + "※※※※※※※※※※※※※※※※※※※※※※※※※※※",
//	            nameMessage = "상품을 등록해주세요!",
//	            exampleMessage = "주문하실 상품을 골라주세요!\n"
//	                  + "1. 아메리카노 ^(*￣(oo)￣)^\n"
//	                  + "2. 카페라떼 (⓿_⓿)\n",
//	                  america = " 아이스 아메리카노",
//	                  latte = "카페라떼잇",
//            		  name = null, menuName = null;
//	      int choice = 0,  action = 0;
//	      boolean flag = false;
//	   
//	   while(true) {
//		   System.out.println(message);
//		   System.out.println(exampleMessage);
//	         
//	         choice = sc.nextInt();
//	         
//	         if(choice < 1 || choice > 5){
//	            System.out.println("잘못 입력했습니다.");
//	         }else {
//	            break;
//	         }
//	      }
//	      
////	      선택한 타마를 대입
//	      switch(choice) {
//	      case 1:
//	         name = america;
//	         break;
//		   case 2:
//			   name = latte;
//			   break;
//		   }
//	         System.out.println(nameMessage);
//	         menuName = sc.next();
////      키오스크 만들기
////      기본 판매 상품
////      아메리카노: 2000원
////      카페라떼: 3000원
//       
////      1. 상품 등록 // 타마의 이름 짓기
////	   		등록할 상품을 선택해 주세요
////	   		+ 아메리카노
////	   		+ 카페라떼
////      2. 상품 판매 // 캐릭터 선택
////	   		구매하실 상품을 입력해 주세요
////	   		1. 아메리카노
////	   		2. 카페라떼
////      3. 이름 변경 ? 뭐써야 할지 모르겠다.
////      4. 가격 변경 ?
//      
////      등록된 물품을 판매하는 시스템 
////      판매가 완료되면 다시 첫 화면으로 돌아오기! 음..?
////	   스위치 액션을 하고 케이스의 행동을 마치고 
////	   break하면 초기화면으로 돌아옴
////	   자동이 아님 while 문 안에 있어서 break하고 다시 돌아오는 거고
////	   이후 flag와 happy의 if조건이 있어서 반복문이 종료됨
//      
//   }
//   }

package whileTask;

import java.util.Scanner;

public class WhileTask {
   public static void main(String[] args) {
//      키오스크 만들기
//      기본 판매 상품
//      아메리카노: 2000원
//      카페라떼: 3000원
      
      Scanner sc = new Scanner(System.in);
      String product1 = "아메리카노", product2 = "카페라떼", product3 = null, product4 = null,
            productName = null,
            message = "기능을 선택하세요.\n"
                  + "1. 상품 등록\n"
                  + "2. 상품 판매\n"
                  + "3. 이름 변경\n"
                  + "4. 가격 변경\n"
                  + "5. 상품 삭제";
      int productPrice = 0, productPrice1 = 2000, productPrice2 = 3000, 
            productPrice3 = 0, productPrice4 = 0, productCount = 2, 
            menuChoice = 0, productChoice = 0;
      
//      1. 상품 등록(4개)
//      2. 상품 판매
//      3. 이름 변경 
//      4. 가격 변경
      
//      등록된 물품을 판매하는 시스템
//      판매가 완료되면 다시 첫 화면으로 돌아오기!
      while(true) {
         System.out.println(message);
         menuChoice = sc.nextInt();
         
         if(menuChoice == 1) {
            if(productCount >= 4) {
               System.out.println("상품 등록 불가");
               continue;
            }
            
            productCount++;
            System.out.println(productCount);
            
            System.out.println("==================");
            if(product1 == null) {
               System.out.println("1. 상품 등록 가능");
            }
            if(product2 == null) {
               System.out.println("2. 상품 등록 가능");
            }
            if(product3 == null) {
               System.out.println("3. 상품 등록 가능");
            }
            if(product4 == null) {
               System.out.println("4. 상품 등록 가능");
            }
            System.out.println("==================");
            System.out.println("상품 등록할 번호를 선택하세요");
            productChoice = sc.nextInt();
            
            System.out.println("상품 이름을 등록하세요.\nex)에이드");
            productName = sc.next();
            System.out.println("상품 가격을 등록하세요.\nex)5000");
            productPrice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               product1 = productName;
               productPrice1 = productPrice;
               break;
            case 2:
               product2 = productName;
               productPrice2 = productPrice;
               break;
            case 3:
               product3 = productName;
               productPrice3 = productPrice;
               break;
            case 4:
               product4 = productName;
               productPrice4 = productPrice;
               break;
            default:
               break;
            }
         }else if(menuChoice == 2) {
            System.out.println("======판매 상품 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======판매 상품 목록======");
            
            productChoice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               System.out.println(product1 + ": "+ productPrice1 + "원");
               break;
            case 2:
               System.out.println(product2 + ": "+ productPrice2 + "원");
               break;
            case 3:
               System.out.println(product3 + ": "+ productPrice3 + "원");
               break;
            case 4:
               System.out.println(product4 + ": "+ productPrice4 + "원");
               break;
            }
            System.out.println("판매 완료");
            
         }else if(menuChoice == 3) {
            System.out.println("======이름 변경 가능 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======이름 변경 가능 목록======");
            
            productChoice = sc.nextInt();
            
            System.out.println("변경할 이름을 입력하세요.");
            productName = sc.next();
            
            switch(productChoice) {
            case 1:
               product1 = productName;
               break;
            case 2:
               product2 = productName;
               break;
            case 3:
               product3 = productName;
               break;
            case 4:
               product4 = productName;
               break;
            }
            System.out.println("이름 변경 완료");
            
         }else if(menuChoice == 4) {
            System.out.println("======가격 변경 가능 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======가격 변경 가능 목록======");
            
            productChoice = sc.nextInt();
            
            System.out.println("변경할 가격을 입력하세요.");
            productPrice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               productPrice1 = productPrice;
               break;
            case 2:
               productPrice2 = productPrice;
               break;
            case 3:
               productPrice3 = productPrice;
               break;
            case 4:
               productPrice4 = productPrice;
               break;
            }
            System.out.println("가격 변경 완료");
         }else if(menuChoice == 5) {
            System.out.println("======상품 삭제 가능 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======상품 삭제 가능 목록======");
            
            System.out.println("삭제할 상품을 선택하세요.");
            productChoice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               product1 = null;
               productPrice1 = 0;
               break;
            case 2:
               product2 = null;
               productPrice1 = 0;
               break;
            case 3:
               product3 = null;
               productPrice1 = 0;
               break;
            case 4:
               product4 = null;
               productPrice1 = 0;
               break;
            }
            productCount--;
            System.out.println("상품 삭제 완료");
         }else {
            
         }
         
         
      }
      
      
      
   }
}


