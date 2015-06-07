package es.cadadosxtres

class TekEvent {

	String city
	String name
	TekUser organizer
	String venue
	Date startDate
	Date endDate
	String description

	static hasMany = [volunteers: TekUser,
		respondents: String,
		sponsorship: Sponsorship,
		tasks: Task,
		messages: TekMessage]

	String toString(){
		"$name, $city"
	}

	static constraints = {
		name()
		city()
		description maxSize: 5000
		venue()
		startDate()
		endDate()
		volunteers nullable: true
		sponsorship nullable: true
		tasks nullable: true
		messages nullable: true
	}
}
