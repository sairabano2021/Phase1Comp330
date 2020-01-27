
public enum QuestionType {
	
	TRUE_FALSE("True or False"),
	MULTIPLE_CHOICE("Multiple Choice"),
	FILL_IN_BLANK("Fill in the Blank"),
	MATCHING("Matching");
	
	
	
	private final String val;
	
	QuestionType(String val){
		this.val = val;
	}
	
	public String getValue() {
		return val;
	}

}
