package es.cadadosxtres

class Sponsorship {

	TekEvent event
	Sponsor sponsor
	String contributionType
	String description
	String notes
	
	String toString(){
		contributionType
	}
	
    static constraints = {
		event nullable: false
		sponsor nullable: false
		contributionType inList:['Other', 'Vanue', 'A/V', 'Promotion', 'Cash']
		description nullable: true, blank: true
		notes nullable: true, blank: true, maxSize: 5000
    }
}
