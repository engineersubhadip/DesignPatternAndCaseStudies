package URLBuilder;

public class Client {

	public static void main(String[] args) {

		/*
		 * // Using Mandatory fields 
		 * URL url1 =
		 * URL.getBuilder().setProtocol("https://").setHostName("flipkart.com").build();
		 * 
		 * System.out.println(url1.getProtocol());
		 * System.out.println(url1.getHostName()); System.out.println(url1.toString());
		 */

		URL url2 = URL.getBuilder().setProtocol("https://").setHostName("amazon.com").setPortNum(":8080")
				.setPathParam("/companies").setQueryParam("?companyName=xyz").build();
		System.out.println(url2.toString());
	}

}
