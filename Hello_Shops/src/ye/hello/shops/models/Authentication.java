package ye.hello.shops.models;

public class Authentication {
	private int user_id;
	private String user_login_id;
	private String user_type;
	private String hint_question;
	private String hint_answer;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_login_id() {
		return user_login_id;
	}

	public void setUser_login_id(String user_login_id) {
		this.user_login_id = user_login_id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getHint_question() {
		return hint_question;
	}

	public void setHint_question(String hint_question) {
		this.hint_question = hint_question;
	}

	public String getHint_answer() {
		return hint_answer;
	}

	public void setHint_answer(String hint_answer) {
		this.hint_answer = hint_answer;
	}

}
