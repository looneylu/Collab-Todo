package collab.todo

class Todo {
    String name
    String note
    Date createdDate
    Date lastUpdated
    Date dueDate
    Date lastModifiedDate
    Date completedDate
    String priority
    String status = "Started"
    User owner
    Category category

    static belongsTo = [User, Category]

    static constraints = {
        name (blank:false)
		createdDate()
        priority()
        status()
        note (maxSize:1000, nullable:true)
        completedDate(nullable:true)
        dueDate(nullable:true)
    }

    String toString() {
        name
    }
}