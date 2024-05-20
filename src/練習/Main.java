package 練習;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


 


public class Main {
   	
	    private static int first ;
		private static int second ;
		private static int your = 1;
		static ArrayList<Integer> enem_list = new ArrayList<>();
		static ArrayList<Integer> your_list = new ArrayList<>();
		
		
	         static void winner(int player) {
			 Random rn = new Random();
			 int bot = rn.nextInt(3);
			 
			  if((player == 0 && bot == 2)||(player == 1 && bot == 0)||(player == 2 && bot == 1)){
				  System.out.println("あなたが勝ったので先行です");
				 first = your;
				
			  }else if ((bot == 0 && player == 2)||(bot == 1 && player == 0)||(bot == 2 && player == 1)) {
				System.out.println("ジャンケンに負けたのであなたは後攻です");
				 second = your;
				 
				 
			  }else if(player == bot) {
				  System.out.println("あいこです再起動をお願いします");
				  System.exit(0);
			  }
			
			
			 }
		 static int select(Integer player1) {    //自分が先に位置決めをするときのメソッド
			 Random rn = new Random();
			 
			 
			
			your_list.add(player1);
			
			
			System.out.println("あなたの位置"+your_list);
			if(your_list.contains(0) && your_list.contains(1) && your_list.contains(2) ) {
				
				System.out.println("1,2,3がそろったのであなたの勝ちです");
				System.exit(0);
				
			}else if(your_list.contains(0) && your_list.contains(3) && your_list.contains(6) ) {
				System.out.println("1,4,7がそろったのであなたの勝ちです");
				System.exit(0);
				
			}else if(your_list.contains(0) && your_list.contains(4) && your_list.contains(8)) {
		    	
				System.out.println("1,5,9がそろったのであなたの勝ちです");
				System.exit(0);
				
				
		    }else if(your_list.contains(2) && your_list.contains(5) && your_list.contains(8) ) {
				System.out.println("3,6,9がそろったのであなたの勝ちです");
				System.exit(0);
				
		    }else if(your_list.contains(2) && your_list.contains(4) && your_list.contains(6) ) {
				System.out.println("3,5,7がそろったのであなたの勝ちです");
				System.exit(0);
				
		    }else if(your_list.contains(3) && your_list.contains(4) && your_list.contains(5) ) {
				System.out.println("4,5,6がそろったのであなたの勝ちです");
				System.exit(0);
				
		    }else if(your_list.contains(1) && your_list.contains(4) && your_list.contains(7) ) {
				System.out.println("2,5,8がそろったのであなたの勝ちです");
				System.exit(0);
				
		    }else if(your_list.contains(6) && your_list.contains(7) && your_list.contains(8) ) {
				System.out.println("7,8,9がそろったのであなたの勝ちです");
				System.exit(0);
		    }
			
			System.out.println("次は相手の選択です");
			
			
			
			enem_list.add(rn.nextInt(9));
			
			
			if(enem_list.contains(enem_list.contains(your_list))) {
				System.out.println("あなたと被ってしまったのでもう一度相手が位置を設定をします");
				}else if(enem_list.contains(enem_list)) {
					System.out.println("相手は自分の位置をまた再度入力してしまったのでまた再度設定します");
				}else {
					System.out.println("相手の位置"+enem_list);
				}
			
			
             if(enem_list.contains(0) && enem_list.contains(1) && enem_list.contains(2) ) {
				
				System.out.println("1,2,3がそろったのであいての勝ちです");
				System.exit(0);
				
			}else if(enem_list.contains(0) && enem_list.contains(3) && enem_list.contains(6) ) {
				System.out.println("1,4,7がそろったのであいての勝ちです");
				System.exit(0);
				
			}else if(enem_list.contains(0) && enem_list.contains(4) && enem_list.contains(8)) {
		    	
				System.out.println("1,5,9がそろったのであいての勝ちです");
				System.exit(0);
				
				
		    }else if(enem_list.contains(2) && enem_list.contains(5) && enem_list.contains(8) ) {
				System.out.println("3,6,9がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(2) && enem_list.contains(4) && enem_list.contains(6) ) {
				System.out.println("3,5,7がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(3) && enem_list.contains(4) && enem_list.contains(5) ) {
				System.out.println("4,5,6がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(1) && enem_list.contains(4) && enem_list.contains(7) ) {
				System.out.println("2,5,8がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(6) && enem_list.contains(7) && enem_list.contains(8) ) {
				System.out.println("7,8,9がそろったのであいての勝ちです");
				System.exit(0);
		    }
			
			 
			
			return player1;
			
			}
			 
		  
	  public  static int enem_select(int enem) {           //相手が先に位置決めをするメソッド
	        Scanner sc = new Scanner(System.in);
		  
		  
			enem_list.add(enem);
			
			
			if(enem_list.contains(enem_list.contains(your_list))) {
				System.out.println("あなたと被ってしまったのでもう一度相手が位置を設定をします");
				}else if(enem_list.contains(enem_list)) {
					System.out.println("あいては自分の位置をまた再度入力してしまったのでまた再度設定します");
				}else {
					System.out.println("あいて位置"+enem_list);
				}
			
			
             if(enem_list.contains(0) && enem_list.contains(1) && enem_list.contains(2) ) {
				
				System.out.println("1,2,3がそろったのであいての勝ちです");
				System.exit(0);
				
			}else if(enem_list.contains(0) && enem_list.contains(3) && enem_list.contains(6) ) {
				System.out.println("1,4,7がそろったのであいての勝ちです");
				System.exit(0);
				
			}else if(enem_list.contains(0) && enem_list.contains(4) && enem_list.contains(8)) {
		    	
				System.out.println("1,5,9がそろったのであいての勝ちです");
				System.exit(0);
				
				
		    }else if(enem_list.contains(2) && enem_list.contains(5) && enem_list.contains(8) ) {
				System.out.println("3,6,9がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(2) && enem_list.contains(4) && enem_list.contains(6) ) {
				System.out.println("3,5,7がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(3) && enem_list.contains(4) && enem_list.contains(5) ) {
				System.out.println("4,5,6がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(1) && enem_list.contains(4) && enem_list.contains(7) ) {
				System.out.println("2,5,8がそろったのであいての勝ちです");
				System.exit(0);
				
		    }else if(enem_list.contains(6) && enem_list.contains(7) && enem_list.contains(8) ) {
				System.out.println("7,8,9がそろったのであいての勝ちです");
				System.exit(0);
		    }
             
             
             System.out.println("あなたの番です");
             System.out.println("0,1,2\n3,4,5\n6,7,8");
             
             your_list.add(sc.nextInt());
            
             
 			
 			
 			System.out.println("あなたの位置"+your_list);
 			if(your_list.contains(0) && your_list.contains(1) && your_list.contains(2) ) {
 				
 				System.out.println("1,2,3がそろったのであなたの勝ちです");
 				System.exit(0);
 				
 			}else if(your_list.contains(0) && your_list.contains(3) && your_list.contains(6) ) {
 				System.out.println("1,4,7がそろったのであなたの勝ちです");
 				System.exit(0);
 				
 			}else if(your_list.contains(0) && your_list.contains(4) && your_list.contains(8)) {
 		    	
 				System.out.println("1,5,9がそろったのであなたの勝ちです");
 				System.exit(0);
 				
 				
 		    }else if(your_list.contains(2) && your_list.contains(5) && your_list.contains(8) ) {
 				System.out.println("3,6,9がそろったのであなたの勝ちです");
 				System.exit(0);
 				
 		    }else if(your_list.contains(2) && your_list.contains(4) && your_list.contains(6) ) {
 				System.out.println("3,5,7がそろったのであなたの勝ちです");
 				System.exit(0);
 				
 		    }else if(your_list.contains(3) && your_list.contains(4) && your_list.contains(5) ) {
 				System.out.println("4,5,6がそろったのであなたの勝ちです");
 				System.exit(0);
 				
 		    }else if(your_list.contains(1) && your_list.contains(4) && your_list.contains(7) ) {
 				System.out.println("2,5,8がそろったのであなたの勝ちです");
 				System.exit(0);
 				
 		    }else if(your_list.contains(6) && your_list.contains(7) && your_list.contains(8) ) {
 				System.out.println("7,8,9がそろったのであなたの勝ちです");
 				System.exit(0);
 		    } 
             
			
		  
		  
		  
		return enem;
		  
	  }
	

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        
        
        System.out.println("じゃんけんを開始します");
        System.out.println("じゃんけんの出す手を決めてください[0,グー　1,パー 　2チョキ");
        
        int your = sc.nextInt();
        
        
        winner(your);
        
       
        
        if(first == 1) {
    
       System.out.println("あなたが先行なので位置決めをして下さい");  
        
        for(int i = 0; i<9; i++) {
       
           System.out.println("0,1,2\n3,4,5\n6,7,8");
           int your_select = sc.nextInt();
           select(your_select);
        
        }
        }
        
        
        if(second == 1) {
        	System.out.println("相手が先行なのであいてが先に位置決めします");
        	for(int i = 0; i<9; i++) {
        	int enem = 	rn.nextInt(9);
        	enem_select(enem);
        	}
        }
        
        
        
         
	}

}
