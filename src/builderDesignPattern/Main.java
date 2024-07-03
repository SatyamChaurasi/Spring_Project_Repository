package builderDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder()
				.setUserId("UserId123")
				.setUserName("Akash")
				.setEmailId("akash@gam.com")
				.build();
		
		System.out.println(user);
		
		User user2 = User.UserBuilder.builder()
		.setUserId("UserId9090")
		.setUserName("Mohit")
		.setEmailId("Mojjb@jhb.com")
		.build();
		
		System.out.println(user2);

	}

}
