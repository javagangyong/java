package phonebook1;

public class PhonebookDTO {

	private String name;		// 이름
	private String pnum;		// 전화번호
	private int age;			// 나이
	private String favorite;	// 즐겨찾기, (Y 혹은 N으로만 넣을 수 있음)
	
	@Override
	public String toString() {
		String form = "%s %13s %2s살 %s";
		form = String.format(form, name, pnum, age, (favorite.equals("Y") ? "❤" : "💔"));
		return form;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	
}
