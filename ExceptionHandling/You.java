package ExceptionHandling;

import cucumber.api.cli.Main;

public class You {
	
	
	public void makeYourGirlFriendLaugh() {
		
		try {
			
			throw new MachanInteruptedException("Machan is coming to hit me");
			
		}catch (MachanInteruptedException e){
			
			e.printStackTrace();
//			
//			System.out.println("Friend:Machan give pose da");
//			
//			System.out.println("Me:Giving Pose like PhotoShoot");
		
	}
		
		

}
	
	public static void main(String[] args) {
		You obj = new You();
		obj.makeYourGirlFriendLaugh();
		
		
	}
}
