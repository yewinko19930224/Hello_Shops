package ye.hello.shops.models;

public class AuthenQuestion {
	private int user_id;
	private String user_name_first;
	private String user_name_last;
	private String user_email;
	private String user_address;
	private String user_phone;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name_first() {
		return user_name_first;
	}

	public void setUser_name_first(String user_name_first) {
		this.user_name_first = user_name_first;
	}

	public String getUser_name_last() {
		return user_name_last;
	}

	public void setUser_name_last(String user_name_last) {
		this.user_name_last = user_name_last;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

}
