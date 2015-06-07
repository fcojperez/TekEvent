package es.cadadosxtres

class Task {

	String title
	String notes
	TekUser assignedTo
	Date dueDate
	TekEvent event


	static constraints = {
		title blank: false
		notes blank: true, mullable: true, maxSize: 5000
		assignedTo nullable: true
		dueDate nullable: true
	}
	
	static belongsTo = TekEvent
}
