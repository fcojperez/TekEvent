package es.cadadosxtres

class Sponsor {

	String name
	String website
	String description
	byte[] logo
	
	//One to Many One TekEvent has Many Sponsor
	//Many sponsor has Many sponsorship
	static hasMany = [sponsorship: Sponsorship]
	static belongsTo = TekEvent

	String toString(){
		name
	}

	static constraints = {
		name blank: false
		website blank: false
		description nullable: true, maxSize: 5000
		logo nullable: true, maxSize: 1000000
		sponsorship nullable: true
	}
}
